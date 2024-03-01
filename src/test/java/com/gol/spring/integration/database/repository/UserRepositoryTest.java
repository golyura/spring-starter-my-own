package com.gol.spring.integration.database.repository;


import com.gol.spring.database.repository.UserRepository;
import com.gol.spring.integration.annotation.IT;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@IT
@RequiredArgsConstructor
public class UserRepositoryTest {
    private final UserRepository userRepository;

    @Test
    void checkQueries() {
        var users = userRepository.findAllBy("a", "ov");
        Assertions.assertThat(users).hasSize(3);
    }

    @Test
    void checkNativeQueries() {
        var users = userRepository.findAllByUsername("ivan@gmail.com");
        Assertions.assertThat(users).hasSize(1);
    }

}
