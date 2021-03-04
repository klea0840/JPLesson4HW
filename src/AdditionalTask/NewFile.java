package AdditionalTask;

import java.io.*;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args) throws IOException {

        try {

            File file = new File("C:\\Users\\Asus\\IdeaProjects\\JPLesson4HW\\src\\AdditionalTask\\newFile.txt");

                System.out.println("File created.");
                FileWriter writer = new FileWriter("C:\\Users\\Asus\\IdeaProjects\\JPLesson4HW\\src\\AdditionalTask\\newFile.txt");
                writer.write("Hello World!!");
                writer.write("Hello Idiots");
                writer.write("I need a hero!!");
                writer.write("Hello Worlds!!");

                writer.flush();
                writer.close();
                String link = null;

                BufferedReader newbf = new BufferedReader(new FileReader(file));

                while ((link = newbf.readLine()) != null) {
                    System.out.println(link);
                }
                newbf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
