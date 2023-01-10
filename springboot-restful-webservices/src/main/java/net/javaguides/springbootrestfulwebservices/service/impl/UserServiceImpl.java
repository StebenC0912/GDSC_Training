package net.javaguides.springbootrestfulwebservices.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.springbootrestfulwebservices.entity.User;
import net.javaguides.springbootrestfulwebservices.respository.UserRepository;
import net.javaguides.springbootrestfulwebservices.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public boolean checkEmail(String email) {
        List<User> listAllUser = getAllUser();
        for (User user : listAllUser) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public User updateUser(User user) {
        User existUser = userRepository.findById(user.getId()).get();
        existUser.setFirstName(user.getFirstName());
        existUser.setLastName(user.getLastName());
        if (checkEmail(user.getEmail())) {
            existUser.setEmail(getUserById(user.getId()).getEmail());
        } else {
            existUser.setEmail(user.getEmail());
        }
        return userRepository.save(existUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
