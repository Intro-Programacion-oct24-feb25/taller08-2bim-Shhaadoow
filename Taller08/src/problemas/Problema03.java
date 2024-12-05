/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int filas = 5;
        String resultado = "";
        for (int i = 1; i <= filas; i++) {
            for (int z = 1; z <= i; z++) {
                resultado = resultado + "*";
            }
            resultado = resultado + "\n";
        }
        for (int i = filas - 1; i >= 1; i--) {
            for (int z = 1; z <= i; z++) {
                resultado = resultado + "*";
            }
            resultado = resultado + "\n";
        }
        System.out.printf("%s", resultado);
    }
}

    

