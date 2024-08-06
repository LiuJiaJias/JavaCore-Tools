package model1;

import model1.base.Callback;

/**
 * @author LiuJiaJia
 */
public class  TestA  {
    /**
     * A类中的 测试方法a
     * @param b B类的实例
     * @param callback 回调接口
     */
    public  void  a(TestB b, Callback callback)  {
        System.out.println("A's  a()  method  is  calling  B's  b()  method.");
        //  调用B类的b()方法，并传入回调接口
        b.b(callback);
    }

    /**
     * A类中的回调方法
      */
    public  void  callback()  {
        System.out.println("Callback  method  in  A  is  executed.");
    }

    public  Callback  getCallbackInstance()  {
        return  this::callback;
    }
}
