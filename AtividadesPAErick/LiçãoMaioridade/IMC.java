import javax.swing.JOptionPane;
public class IMC{
    public static void main(String[]args){
        int anonascimento = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu ano de nascimento: "));
        int anoatual = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano atual(ex:2026): "));
        int idade;
        idade = anoatual - anonascimento;
        if(idade<18 && idade>=0){
            JOptionPane.showMessageDialog(null,"Você tem "+idade+" , então é de menor.");
        }
        if(idade>=18) {
            JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos, então você atigiu a maioridade.");
        }
        if(idade<0){
            JOptionPane.showMessageDialog(null,"Tente novamente, a idade de "+idade+" está negativa.");
        }
    }
}
