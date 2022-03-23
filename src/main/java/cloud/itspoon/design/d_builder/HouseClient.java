package cloud.itspoon.design.d_builder;

import cloud.itspoon.design.d_builder.builder.HouseBuilder;
import cloud.itspoon.design.d_builder.builder.impl.CommonHouseBuilder;
import cloud.itspoon.design.d_builder.builder.impl.HighEndHouseBuilder;
import cloud.itspoon.design.d_builder.director.HouseDirector;
import cloud.itspoon.design.d_builder.product.House;
import lombok.extern.slf4j.Slf4j;

/**
 * @author suxin
 * @package cloud.itspoon.design.d_builder
 * @date 2022/3/24 0:36
 * @description 最终的调用类
 * 建造者与工厂模式有点相似，都是通过将模板抽象出来，子类去进行具体的实现。
 * 主要区别还是工厂模式是可以看做一个将对象创建出来的方法，只关注把对象创建出来。
 * <p>
 * 但是建造者模式增加了一层缓存层，让产品与实现细节隔离开，让调用方不需要关注里面的实现细节，只需要去调用即可。
 * 建造者模式每个对象的实现细节，统一提供对外的调用方法，内部可以根据需要重写或不重写来自父类的doBuildHouse方法。
 */
@Slf4j
public class HouseClient {

    public static void main(String[] args) {

        HouseBuilder houseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        House house = houseDirector.createHouse();
        log.info("打印房子信息：{}", house);

        HouseBuilder highEndBuilder = new HighEndHouseBuilder();
        houseDirector.setHouseBuilder(highEndBuilder);
        House highEndHouse = houseDirector.createHouse();
        log.info("打印第二个房子信息：{}", highEndHouse);
    }
}
