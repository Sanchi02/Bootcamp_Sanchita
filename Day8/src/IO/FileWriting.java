package IO;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by badkass on 7/27/2017.
 */
public class FileWriting {
    public static void main(String[] args) {
        HashSet carNames = new HashSet();
        carNames.add("BMW");
        carNames.add("Porche");
        carNames.add("Lamobhogini");
        carNames.add("Alto");
        carNames.add("Range rover");
        carNames.add("Suzuki");
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            file = new File("C:/Users/badkass/IdeaProjects/Bootcamp007/Day8/src/IO/Cars");
            fw = new FileWriter(file);
            bw =  new BufferedWriter(fw);
            Iterator<String> itr = carNames.iterator();
            while (itr.hasNext()) {
                String temp = itr.next();
                bw.write(temp);
                bw.write("\n\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
