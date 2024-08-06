package model2.test1;

import model2.base.Callback1;

/**
 * @author LiuJiaJia
 */
public class TestB {

    /**
     * B类方法
     * @param callback 无返回值回调
     */
    public void b1(Callback1 callback) {
        System.out.println("B's method is running.");

        // B类方法执行完毕后回调传入的回调方法
        callback.execute();
    }

}
