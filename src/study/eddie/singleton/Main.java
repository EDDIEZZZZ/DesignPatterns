package study.eddie.singleton;

/**
 * @program: DesignPatterns
 * @description: 单例模式main类
 * @author: EddieZhang
 * @create: 2020-11-30 11:54
 **/
public class Main {
    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        System.out.println(mgr01);
    }
}
