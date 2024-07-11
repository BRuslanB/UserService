package kz.bitlab.portal.user.mapper;

import kz.bitlab.portal.user.dto.UserDto;
import kz.bitlab.portal.user.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);

    List<UserDto> toDtoList(List<User> users);
}