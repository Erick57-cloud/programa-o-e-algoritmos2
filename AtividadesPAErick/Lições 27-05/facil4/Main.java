
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
       int i = 1; //vai guardar os valores digitados pelo usuario
       int ahah = 0; //vai guardar quantos numeros foram maiores que 100 e menores que 200
       int batata = 0; //vai guardar a quantidade de numeros digitado pelo usuario
        JOptionPane.showMessageDialog(null, "Iremos começar a sequencia de numeros, se quiser parar, digite 0.");
        while(i != 0) { //essa linha ira acontecer enquanto a variavel i for diferente de zero
            i = Integer.parseInt(JOptionPane.showInputDialog(null, "digite um numero, voce ja digitou " + batata + " numeros."));
            batata++;
            if(i>=100 && i<=200){
                ahah++;
            }
        }
            if(i == 0) { //se o numero zero for digitado, essa linha irá atuar
JOptionPane.showMessageDialog(null,"Entre os numeros digitados, "+ahah+" foram maiores que 100 e menores que 200.");
                JOptionPane.showMessageDialog(null, "o usuario digitou 0, o sistema ira se encerrar.");

            }




    }
}
