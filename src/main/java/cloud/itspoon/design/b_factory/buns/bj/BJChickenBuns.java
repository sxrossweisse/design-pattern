package cloud.itspoon.design.b_factory.buns.bj;

import cloud.itspoon.design.b_factory.buns.Buns;

/**
 * @author suxin
 * @package cloud.itspoon.design.b_factory
 * @date 2022/3/18 1:18
 * @description 用一句话描述
 */
public class BJChickenBuns extends Buns {
    @Override
    public void leavenedDough() {
        System.out.println("鸡肉包子准备和面。。。。");
    }

    @Override
    public void prepareFilling() {
        System.out.println("准备上好的奥尔良鸡肉切块。。。");
    }

    @Override
    public void packageBuns() {
        System.out.println("包鸡肉包子。。。。。。");
    }

    @Override
    public void steamBuns() {
        System.out.println("鸡肉包子上笼屉开蒸。。。");
    }

    @Override
    public void outOfPot() {
        System.out.println("啊哈哈哈哈。。鸡肉包来咯。。。");
    }
}
