package threeFour.ArtI.styler;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StylerRepository extends JpaRepository<Styler, Long> {

    List<Styler> findAll(); // 전체 조회
}
