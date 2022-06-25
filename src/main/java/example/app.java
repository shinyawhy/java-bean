package example;

import example.service.impl.BookService;
import example.service.impl.BookServiceImpl;

public class app {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
