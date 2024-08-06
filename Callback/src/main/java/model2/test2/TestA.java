package model2.test2;

import model2.base.Callback2;

/**
 * @author LiuJiaJia
 */
public class TestA {

    private Callback2 callback;

    /**
     * 设置回调方法
     * @param callback set方法注入回调函数
     */
    public void setCallback(Callback2 callback) {
        this.callback = callback;
    }

    /**
     * A类方法调用了B类方法
     */
    public void a1() {
        System.out.println("A's method is running.");
        String param = "leaf A";
        // 创建B类实例
        TestB b = new TestB();

        // B类方法执行完毕后回调A的回调方法，并传递返回值
        b.b1(result -> {
            if (callback != null) {
                callback.execute(result);
            }
        });



    }
}
