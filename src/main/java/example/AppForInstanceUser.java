package example;

import example.dao.impl.UserDao;
import example.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
//        // 创建实例工厂
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        // 通过实例工厂对象创建对象
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save();
    }
}
