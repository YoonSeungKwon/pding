package yoon.capstone.pding.friend.infrastructure;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import yoon.capstone.pding.friend.FriendRepository;
import yoon.capstone.pding.friend.service.domain.Friend;
import yoon.capstone.pding.user.service.domain.User;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FriendRepositoryImpl implements FriendRepository {

    private final FriendJpaRepository friendJpaRepository;

    @Override
    public void save(FriendJpaEntity friendJpaEntity) {

    }

    @Override
    public List<Friend> findAll(User user) {
        return null;
    }

    @Override
    public void rejectFriend(Friend friend) {

    }

    @Override
    public void acceptFriend(Friend friend) {

    }
}
