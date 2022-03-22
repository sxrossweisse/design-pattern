package cloud.itspoon.design.c_prototype.shallow;

import lombok.extern.slf4j.Slf4j;

/**
 * @author suxin
 * @package cloud.itspoon.design.c_prototype
 * @date 2022/3/22 23:05
 * @description 一个测试类，测试浅拷贝
 */
@Slf4j
public class PersonClient {

    public static void main(String[] args) {
        Person person1 = new Person("张三", 127);

        Person person2 = person1.clone();
        person2.setAge(128);
        Person person3 = person1.clone();

        log.info("打印person 1: {}", person1);
        log.info("打印person 2: {}", person2);
        log.info("打印person 3: {}", person3);

    }

}
