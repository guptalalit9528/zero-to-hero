package osnative;

import java.io.IOException;

public class KaluGini {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        runtime.exec("calc");
        System.out.println("Hello Notepad open or not");



    }
}
