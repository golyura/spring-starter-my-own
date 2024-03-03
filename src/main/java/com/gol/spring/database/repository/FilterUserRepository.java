package com.gol.spring.database.repository;

import com.gol.spring.database.entity.User;
import com.gol.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter filter);
}
