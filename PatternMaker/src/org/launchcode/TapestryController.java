package org.launchcode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.security.krb5.internal.PAData;

import java.util.ArrayList;
import java.util.List;

public class TapestryController {
//this class will contain the main() method
//should do the following:
    //1. for each pattern, print band of 8 pattern-blocks wide and 3 rows tall
    //2. leave a few blank lines
    //3. for each pattern, print a band 6 pattern-blocks wide and 8 rows tall
    private static List<Pattern> patternList = new ArrayList<>();

    public static void main(String[] args) {
        Pattern crossStitchWigglePattern = new CrossStitchWigglePattern();
        addToPatternList(crossStitchWigglePattern);
        Pattern zigZagLinesPattern = new ZigZagLinesPattern();
        addToPatternList(zigZagLinesPattern);
        Pattern baublePattern = new BaublePattern();
        addToPatternList(baublePattern);
        Pattern blockyBaublePattern = new BlockyBaublePattern();
        addToPatternList(blockyBaublePattern);

        for (Pattern pattern : patternList) {
            for (int rows = 0; rows < 3; rows++) {
                for (int length = 0; length < 8; length++) {
                    pattern.pattern();
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (Pattern pattern : patternList) {
            for (int rows = 0; rows < 8; rows++) {
                for (int length = 0; length < 6; length++) {
                    pattern.pattern();
                }
                System.out.println();
            }

        }
    }
    static void addToPatternList(Pattern pattern) {
        patternList.add(pattern);
    }
}
