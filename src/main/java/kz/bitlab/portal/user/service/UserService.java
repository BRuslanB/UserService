package kz.bitlab.portal.user.service;

import kz.bitlab.portal.user.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();
    UserDto getUser(Long id);
    UserDto addUser(UserDto userDTO);
    UserDto updateUser(UserDto userDTO);
    void deleteUser(Long id);

}
