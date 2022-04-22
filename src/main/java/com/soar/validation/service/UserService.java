package com.soar.validation.service;

import com.soar.validation.dto.UserRequest;
import com.soar.validation.entity.User;
import com.soar.validation.exceptions.UserNotFoundException;
import com.soar.validation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest){
       User user = User.build(0L,userRequest.getName(), userRequest.getEmail(), userRequest.getAge(),
               userRequest.getMobile(), userRequest.getGender(), userRequest.getNationality());
       return userRepository.save(user);
    }

    public User getUser(Long userId) throws UserNotFoundException{
        User user = userRepository.findByUserId(userId);
        if(user != null){
            return user;
        }else {
            throw new UserNotFoundException("User with id=" + userId + " doesn't exist.");
        }
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
