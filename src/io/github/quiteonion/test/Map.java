package io.github.quiteonion.test;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private Integer floorHeight;
    private List<Layer> list = new ArrayList<>();

    public Integer getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(Integer floorHeight) {
        this.floorHeight = floorHeight;
    }

    public List<Layer> getList() {
        return list;
    }

    public void setList(List<Layer> list) {
        this.list = list;
    }
}
