package yoon.capstone.pding.user.service.domain;

public interface UserUpdatable {

    UserUpdatable updateProfile(String profile);

    UserUpdatable updateNickName(String nickName);

    UserUpdatable updateEmail(String email);

}
