package threeFour.ArtI.book;

import org.springframework.web.bind.annotation.*;
import threeFour.ArtI.styler.Styler;
import threeFour.ArtI.styler.StylerDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    private Map<String, Book> bookMap;

    /* 생성한 동화 리스트 */
    @GetMapping("/book")
    public List<BookDto> getBookList(){
        List<BookDto> books = new ArrayList<>();

        for (Book book : bookMap.values()) {
            books.add(BookDto.builder()
                    .ImgIDs(book.getImgIDs())
                    .createdDate(book.getCreatedDate())
                    .keyword(book.getKeyword())
                    .id(book.getId()).build());
        }
        return books;
    }
}
