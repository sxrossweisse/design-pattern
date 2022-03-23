package cloud.itspoon.design.d_builder.builder.impl;

import cloud.itspoon.design.d_builder.builder.HouseBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * @author suxin
 * @package cloud.itspoon.design.d_builder
 * @date 2022/3/24 0:26
 * @description 普通房子的建筑
 */
@Slf4j
public class CommonHouseBuilder extends HouseBuilder {

    @Override
    public void doBuildDeep() {
        house.setDeep(5);
        log.info("这层普通楼房挖了五米深");
    }

    @Override
    public void doBuildHigh() {
        house.setHigh(12);
        log.info("这层普通楼房盖了十二米高");

    }

    @Override
    public void doBuildLayers() {
        house.setLayers(5);
        log.info("这幢楼有五层");
    }
}
