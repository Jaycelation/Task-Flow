package com.task_flow.Task_SpringBoot.dto;

import com.task_flow.Task_SpringBoot.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

}
