package cloud.itspoon.design.c_prototype.shallow;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author suxin
 * @package cloud.itspoon.design.c_prototype
 * @date 2022/3/22 22:27
 * @description 一个person的实体类，简单实现了浅克隆，只是复制简单的基本数据类型。
 * 但是需要注意，本案例没有使用基本数据类型，只是而是用了String和int包装类型：Integer。
 * <p>
 * Integer是因为复制的时候直接是值传递，而不是使用了所谓引用的传递。
 * <p>
 * String则是因为创建的时候，对象存放在 方法区/常量池 中，直接指向，再次拷贝的时候还是会再 方法区/常量池 创建字符串。
 */
@Slf4j
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Cloneable {

    private String name;

    private Integer age;

    @Override
    protected Person clone() {

        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("person对象克隆异常：", e);
        }
        return person;

    }
}
