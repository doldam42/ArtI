package threeFour.ArtI.book;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    private Map<String, Book> bookMap;

    /* 생성한 동화 리스트 */
    @GetMapping("/book")
    public List<Book> getBookList(){
        return new ArrayList<Book>(bookMap.values());
    }

    /* 특정 동화 불러오기 */
    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") Long id){
        return bookMap.get(id);
    }

    /* 특정 동화 삭제하기 */
    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable("id") Long id){
        bookMap.remove(id);
    }
}
