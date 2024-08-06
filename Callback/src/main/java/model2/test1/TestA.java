package model2.test1;

import model2.base.Callback1;

/**
 * @author LiuJiaJia
 */
public class TestA {

    private Callback1 callback;

    /**
     * 设置回调方法
     * @param callback set方法注入回调函数
     */
    public void setCallback(Callback1 callback) {
        this.callback = callback;
    }

    /**
     * A类方法调用了B类方法
     */
    public void a1() {
        System.out.println("A's method is running.");

        // 创建B类实例
        TestB b = new TestB();

         //B类方法执行完毕后回调A的回调方法，无返回值
        b.b1(() -> {
            if (callback != null) {
                callback.execute();
            }
        });
    }
}
