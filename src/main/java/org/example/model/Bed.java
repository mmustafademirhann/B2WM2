package org.example.model;

public class Bed {
//```pillows, height, sheets, quilt```
    private int pillows,height,sheets,quilts;
    private String style;

    public Bed( String style,int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;

    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public int getQuilts() {
        return quilts;
    }
}
