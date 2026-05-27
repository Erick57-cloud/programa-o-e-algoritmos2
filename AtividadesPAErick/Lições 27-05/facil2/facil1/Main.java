import javax.swing.JOptionPane;
public class Main{
    public static void main(String[]args){
        int i;
        JOptionPane.showMessageDialog(null,"Os numeros impares entre 75 e 197 são: ");
        for(i=75;i>=75 && i<=197;i++){ //A linha so ira rodar se os requisitos estiverem cumpridos
            if(i % 2 !=0){ //checa se é um numero par ou impar de acordo com seu resto, no caso se o resto for diferente de zero, o numero é impar.
                System.out.println(+i);
            }
        }
    }
}