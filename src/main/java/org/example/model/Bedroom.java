package org.example.model;

public class Bedroom {
    private Wall wall1,wall2,wall3,wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3,
                   Wall wall4, Ceiling ceiling, Bed bed,
                   Lamp lamp, Wardrobe wardrobe,
                   Carpet carpet) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }
}
