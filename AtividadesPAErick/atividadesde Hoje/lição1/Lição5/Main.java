import javax.swing.JOptionPane;
public class Main {

    public static void main(String[]args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo valor: "));
        int maior = 0, menor = 0;
        int s = 0;
JOptionPane.showMessageDialog(null,"Segue os numeros pares no painel:");
        if(a>b){
            maior = a;
            menor = b;
            } else if (a<b) {
            maior = b;
            menor = a;
        }
            for(s = maior; s>=menor; s--){
                if(s % 2 == 0){
                    System.out.println(+s);
                }
            }

    }
}