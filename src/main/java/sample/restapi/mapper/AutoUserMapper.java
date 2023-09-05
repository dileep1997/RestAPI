package sample.restapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sample.restapi.dto.UserDto;
import sample.restapi.entity.User;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

//    @Mapping(source="email",target = "emailAddress") ------- this will be used when attributes in JPA entity and DTO is different
    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
