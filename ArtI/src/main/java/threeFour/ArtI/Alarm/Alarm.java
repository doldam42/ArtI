package threeFour.ArtI.Alarm;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Table(name="Alarm")
public class Alarm {

    @NotNull
    @Column(columnDefinition = "TEXT", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String text;

    private String createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
}
