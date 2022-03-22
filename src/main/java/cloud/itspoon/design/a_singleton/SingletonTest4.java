package cloud.itspoon.design.a_singleton;

/**
 * @author suxin
 * @package cloud.itspoon.design.a_singleton
 * @date 2022/3/17 0:35
 * @description 单例模式：枚举
 */
public class SingletonTest4 {

    public static void main(String[] args) {
        Hello instance = Hello.INSTANCE;
        Hello instance1 = Hello.INSTANCE;
        System.out.println(instance == instance1);// true
    }
}

enum Hello {

    INSTANCE;

    public void say() {
        System.out.println("say hello~");
    }
}
