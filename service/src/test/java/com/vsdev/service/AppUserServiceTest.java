package com.vsdev.service;

import com.ServiceConfig;
import com.vsdev.DataConfig;
import com.vsdev.dto.AppUserCreateDto;
import com.vsdev.dto.AppUserReadDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        ServiceConfig.class,
        DataConfig.class})
@Transactional
@TestPropertySource(value = "classpath:/test.db.properties")
public class AppUserServiceTest {
    @Autowired
    private AppUserService appUserService;

    @Test
    public void getAppUsers() {
        Page<AppUserReadDto> appUsersPage = appUserService.getAppUsers(
                PageRequest.of(0, 10, Sort.by("appUserInfo.email")));
        List<AppUserReadDto> content = appUsersPage.getContent();
        assertEquals(10, content.size());
    }

    @Test
    public void createAppUser() {
        AppUserCreateDto appUserCreateDto = new AppUserCreateDto(
                "Savilov",
                "Vitaly",
                "Andreevich",
                "vitalik.savilov@gmail.com",
                "Administrator"
        );

        AppUserReadDto actualResult = appUserService.createAppUser(appUserCreateDto);
        assertEquals("Savilov Vitaly Andreevich", actualResult.getFullName());
        assertEquals(appUserCreateDto.getEmail(), actualResult.getEmail());
        assertEquals(appUserCreateDto.getRole(), actualResult.getRole());
    }
}