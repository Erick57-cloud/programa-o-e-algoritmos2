import javax.swing.JOptionPane;
public class IMC{
    public static void main(String[]args){
        int peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o peso do peixe"));
        int multa=0;
        int excedente=0;
        if(peso<=0){

            JOptionPane.showMessageDialog(null,"Houve algum erro, tente novamente");
        }
        if(peso>0 && peso<=50){
            System.out.println("Seu peixe ta na media e sem multas!");
            JOptionPane.showMessageDialog(null,"Seu peixe ta na media e sem multas!");
        }
        if(peso>50){
            excedente = peso - 50;
            multa = excedente * 4;
            System.out.println("O seu peixe é muito pesado e levou multa, a multa é de: "+multa);
            JOptionPane.showMessageDialog(null,"O seu peixe é muito pesado e levou multa, a multa é de"+multa);
        }
    }
}
