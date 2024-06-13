package com.example.springbootrestfulwebservices.mapper;

import com.example.springbootrestfulwebservices.entity.User;
import com.example.springbootrestfulwebservices.entity.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    // use third library mapstruct
    // provide implementation of this interface
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

//    @Mapping(source = "email", target = "emailAddress")    // if two entities fields not matching
    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);


}
