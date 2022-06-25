package example.factory;

import example.dao.impl.UserDao;
import example.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean <UserDao>{
   // 代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

//    @Override
//    public boolean isSingleton() {
//        // true 单例 false 非单例
//        return true;
//    }
}
