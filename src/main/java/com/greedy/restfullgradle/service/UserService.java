package com.greedy.restfullgradle.service;

import com.greedy.restfullgradle.dto.UserDTO;
import com.greedy.restfullgradle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    //같은 계층끼리 연결 가능
    UserRepository userRepository;
    //이렇게 되면 userServie 와 userRepository 가 연결됨

    public UserDTO insertUser(UserDTO user){
        return userRepository.insertUser(user);
    }

    public List<UserDTO> getAllUsers(){
        return  userRepository.getAllUsers();
    }

    public UserDTO getUserByUserId(String userId){
        return userRepository.getUserByUserId(userId);
    }

    public void updateUserPw(String userId, UserDTO user){
        userRepository.updateUserPw(userId, user);
    }

    public void deleteUser(String userId){
        userRepository.deleteUser(userId);
    }
}
