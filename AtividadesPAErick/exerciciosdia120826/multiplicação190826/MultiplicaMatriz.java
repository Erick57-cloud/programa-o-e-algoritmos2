public class MultiplicaMatriz{ //criação da classe publica chamada MultiplicaMatriz
    public static void main(String[] args){ //pacote de extenção do nucleo de java
        //declaração da matriz A 2x2
        int [][] A = {
                {1, 2},
                {3, 4}
        };
        //declaração da matriz B 2x2
        int [][] B = {
                {5, 6},
                {7, 8}
        };
        //cria a matriz C que armazenara o resultado da multiplicação
        int [][] C = new int[2][2];
        //realiza a multiplicação das matrizes
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                for(int k = 0; k<2; k++){
C[i][j] += A[i][k] * B[k] [j];
                }
            }
        }
        System.out.println("Matriz A");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
               System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n Matriz B");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.print(B[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println("\n A * B = C");
        for(int i = 0; i<2; i++){
                for(int k = 0; k<2; k++){
                    System.out.print(C[i][k]+"\t");
                }
            System.out.println();
        }

    }
}