package java_lecture2;

import java.io.File;

/**
 * Работа с файловой системой
 */
public class program3 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir"); // user.dir - /Users/o/Documents/Java
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        System.out.println(pathFile);
        File f1 = new File("file.txt");
        File f2 = new File("/Users/o/Documents/Java/file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }

}
