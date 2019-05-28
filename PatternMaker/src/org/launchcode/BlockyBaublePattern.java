package org.launchcode;

public class BlockyBaublePattern extends Pattern {
    //prints pattern: []--o--[]--o--[]--o--

    BlockyBaublePattern(){}

    public void pattern(){
        Stitch block = new BlockStitch();
        Stitch shortLine = new ShortLineStitch();
        Stitch circle = new CircleStitch();
        for (int i = 0; i < 3; i++){
            block.sew();
            shortLine.sew();
            shortLine.sew();
            circle.sew();
            shortLine.sew();
            shortLine.sew();
        }
    }
}
