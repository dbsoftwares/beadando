/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dbsoftwares.beadando;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tóth Péter György
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String filePath;
        TaskClass taskToDo = new TaskClass();
        int numberOfRacers;

        // Menü kiiratása
        System.out.println("Menü:");
        System.out.println("1. fájlból beolvasás");
        System.out.println("2. fájlba írás");
        System.out.println("3. súgó");
        System.out.println("Input: kerem adja meg a menu pont szamat");

        // Beolvasás:csak számot fog elfogadni, egyéb esetben hibát dob
        // azért nextLine-al olvassuk, hogy az Enter zárja az inputot!
        int choice = Integer.parseInt(input.nextLine());


        // Az input kiértékelése
        switch (choice) {
            case 1:
                // Fájlból olvasás
                System.out.println("Kérem adja meg a fájl abszolút elérési útját:");
                filePath = input.nextLine();
                System.out.println("Kérem adja meg a versenyzők számát");
                numberOfRacers = Integer.parseInt(input.nextLine());
                taskToDo.executeFileRead(filePath, numberOfRacers);
                break;
            case 2:
                // Fájlba írás
                System.out.println("Kérem adja meg a fájl abszolút elérési útját:");
                //filePath = input.nextLine();
                taskToDo.executeFileWrite("C:\\INSTALL\\text2.txt");
                break;
            case 5:
                // sugó kiirása
                displayHelp();
                break;
            default:
                System.out.println("Error: hiba, a megadott ertek helytelen, a helyes ertek 1-5 intervallumba esik");
                break;
        }
    }

    /**
     * A súgó kiiratása
     */
    private static void displayHelp() {
        System.out.println("Sugo:");
        System.out.println("Usage/Felhasznalas:");

        System.out.println("Az 1.)-es menu pontal beolvashatunk egy text file tartalmat,\n"
                + "nagyon fontos, hogy a szoveges text file a helyes file formatumot tartalmaza\n"
                + "amely a kovetkezo keppen nezz ki:\n"
                + "Nev (karakterlanc)\n"
                + "Varos (karakterlanc)\n"
                + "Elso pont (numerikus decimalis egesz)\n"
                + "Masodik pont (numerikus decimalis egesz)\n"
                + "Harmadik pont (numerikus decimalis egesz)\n"
                + "Negyedik pont (numerikus decimalis egesz)\n"
                + "Otodik pont (numerikus decimalis egesz)\n");

        System.out.println("A 2.)-es feladat a file-ba valo irasert felel es a kepernyore iratasert,\n"
                + "nevet es varost iratja ki\n"
                + "azoket kiknek a pontja tobb illetve nagyobb mint 40%\n"
                + "a fajlba es a kepernyore iratas ugyan ugy tortenik mint a specifikacioban:\n"
                + "strukturaja, illetve szerkezete es formaja: nev , szokoz , varos\n");

        System.out.println("A 3.)-as feladat a Sugo, amely tajekoztatast nyujt a felhasznalonak a program hasznalatarol");

        System.out.println("a feladat specifikacio, illetve kovetelmeny:\n"
                + "Minden programnak tartalmaznia kell fájlból beolvasást, billentyűzetről olvasást, menüt, fájlba írást,\n"
                + "képernyőre írást, súgót. A programhoz mellékelni kell a dokumentációt, melyben szerepelnie kell a\n"
                + "feladat leírásának, a dokumentáció készítőjének adatainak, teszteseteknek, az állományok nevének,\n"
                + "algoritmusnak, programkódnak, program használati leírásnak. A teszt állományokat (be- és\n"
                + "kimenetek) csatolni kell. A projektet JAVA környezetben kell elkészíteni. Csak futtatható programot\n"
                + "értékelek! A dokumentációt a minta dokumentációhoz hasonlóan kell elkészíteni! A beadandó neve:\n"
                + "VezeteknevKeresztnev_sorszam legyen! Pl: DeakZoltan_00.\n"
                + "A program billentyűzetről csak megfelelő értékeket olvasson be (szám esetén ne szálljon el szövegre,\n"
                + "stb.)! Fájlban már helyes értékek szerepelnek!\n"
                + "Feladat: Egy szövegfájlban egy verseny eredményeit találjuk. A fájl szerkezete a következő: az első\n"
                + "sorban találunk egy nevet, a következőben egy várost, majd a további 5 sorban egy-egy 0 és\n"
                + "20 közötti számot, ami az egyes versenyszámokra kapott pontszámot jelenti. A továbbiakban\n"
                + "az előzőek ismétlődnek! Írassuk azokat a versenyzőket és városukat egy sorba, szóközzel\n"
                + "elválasztva, akik továbbjutottak a versenyből! Továbbjutott az a versenyző, aki az\n"
                + "összpontszám 40%-át teljesítette!");
    }
}
