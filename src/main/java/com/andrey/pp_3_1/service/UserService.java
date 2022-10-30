package com.andrey.pp_3_1.service;



import com.andrey.pp_3_1.model.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public void updateUser(User user);

    public User getUserById(int id);

    public void removeUser(int id);


    List<User> getAllUsers();
}
