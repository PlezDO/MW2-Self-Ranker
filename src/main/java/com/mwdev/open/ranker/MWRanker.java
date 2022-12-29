package com.mwdev.open.ranker;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author Plez Ownby
 */
public class MWRanker {


    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("stats.txt"));
            writer.write("writing to a file.");
            writer.write("\nthis is a new line");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("stats.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
                
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
