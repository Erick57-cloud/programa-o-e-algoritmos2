import javax.swing.JOptionPane;
public class Main {
    public static void main(String[]args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva um Numero: "));
        int i = 0;
        int tabuada;
        System.out.println(" a tabuada de "+numero+" é:");
        for(i=0; i<=10; i++){
            tabuada = numero * i;
            System.out.println(+tabuada);

        }
    }
}