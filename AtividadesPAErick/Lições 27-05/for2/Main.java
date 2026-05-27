import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args){
        int seila = 0; //guarda quantas vezes o usuario digitou
        int numbers = 0;//é o numero digitado
        int quadrado = 0; //é o quadrado do numero
        for(seila = 0; seila<5;seila++){
            numbers = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os numeros inteiros. Já digitou "+seila+" de 5:"));
            quadrado = numbers * numbers;
            JOptionPane.showMessageDialog(null,"o quadrado de "+numbers+" é "+quadrado);
        }
        if(seila>=5){//encerra caso ja tenha digitado os cinco numeros
            JOptionPane.showMessageDialog(null,"Você ja digitou os 5 numeros, encerraremos agora.");
        }
    }
}