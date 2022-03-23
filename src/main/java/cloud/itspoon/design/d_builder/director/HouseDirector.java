package cloud.itspoon.design.d_builder.director;

import cloud.itspoon.design.d_builder.builder.HouseBuilder;
import cloud.itspoon.design.d_builder.product.House;
import lombok.*;

/**
 * @author suxin
 * @package cloud.itspoon.design.d_builder
 * @date 2022/3/24 0:32
 * @description 房屋创建类，缓存层
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HouseDirector {

    HouseBuilder houseBuilder;

    public House createHouse(){
        return houseBuilder.doBuildHouse();
    }

}
