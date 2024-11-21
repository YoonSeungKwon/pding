package yoon.capstone.pding.user.service.domain;

public interface UserAuthenticatable {

    boolean checkEmail(String email);

    boolean checkPassword(String password);

    boolean checkNickName(String nickName);

}
