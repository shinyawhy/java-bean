package example;

import example.dao.impl.BookDao;
import example.service.impl.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app2 {
    public static void main(String[] args) {
        // 获取ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");

        bookService.save();
    }
}
