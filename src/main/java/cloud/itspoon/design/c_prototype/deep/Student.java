package cloud.itspoon.design.c_prototype.deep;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @author suxin
 * @package cloud.itspoon.design.c_prototype
 * @date 2022/3/22 23:23
 * @description 学生类，测试深拷贝
 * 深拷贝主要是使用io流去进行操作，也可以再重写clone方法，但是太过于低效，每个对象属性都要去加一次代码。不如直接用io去操作。
 */
@Slf4j
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Cloneable, Serializable {

    private String name;

    private Integer age;

    private Phone phone;

    public Student deepClone() {

        Student student = null;
        // 写出该类
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(this);
            // 将该类读取，拷贝返回
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                student = (Student) ois.readObject();
            } catch (ClassNotFoundException e) {
                log.error("读取学生类异常：", e);
            }
        } catch (IOException e) {
            log.error("写入学生类异常：", e);
        }

        return student;
    }
}
