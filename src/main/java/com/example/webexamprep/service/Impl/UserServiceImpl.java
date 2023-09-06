package com.example.webexamprep.service.Impl;

import com.example.webexamprep.model.entity.User;
import com.example.webexamprep.model.service.UserServiceModel;
import com.example.webexamprep.repository.UserRepository;
import com.example.webexamprep.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void register(UserServiceModel userServiceModel) {
        userRepository
                .save(modelMapper.map(userServiceModel, User.class));
    }
}
