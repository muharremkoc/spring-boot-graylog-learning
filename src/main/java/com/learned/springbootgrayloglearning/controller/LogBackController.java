package com.learned.springbootgrayloglearning.controller;

import com.learned.springbootgrayloglearning.domain.User;
import com.learned.springbootgrayloglearning.model.request.UserRequestDto;
import com.learned.springbootgrayloglearning.model.response.UserResponseDto;
import com.learned.springbootgrayloglearning.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/v1/graylog")
public class LogBackController {

    final UserService userService;

    @GetMapping("/user")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody UserRequestDto userRequestDto){
        return userService.saveUser(userRequestDto);
    }

    @PutMapping("/user/{id}")
    public UserResponseDto updateUser(@PathVariable("id") long id,@RequestBody UserRequestDto userRequestDto){
        return userService.updateUser(id,userRequestDto);
    }

    @GetMapping("/user/{id}")
    public UserResponseDto getUser(@PathVariable("id")long id){
        return userService.getUser(id);
    }

    @DeleteMapping ("/user/{id}")
    public void  deleteUser(@PathVariable("id")long id){
            userService.deleteUser(id);
    }

}
