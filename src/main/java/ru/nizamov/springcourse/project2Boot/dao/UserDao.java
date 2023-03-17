package ru.nizamov.springcourse.project2Boot.dao;

import ru.nizamov.springcourse.project2Boot.model.User;
import java.util.List;
public interface UserDao {
    List<User> index();
    User show(Integer id);
    void save(User user);
    void update(User updateUser);
    void deleteById(Integer id);
}