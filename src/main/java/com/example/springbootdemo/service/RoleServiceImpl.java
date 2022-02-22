package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Role;
import com.example.springbootdemo.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService{

    private final RolesRepository rolesRepository;

    @Autowired
    public RoleServiceImpl(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    @Override
    public Role getByName(String name) {
        return rolesRepository.getByName(name);
    }

    @Override
    public List<Role> getAllRoles() {
        return rolesRepository.findAll();
    }
}
