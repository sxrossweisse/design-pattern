package cloud.itspoon.design.factory.bunsFactory;

import cloud.itspoon.design.factory.buns.Buns;

/**
 * @author suxin
 * @package cloud.itspoon.design.factory
 * @date 2022/3/18 0:51
 * @description 包子抽象工厂
 */
public interface BunsFactory {

    Buns createBuns(Integer bunsType);
}
