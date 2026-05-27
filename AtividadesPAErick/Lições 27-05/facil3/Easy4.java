import javax.swing.JOptionPane;
public class Easy4 {
    public static void main(String[] args) {

        int numero_desejado = 0; //guarda a quantidade de numeros digitada pelo usuario
        int jorge = 0; //guarda os numeros maiores que 30
        int i = 0; //guarda os numeros digitados
        while(numero_desejado <15){ //enquanto a quantidade de numeros digitado pelo usuario for menor que 30, essa linha ira atuar.
            i = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 15 numeros. ja foram "+numero_desejado+" de 15."));
            numero_desejado++;
            if(i>30) {
                jorge++;
            }
            if(numero_desejado == 15){ //se a quantidade de numeros for maior que 15, essa linha ira atuar e encerrar o sistema
                JOptionPane.showMessageDialog(null,"Entre os numeros digitados, foram digitados "+jorge+" numeros maiores que 30.");
                JOptionPane.showMessageDialog(null,"Ja digitou os 15 numeros, encerrando sequencia.");
            }

        }
    }
}