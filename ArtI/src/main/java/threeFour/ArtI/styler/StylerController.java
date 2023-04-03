package threeFour.ArtI.styler;

import lombok.Getter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class StylerController {

    private Map<String, Styler> stylerMap;

    /* 생성한 이미지 리스트 */
    @GetMapping("/styler")
    public List<StylerDto> getStylerList(){
        List<StylerDto> styles = new ArrayList<>();
        for (Styler style : stylerMap.values()) {
            styles.add(StylerDto.builder()
                    .id(style.getId())
                    .originImgId(style.getOriginImgId())
                    .createdImgId(style.getCreatedImgId()).build());
        }
        return styles;
    }
}
