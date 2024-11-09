package com.task_flow.Task_SpringBoot.services.auth;

import com.task_flow.Task_SpringBoot.dto.SignupRequest;
import com.task_flow.Task_SpringBoot.dto.UserDto;

public interface AuthService {
    UserDto signupUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);

}
