package com.vsdev.mapper;

import com.vsdev.dto.AppUserReadDto;
import com.vsdev.model.AppUser;
import org.springframework.stereotype.Component;

@Component
public class AppUserReadMapper implements Mapper<AppUser, AppUserReadDto> {

    @Override
    public AppUserReadDto map(AppUser object) {
        return new AppUserReadDto(
                object.getAppUserInfo().getLastname() + " " +
                        object.getAppUserInfo().getFirstname() + " " +
                        object.getAppUserInfo().getPatronymic(),
                object.getAppUserInfo().getEmail(),
                object.getRole().getName()
        );
    }
}
