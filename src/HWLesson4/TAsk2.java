package HWLesson4;

import java.io.*;

public class TAsk2 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Asus\\IdeaProjects\\JPLesson4HW\\src\\HWLesson4\\task2.txt")));
            bw.write(1250);
            bw.newLine();
            bw.write("I need a hero");
            bw.newLine();
            bw.write(875);
            bw.write(-36);
            bw.write("Говорим по-русски");
            bw.write(0);

            bw.flush();
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Asus\\IdeaProjects\\JPLesson4HW\\src\\HWLesson4\\task2.txt"));

            String link = null;

            while ((link = br.readLine()) != null) {
                System.out.println(link);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
