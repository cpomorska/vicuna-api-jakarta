package com.scprojekt.application.service;

import com.scprojekt.domain.model.user.UserRepository;
import com.scprojekt.domain.service.DomainUserService;
import com.scprojekt.stereotype.ApplicationService;
import jakarta.inject.Inject;

@ApplicationService
public class UserApplicationService extends DomainUserService {

    @Inject
    public UserApplicationService(UserRepository userRepository) {
        super(userRepository);
    }
}
