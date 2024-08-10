package io.github.quiteonion.test;

public class Layer {
    private Integer rowNum;
    private Integer colNum;
    private Integer capacity;//容量
    private Integer size;//目前有多少牌

    public Layer(Integer rowNum,Integer colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.capacity = this.rowNum*this.colNum;
        this.cells = new Cell[this.rowNum][this.colNum];

    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public Integer getColNum() {
        return colNum;
    }

    public void setColNum(Integer colNum) {
        this.colNum = colNum;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    private Cell[][] cells = null;

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
}
