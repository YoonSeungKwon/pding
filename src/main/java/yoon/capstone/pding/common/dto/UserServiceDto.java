package yoon.capstone.pding.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserServiceDto implements UserDto{

    public final String email;

    public final String password;

    public final String nickName;

    public final String profile;

}
