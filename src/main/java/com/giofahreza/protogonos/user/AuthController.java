package com.giofahreza.protogonos.user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {    
    @GetMapping("/welcome")
    public String first_api(){
        return "welcome to first project";
    }
}