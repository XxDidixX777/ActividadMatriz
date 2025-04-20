/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadmatrices;

/**
 *
 * @author Harry
 */
public class ActividadMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int n = 4; 
        int[][] matriz = new int[n][n];

        int valor = 1;
        for (int d = 0; d < n; d++) {
            for (int j = 0; j < n; j++) {
                matriz[d][j] = valor++;
            }
        }

        System.out.println("Matriz completa:");
        for (int d = 0; d < n; d++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[d][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\nDiagonal principal: ");
        for (int d = 0; d < n; d++) {
            System.out.print(matriz[d][d] + " ");
        }

        System.out.print("\nDiagonal secundaria: ");
        for (int d = 0; d < n; d++) {
            System.out.print(matriz[d][n - 1 - d] + " ");
        }
    }
}