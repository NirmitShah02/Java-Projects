package ErrorAndException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fis = null;
        /* the constructor FileInputStream(File filename)
            throws a checked exception FileNotFound
         */
        fis = new FileInputStream("V:/STUDY-4TH SEM/JAVA//Programs/java1.txt");
        int k;
        /*
        Method read() of FileInputStream class throws a checked
        exception: IOException
         */
        while ((k = fis.read()) != -1){
            System.out.println((char) k);
        }
        /*
        The method close closes the file input stream
        throws IOException
         */
        fis.close();

    }
}