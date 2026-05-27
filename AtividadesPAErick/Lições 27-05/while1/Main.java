import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
        int ligado = 1; //enquanto o valor for 1, o usuario poderá digitar numeros para somar
        int quant = 0; //Mostra a quantidade de numeros digitados
        int somat = 0; //mostra a soma de todos os numeros
        while(ligado == 1){
            String band = JOptionPane.showInputDialog(null,"Digite os numeros a serem somados. Digite 0 se quiser ver o resultado.");
            int nop = Integer.parseInt(band); // guarda o valor dos numeros
            somat = somat + nop;
            quant++;
            if(nop == 0){ //se o numero digitado for 0, vai encerrar tudo e mostrar os resultados
                ligado = 0;
                quant = quant - 1; //para remover o 0 da contagem dos numeros.
            }
        }
        JOptionPane.showMessageDialog(null,"foram digitados "+quant+" numeros, a somatoria deles é: "+somat); //resultados
    }
}