package Task3;

import java.io.*;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        try {
            File task3 = new File("C:\\Users\\Asus\\IdeaProjects\\JPLesson4HW\\src\\Task3\\task3.txt");
//            bw.write(1250);
//            bw.write(-1);
//            bw.write(875);
//            bw.write(-36);
//            bw.write(0);

//            bw.flush();
//            bw.close();

//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Asus\\IdeaProjects\\JPLesson4HW\\src\\HWLesson4\\task3.txt"));

            int link;

            ArrayList arrayList = new ArrayList();

            Scanner sc = new Scanner(task3);
            sc.next();

            while (sc.hasNext()) {
                arrayList.add(sc.next());
            }

//            br.close();
            sc.close();

            System.out.println(arrayList);

            Collections.sort(arrayList);

            System.out.println("New list " + arrayList);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
