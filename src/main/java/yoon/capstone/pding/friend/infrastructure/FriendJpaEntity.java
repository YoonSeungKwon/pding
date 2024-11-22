package yoon.capstone.pding.friend.infrastructure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import yoon.capstone.pding.friend.service.domain.Friend;
import yoon.capstone.pding.user.infrastructure.UserJpaEntity;

import java.util.Objects;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "friend")
public class FriendJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long friendId;

    @ManyToOne
    @JoinColumn(name = "friend_fromUser")
    private UserJpaEntity fromUser;

    @ManyToOne
    @JoinColumn(name = "friend_toUser")
    private UserJpaEntity toUser;

    private boolean isFriend;

    public Friend toModel(FriendJpaEntity friendJpaEntity){
        return Friend.builder()
                .requester(friendJpaEntity.fromUser.toModel())
                .receiver(friendJpaEntity.toUser.toModel())
                .isFriend(friendJpaEntity.isFriend)
                .build();
    }

    public static FriendJpaEntity toPersist(Friend friend){
        return FriendJpaEntity.builder()
                .fromUser(UserJpaEntity.toPersist(friend.getRequester()))
                .toUser(UserJpaEntity.toPersist(friend.getReceiver()))
                .isFriend(friend.isFriend())
                .build();
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.friendId);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendJpaEntity that = (FriendJpaEntity) o;
        return Objects.equals(friendId, that.friendId);
    }


}
