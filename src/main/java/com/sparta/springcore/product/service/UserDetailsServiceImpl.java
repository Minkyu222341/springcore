package com.sparta.springcore.product.service;

import com.sparta.springcore.product.domain.User;
import com.sparta.springcore.product.repository.UserRepository;
import com.sparta.springcore.security.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Can't find " + username));
        log.info("유저?={}",user.getUsername());
        log.info("유저메일={}",username);

        return new UserDetailsImpl(user);
    }
}
