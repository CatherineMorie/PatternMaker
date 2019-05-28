package org.launchcode;

public class BaublePattern extends Pattern {
    //prints pattern: --o--o--o--o--o

    BaublePattern(){}

    public void pattern(){
        Stitch shortLine = new ShortLineStitch();
        Stitch circle = new CircleStitch();
        for (int i = 0; i < 5; i++){
            for (int x = 0; x < 2; x++){
                shortLine.sew();
            }
            circle.sew();
        }
    }
}
