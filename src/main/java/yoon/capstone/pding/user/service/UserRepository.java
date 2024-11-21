package yoon.capstone.pding.user.service;

import yoon.capstone.pding.user.infrastructure.UserJpaEntity;

public interface UserRepository {

    UserJpaEntity save(UserJpaEntity user);

    void find();

    void findAll();

    boolean existEmail(String email);

}
