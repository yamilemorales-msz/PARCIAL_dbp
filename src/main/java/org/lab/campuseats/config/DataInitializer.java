package org.lab.campuseats.config;

import lombok.RequiredArgsConstructor;
import org.lab.campuseats.model.User;
import org.lab.campuseats.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        if (!userRepository.existsByUsername("user")) {
            userRepository.save(User.builder()
                    .username("maria.eats")
                    .email("maria@utec.edu.pe")
                    .password(passwordEncoder.encode("Campus2026"))
                    .role("ROLE_USER")
                    .build());
        }
    }
}
