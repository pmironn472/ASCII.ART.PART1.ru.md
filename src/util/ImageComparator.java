package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImageComparator {
    int count = 0;

    public int compareTwo(String sourceFile, String modifiedFile) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(sourceFile));
        BufferedReader br1 = new BufferedReader(new FileReader(modifiedFile));
        int c, b;
        while ((c = br.read()) != -1) {
            b = br1.read();
            if (c == b) return count;
            else count++;
        }
        return count;
    }

    public boolean compare(String sourceFile, String modifiedFile) throws IOException {
        ImageComparator ic = new ImageComparator();
        if (ic.compareTwo(sourceFile,modifiedFile) == 0) {
            return true;
        } else
            return false;
    }
}
