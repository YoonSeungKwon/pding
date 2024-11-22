package yoon.capstone.pding.friend.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import yoon.capstone.pding.friend.service.domain.Friend;

public interface FriendJpaRepository extends JpaRepository<Friend, Long> {


}
