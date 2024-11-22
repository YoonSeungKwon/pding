package yoon.capstone.pding.friend.service.application;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yoon.capstone.pding.friend.FriendRepository;
import yoon.capstone.pding.friend.service.domain.Friend;

@Service
@Builder
@RequiredArgsConstructor
public class FriendAcceptManager {

    private final FriendRepository friendRepository;

    public Friend acceptFriend(Friend friend){
        friend.acceptFriend();
        friendRepository.acceptFriend(friend);
        return friend;
    }


    public boolean rejectFriend(Friend friend){
        try{
            friend.rejectFriend();
            friendRepository.rejectFriend(friend);
            return true;
        }catch (Exception e){
            return false;
        }
    }


}
