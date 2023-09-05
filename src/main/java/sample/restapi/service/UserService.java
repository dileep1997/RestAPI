package sample.restapi.service;

import sample.restapi.dto.UserDto;
import sample.restapi.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUser(Long userId);

    List<UserDto> getAllUsers();

    UserDto update(UserDto user);

    void deleteUser(Long userId);
}
