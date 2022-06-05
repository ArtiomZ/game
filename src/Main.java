import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Create create = new Create();

        create.createDir("C:\\Games\\src", "src");
        create.createDir("C:\\Games\\res", "res");
        create.createDir("C:\\Games\\savegames", "savegames");
        create.createDir("C:\\Games\\temp", "temp");
        create.createDir("C:\\Games\\src\\main", "main");
        create.createDir("C:\\Games\\src\\test", "test");
        create.createDir("C:\\Games\\res\\drawables", "drawables");
        create.createDir("C:\\Games\\res\\vectors", "vectors");
        create.createDir("C:\\Games\\res\\icons", "icons");

        create.createFile("C:\\Games\\src\\main\\Main.java", "Main.java");
        create.createFile("C:\\Games\\src\\main\\Utils.java", "Utils.java");
        create.createFile("C:\\Games\\temp\\temp.txt", "temp.txt");


        try (FileWriter writer = new FileWriter("C:\\Games\\temp\\temp.txt")) {
            StringBuilder str = create.getStr();
            String log = str.toString();
            writer.write(log);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

