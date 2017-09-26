package com.david;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

///import static input.InputUtils.stringInput;

public class Main {

    public static void main(String[] args) {

        String name = "David";
        String filename = "name.txt";

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename))){

            fileWriter.write(name + "\n");
            fileWriter.write("Java Programming");
            fileWriter.newLine();

            fileWriter.write(2545 + "\n");
            fileWriter.newLine();

            fileWriter.write("Tomorrow is Wednesday." + "\n");
            fileWriter.write("Yo Yo YO YO!");
            fileWriter.write(2620);
            fileWriter.newLine();

            fileWriter.write(Double.toString(123.45));

            fileWriter.close();

            System.out.println("Your name has been written to " + filename);

        } catch (IOException ioe) {

            System.out.println("Error writing to file.");
            System.out.println(ioe);
        }

        //FileReader reader = new FileReader("name.txt");
        //BufferedReader bufReader = new BufferedReader(reader);
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))){

            String line = fileReader.readLine();

            while (line != null) {
                System.out.println(line);

                line = fileReader.readLine();
            }

            fileReader.close();
        } catch(IOException ioe){

            System.out.println("Could not open ore read " + filename);
            System.out.println(ioe.toString());
        }

        System.out.println("If the code did not work, the program did not crash");
        System.out.println("The program keeps running so could perhaps ask the user " + "to create this file, or specify the file location");
    }
}
