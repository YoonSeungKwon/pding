package yoon.capstone.pding.user.infrastructure;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import yoon.capstone.pding.user.service.UserRepository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    @Override
    public UserJpaEntity save(UserJpaEntity user) {
        return userJpaRepository.save(user);
    }

    @Override
    public void find() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public boolean existEmail(String email) {
        return false;
    }
}
