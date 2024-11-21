package yoon.capstone.pding.user.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yoon.capstone.pding.user.infrastructure.UserJpaEntity;

public interface UserJpaRepository extends JpaRepository<UserJpaEntity, Long> {

}
