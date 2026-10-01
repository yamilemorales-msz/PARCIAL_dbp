package org.lab.campuseats.security;

import lombok.RequiredArgsConstructor;
import org.lab.campuseats.model.User;
import org.lab.campuseats.repository.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CurrentUserService {

    private final UserRepository userRepository;

    public User getCurrentUser() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("Usuario " + username + " no encontrado"));
    }

    public boolean isAdmin(User user) {
        return "ROLE_ADMIN".equals(user.getRole());
    }
}
