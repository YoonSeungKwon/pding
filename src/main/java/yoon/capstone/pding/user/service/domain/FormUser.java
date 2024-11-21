package yoon.capstone.pding.user.service.domain;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FormUser extends User implements UserAuthenticatable {

    @Override
    public boolean checkEmail(String email) {
        return super.email.equals(email);
    }

    @Override
    public boolean checkPassword(String password) {
        return super.password.equals(password);
    }

    @Override
    public boolean checkNickName(String nickName) {
        return super.nickName.equals(nickName);
    }
}
