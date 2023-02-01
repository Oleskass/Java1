package java_lecture1;

import java.io.*;

public class program5 {
    // public static void main(String[] args) {
    // try (FileWriter fw = new FileWriter("file.txt", false)) {
    // fw.write("line 1");
    // fw.append('\n');
    // fw.append('2');
    // fw.append('\n');
    // fw.write("line 3");
    // fw.flush();
    // } catch (IOException ex) {
    // System.out.println(ex.getMessage());
    // }

    // }

    // // чтение файла посимвольно
    // public static void main(String[] args) throws Exception {
    // FileReader fr = new FileReader("file.txt");
    // int c;
    // while ((c = fr.read()) != -1) {
    // char ch = (char) c;
    // if (ch == '\n') {
    // System.out.print(ch);
    // } else {
    // System.out.print(ch);
    // }
    // }
    // System.out.println();
    // fr.close();
    // }

    // чтение файла построчно
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
