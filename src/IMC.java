import javax.swing.JOptionPane;
public class IMC{
    public static void main(String[]args){
        double idade = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua idade"));
        if(idade<=0){
            System.out.println("tu nem nasceu ainda");
            JOptionPane.showMessageDialog(null,"tu nem nasceu ainda");
        }


        if(idade>0 && idade<=12) {
            System.out.println("crionça");
            JOptionPane.showMessageDialog(null,"crionça");
        }
        if(idade>12 &&idade <=19){
            System.out.println("asodelente");
            JOptionPane.showMessageDialog(null,"asodelente");
        }
        if(idade>19 && idade<=60){
            System.out.println("alunto");
            JOptionPane.showMessageDialog(null,"alunto");
        }
        if(idade>60 && idade<=130){
            System.out.println("velhote");
            JOptionPane.showMessageDialog(null,"velhote");
        }
        if(idade>130) {
            System.out.println("como tu ta vivo cara");
            JOptionPane.showMessageDialog(null, "como tu ta vivo cara");
            System.out.println("passa o hack ai man");
            JOptionPane.showMessageDialog(null, "passa o hack ai man na humildade");
        }
    }
    }

