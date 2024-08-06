package model2.test1;

/**
 * @author LiuJiaJia
 */
public class CallTest {
    public static void main(String[] args) {
        TestA a = new TestA();

        // 设置A的回调方法
        //======使用了Lambda表达式来创建一个匿名函数，
        //======并将其作为回调方法传递给A类的setCallback方法
        a.setCallback(() -> System.out.println("Callback method is executed."));
        
        // 调用A类的方法
        a.a1();
    }
}
