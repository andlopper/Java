package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Votes {
    public static void main(String[] args) {

        String path = "votes.txt";
        Map<String, Integer> map = new LinkedHashMap<>(); //Linked para ordenar

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] strings = line.split(",");
                if (map.containsKey(strings[0])){
                    map.put(strings[0], Integer.parseInt(strings[1]) + map.get(strings[0]));
                } else {
                    map.put(strings[0], Integer.parseInt(strings[1]));
                }
                line = br.readLine();
            }
            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
