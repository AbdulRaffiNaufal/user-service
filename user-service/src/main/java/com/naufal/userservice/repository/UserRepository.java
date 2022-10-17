/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.userservice.repository;

import com.naufal.userservice.dto.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
/**
 *
 * @author IIISI
 */
@Repository
public class UserRepository {

    List<User> userList = new ArrayList<>();
    
    public List<User> getAllUsers() {
        return userList;
    }

    public User getUser(String id) {
        Optional<User> first = userList.stream().filter(u -> u.getId().equals(id)).findFirst();
        if(first.isPresent()){
            return first.get();
        }else{
            return new User();
        }
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User updateUser(User user) {
        for(User ul :userList){
            if(ul.getId().equals(user.getId())){
                ul.setName(user.getName());
                ul.setAddress(user.getAddress());
                ul.setId(user.getId());
                return ul;
            }
        }
        return new User();
    }

    public User deleteUser(String id) {
        Optional<User> first = userList.stream().filter(u -> u.getId().equals(id)).findFirst();
        if(first.isPresent()){
            User user = first.get();
            userList.remove(user);
            return user;
        }else{
            return new User();
        }
    }

  
}
