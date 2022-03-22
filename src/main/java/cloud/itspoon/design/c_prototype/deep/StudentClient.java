package cloud.itspoon.design.c_prototype.deep;

import lombok.extern.slf4j.Slf4j;

/**
 * @author suxin
 * @package cloud.itspoon.design.c_prototype.deep
 * @date 2022/3/23 0:06
 * @description 深拷贝测试类
 */
@Slf4j
public class StudentClient {

    public static void main(String[] args) {
        Student student = new Student("张三", 12, new Phone("小米", 2017));

        Student student1 = student.deepClone();
        Student student2 = student.deepClone();
        student2.setPhone(new Phone("一加", 2017));
        Student student3 = student.deepClone();

        log.info("打印学生类本体：{}, 打印电话hash: {}", student, student.getPhone().hashCode());
        log.info("打印学生类1：{}, 打印电话hash: {}", student1, student1.getPhone().hashCode());
        log.info("打印学生类2：{}, 打印电话hash: {}", student2, student2.getPhone().hashCode());
        log.info("打印学生类3：{}, 打印电话hash: {}", student3, student3.getPhone().hashCode());

    }
}
