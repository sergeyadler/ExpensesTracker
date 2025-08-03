package com.expensetacker.expense_tracker.controller;


import com.expensetacker.expense_tracker.dto.RegisterRequest;
import com.expensetacker.expense_tracker.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register (@RequestBody @Valid RegisterRequest request){
        authService.register(request);
        return ResponseEntity.ok("User registered succsessfully");
    }
}
