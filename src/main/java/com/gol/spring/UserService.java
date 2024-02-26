package com.gol.spring;

import com.gol.spring.database.entity.Company;
import com.gol.spring.database.repository.CrudRepository;
import com.gol.spring.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Qualifier("userRepository")
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;
}
