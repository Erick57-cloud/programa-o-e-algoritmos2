public class divison{
    public static void main(String[] args){
        //declaração de A de ordem 2x2
        int [][] A = {
                {2, 4},
                {6, 8}
        };
        //declaração de C de ordem 2x2
        int [][] B = {
                {1, 2},
                {3, 4}
        };
        //declaração de C que armazenara o resultado
        int [][] C = new int [2] [2];
        //percorre as linhas da matriz
        for(int i = 0;i<2;i++){
            //percorre as colunas
            for(int j = 0; j<2;j++){
                //soma os elementos
                C[i][j] = A[i][j] / B[i][j];
            }
        }
        //exibe a matriz A
        System.out.println("matriz A:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println();
        }
        //exibe a matriz B
        System.out.println("\nMatriz B:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        //exibe a soma das matrizes A e B
        System.out.println("\n A / B = C:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
}