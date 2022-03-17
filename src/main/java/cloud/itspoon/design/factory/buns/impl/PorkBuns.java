package cloud.itspoon.design.factory.buns.impl;

import cloud.itspoon.design.factory.buns.Buns;

/**
 * @author suxin
 * @package cloud.itspoon.design.factory
 * @date 2022/3/18 1:12
 * @description 用一句话描述
 */
public class PorkBuns extends Buns {

    @Override
    public void leavenedDough() {
        System.out.println("肉包子和面。。。。");
    }

    @Override
    public void prepareFilling() {
        System.out.println("剁猪肉馅。。。。");
    }

    @Override
    public void packageBuns() {
        System.out.println("包猪肉包子");
    }

    @Override
    public void steamBuns() {
        System.out.println("上笼屉蒸猪肉包。。。");
    }

    @Override
    public void outOfPot() {
        System.out.println("猪肉馅包子好了。。。");
    }
}
