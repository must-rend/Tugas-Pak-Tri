package com.mycompany.belajarjava;
public class BelajarLooping {

    public static void main(String[] args) {
        
        
        for(int a=1; a<=5; a++)
            System.out.println("Rendi Ke-" +a);
        
        System.out.println("-");
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
                System.out.println();
            }

        System.out.println("-");
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
                System.out.println();
            }
        
        System.out.println("-");
        
        int n=5;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
                System.out.println();
            }
        
        System.out.println("-");
        
        int g=5;
        
        for (int i = g; i >= 1; i--) {
            for (int j = g; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
                System.out.println();
            }

        
    }
    
}
