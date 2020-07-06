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
public class Person {

	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	Person(String firstName, String lastName, int identification){

		this.firstName = firstName;
		this.lastName = lastName;
        this.idNumber = identification;
        
	}
	
	public void printPerson(){

		 System.out.println(
				"Name: " + lastName + ", " + firstName 
            + 	"\nID: " + idNumber); 
            
	}
	 
}
