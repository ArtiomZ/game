import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Create create = new Create();
        String[] path = new String[]
                {
                        "C:\\Games\\src",
                        "C:\\Games\\res",
                        "C:\\Games\\savegames",
                        "C:\\Games\\temp",
                        "C:\\Games\\src\\main",
                        "C:\\Games\\src\\test",
                        "C:\\Games\\res\\drawables",
                        "C:\\Games\\res\\vectors",
                        "C:\\Games\\res\\icons"
                };

        String[] path2 = new String[]{
                "C:\\Games\\src\\main\\Main.java",
                "C:\\Games\\src\\main\\Utils.java",
                "C:\\Games\\temp\\temp.txt"
        };

        create.createDir(path);
        create.createFile(path2);

        try (FileWriter writer = new FileWriter("C:\\Games\\temp\\temp.txt")) {
            StringBuilder str = create.getStr();
            String log = str.toString();
            writer.write(log);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

