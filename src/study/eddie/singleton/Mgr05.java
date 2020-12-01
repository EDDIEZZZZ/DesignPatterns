package study.eddie.singleton;

/**
 * @program: DesignPatterns
 * @description: 单例模式05
 * @author: EddieZhang
 * @create: 2020-11-30 11:55
 * lazy loading 懒汉式
 * 虽然也达到了初始化的目的，但带来了线程不安全的问题
 * 可以通过synchronized解决，但也带来了效率下降
 **/
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {

    }

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            // 妄图减少同步代码块的方式提高效率，然后不可行
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }

}
