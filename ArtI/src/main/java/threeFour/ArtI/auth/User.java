package threeFour.ArtI.auth;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Table(name="ArtiUser")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(columnDefinition = "TEXT", nullable = false)
    private String password;

    @NotNull
    @Column(columnDefinition = "TEXT", nullable = false)
    private String userName;

    @NotNull
    @Column(columnDefinition = "TEXT", nullable = false)
    private String NickName;
}