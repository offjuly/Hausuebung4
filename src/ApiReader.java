import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApiReader {
    List myList = new ArrayList<>();

    public void readIn() {
        {
            Scanner scanner = new Scanner(System.in);
            try {
                BufferedReader br = new BufferedReader(new FileReader("numbers.csv"));
                String line ;
                boolean running = true;
                while ((line = br.readLine()) != null) {
                    String[] split = line.split(":");
                    for (int i = 0; i < split.length; i++) {
                        System.out.println(split[i]);
                        running = true;
                        try {
                           int j= Integer.parseInt(split[i]);
                        }catch( NumberFormatException e){
                            running = false;
                        }
                        if(running == true){
                            myList.add(Integer.parseInt(split[i]));

                        }
                        System.out.println(myList.size());

                        //int userEingabe = scanner.nextInt();

                        //if (Integer.parseInt(split[i]) % userEingabe == 0) {
                          //  System.out.println(split[i]);
                        //}
                    }

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


