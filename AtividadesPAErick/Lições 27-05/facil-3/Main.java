import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero_desejado = 0;
        int n;
        int i = 0;
        while(numero_desejado <15){
            i = leitor.nextInt();
            numero_desejado++;

        if(i>30) {
            System.out.println(+i);
        }
        }
    }
}