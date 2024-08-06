package model1;

import model1.base.Callback;

/**
 * @author LiuJiaJia
 */
public  class  TestB  {
    /**
     * B类中的方法b它接受一个回调接口
      * @param callback 回调接口
     */
    public  void  b(Callback callback)  {
        System.out.println("B's  b()  method  is  executing.");
        //  ...  B类中的其他逻辑
        //  模拟任务执行过程
        try  {
            //  假设这里有一些耗时的操作
            Thread.sleep(2000);
        } catch (InterruptedException  e)  {
            e.printStackTrace();
        }
        //  任务执行完毕，调用回调函数
        //  执行完毕后，调用回调方法
        if  (callback  !=  null)  {
            callback.callback();
        }
    }
}
