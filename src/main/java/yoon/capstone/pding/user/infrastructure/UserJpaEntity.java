package yoon.capstone.pding.user.infrastructure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import yoon.capstone.pding.user.service.domain.User;

import java.time.LocalDateTime;

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


    public User toModel(UserJpaEntity userJpaEntity){
        return User.builder()
                .email(userJpaEntity.getEmail())
                .password(userJpaEntity.getPassword())
                .nickName(userJpaEntity.getNickName())
                .profile(userJpaEntity.getProfile())
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

}
