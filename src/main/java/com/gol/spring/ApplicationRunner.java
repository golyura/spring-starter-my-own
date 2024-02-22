package com.gol.spring;

import com.gol.spring.database.pool.ConnectionPool;
import com.gol.spring.database.repository.CompanyRepository;
import com.gol.spring.database.repository.UserRepository;
import com.gol.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var connectionPool = new ConnectionPool();
        var userRepository = new UserRepository(connectionPool);
        var companyRepository = new CompanyRepository();
        var userService = new UserService(userRepository, companyRepository);



    }
}
