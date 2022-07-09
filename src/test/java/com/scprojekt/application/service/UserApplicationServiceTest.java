package com.scprojekt.application.service;

import com.scprojekt.domain.model.user.User;
import com.scprojekt.domain.model.user.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserApplicationServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserApplicationService userApplicationService;

    @BeforeEach
    void setUp() {
        when(userApplicationService.getUser(any(Long.class))).thenReturn(new User());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setUserApplicationService(){
        assertThat(userApplicationService.getUser(0)).isNotNull();
    }
}