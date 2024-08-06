package model2.test3;



/**
 * @author LiuJiaJia
 */
public class CallTest {
    public static void main(String[] args) {
        TestA a = new TestA();

        // 设置A的回调方法
        //======使用了Lambda表达式来创建一个匿名函数【它接受一个参数 result 并打印出带有该参数的回调方法的执行结果。】
        //======并将其作为回调方法传递给A类的setCallback方法
        //======result 是回调方法 execute(String result) 中的参数
        a.setCallback(result -> System.out.println("Callback method is executed with result: " + result));
        // 调用A类的方法
        a.a1();
    }
}
