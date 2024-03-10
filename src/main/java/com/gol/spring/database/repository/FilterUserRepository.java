package com.gol.spring.database.repository;

import com.gol.spring.database.entity.Role;
import com.gol.spring.database.entity.User;
import com.gol.spring.dto.PersonalInfo;
import com.gol.spring.dto.UserFilter;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter filter);

    List<PersonalInfo> findAllByCompanyIdAndRole(Integer companyId, Role role);

    void updateCompanyAndRole(List<User> users);

    void updateCompanyAndRoleNamed(List<User> users);
}
