package cloud.itspoon.design.d_builder.builder;

import cloud.itspoon.design.d_builder.product.House;

/**
 * @author suxin
 * @package cloud.itspoon.design.d_builder
 * @date 2022/3/24 0:24
 * @description 房屋建造抽象层
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void doBuildDeep();

    public abstract void doBuildHigh();

    public abstract void doBuildLayers();

    public House doBuildHouse() {
        doBuildDeep();
        doBuildHigh();
        doBuildLayers();
        return house;
    }

}
