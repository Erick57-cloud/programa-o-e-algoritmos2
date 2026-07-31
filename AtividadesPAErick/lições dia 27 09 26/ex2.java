import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int coconut = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: ")); //guarda o numero digitado
        if(coconut % 2 ==0){ //se o numero for divisivel por 2
            JOptionPane.showMessageDialog(null,"O numero é par");
        }
        else{
            JOptionPane.showMessageDialog(null,"O numero é impar");
        }
        if(coconut>0){ //se o numero é maior que zero
            JOptionPane.showMessageDialog(null,"O numero é positivo");
        } else if (coconut == 0) { //se o numero é menor que zero
            JOptionPane.showMessageDialog(null,"O numero é neutro");
        }
        else{
            JOptionPane.showMessageDialog(null,"O numero é negativo");
        }
    }
}