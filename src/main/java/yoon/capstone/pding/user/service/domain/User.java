package yoon.capstone.pding.user.service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
public class User implements UserUpdatable{

    public final String email;

    public final String password;

    public final String nickName;

    public final String profile;

    @Override
    public User updateProfile(String profile) {
        return User.builder()
                .email(this.email)
                .password(this.password)
                .nickName(this.nickName)
                .profile(profile)
                .build();
    }

    @Override
    public User updateNickName(String nickName) {
        return User.builder()
                .email(this.email)
                .password(this.password)
                .nickName(this.nickName)
                .profile(profile)
                .build();
    }

    @Override
    public User updateEmail(String email){
        return User.builder()
                .email(this.email)
                .password(this.password)
                .nickName(this.nickName)
                .profile(profile)
                .build();
    }

}
