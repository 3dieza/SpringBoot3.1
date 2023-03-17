package ru.nizamov.springcourse.project2Boot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.nizamov.springcourse.project2Boot.model.User;


import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    @Autowired
    private EntityManager entityManager;

    public UserDaoImpl(){}

    @Override
    public List<User> index() {
    List<User>resultList = entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    return resultList;
    }


    @Override
    public User show(Integer id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User updatedUser) {

        entityManager.merge(updatedUser);
    }

    @Override
    public void deleteById(Integer id) {
        entityManager.remove(show(id));
    }
}