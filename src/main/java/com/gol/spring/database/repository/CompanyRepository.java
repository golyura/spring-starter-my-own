package com.gol.spring.database.repository;

import com.gol.spring.bpp.Auditing;
import com.gol.spring.bpp.InjectBean;
import com.gol.spring.bpp.Transaction;
import com.gol.spring.database.entity.Company;
import com.gol.spring.database.pool.ConnectionPool;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {
//    @Autowired
    //    @Resource(name = "pool1")
//    @Qualifier("pool1")
    private ConnectionPool pool1;
    @Autowired
    private List<ConnectionPool> pools;
    @Value("${db.pool.size}")
    private Integer poolSize;


//    @Autowired
//    @Qualifier("pool1")
//    public void setPool1(ConnectionPool pool1) {
//        this.pool1 = pool1;
//    }

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }
}
