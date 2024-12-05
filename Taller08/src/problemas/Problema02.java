/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grados = 20;
        int incremento = 4;
        int operacion = 20;
        String cadenaFinal = "";

        for (int i = 0; i <= operacion; i++) {
            double gradosC = (5.0 / 9) * (grados - 32);
            cadenaFinal
                    += String.format("Operación(%d)Farenheit: %d ===> Celsius: "
                            + "%.2f\n", i, grados, gradosC);
            grados += incremento;

        }
        System.out.println(cadenaFinal);
    }
}


