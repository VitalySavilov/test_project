package com.vsdev.service;

import com.vsdev.dto.AppUserCreateDto;
import com.vsdev.dto.AppUserReadDto;
import com.vsdev.mapper.AppUserCreateMapper;
import com.vsdev.mapper.AppUserReadMapper;
import com.vsdev.model.AppUser;
import com.vsdev.repository.AppUserRepository;
import com.vsdev.repository.AppUserRoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AppUserService {
    private final AppUserRepository appUserRepository;
    private final AppUserRoleRepository appUserRoleRepository;
    private final AppUserCreateMapper appUserCreateMapper;
    private final AppUserReadMapper appUserReadMapper;

    public Page<AppUserReadDto> getAppUsers(Pageable pageable) {
        return appUserRepository.findAll(pageable).map(appUserReadMapper::map);
    }

    @Transactional
    public AppUserReadDto createAppUser(AppUserCreateDto appUserCreateDto) {
        AppUser appUser = appUserCreateMapper.map(appUserCreateDto);
        appUserRoleRepository.findAppUserRoleByName(appUserCreateDto.getRole())
                .ifPresent(appUser::setRole);
        return appUserReadMapper.map(appUserRepository.save(appUser));
    }
}
