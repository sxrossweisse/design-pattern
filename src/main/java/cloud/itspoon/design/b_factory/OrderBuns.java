package cloud.itspoon.design.b_factory;

import cloud.itspoon.design.b_factory.buns.Buns;
import cloud.itspoon.design.b_factory.bunsFactory.BunsFactory;
import cloud.itspoon.design.b_factory.enums.BunsEnum;

/**
 * @author suxin
 * @package cloud.itspoon.design.b_factory
 * @date 2022/3/18 1:26
 * @description 用一句话描述
 */
public class OrderBuns {

    public OrderBuns(BunsFactory absBunsFactory, BunsEnum bunsEnum) {
        getBuns(absBunsFactory, bunsEnum);
    }

    private void getBuns(BunsFactory absBunsFactory, BunsEnum bunsEnum){

        Buns buns = absBunsFactory.createBuns(bunsEnum.getCode());
        buns.leavenedDough();
        buns.prepareFilling();
        buns.packageBuns();
        buns.steamBuns();
        buns.outOfPot();
    }
}
