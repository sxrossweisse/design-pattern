package cloud.itspoon.design.b_factory;

import cloud.itspoon.design.b_factory.bunsFactory.impl.HZBunsFactory;
import cloud.itspoon.design.b_factory.enums.BunsEnum;

/**
 * @author suxin
 * @package cloud.itspoon.design.b_factory
 * @date 2022/3/18 0:56
 * @description 用一句话描述
 */
public class BunsStore {

    public static void main(String[] args) {
        new OrderBuns(new HZBunsFactory(), BunsEnum.CHICKEN_BUNS);
    }
}
