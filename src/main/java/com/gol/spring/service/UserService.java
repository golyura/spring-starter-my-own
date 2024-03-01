package com.gol.spring.service;

import com.gol.spring.database.repository.CompanyRepository;
import com.gol.spring.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Qualifier("userRepository")
    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;
}
