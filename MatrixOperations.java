package Azul;

import java.util.Arrays;
    import java.util.Random;
    
    public class MatrixOperations {
        public static void main(String[] args) {
            int[][] matrix = new int[4][4];
            Random dia = new Random();
    
            // Preenchendo a matriz com valores aleatórios
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = dia.nextInt(100); // Valores entre 0 e 99
                }
            }
    
            // 1. Mostrando a matriz carregada
            System.out.println("Matriz Carregada:");
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
    
            // 2. Valores da Diagonal Principal
            int[] mainDiagonal = new int[4];
            int[] secondaryDiagonal = new int[4];
            int[] oddValues = new int[16];
            int[] evenValues = new int[16];
            int oddCount = 0, evenCount = 0;
    
            for (int i = 0; i < 4; i++) {
                mainDiagonal[i] = matrix[i][i];
                secondaryDiagonal[i] = matrix[i][3 - i];
                for (int j = 0; j < 4; j++) {
                    if (matrix[i][j] % 2 != 0) {
                        oddValues[oddCount++] = matrix[i][j];
                    } else {
                        evenValues[evenCount++] = matrix[i][j];
                    }
                }
            }
    
            Arrays.sort(mainDiagonal);
            Arrays.sort(secondaryDiagonal);
            oddValues = Arrays.copyOf(oddValues, oddCount);
            evenValues = Arrays.copyOf(evenValues, evenCount);
            Arrays.sort(oddValues);
            Arrays.sort(evenValues);
    
            System.out.println("Diagonal Principal Ordenada:");
            System.out.println(Arrays.toString(mainDiagonal));
            System.out.println("Diagonal Secundária Ordenada:");
            System.out.println(Arrays.toString(secondaryDiagonal));
            System.out.println("Valores Ímpares Ordenados:");
            System.out.println(Arrays.toString(oddValues));
            System.out.println("Valores Pares Ordenados:");
            System.out.println(Arrays.toString(evenValues));
        }
    }
    
    

