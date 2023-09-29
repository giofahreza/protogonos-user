package com.giofahreza.protogonos.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/users")
public class AuthController {
    @GetMapping("/welcome")
    public String first_api(){
        return "welcome to authentication";
    }

    @PostMapping("/create")
    public String createUser() {
        // Lakukan operasi untuk membuat pengguna di sini
        return "User berhasil dibuat: ";
    }
}