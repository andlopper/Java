import java.io.*;

public class Files {
    public static void main(String[] args) {
        String path = "text.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        String path2 = "text3.txt";
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine(); //Adiciona quebra de linha
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
