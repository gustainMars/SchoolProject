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

import java.util.Scanner;

/**
 *
 * @author Gustavo Marques
 */
public class Main {
    
    public String ordinal(int number) {

        String[] sufixes = {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};

        if(number == 0)
            return null;
        else {

            switch (number % 100) {

                case 11:
                case 12:
                case 13:
                    return number + sufixes[0];
            
                default:
                    return number + sufixes[number % 10];

            }

        }

    }
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please, insert your first name:");
        String firstName = scan.next();

        System.out.println("Now, your last name:");
        String lastName = scan.next();
        
        System.out.println("And your student's id:");
        int id = scan.nextInt();
        
        System.out.println("How many grades do you have to calculate your final grade?");
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        Main main = new Main();

        for(int i = 0; i < numScores; i++) {

            System.out.println("Ok, now type your " + main.ordinal(i) + " note:");
            testScores[i] = scan.nextInt();
            
        }
        
        scan.close();

        Student student = new Student(firstName, lastName, id, testScores);
        student.printPerson();
        System.out.println("Grade: " + student.calculate());
        
    }

}
