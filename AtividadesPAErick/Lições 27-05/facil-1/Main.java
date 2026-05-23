import javax.swing.JOptionPane;
public class Main{
    public static void main(String[]args){
        int i;
        JOptionPane.showMessageDialog(null,"Os numeros impares entre 75 e 197 são: ");
        for(i=75;i>=75 && i<=197;i++){
            if(i % 2 !=0){
                System.out.println(+i);
            }
        }
    }
}