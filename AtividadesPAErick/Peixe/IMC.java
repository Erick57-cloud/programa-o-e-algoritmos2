import javax.swing.JOptionPane;
public class IMC{
    public static void main(String[]args){
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o peso do peixe"));
        double multa=0;
        double excedente=0;
        if(peso<=0){
            System.out.println("se ta brincando né?");
            JOptionPane.showMessageDialog(null,"se ta bricando né?");
        }
        if(peso>0 && peso<=30){
            System.out.println("teu peixe ta pequeno, mas você nao pagará multa.");
            JOptionPane.showMessageDialog(null,"teu peixe ta pequeno, mas você nao pagará multa.");
        }
        if(peso>30 && peso<=50){
            System.out.println("Seu peixe ta na media e sem multas!");
            JOptionPane.showMessageDialog(null,"Seu peixe ta na media e sem multas!");
        }
        if(peso>50){
            excedente = peso - 50;
            multa = excedente * 4;
            System.out.println("O seu peixe é muito pesado e levou multa, a multa é de "+multa);
            JOptionPane.showMessageDialog(null,"O seu peixe é muito pesado e levou multa, a multa é de"+multa);
        }
    }
}