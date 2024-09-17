package com.rest.ets.security;

import com.rest.ets.exception.UserNotFoundByIdException;
import com.rest.ets.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private  final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    // Optional<User> user = ;
        return userRepository.findByEmail(username)
                .map(CustomUserDetails::new)
        .orElseThrow(() -> new UsernameNotFoundException("User Not Found by This Email"));
    };
}