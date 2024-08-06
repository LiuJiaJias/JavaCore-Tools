package model1;

import model1.TestA;
import model1.TestB;
import model1.base.Callback;

/**
 * @author LiuJiaJia
 */
public  class  CallTest{
    public  static  void  main(String[]  args)  {
        TestA a  =  new  TestA();
        TestB b  =  new  TestB();
        //  创建一个回调实例，指向A类中的callback方法
        Callback callbackInstance  =  a::callback;
        //  A类中的a()方法调用B类的b()方法，并传入回调实例
        a.a(b,  callbackInstance);
    }
}
