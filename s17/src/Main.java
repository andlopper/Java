import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        Scanner sc = null;

        BufferedReader br = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

            br = new BufferedReader(new FileReader("text2.txt"));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
            try {
                if (br != null){
                    br.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}