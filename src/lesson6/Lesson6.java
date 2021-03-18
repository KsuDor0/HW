package lesson6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lesson6 {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fin = new FileInputStream("C:\\Users\\Ksu_Dor\\Desktop\\Geekbrains\\javaText1.txt");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\Ksu_Dor\\Desktop\\Geekbrains\\javaText2.txt", true)) {
            byte[] buffer = new byte[fin.available()];

            fin.read(buffer, 0, buffer.length);

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
