package study.eddie.singleton;

/**
 * @program: DesignPatterns
 * @description: 单例模式03
 * @author: EddieZhang
 * @create: 2020-11-30 11:55
 * lazy loading 懒汉式
 * 虽然也达到了初始化的目的，但带来了线程不安全的问题
 **/
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {

    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }

}
