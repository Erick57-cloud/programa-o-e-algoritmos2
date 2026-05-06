import javax.swing.JOptionPane;
public class IMC{
    public static void main(String[]args){

        String senhacad = JOptionPane.showInputDialog(null, "Cadastre sua senha: ");
        JOptionPane.showMessageDialog(null,"Já cadastramos sua senha, utilize ela novamente para logar em sua conta.");
        String senha = JOptionPane.showInputDialog(null, "Digite sua senha: ");
        if(senhacad.equals(senha)) {
            JOptionPane.showMessageDialog(null, "senha correta, bem vindo a sua conta!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Senha incorreta, por favor, tente novamente mais tarde" );
        }

    }
}