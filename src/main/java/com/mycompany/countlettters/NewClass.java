/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.countlettters;

import java.util.Scanner;


public class NewClass
{
public static void main(String[] args)
{
int[] counts = new int[26];
Scanner scan = new Scanner(System.in);
//get word from user
System.out.print("Enter a single word (letters only, please): ");
String word = scan.nextLine();
//convert to all upper case
word = word.toUpperCase();
//count frequency of each letter in string
try{
for (int i=0; i < word.length(); i++)
 counts[word.charAt(i)-'A']++;
}
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Error not a letter " + e);}
//print frequencies
System.out.println();
for (int i=0; i < counts.length; i++)
 if (counts [i] != 0)
System.out.println((char)(i +'A') + ": " + counts[i]);
}
}