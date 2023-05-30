package com.example.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@Service
public class UserDaoService {
    // JPA/Hibernate > Database
    // UserDaoService > Static List

    private static int usersCount = 0;

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(++usersCount,"Adam",LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount,"Jim",LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    //public User findOne(int id) {
}
