package ru.nizamov.springcourse.Project2Boot.Service;

import ru.nizamov.springcourse.Project2Boot.model.User;

import java.util.List;

public interface UserService {
        List<User> index();
        User show(int id);
        void save(User user);
        void update(User updatedUser);
        void deleteById(int id);
}