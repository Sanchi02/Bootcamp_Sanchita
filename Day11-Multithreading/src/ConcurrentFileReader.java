import org.junit.Test;

import java.io.*;

/**
 * Created by badkass on 7/31/2017.
 */
public class ConcurrentFileReader {
    public static void main(String[] args) {
        FileReader1 reader1 = new FileReader1();
        FileReader2 reader2 = new FileReader2();

        Reader read = new Reader(reader1);
        read.start();

        Reader read1 = new Reader(reader2);
        read1.start();

        /*Thread thread1 = new Thread(reader1);
        thread1.start();
        Thread thread2 = new Thread(reader2);
        thread2.start();*/
    }
}

class Reader extends Thread {
    public Reader(Runnable target) {
        super(target);
    }


    public static void readfrom(String filename) {
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



class FileReader1 implements Runnable {
    @Override
    public void run() {
        Reader.readfrom("C:\\Users\\badkass\\IdeaProjects\\Bootcamp007\\Day11-Multithreading\\src\\SampleText1");
    }
}

class FileReader2 implements Runnable {
    @Override
    public void run() {
      Reader.readfrom("C:\\Users\\badkass\\IdeaProjects\\Bootcamp007\\Day11-Multithreading\\src\\SampleText2");
    }
}