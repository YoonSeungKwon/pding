package yoon.capstone.pding.friend.service.application;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yoon.capstone.pding.friend.FriendRepository;
import yoon.capstone.pding.friend.service.domain.Friend;
import yoon.capstone.pding.user.service.domain.User;

import java.util.List;

@Service
@Builder
@RequiredArgsConstructor
public class FriendRequestManager {

    private final FriendRepository friendRepository;


    public List<Friend> getFriendRequest(User user){
        List<Friend> requestList = friendRepository.findAll(user);
        return requestList;
    }

}
