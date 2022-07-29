//package com.sparta.springcore.springprac;
//
////@Controller
////public class LoginController {
////
////    @GetMapping("/login")
////    public String loginForm() {
////        return "redirect:/login-form.html";
////    }
////
////
////    @PostMapping("/login")
////    public String login(@RequestParam String id,@RequestParam String password, Model model) {
////        if (id.equals(password)) {
////            model.addAttribute("loginId", id);
////        }
////        return "login-result";
////    }
////}