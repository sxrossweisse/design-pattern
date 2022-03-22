package cloud.itspoon.design.b_factory.bunsFactory.impl;

import cloud.itspoon.design.b_factory.bunsFactory.BunsFactory;
import cloud.itspoon.design.b_factory.buns.Buns;
import cloud.itspoon.design.b_factory.buns.hz.HZChickenBuns;
import cloud.itspoon.design.b_factory.buns.hz.HZPorkBuns;
import cloud.itspoon.design.b_factory.buns.hz.HZTofuBuns;

/**
 * @author suxin
 * @package cloud.itspoon.design.b_factory
 * @date 2022/3/18 0:55
 * @description 用一句话描述
 */
public class HZBunsFactory implements BunsFactory {

    @Override
    public Buns createBuns(Integer bunsType) {
        Buns buns = null;

        switch (bunsType) {
            case 1:
                buns = new HZPorkBuns();
                break;
            case 2:
                buns = new HZTofuBuns();
                break;
            case 3:
                buns = new HZChickenBuns();
                break;
            default:
                break;
        }

        return buns;
    }
}
