/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dbsoftwares.beadando;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Tóth Péter György
 */
public class TaskClass {

    Student[] students;
    StringBuilder sBuilder = new StringBuilder();

    public void executeFileRead(String filePath, int numberOfRacers) {
        students = new Student[numberOfRacers];
        int i = 0;
        try {
            File fileToRead = new File(filePath);
            Scanner inputFile = new Scanner(fileToRead);
            while (i < numberOfRacers && inputFile.hasNextLine()) {
                /**
                 * create a new student object every readed line is loaded to
                 * the right place int the object
                 */
                students[i] = new Student();
                students[i].name = inputFile.nextLine();
                students[i].city = inputFile.nextLine();
                students[i].firstScore = inputFile.nextLine();
                students[i].secondScore = inputFile.nextLine();
                students[i].thirdScore = inputFile.nextLine();
                students[i].fourthScore = inputFile.nextLine();
                students[i].fifthScore = inputFile.nextLine();
                students[i].calculateSumScore();

                if (students[i].sumScore >= 40) {
                    // got the 40%
                    System.out.println(students[i].name + " " + students[i].city);
                }
                i++;
            }
            inputFile.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
        }
    }

    public void executeFileWrite(String filePath) {
        try {
            File fileToWrite = new File(filePath);
            FileWriter fstream = new FileWriter(fileToWrite);
            BufferedWriter out = new BufferedWriter(fstream);

            out.append("this file has been created @ " + Calendar.getInstance().getTime() + "!");
            out.flush();
            out.close();
        } catch (IOException ex) {
            System.err.println("File not found!");
        }
    }
}
