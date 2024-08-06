package model2.test3;

import model2.base.Callback3;

/**
 * @author LiuJiaJia
 */
public class TestA {

    private Callback3 callback;

    /**
     * 设置回调方法
     * @param callback set方法注入回调函数
     */
    public void setCallback(Callback3 callback) {
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
        b.b1(param,result -> {
            if (callback != null) {
                callback.execute(result);
            }
        });



    }
}
