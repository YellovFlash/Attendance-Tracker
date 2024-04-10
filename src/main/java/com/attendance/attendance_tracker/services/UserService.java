package com.attendance.attendance_tracker.services;

import com.attendance.attendance_tracker.models.User;
import com.attendance.attendance_tracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveNewUser(User user){
        userRepository.save(user);
    }
    public void deleteNewUser(String userId){
        userRepository.deleteById(userId);
    }
    public User getUserFromId(String userId){
       return userRepository.findById(userId).orElse(null);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

}
