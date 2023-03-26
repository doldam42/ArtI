package threeFour.ArtI.styler;

import lombok.Builder;
import lombok.Data;

@Data
public class StylerDto {

    private Long id;
    private Long originImgId;
    private Long createdImgId;
    private String createdDate;

    @Builder
    public StylerDto(Long id, Long originImgId, Long createdImgId, String createdDate){
        this.id = id;
        this.originImgId = originImgId;
        this.createdImgId = createdImgId;
        this.createdDate = createdDate;
    }

    public Styler toEntity(){
        Styler build = Styler.builder()
                .id(id)
                .originImgId(originImgId)
                .createdImgId(createdImgId)
                .createdDate(createdDate)
                .build();
        return build;
    }
}
