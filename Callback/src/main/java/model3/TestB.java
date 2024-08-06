package model3;


import model2.base.Callback3;
import model3.base.MyCallback;

/**
 * @author LiuJiaJia
 */
public class TestB {

    /**
     * B类方法 无返回值
     * @param param 接收参数
     * @param callback 回调函数
     */
    public void b2(String param, MyCallback callback) {
        System.out.println("B's method is running 2.");
        System.out.println("Receive A: "+param);

        // B类方法执行完毕后回调传入的回调方法
        callback.execute();
    }

    /**
     * B类方法
     * @param callback 有返回值回调
     */
    public void b1(String param, MyCallback callback) {
        System.out.println("B's method is running 1.");
        System.out.println("Receive A: "+param);
        // 模拟B方法的结果
        String result = "B's method result";
        // B类方法执行完毕后回调传入的回调方法
        callback.execute(result);
    }



}
