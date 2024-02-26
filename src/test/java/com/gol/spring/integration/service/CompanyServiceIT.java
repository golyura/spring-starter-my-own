package com.gol.spring.integration.service;

import com.gol.spring.CompanyService;
import com.gol.spring.config.DatabaseProperties;
import com.gol.spring.dto.CompanyReadDto;
import com.gol.spring.integration.annotation.IT;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@IT
@RequiredArgsConstructor
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = ApplicationRunner.class, initializers = ConfigDataApplicationContextInitializer.class)
public class CompanyServiceIT {

    private static final Integer COMPANY_ID = 1;

    private final CompanyService companyService;
    private final DatabaseProperties databaseProperties;
    @Test
    void findById() {
        var actualResult = companyService.findById(COMPANY_ID);

        assertTrue(actualResult.isPresent());

        var expectedResult = new CompanyReadDto(COMPANY_ID);
        actualResult.ifPresent(actual -> assertEquals(expectedResult, actual));
    }
}
