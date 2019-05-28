package org.launchcode;

public class ZigZagLinesPattern extends Pattern {
    //prints pattern: ZZZ===ZZZ===
    //Needle Jam rate of 0%

    ZigZagLinesPattern(){}

    public void pattern(){
        Stitch zigZag = new ZigZagStitch();
        Stitch fill = new FillStitch();
        for (int i = 0; i < 2; i++){
            for (int x = 0; x < 3; x++){
                zigZag.sew();
            }
            for (int y = 0; y < 3; y++){
                fill.sew();
            }
        }
    }
}
