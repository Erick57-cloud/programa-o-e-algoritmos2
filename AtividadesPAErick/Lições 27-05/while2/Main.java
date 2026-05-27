import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int ligado = 1; //enquanto o valor for 1, o usuario poderá digitar numeros para somar
        int quant = 0; //Mostra a quantidade de numeros digitados
        int somat = 0; //mostra a soma de todos os numeros
        do {
          if(ligado == 1) {
              String band = JOptionPane.showInputDialog(null, "Digite os numeros a serem somados. Digite 0 se quiser ver o resultado.");
              int nap = Integer.parseInt(band); // guarda o valor dos numeros
              somat = somat + nap;
              quant++;
              if (nap == 0) { //se for digitado o zero, vai encerrar o ciclo
                  ligado = 0;
                  quant = quant - 1; //é para quando for exibir a quantidade de numeros, nao incluir o zero
              }
          }
        }while(ligado == 1); {
            JOptionPane.showMessageDialog(null, "foram digitados " + quant + " numeros, a somatoria deles é: " + somat); //resultados
        }
    }
}