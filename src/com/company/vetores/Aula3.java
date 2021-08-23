package com.company.vetores;

public class Aula3 {
    public static void main(String[] args) {
        int [][] matriz = new int [3][3]; // Declaro e inicializo uma matriz de 3 filas e 3 colunas.

        matriz[0][0] = 52;
        matriz[0][1] = 133;
        matriz[0][2] = 24;
        matriz[2][2] = 86;

        //Nós examinaremos e mostraremos o que está em cada posição.
        // Para as matrizes usamos dois índices, um para linhas e para colunas.
        for (int fila = 0; fila <= 2; fila++ ) {
            for (int column = 0; column <= 2; column ++) {
                System.out.println("Fila: " + fila + "; coluna: " + column + ".");
                System.out.println("tenho guardado um " + matriz[fila][column] + ".");
            }
        }
    }
}
