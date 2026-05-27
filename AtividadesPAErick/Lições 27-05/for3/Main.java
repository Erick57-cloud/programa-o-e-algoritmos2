import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args){
        for(int i=0;i<=5;i++){ //faz com que o ciclo se repida 5 vezes.
            double fah = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um numero com 3 casas decimais: "));
            //o fahh guarda o numero decimal
            double haf = fah * 1000; //e o haf ajuda a checar se é par ou impar por tirar as decimais
            if(haf % 2 ==0){
                JOptionPane.showMessageDialog(null,"o numero "+fah+" é par");

            }else{
                JOptionPane.showMessageDialog(null,"o numero "+fah+" é impar");
            }
        }
    }
}