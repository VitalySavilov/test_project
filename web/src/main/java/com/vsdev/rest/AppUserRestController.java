package com.vsdev.rest;

import com.vsdev.dto.AppUserCreateDto;
import com.vsdev.dto.AppUserReadDto;
import com.vsdev.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class AppUserRestController {
    private static final int PAGE_SIZE = 10;
    private final AppUserService appUserService;

    @GetMapping
    public ResponseEntity<List<AppUserReadDto>> getUsers(
            @RequestParam(name = "page", defaultValue = "0") int pageNumber) {
        Page<AppUserReadDto> page = appUserService.getAppUsers(
                PageRequest.of(pageNumber, PAGE_SIZE, Sort.by("appUserInfo.email")));
        return new ResponseEntity<>(
                page.getContent(),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AppUserReadDto> postUser(@RequestBody @Validated AppUserCreateDto appUserCreateDto) {
        return new ResponseEntity<>(
                appUserService.createAppUser(appUserCreateDto),
                HttpStatus.OK);
    }
}
