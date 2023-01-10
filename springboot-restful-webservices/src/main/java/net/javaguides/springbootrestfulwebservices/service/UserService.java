package net.javaguides.springbootrestfulwebservices.service;
import net.javaguides.springbootrestfulwebservices.entity.User;

import java.util.List;

public interface UserService {
    User createUser (User user);
    User getUserById(Long userId);
    List<User> getAllUser();
    User updateUser(User user) throws Exception;
    void deleteUser(Long userId);
}
