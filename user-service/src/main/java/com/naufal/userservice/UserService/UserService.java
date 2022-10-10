/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.userservice.UserService;

import com.naufal.userservice.dto.User;
import java.util.List;
/**
 *
 * @author IIISI
 */
public interface UserService {
    
    public List<User> getAllUsers();

    public User getUser(String id);

    public void addUser(User user);

    public User updateUser(User user);

    public User deleteUser(String id);

    
}
