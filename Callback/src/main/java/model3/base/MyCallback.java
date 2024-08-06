package model3.base;

import model3.TestA;

/**
 * @author LiuJiaJia
 */
public class MyCallback implements Callback {
    TestA a;

    public MyCallback(TestA a) {
        this.a = a;
    }

    @Override
    public void execute() {
        // 在这里执行回调到A类的逻辑
        a.callback();
    }

    @Override
    public void execute(String result) {
        // 在这里执行回调到A类的逻辑
        a.callback();
    }
}


