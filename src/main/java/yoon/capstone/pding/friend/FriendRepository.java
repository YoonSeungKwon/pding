package yoon.capstone.pding.friend;

import yoon.capstone.pding.friend.infrastructure.FriendJpaEntity;
import yoon.capstone.pding.friend.service.domain.Friend;
import yoon.capstone.pding.user.service.domain.User;

import java.util.List;

public interface FriendRepository {

    void save(FriendJpaEntity friendJpaEntity);

    List<Friend> findAll(User user);

    void rejectFriend(Friend friend);

    void acceptFriend(Friend friend);

}
