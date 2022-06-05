import java.io.File;
import java.io.IOException;

public class Create {
    private StringBuilder str = new StringBuilder();

    public void createDir(String path, String name) {
        File dir = new File(path);
        if (dir.mkdir()) {
            str.append("\nСоздан каталог " + name);
        } else {
            str.append("\nНе удалось создать каталог " + name);
        }
    }

    public StringBuilder getStr() {
        return str;
    }

    public void createFile(String path, String name) {
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                str.append("\nСоздан файл " + name);
            }
        } catch (IOException e) {
            str.append(e.getMessage());
        }
    }
}
