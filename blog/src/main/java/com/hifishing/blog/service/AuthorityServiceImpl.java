package com.hifishing.blog.service;

import com.hifishing.blog.model.Authority;
import com.hifishing.blog.model.Post;
import com.hifishing.blog.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    private final AuthorityRepository authorityRepository;

    @Autowired
    public AuthorityServiceImpl(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    @Override
    public void save(Authority authority) {
        authorityRepository.save(authority);
    }

    @Override
    public Optional<Authority> findByName(String name) {
        return authorityRepository.findById(name);
    }

    @Override
    public List<Authority> findAll() {
        return authorityRepository.findAll();
    }

    @Override
    public void deleteByName(String name) {
        authorityRepository.deleteById(name);
    }
}
