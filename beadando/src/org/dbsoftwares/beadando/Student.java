/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dbsoftwares.beadando;

/**
 *
 * @author Tóth Péter György
 */
public class Student {

    String name;
    String city;
    String firstScore;
    String secondScore;
    String thirdScore;
    String fourthScore;
    String fifthScore;
    int sumScore;

    protected int calculateSumScore() {
        int firstScoreNum = Integer.parseInt(firstScore);
        int secondScoreNum = Integer.parseInt(secondScore);
        int thirdScoreNum = Integer.parseInt(thirdScore);
        int fourthScoreNum = Integer.parseInt(fourthScore);
        int fifthScoreNum = Integer.parseInt(fifthScore);

        this.sumScore = firstScoreNum + secondScoreNum + thirdScoreNum
                + fourthScoreNum + fifthScoreNum;
        return sumScore;
    }
}
