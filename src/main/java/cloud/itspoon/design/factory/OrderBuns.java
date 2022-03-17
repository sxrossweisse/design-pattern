package cloud.itspoon.design.factory;

import cloud.itspoon.design.factory.buns.Buns;
import cloud.itspoon.design.factory.bunsFactory.BunsFactory;
import cloud.itspoon.design.factory.enums.BunsEnum;

/**
 * @author suxin
 * @package cloud.itspoon.design.factory
 * @date 2022/3/18 1:26
 * @description 用一句话描述
 */
public class OrderBuns {

    private BunsEnum bunsEnum;

    private BunsFactory absBunsFactory;

    public OrderBuns(BunsFactory absBunsFactory, BunsEnum bunsEnum) {
        getBuns(absBunsFactory, bunsEnum);
    }

    private void getBuns(BunsFactory absBunsFactory, BunsEnum bunsEnum){

        this.absBunsFactory = absBunsFactory;

        Buns buns = absBunsFactory.createBuns(bunsEnum.getCode());
        buns.leavenedDough();
        buns.prepareFilling();
        buns.packageBuns();
        buns.steamBuns();
        buns.outOfPot();
    }
}
