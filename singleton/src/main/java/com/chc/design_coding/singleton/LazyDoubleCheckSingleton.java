package com.chc.design_coding.singleton;

/**
 * 懒汉式单例-使用双重检查解决线程安全问题
 * @Author chc
 * @Date 2019/4/18 21:50
 */
public class LazyDoubleCheckSingleton {
    // volatile 禁止指令重排,不具备原子性
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
//                  //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //2.初始化对象
//                    intra-thread semantics
//                    ---------------//3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
