package yoon.capstone.pding.friend.service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import yoon.capstone.pding.user.service.domain.User;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
public class Friend implements FriendAcceptable, FriendRequestable{

    private User requester;

    private User receiver;

    private boolean isFriend;

    @Override
    public FriendAcceptable acceptFriend() {
        this.isFriend = true;
        return this;
    }

    @Override
    public FriendAcceptable rejectFriend() {
        this.isFriend = false;
        return this;
    }

}
