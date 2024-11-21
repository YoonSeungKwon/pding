package yoon.capstone.pding.friend.service.domain;

import lombok.Builder;
import yoon.capstone.pding.user.service.domain.User;

import java.util.List;

@Builder
public class Friend implements  FriendFindable, FriendAcceptable{

    public final User requester;

    public final User receiver;

    public final boolean isFriend;

    @Override
    public FriendAcceptable acceptFriend() {
        return null;
    }

    @Override
    public FriendAcceptable rejectFriend() {
        return null;
    }

    @Override
    public FriendFindable findFriend() {
        return null;
    }

    @Override
    public List<FriendFindable> findAllFriends() {
        return null;
    }

}
