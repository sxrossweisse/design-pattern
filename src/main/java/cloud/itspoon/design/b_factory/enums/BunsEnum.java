package cloud.itspoon.design.b_factory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author suxin
 * @package cloud.itspoon.design.b_factory.enums
 * @date 2022/3/18 1:23
 * @description 用一句话描述
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum BunsEnum {

    PORK_BUNS(1, "猪肉包子"),

    TOFU_BUNS(2, "豆腐包子"),

    CHICKEN_BUNS(3, "鸡肉包子"),

    OTHER_BUNS(-1, "奇行种包子");

    Integer code;

    String desc;


}
