import java.io.File;
import java.io.IOException;

public class Create {
    private StringBuilder str = new StringBuilder();

    public void createDir(String[] path) {
        for (int i = 0; i < path.length; i++) {
            String[] lastWord = path[i].split("\\\\");
            File dir = new File(path[i]);
            if (dir.mkdir()) {
                str.append("Создан каталог " + lastWord[lastWord.length - 1] + "\n");
            } else {
                str.append("Не удалось создать каталог " + lastWord[lastWord.length - 1] + "\n");
            }
        }
    }

    public void createFile(String[] path) {
        for (int i = 0; i < path.length; i++) {
            String[] lastWord = path[i].split("\\\\");
            File file = new File(path[i]);
            try {
                if (file.createNewFile()) {
                    str.append("Создан файл " + lastWord[lastWord.length - 1] + "\n");
                }
            } catch (IOException e) {
                str.append(e.getMessage() + "\n");
            }
        }
    }

    public StringBuilder getStr() {
        return str;
    }
}
