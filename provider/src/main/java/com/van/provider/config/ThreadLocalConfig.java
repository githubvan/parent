package com.van.provider.config;


/**
 * @Classname ThreadLocalConfig
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/24 14:16
 * @Version 1.0
 **/
public class ThreadLocalConfig {
  //  private ThreadLocal<String> local = new ThreadLocal<>();
    private String a;

    public void setLocal() {
       // local.set(Thread.currentThread().getName());
        a +="*";
    }

    public String getLocal() {
      //  String s = local.get();
        System.out.println(a);
        return a;
    }
}

class OneThread extends Thread {

    private ThreadLocalConfig threadLocalConfig;

    public ThreadLocalConfig getThreadLocalConfig() {
        return threadLocalConfig;
    }

    public void setThreadLocalConfig(ThreadLocalConfig threadLocalConfig) {
        this.threadLocalConfig = threadLocalConfig;
    }


    @Override
    public void run() {
        threadLocalConfig.setLocal();
        threadLocalConfig.getLocal();
    }
}

class test {
    public static void main(String[] args) {
        ThreadLocalConfig threadLocalConfig = new ThreadLocalConfig();/*
        threadLocalConfig.setLocal();
        threadLocalConfig.getLocal();

        OneThread oneThread = new OneThread();
        oneThread.setName("second");
        oneThread.setThreadLocalConfig(threadLocalConfig);
        oneThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadLocalConfig.getLocal();*/

        OneThread oneThread1 = new OneThread();
        OneThread oneThread2 = new OneThread();
        OneThread oneThread3 = new OneThread();
        OneThread oneThread4 = new OneThread();
        oneThread1.setThreadLocalConfig(threadLocalConfig);
        oneThread2.setThreadLocalConfig(threadLocalConfig);
        oneThread3.setThreadLocalConfig(threadLocalConfig);
        oneThread4.setThreadLocalConfig(threadLocalConfig);
        oneThread1.setName("1");
        oneThread2.setName("2");
        oneThread3.setName("3");
        oneThread4.setName("4");
        oneThread1.start();
        oneThread2.start();
        oneThread3.start();
        oneThread4.start();


    }


}