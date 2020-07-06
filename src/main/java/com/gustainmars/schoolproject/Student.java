/*
 * Copyright (C) 2020 Gustavo Marques
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gustainmars.schoolproject;

/**
 *
 * @author Gustavo Marques
 */
public class Student extends Person {
    
    private int[] testScores;
    public enum GRADES {O, E, A, P, D, T};

    Student(String firstName, String lastName, int idNumber, int[] testScores) {

        super(firstName, lastName, idNumber);
        this.testScores = testScores;

    } 
    
    public String calculate() {

        int sumScores = 0;

        for(int score : testScores) {

            sumScores += score;

        }

        int average = sumScores / testScores.length;

        if(average < 40)
            return GRADES.T.toString();

        if(average >= 40 && average < 55)
            return GRADES.D.toString();

        if(average >= 55 && average < 70)
            return GRADES.P.toString();

        if(average >= 70 && average < 80)
            return GRADES.A.toString();

        if(average >= 80 && average < 90)
            return GRADES.E.toString();

        if(average >= 90 && average <= 100)
            return GRADES.O.toString();

        return null;

    }

}
