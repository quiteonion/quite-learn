package io.github.quiteonion.test;

import java.util.List;
import java.util.Random;

public class MapUtil {
    public static Map buildMap(Integer floorHeight) {
        Map map = new Map();
        map.setFloorHeight(floorHeight);


        Layer l1 = LayerUtil.build(3,3);
        Layer l2 = LayerUtil.build(6,6);
        Layer l3 = LayerUtil.build(9,9);

        map.getList().add(l1);
        map.getList().add(l2);
        map.getList().add(l3);


        return map;
    }

}
