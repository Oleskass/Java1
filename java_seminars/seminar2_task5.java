package java_seminars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class seminar2_task5 {
    public static void main(String[] args) {
        /*
         * Напишите метод, который вернёт содержимое текущей папки в виде
         * массива строк имён файлов.
         * Напишите метод, который запишет массив, возвращённый предыдущим методом в
         * файл.
         * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
         * исключения, оно должно записаться в лог-файл.
         */

        File f1 = new File("/Users/oleskass/Documents/Java/java_seminars");

        // -------получение пути текущей папки-------
        String path1 = System.getProperty("user.dir", null);
        System.out.println(path1);

        // -------исследование разных методов-------
        System.out.println("Имя папки: " + f1.getName());
        System.out.println("Путь: " + f1.getPath());
        System.out.println("Полный путь: " +
                f1.getAbsolutePath());
        System.out.println("Родительский каталог: " +
                f1.getParent());
        System.out.println(f1.exists() ? "Файл существует" : "Файл  не существует");
        System.out.println(f1.canWrite() ? "Свойство - можно записывать" : "Свойство - нельзя записывать");
        System.out.println(f1.canRead() ? "Свойство - можно читать" : "Свойство - нельзя читать");
        System.out.println("Это директория? " +
                (f1.isDirectory() ? "да" : " нет"));
        System.out.println("Это обычный файл? " +
                (f1.isFile() ? "да" : "нет"));
        System.out.println("Последняя модификация файла: "
                + f1.lastModified());
        System.out.println("Размер файла: " + f1.length()
                + " bytes");
        System.out.println();

        readFiles(f1);
        writeToFile(readFiles(f1));
    }

    public static String[] readFiles(File baseDirectory) {
        /*
         * Метод для чтения содержимого папки
         */
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (baseDirectory.isDirectory()) {
            for (File file : baseDirectory.listFiles()) {
                sb.append(file.getName() + ",");
                // System.out.println(sb);
            }
            // System.out.println("Last line: " + sb);
        }
        str = sb.toString();
        String[] names = str.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }
        return names;
    }

    public static void writeToFile(String[] text) {

        try (FileWriter f1 = new FileWriter("StringArray.txt", true)) {
            for (int i = 0; i < text.length; i++) {
                f1.write(text[i] + ", ");
            }
            f1.write("\n");
            f1.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
