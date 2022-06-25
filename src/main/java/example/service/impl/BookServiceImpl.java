package example.service.impl;

import example.dao.impl.BookDao;
import example.dao.impl.BookDaoImpl;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save()
    {
        System.out.println("book service save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
