package example.dao.impl;

public class BookDaoImpl implements BookDao{
    /**
     * 实例化bean三种方式
     * 1.提供可访问的构造方法 public bookDaoImpl()空参
     * 2. 静态工厂
     * 3.实例工厂初始化bean
     */
//    public BookDaoImpl() {
//        System.out.println("book dao constructor running...");
//    }

    public void save()
    {
        System.out.println("book dao save...");
    }
}
