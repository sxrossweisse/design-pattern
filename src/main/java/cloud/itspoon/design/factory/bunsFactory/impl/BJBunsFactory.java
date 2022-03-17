package cloud.itspoon.design.factory.bunsFactory.impl;

import cloud.itspoon.design.factory.bunsFactory.BunsFactory;
import cloud.itspoon.design.factory.buns.Buns;
import cloud.itspoon.design.factory.buns.bj.BJChickenBuns;
import cloud.itspoon.design.factory.buns.bj.BJPorkBuns;
import cloud.itspoon.design.factory.buns.bj.BJTofuBuns;

/**
 * @author suxin
 * @package cloud.itspoon.design.factory
 * @date 2022/3/18 0:53
 * @description 用一句话描述
 */
public class BJBunsFactory implements BunsFactory {

    @Override
    public Buns createBuns(Integer bunsType) {
        Buns buns = null;

        switch (bunsType) {
            case 1:
                buns = new BJPorkBuns();
                break;
            case 2:
                buns = new BJTofuBuns();
                break;
            case 3:
                buns = new BJChickenBuns();
                break;
            default:
                break;
        }

        return buns;
    }
}
