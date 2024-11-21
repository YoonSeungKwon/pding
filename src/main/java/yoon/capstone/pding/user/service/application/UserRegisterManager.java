package yoon.capstone.pding.user.service.application;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yoon.capstone.pding.common.dto.UserServiceDto;
import yoon.capstone.pding.user.infrastructure.UserJpaEntity;
import yoon.capstone.pding.user.service.UserRepository;
import yoon.capstone.pding.user.service.domain.User;

@Service
@Builder
@RequiredArgsConstructor
public class UserRegisterManager {

    private final UserRepository userRepository;

    @Transactional
    public void register(UserServiceDto dto){

        if(userRepository.existEmail(dto.email)){
            throw new RuntimeException("이미 존재하는 이메일");
        }

        User user = User.builder()
                .email(dto.email)
                .password(dto.password)
                .nickName(dto.nickName)
                .profile(dto.profile)
                .build();

        userRepository.save(UserJpaEntity.toPersist(user));
    }

}
