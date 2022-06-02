package com.learned.springbootgrayloglearning.mapper;

import com.learned.springbootgrayloglearning.domain.User;
import com.learned.springbootgrayloglearning.model.request.UserRequestDto;
import com.learned.springbootgrayloglearning.model.response.UserResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface UserMapper {

    @Mappings({
            @Mapping(target = "firstName",source = "firstName"),
            @Mapping(target = "lastName",source = "lastName"),
            @Mapping(target = "shoesNumber",source = "shoesNumber"),

    })
    User userRequestDtoToUser(UserRequestDto userRequestDto);


    @Mappings({
            @Mapping(target = "id",source = "id"),
            @Mapping(target = "firstName",source = "firstName"),
            @Mapping(target = "lastName",source = "lastName"),
            @Mapping(target = "shoesNumber",source = "shoesNumber"),

    })
    UserResponseDto userToUserResponseDto(User user);

}
