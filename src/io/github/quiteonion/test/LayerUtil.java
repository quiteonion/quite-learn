package io.github.quiteonion.test;

public class LayerUtil {
    public static Layer build(Integer rowNum, Integer colNum){
        Layer layer = new Layer(rowNum, colNum);
        Brand[] brands =BrandUtil.buildBrands(layer.getCapacity());
        int number = 0;
        Cell[][] cells = layer.getCells();
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                Cell cell = new Cell();
                cell.setState(1);
                cell.setBrand(brands[number++]);

                cells[row][col] = cell;
            }
        }
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                System.out.println(cells[row][col].getBrand().getName());
            }
        }
        return layer;
    }
}
