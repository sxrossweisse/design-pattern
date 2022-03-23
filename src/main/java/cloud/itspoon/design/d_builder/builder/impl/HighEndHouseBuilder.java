package cloud.itspoon.design.d_builder.builder.impl;

import cloud.itspoon.design.d_builder.builder.HouseBuilder;
import cloud.itspoon.design.d_builder.product.House;
import lombok.extern.slf4j.Slf4j;

/**
 * @author suxin
 * @package cloud.itspoon.design.d_builder
 * @date 2022/3/24 0:29
 * @description 高端的建筑楼房
 */
@Slf4j
public class HighEndHouseBuilder extends HouseBuilder {

    @Override
    public void doBuildDeep() {
        house.setDeep(3);
        log.info("这个高端的房子挖了三米深");
    }

    @Override
    public void doBuildHigh() {
        house.setHigh(3);
        log.info("这个高端的房子盖了三米高");
    }

    @Override
    public void doBuildLayers() {
        house.setLayers(1);
        log.info("这个高端的房子有一层");
    }

    @Override
    public House doBuildHouse() {
        // 重写进行细节修改
        doBuildDeep();
        doBuildLayers();
        doBuildHigh();
        return house;
    }
}
