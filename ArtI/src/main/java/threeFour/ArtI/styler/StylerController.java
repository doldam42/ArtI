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
    public List<Styler> getStylerList(){
        return new ArrayList<Styler>(stylerMap.values());
    }

    /* 특정 이미지 불러오기 */
    @GetMapping("/styler/{id}")
    public Styler getStyler(@PathVariable("id") Long id){
        return stylerMap.get(id);
    }

    /* 특정 이미지 삭제하기*/
    @DeleteMapping("/styler/{id}")
    public void deleteStyler(@PathVariable("id") Long id){
        stylerMap.remove(id);
    }
}
