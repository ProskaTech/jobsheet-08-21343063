/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_8;

/**
 *
 * created by 21343063_Nurul Husna
 */
public class tugas_3 {
    public static void main(String[]args){
        String[][] entry ={{"Florence","735-1234","Manila"},
                            {"Joyce","983-3333","Quezon City"},
                            {"Becca","456-3322","Manila"}};
        
        for (int i=0; i<entry.length;i++){
            System.out.println("Name    " +entry[i][0]);
            System.out.println("Tel. #  " +entry[i][1]);
            System.out.println("Address " +entry[i][2]);
            System.out.println("");
        }    
                           
    }
}
