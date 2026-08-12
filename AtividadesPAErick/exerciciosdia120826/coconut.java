public class coconut{
    public static void main(String[] args){
        //declaração de A de ordem 5x5
        int [][] A = {
                {2, 4, 6, 8, 10},
                {12, 14, 16, 18, 20},
                {22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40},
                {42, 44, 46, 48, 50}
        };
        //declaração de C de ordem 5x5
        int [][] B = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        //declaração de C que armazenara o resultado
        int [][] C = new int [5] [5];
        //percorre as linhas da matriz
        for(int i = 0;i<5;i++){
            //percorre as colunas
            for(int j = 0; j<5;j++){
                //soma os elementos
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        //exibe a matriz A
        System.out.println("matriz A:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println();
        }
        //exibe a matriz B
        System.out.println("\nMatriz B:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        //exibe a soma das matrizes A e B
        System.out.println("\n A + B = C:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
        //declaração de D que armazenara o resultado
        int [][] D = new int [5] [5];
        //percorre as linhas da matriz
        for(int i = 0;i<5;i++){
            //percorre as colunas
            for(int j = 0; j<5;j++){
                //soma os elementos
                D[i][j] = A[i][j] - B[i][j];
            }
        }
        //exibe a matriz A
        System.out.println("matriz A:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println();
        }
        //exibe a matriz B
        System.out.println("\nMatriz B:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        //exibe a soma das matrizes A e B
        System.out.println("\n A - B = D:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                System.out.print(D[i][j]+"\t");
            }
            System.out.println();
        }
        //declaração de E que armazenara o resultado
        int [][] E = new int [5] [5];
        //percorre as linhas da matriz
        for(int i = 0;i<5;i++){
            //percorre as colunas
            for(int j = 0; j<5;j++){
                //soma os elementos
                E[i][j] = A[i][j] / B[i][j];
            }
        }
        //exibe a matriz A
        System.out.println("matriz A:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println();
        }
        //exibe a matriz B
        System.out.println("\nMatriz B:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        //exibe a soma das matrizes A e B
        System.out.println("\n A / B = E:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                System.out.print(E[i][j]+"\t");
            }
            System.out.println();
        }


    }
}