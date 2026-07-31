import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
        int A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor 1: ")); //guarda o valor A
        int B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor 2: ")); //guarda o valor B
        int C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor 3: ")); // guarda o valor C
        int D = A + B;//guarda a soma dos valores a e b
        JOptionPane.showMessageDialog(null,"Agora vamos fazer a soma e averiguar o valor");
        if( A + B > C){ //se a soma for maior que C
            JOptionPane.showMessageDialog(null,"O valor 3 '"+C+"' é menor que a soma do valor 1 e valor 2 '"+D+"'");
        }
        if(A + B < C){ //se a soma for menor que C
            JOptionPane.showMessageDialog(null,"O valor 3 '"+C+"' é maior que a soma do valor 1 e valor 2 '"+D+"'");

        }
        if(A + B == C){ //se a soma for igual a C
            JOptionPane.showMessageDialog(null,"O valor 3 '"+C+"' é igual a soma do valor 1 e valor 2 '"+D+"'");
        }
    }
}