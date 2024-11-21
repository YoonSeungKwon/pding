package yoon.capstone.pding.user.service.application;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yoon.capstone.pding.common.dto.UserServiceDto;
import yoon.capstone.pding.user.service.UserRepository;

@Service
@Builder
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


}
