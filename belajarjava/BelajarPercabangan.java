
package com.mycompany.belajarjava;

import java.util.Scanner;

public class BelajarPercabangan {
    public static void main(String[] args) {
        Scanner Inputuser=new Scanner(System.in);
            System.out.print("Inputkan Nilai Anda: ");
            int nilai= Inputuser.nextInt();
            System.out.println("Nilai Anda: " +nilai);
            
            if (nilai>=90){
                System.out.println("Nilai A");
            }   else if (nilai >=80){System.out.println("Nilai B+");
            }   else if (nilai >=70){System.out.println("Nilai B");
            }   else if (nilai <=60){System.out.println("Nilai C");
            }
           
    }
    
    }
