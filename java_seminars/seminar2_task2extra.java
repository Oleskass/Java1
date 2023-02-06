package java_seminars;

public class seminar2_task2extra {

    public static void main(String[] args) {

        String text = "{\"name\" : \"site_3\", \"version\" : \"1.0.0\", \"description\" : \"text\", \"main\" : \"index-js\"}";
        // String text2 = text.replace(",", "");
        // String newText = text.replace("{", "").replace("}",
        // "").replace("\"", "").replace(" ", "");
        String newText = text.replaceAll("[{}\" ]", "");

        System.out.println(text);
        System.out.println(newText);

        String[] arr = newText.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println();

        for (String line : arr) {
            String[] newArr = line.split(":");
            System.out.println(newArr[0]);
            System.out.println(newArr[1]);
            System.out.println();
        }
    }

}
