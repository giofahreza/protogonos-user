package com.giofahreza.protogonos.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class CustomErrorController implements ErrorController {
    @Value("${APP_PORT}")
    private String appPort;

    @RequestMapping("/error")
    public ResponseEntity<String> handleError() {
        // Customize the response for the default error page here.
        return new ResponseEntity<>("The server running on PORT : "+appPort, HttpStatus.NOT_FOUND);
    }
}
