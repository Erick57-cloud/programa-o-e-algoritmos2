import javax.swing.JOptionPane;
public class IMC{
    public static void main(String[]args){
        String sexo = JOptionPane.showInputDialog(null,"Digite seu gênero (H para homem, M para mulher)");
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite altura"));
       String nome = JOptionPane.showInputDialog(null,"Digite seu nome:");
        double peso;
        if(sexo.equals("H")){
            peso = (72.7 * altura)-58;
            JOptionPane.showMessageDialog(null,"Ola "+nome+". Seu peso ideal é de "+peso);
        }
        if(sexo.equals("M")){
            peso = (62.1 * altura)-44.7;
            JOptionPane.showMessageDialog(null,"Ola "+nome+". Seu peso ideal é de "+peso);
        }
    }
}