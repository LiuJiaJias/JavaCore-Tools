package model3;

import model3.base.MyCallback;

/**
 * @author LiuJiaJia
 */
public class TestA {

    /**
     * A类方法调用了B类方法
     */
    public void a1() {
        System.out.println("A's method is running.");
        String param = "leaf A";
        // 创建B类实例
        TestB b = new TestB();

        // B类方法执行完毕后回调A的回调方法，并传递返回值
        b.b1(param,new MyCallback(this));
        b.b2(param,new MyCallback(this));
    }

    /**
     * 回调逻辑
     */
    public void callback() {
        System.out.println("Callback method in A class is executed.");
    }
}
