package com.vsdev.mapper;

import com.vsdev.dto.AppUserCreateDto;
import com.vsdev.model.AppUser;
import com.vsdev.model.AppUserInfo;
import org.springframework.stereotype.Component;

@Component
public class AppUserCreateMapper implements Mapper<AppUserCreateDto, AppUser> {

    @Override
    public AppUser map(AppUserCreateDto object) {
        return AppUser.builder()
                .appUserInfo(AppUserInfo.builder()
                        .lastname(object.getLastname())
                        .firstname(object.getFirstname())
                        .patronymic(object.getPatronymic())
                        .email(object.getEmail())
                        .build())
                .build();
    }
}
