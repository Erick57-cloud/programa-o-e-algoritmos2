import javax.swing.JOptionPane;
public class Main {

    public static void main(String[]args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo valor: "));
        int soma = 0;
        System.out.println("os numeros impares e sua soma são: ");
        for(int n = a; n<=b; n++){
            if(n % 2 !=0){
                soma = soma + n;
System.out.println(+n);
System.out.println(+soma);
            }
            ;
        }
    }
    }
