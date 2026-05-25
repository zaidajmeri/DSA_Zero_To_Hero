package Exception_In_Java;

import Constructor.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class try_with_resource {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("Example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }
        catch (IOException e){
            System.out.println("Io Exception cought: " + e.getMessage());

            }
        }

    }

