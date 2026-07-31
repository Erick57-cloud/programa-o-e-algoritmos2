import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor A: ")); //guarda o valor A
        int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor B: ")); //guarda o valor B
        int C;//cria a variavel que ira guardar os valores de A e B
        if(A == B){//se A for igual a B
            C = A + B;//atribui a soma dos valores A e B à C
            JOptionPane.showMessageDialog(null,"Os valores são iguais, sua soma é de: "+C);
        }
        else{
            C = A*B;//atribui a multiplicação de A e B à C
            JOptionPane.showMessageDialog(null,"Os valores são diferentes, sua multiplicação é de: "+C);
        }
    }
    }