package com.example.springbootdemo.service;

import com.example.springbootdemo.model.User;
import com.example.springbootdemo.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> index() {
        return usersRepository.findAll();
    }

    public User show(int id) {
        Optional<User> foundUser = usersRepository.findById(id);
        return foundUser.orElse(null);
    }

    public void save(User person) {
        usersRepository.save(person);
    }

    public void update(int id, User updatedPerson) {
        User toBeUpdated = show(id);
        toBeUpdated.setName(updatedPerson.getName());
        toBeUpdated.setSurname(updatedPerson.getSurname());
        toBeUpdated.setCity(updatedPerson.getCity());
        toBeUpdated.setAge(updatedPerson.getAge());
        usersRepository.save(toBeUpdated);
    }

    public void delete(int id) {
        usersRepository.deleteById(id);
    }
}
