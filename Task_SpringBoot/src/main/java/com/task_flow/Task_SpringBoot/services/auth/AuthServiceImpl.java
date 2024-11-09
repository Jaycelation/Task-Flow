package com.task_flow.Task_SpringBoot.services.auth;

import com.task_flow.Task_SpringBoot.entities.User;
import com.task_flow.Task_SpringBoot.enums.UserRole;
import com.task_flow.Task_SpringBoot.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @PostConstruct
    public void createAnAdminAccount() {
        Optional<User> optionalUser = userRepository.findByUserRole(UserRole.ADMIN);
        if (optionalUser.isEmpty()) {
            User user = new User();
            user.setEmail("admin@test.com");
            user.setName("admin");
            user.setPassword(new BCryptPasswordEncoder().encode("admin"));
        } else {
            System.out.println("Admin account already exists!");
        }
    }

}
