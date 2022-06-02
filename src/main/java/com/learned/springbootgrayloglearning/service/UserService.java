package com.learned.springbootgrayloglearning.service;


import com.learned.springbootgrayloglearning.domain.User;
import com.learned.springbootgrayloglearning.model.request.UserRequestDto;
import com.learned.springbootgrayloglearning.model.response.UserResponseDto;

import java.util.List;

public interface UserService {
    User saveUser(UserRequestDto userRequestDto);
    UserResponseDto updateUser(long id,UserRequestDto userRequestDto);
    UserResponseDto getUser(long id);
    void  deleteUser(long id);
    List<User> getAllUsers();

}
