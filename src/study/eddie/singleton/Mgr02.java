package study.eddie.singleton;

/**
 * @program: DesignPatterns
 * @description: 单例模式02
 * @author: EddieZhang
 * @create: 2020-11-30 11:55
 * 跟01是一个意思
 **/
public class Mgr02 {
    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02() {

    }

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr02 mgr01 = new Mgr02();
        Mgr02 mgr02 = new Mgr02();
        System.out.println(mgr01.equals(mgr02));
    }

}
