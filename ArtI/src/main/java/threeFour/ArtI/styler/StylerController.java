package threeFour.ArtI.styler;

import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class StylerController {

    private StylerService stylerService;

    /* 생성한 이미지 리스트 */
    @GetMapping("/styler")
    public List<StylerDto> getStylerList(){
        List<StylerDto> styles = new ArrayList<>();
        for (Styler style : stylerService.getStylerList()) {
            styles.add(StylerDto.builder()
                    .id(style.getId())
                    .originImgId(style.getOriginImgId())
                    .createdImgId(style.getCreatedImgId()).build());
        }
        return styles;
    }

    /* db에 새로 originId, createdId 를 만들고 가져오기 */
    @GetMapping("/styler/new")
    public StylerDto getNewStyler()
    {
        Styler newOne = stylerService.getNewStyler();
        return StylerDto.builder()
                .createdImgId(newOne.getCreatedImgId())
                .originImgId(newOne.getOriginImgId())
                .build();
    }
}
