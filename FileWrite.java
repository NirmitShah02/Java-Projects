import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

class FileWrite
{
    public static void main(String[] args) {
        Stream<String> streamm;
        try {
            File f1 = new File("C:\\Users\\nirmi\\Downloads\\java test1.txt");
            f1.createNewFile();

            String str = "this is my fav class.";

            FileWrite fw = new FileWrite();
            fw.write(str);
            fw.close();

            Path pf = Paths.get("C:\\Users\\nirmi\\Downloads\\java test1.txt");
            List<String> l1 = Files.readAllLines(pf);
            System.out.println(l1);

            Stream<String> stream = Files.lines(pf);
            stream.forEach(System.out::println);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void close() {
    }

    private void write(String str) {
    }
}
