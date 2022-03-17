package cloud.itspoon.design.factory.buns;

/**
 * @author suxin
 * @package cloud.itspoon.design.factory
 * @date 2022/3/18 0:57
 * @description 用一句话描述
 */
public abstract class Buns {

    /**
     * 发酵面团
     */
    public abstract void leavenedDough();

    /**
     * 准备馅料
     */
    public abstract void prepareFilling();

    /**
     * 包包子
     */
    public abstract void packageBuns();

    /**
     * 蒸包子
     */
    public abstract void steamBuns();

    /**
     * 出锅
     */
    public abstract void outOfPot();
}
