/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dbsoftwares.beadando;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tóth Péter György
 */
public class TaskClass {

    public void executeFileRead(String filePath, int numberOfRacers) {
        Student[] students = new Student[numberOfRacers];
        int i = 0;
        try {
            File fileToRead = new File(filePath);
            System.out.println(fileToRead);
            Scanner inputFile = new Scanner(fileToRead);
            while (inputFile.hasNextLine()) {
                /**
                 * create a new student object
                 * every readed line is loaded to the right place int the object
                 */
                students[i] = new Student();
                students[i].name = inputFile.nextLine();
                students[i].city = inputFile.nextLine();
                students[i].firstScore = inputFile.nextLine();
                students[i].secondScore = inputFile.nextLine();
                students[i].thirdScore = inputFile.nextLine();
                students[i].fourthScore = inputFile.nextLine();
                students[i].fifthScore = inputFile.nextLine();
                i++;
            }
            inputFile.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
        }
        
        System.out.println(students[0].name);
        System.out.println(students[0].city);        
    }

    public void executeFileWrite(String filePath) {
        try {
            File fileToRead = new File(filePath);
            System.out.println(fileToRead);
            Scanner inputFile = new Scanner(fileToRead);
            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                System.out.println(line);
            }
            System.out.println("none");
            inputFile.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
        }
    }
}
