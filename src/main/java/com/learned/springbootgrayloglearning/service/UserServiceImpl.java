package com.learned.springbootgrayloglearning.service;

import com.learned.springbootgrayloglearning.domain.User;
import com.learned.springbootgrayloglearning.mapper.UserMapper;
import com.learned.springbootgrayloglearning.model.request.UserRequestDto;
import com.learned.springbootgrayloglearning.model.response.UserResponseDto;
import com.learned.springbootgrayloglearning.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
public class UserServiceImpl implements UserService{

    final UserRepository userRepository;

    final UserMapper userMapper;

    @Override
    public User saveUser(UserRequestDto userRequestDto) {
       User user=userMapper.userRequestDtoToUser(userRequestDto);
        userRepository.save(user);
        log.info("User was successfully Saved");
        return user;
    }

    @Override
    public UserResponseDto updateUser(long id, UserRequestDto userRequestDto) {
        User user=userRepository.findById(id).orElseThrow();

        log.info("Old User values:"+user);
        user.setFirstName(userRequestDto.getFirstName());
        user.setLastName(userRequestDto.getLastName());
        user.setShoesNumber(userRequestDto.getShoesNumber());
        userRepository.save(user);
        log.info("New User Values:"+user);
        return userMapper.userToUserResponseDto(user);
    }

    @Override
    public UserResponseDto getUser(long id) {
        return userMapper.userToUserResponseDto(userRepository.findById(id).orElseThrow());
    }

    @Override
    public void deleteUser(long id) {
        if (userRepository.existsById(id)){
            userRepository.deleteById(id);
            log.info("User ID's:"+id+" is deleted");
        }else {
            log.error("User was not found");
        }

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
