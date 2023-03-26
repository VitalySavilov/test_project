package com.vsdev.dto;

import lombok.Value;

@Value
public class AppUserReadDto {
    String fullName;
    String email;
    String role;
}
