package model3.base;

/**
 * @author LiuJiaJia
 */
public  interface Callback {
    /**
     * 无返回值回调函数
     */
    void  execute();

    /**
     * 有回值回调函数
     * @param result 回调函数返回值
     */
    void execute(String result);


}
