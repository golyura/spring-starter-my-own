package com.gol.spring.mapper;

import com.gol.spring.database.entity.Company;
import com.gol.spring.dto.CompanyReadDto;
import org.springframework.stereotype.Component;

@Component
public class CompanyReadMapper implements Mapper<Company, CompanyReadDto> {

    @Override
    public CompanyReadDto map(Company object) {
        return new CompanyReadDto(
                object.getId(),
                object.getName()
        );
    }
}
