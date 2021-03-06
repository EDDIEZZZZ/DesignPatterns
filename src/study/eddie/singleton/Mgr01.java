package study.eddie.singleton;

/**
 * @program: DesignPatterns
 * @description: 单例模式01
 * @author: EddieZhang
 * @create: 2020-11-30 11:55
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM线程安全
 * 简单实用，推荐使用
 * 唯一缺点：不管用到与否，类加载时就完成实例化
 **/
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {

    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = new Mgr01();
        Mgr01 mgr02 = new Mgr01();
        System.out.println(mgr01.equals(mgr02));
    }

}
