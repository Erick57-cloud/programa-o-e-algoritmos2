public class Main{
    public static void main(String[] args){
       System.out.println("Segue os numeros pares entre 1 e 10."); //Comentario fora do for pra nao se repetiir
        for(int i=1; i<=10;i++){ //i é igual a 1 para nao imprimir o zero
            if(i % 2 ==0){ //garante que os numeros imprimidos sejam pares.
                System.out.println(+i);
            }
        }
    }
}