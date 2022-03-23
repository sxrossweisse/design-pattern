package cloud.itspoon.design.d_builder.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author suxin
 * @package cloud.itspoon.design.d_builder
 * @date 2022/3/24 0:18
 * @description 产品类(房子)
 */
@Getter
@Setter
@ToString
public class House {

    /**
     * 楼房高度
     */
    private Integer high;

    /**
     * 楼房深度
     */
    private Integer deep;

    /**
     * 层数
     */
    private Integer layers;

}
