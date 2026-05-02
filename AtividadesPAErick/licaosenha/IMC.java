import javax.swing.JOptionPane;
public class IMC{
    public static void main(String[]args){

        String senha = JOptionPane.showInputDialog(null, "Coloque sua senha:");
        String abcd;
        if(senha.equals("abcd")) {
            JOptionPane.showMessageDialog(null, "senha correta, bem vindo a sua conta!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Senha incorreta, por favor, tente novamente mais tarde" );
        }

    }
}