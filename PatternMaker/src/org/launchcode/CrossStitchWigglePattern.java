package org.launchcode;

public class CrossStitchWigglePattern extends Pattern{

    //prints pattern: xXxXxXxXx
    public void pattern(){
        Stitch small = new SmallCrossStitch();
        Stitch large = new LargeCrossStitch();
        for (int i = 0; i<5; i++){
            small.sew();
            large.sew();
        }
    }

}
