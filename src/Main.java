import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        File dir = new File("C:\\Games\\src");
        if (dir.mkdir()) {
            str.append("Каталог 'src' создан");
        } else {
            str.append("ошибка");
        }


        File dir2 = new File("C:\\Games\\res");
        if (dir2.mkdir()) {
            str.append("\nКаталог 'res' создан");
        } else {
            str.append("ошибка");
        }


        File dir3 = new File("C:\\Games\\savegames");
        if (dir3.mkdir()) {
            str.append("\nКаталог 'savegames' создан");
        } else {
            str.append("ошибка");
        }


        File dir4 = new File("C:\\Games\\temp");
        if (dir4.mkdir()) {
            str.append("\nКаталог 'temp' создан");
        } else {
            str.append("ошибка");
        }


        File dir5 = new File("C:\\Games\\src\\main");
        if (dir5.mkdir()) {
            str.append("\nКаталог 'main' создан");
        } else {
            str.append("ошибка");
        }


        File dir6 = new File("C:\\Games\\src\\test");
        if (dir6.mkdir()) {
            str.append("\nКаталог 'test' создан");
        } else {
            str.append("ошибка");
        }


        File myFile = new File("C:\\Games\\src\\main\\Main.java");
        try {
            if (myFile.createNewFile()) {
                str.append("\nФайл 'Main.java' создан");
            }
        } catch (IOException e) {
            str.append(e.getMessage());
        }

        File myFile2 = new File("C:\\Games\\src\\main\\Utils.java");
        try {
            if (myFile2.createNewFile()) {
                str.append("\nФайл 'Utils.java' создан");
            }
        } catch (IOException e) {
            str.append(e.getMessage());
        }


        File dir9 = new File("C:\\Games\\res\\drawables");
        if (dir9.mkdir()) {
            str.append("\nКаталог 'drawables' создан");
        } else {
            str.append("ошибка");
        }


        File dir10 = new File("C:\\Games\\res\\vectors");
        if (dir10.mkdir()) {
            str.append("\nКаталог 'vectors' создан");
        } else {
            str.append("ошибка");
        }


        File dir11 = new File("C:\\Games\\res\\icons");
        if (dir11.mkdir()) {
            str.append("\nКаталог 'icons' создан");
        } else {
            str.append("ошибка");
        }


        File myFile3 = new File("C:\\Games\\temp\\temp.txt");
        try {
            if (myFile3.createNewFile()) {
                str.append("\nФайл 'temp.txt' создан");
            }
        } catch (IOException e) {
            str.append(e.getMessage());
        }


        try (FileWriter writer = new FileWriter("C:\\Games\\temp\\temp.txt")) {
            String log = str.toString();
            writer.write(log);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

