import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ass4 {
    public static void main(String[] args) throws IOException {
        var path="C:\\Users\\pundaban\\project_dir\\StudentList.txt";
         String data= Files.readString(Path.of(path));
       System.out.println(data);
       long numberofLines=data.lines().count();
        System.out.println(numberofLines);
    }
}
