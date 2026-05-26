import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       int i = 1;
       while(i != 0){
            i = leitor.nextInt();
            if(i>=100 && i<=200) {


                System.out.println(+i);
            }

       }
        System.out.println("o usuario digitou 0, o sistema ira se encerrar.");

        }
    }
