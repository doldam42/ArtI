package threeFour.ArtI.book;

import org.springframework.web.bind.annotation.*;
import threeFour.ArtI.styler.Styler;
import threeFour.ArtI.styler.StylerDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    BookService bookService;

    /* 생성한 동화 리스트 */
    @GetMapping("/book")
    public List<BookDto> getBookList(){
        List<BookDto> books = new ArrayList<>();

        for (Book book : bookService.getBookList()) {
            books.add(BookDto.builder()
                    .ImgIDs(book.getImgIDs())
                    .createdDate(book.getCreatedDate())
                    .keyword(book.getKeyword())
                    .id(book.getId()).build());
        }
        return books;
    }

    @GetMapping("/book/new")
    public BookDto getNewBook() {
        Book book = bookService.getNewBook();
        return BookDto.builder()
                .keyword(book.getKeyword())
                .ImgIDs(book.getImgIDs())
                .build();
    }
}
