package cloud.itspoon.design.b_factory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author suxin
 * @package cloud.itspoon.design.b_factory.enums
 * @date 2022/3/18 1:21
 * @description 用一句话描述
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum BunsFactoryEnum {

    BJ_FACTORY(1, "北京工厂"),

    HZ_FACTORY(2, "杭州工厂"),

    OTHER_FACTORY(-1, "野路子工厂");

    Integer code;

    String desc;


}
