package study.eddie.singleton;

/**
 * @program: DesignPatterns
 * @description: 枚举单例，最完美的写法
 * @author: EddieZhang
 * @create: 2020-11-30 12:17
 * 不仅可以解决线程同步，还可以防止反序列化(枚举类可以防止反射破坏单例)
 **/
public enum Mgr08 {

    INSTANCE;

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }

}
