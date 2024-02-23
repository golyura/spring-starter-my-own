package com.gol.spring.database.repository;

import com.gol.spring.bpp.InjectBean;
import com.gol.spring.database.pool.ConnectionPool;

public class CompanyRepository {
    @InjectBean
    private ConnectionPool connectionPool;


}
