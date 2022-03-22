package cloud.itspoon.design.b_factory.buns.hz;

import cloud.itspoon.design.b_factory.buns.Buns;

/**
 * @author suxin
 * @package cloud.itspoon.design.b_factory
 * @date 2022/3/18 1:15
 * @description 用一句话描述
 */
public class HZTofuBuns extends Buns {
    @Override
    public void leavenedDough() {
        System.out.println("豆腐包子和面。。。。");
    }

    @Override
    public void prepareFilling() {
        System.out.println("准备上好的豆腐切块。。。");
    }

    @Override
    public void packageBuns() {
        System.out.println("包豆腐包子。。。。");
    }

    @Override
    public void steamBuns() {
        System.out.println("上笼屉蒸豆腐包子。。。");
    }

    @Override
    public void outOfPot() {
        System.out.println("豆腐包子出锅了。。。");
    }
}
