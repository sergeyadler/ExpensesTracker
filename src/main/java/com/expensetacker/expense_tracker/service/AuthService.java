package com.expensetacker.expense_tracker.service;


import com.expensetacker.expense_tracker.dto.RegisterRequest;
import com.expensetacker.expense_tracker.model.User;
import com.expensetacker.expense_tracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService{
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

    public void register(RegisterRequest request) {
        // Проверка: есть ли пользователь с таким email
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered");
        }

        // Хеширование пароля
        String hashedPassword = passwordEncoder.encode(request.getPassword());

        // Создание пользователя
        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(hashedPassword);

        userRepository.save(user);
    }
}
