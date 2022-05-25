/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.repositorio;

/**
 *
 * @author Bsanc
 */
public class PruebaRepositorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic gihere
        int num = 201;
        System.out.println( catering(num));
    }

    private static int catering(int num) {
        if (num > 200) {
            return 50;
        } else if (num > 100) {
            return 75;
        } else {
            return 95;
        }
    }

}
