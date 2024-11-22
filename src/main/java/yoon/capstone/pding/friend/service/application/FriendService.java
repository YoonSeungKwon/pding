package yoon.capstone.pding.friend.service.application;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yoon.capstone.pding.friend.FriendRepository;

@Service
@Builder
@RequiredArgsConstructor
public class FriendService {

    private final FriendRepository friendRepository;

    private final FriendAcceptManager friendAcceptManager;

    private final FriendRequestManager friendRequestManager;




}
