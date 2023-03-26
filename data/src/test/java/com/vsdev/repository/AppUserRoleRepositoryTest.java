package com.vsdev.repository;

import com.vsdev.DataConfig;
import com.vsdev.model.AppUserRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class})
@Transactional
@TestPropertySource(value = "classpath:/test.db.properties")
public class AppUserRoleRepositoryTest {
    @Autowired
    private AppUserRoleRepository appUserRoleRepository;

    @Test
    public void findAppUserRoleByName() {
        String expectedRole = "Administrator";
        Optional<AppUserRole> actualResult = appUserRoleRepository.findAppUserRoleByName(expectedRole);
        assertTrue(actualResult.isPresent());
        actualResult.ifPresent(actual -> assertEquals(expectedRole, actualResult.get().getName()));
    }
}