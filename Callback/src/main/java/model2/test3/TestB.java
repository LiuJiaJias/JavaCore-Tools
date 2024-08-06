package model2.test3;


import model2.base.Callback3;

/**
 * @author LiuJiaJia
 */
public class TestB {

    /**
     * B类方法
     * @param callback 有返回值回调
     */
    public void b1(String param,Callback3 callback) {
        System.out.println("B's method is running.");
        System.out.println("Receive A: "+param);
        // 模拟B方法的结果
        String result = "B's method result";
        // B类方法执行完毕后回调传入的回调方法
        callback.execute(result);
    }


}
