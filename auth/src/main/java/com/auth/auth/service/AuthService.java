
package com.auth.auth.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.auth.auth.repository.UserRepository;
import com.auth.auth.model.User;


@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        // هنا ممكن تشفر الباسورد باستخدام BCryptPasswordEncoder
        return userRepository.save(user);
    }

    public Optional<User> login(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        // تحقق من كلمة المرور
        if(user.isPresent() && user.get().getPassword().equals(password)) {
            return user;
        }
        return Optional.empty();
    }
}
