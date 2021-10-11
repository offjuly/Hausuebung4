import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApiReader {


    List myList = new ArrayList<>();

    public void readIn(){
        {
            try {
                BufferedReader br = new BufferedReader(new FileReader("numbers.csv"));
                String line = br.readLine();

                while(line != null){
                    String[] split = line.split(":");
                    for (int i = 0; i < split.length; i++) {
                        System.out.println(split[i]);
                        myList.add(split[i]);
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
