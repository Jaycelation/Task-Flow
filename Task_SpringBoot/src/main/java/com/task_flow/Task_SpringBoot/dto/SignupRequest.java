package com.task_flow.Task_SpringBoot.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String name;
    private String email;
    private String password;
}
