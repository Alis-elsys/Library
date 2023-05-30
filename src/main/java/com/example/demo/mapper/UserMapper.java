package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.demo.entities.User;
import com.example.demo.controlers.resources.UserRes;

import java.util.List;

@Mapper(uses = {BookMapper.class, FineMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userToResuorce(UserRes resource);

    UserRes userToUserRes(User user);

    List<UserRes> toUserResList(List<User> users);
}
