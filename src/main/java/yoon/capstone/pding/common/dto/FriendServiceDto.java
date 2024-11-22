package yoon.capstone.pding.common.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FriendServiceDto {

    public final long requester;

    public final long receiver;

    public final boolean isFriend;

}
