package yoon.capstone.pding.user.infrastructure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import yoon.capstone.pding.friend.infrastructure.FriendJpaEntity;
import yoon.capstone.pding.user.service.domain.User;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Builder
public class UserJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    private String email;

    private String password;

    private String nickName;

    private String profile;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;


    public User toModel(){
        return User.builder()
                .email(this.getEmail())
                .password(this.getPassword())
                .nickName(this.getNickName())
                .profile(this.getProfile())
                .build();
    }

    public static UserJpaEntity toPersist(User user){
        return UserJpaEntity.builder()
                .email(user.email)
                .password(user.password)
                .nickName(user.nickName)
                .profile(user.profile)
                .build();
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.userId);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserJpaEntity that = (UserJpaEntity) o;
        return Objects.equals(userId, that.userId);
    }

}
