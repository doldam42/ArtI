package threeFour.ArtI.book;

import lombok.Builder;
import lombok.Data;

@Data
public class BookDto {

    private Long id;
    private String keyword;
    private Long ImgIDs;
    private String createdDate;

    @Builder
    public BookDto(Long id, String keyword, Long ImgIDs, String createdDate){
        this.id = id;
        this.keyword = keyword;
        this.ImgIDs = ImgIDs;
        this.createdDate = createdDate;
    }

    public Book toEntity(){
        Book build = Book.builder()
                .id(id)
                .keyword(keyword)
                .ImgIDs(ImgIDs)
                .createdDate(createdDate)
                .build();
        return build;
    }
}
