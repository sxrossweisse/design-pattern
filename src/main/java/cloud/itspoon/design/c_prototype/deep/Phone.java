package cloud.itspoon.design.c_prototype.deep;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author suxin
 * @package cloud.itspoon.design.c_prototype.deep
 * @date 2022/3/22 23:46
 * @description 手机类，作为属性对象，也需要实现Cloneable 和序列化，以及clone方法
 */
@Slf4j
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Cloneable, Serializable {

    private String name;

    private Integer createYear;

    @Override
    protected Phone clone() {
        Phone phone = null;
        try {
            phone = (Phone) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("电话对象克隆异常：", e);
        }

        return phone;
    }
}
