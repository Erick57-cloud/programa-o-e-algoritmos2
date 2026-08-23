import javax.swing.JOptionPane;//importa as janelas de mensagem, input e menu
public class multiplamatriz {//nome da classe
    public static void main(String[] args) {//inicia o programa
        JOptionPane.showMessageDialog(null,"iremos começar as operações com matrizes 5x5");
        //essas strings acumulam os textos e numeros das matrizes A e B para mostrar depois
        String avocado = "Os numeros da matriz A: \n";
        String banana = "Os numeros da matriz B: \n";
        //cria as matrizes: A e B e C, com A e B sendo int e C sendo double
        int[][] a = new int[5][5];
        int[][] b = new int[5][5];
        double[][] c = new double[5][5];
        //i escaneia as linhas, j as colunas e k serve para fazer a multiplicação
        int i, j, k;
        JOptionPane.showMessageDialog(null,"Começaremos a preencher os numeros da matriz A");
        for (i = 0; i < a.length; i++) {//a.lenght mede o tamanho das linhas de A
            for (j = 0; j < a.length; j++) {//messma coisa do i
                //o usuario digita texto e o Integer.parseInt transforma em inteiro
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os numeros que compoem a matriz A: ("+i+"),("+j+")"));
                avocado += a[i][j] + " \t ";//+= adiciona os numeros da matriz na string e o \t da um espaço legal
            }
            avocado += "\n";//quando termina uma linha da matriz, o \n pula pra proxima
        }
        // mesma coisa para a matriz B
        JOptionPane.showMessageDialog(null,"Começaremos a preencher os numeros da matriz B");
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b.length; j++) {
                b[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os numeros que compoem a matriz B: ("+i+"), ("+j+")."));
                banana += b[i][j] + " \t ";
            }
            banana += "\n";
        }
        // mostra como ficou as matrizes A e B
        JOptionPane.showMessageDialog(null,"Vamos mostrar os numeros digitados nas duas matrizes");
        JOptionPane.showMessageDialog(null,avocado);
        JOptionPane.showMessageDialog(null,banana);
        //esse array serve pra dar a opção de cada operação no menu legal la
        // posicao 0=adicao, 1=subtracao, 2=divisao, 3=multiplicacao, 4=sair
        String[] matematica = {"Adição", "Subtração", "Divisão", "Multiplicação", "Sair"};
        while(true) {// loop que volta para o menu sem parar
            String coconut = "Os numeros da matriz C: \n"; //zera o valor da matriz c pra nao virar uma bagunça a cada loop
            // abre o menu de botoes e guarda o numero do botao clicado na variavel legal chamada numeroslegais
            int numeroslegais = JOptionPane.showOptionDialog(null,"Faça uma operação de sua escolha:", "Escolha sabiamente:", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, matematica, matematica[4]);
            //4=clicou em sair e -1=fechou a janela no x (não use o x, fiz o botao de sair só pra isso)
            if (numeroslegais == 4 || numeroslegais == -1) {
                JOptionPane.showMessageDialog(null,"Você escolheu encerrar o programa, até logo!");
                break;//sai do while e encerra o codigo
            }
            if (numeroslegais == 0) {//faz a adição entre as matrizes, o numero da linha 1 da coluna 1 da matriz A soma com o numero da linha 1 da coluna 1 da matriz B, assim por diante
                for (i = 0; i < c.length; i++) {
                    for (j = 0; j < c.length; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                        coconut += c[i][j] + " \t ";
                    }
                    coconut += "\n";
                }
                JOptionPane.showMessageDialog(null, coconut);//mostra os numeros e textos na matriz c
            } else if (numeroslegais == 1) {//faz a subtraçãp entre as matrizes, o numero da linha 1 da coluna 1 da matriz B subtrai o numero da linha 1 da coluna 1 da matriz A, assim por diante
                for (i = 0; i < c.length; i++) {
                    for (j = 0; j < c.length; j++) {
                        c[i][j] = a[i][j] - b[i][j];
                        coconut += c[i][j] + " \t ";
                    }
                    coconut += "\n";
                }
                JOptionPane.showMessageDialog(null, coconut);
            } else if (numeroslegais == 2) {//faz a divisão entre as matrizes, o numero da linha 1 da coluna 1 da matriz B divide o numero da linha 1 da coluna 1 da matriz A, assim por diante
                boolean zerointruso = false;//cria uma variavel pra ver se tem um convidado indesejado(0) no divisor, q é a matriz B
                for (i = 0; i < c.length; i++) {
                    for (j = 0; j < c.length; j++) {
                        if(b[i][j] == 0){//se um invasor for detectado em B, a medida de segurança de ultima geração impede ele de causar danos
                            zerointruso = true;
                        }
                    }
                }
                if(zerointruso == true){//se achou um zero em B, ele avisa, não divide e volta pro menu de opções
                    JOptionPane.showMessageDialog(null,"Intruso detectado, foi localizado um zero na matriz B e deu erro. Tente outras operações ou faça uma matriz B que não tenha o zero.");
                }else {//se nao tiver zero na B,voce~ pode dividir
                    for (i = 0; i < c.length; i++) {
                        for (j = 0; j < c.length; j++) {
                            c[i][j] =(double) a[i][j] / b[i][j];//o double faz a conta ter decimal
                            coconut += c[i][j] + " \t ";
                        }
                        coconut += "\n";
                    }
                    JOptionPane.showMessageDialog(null, coconut);
                }
            } else if (numeroslegais == 3) {//multiplicacao de matrizes
                for (i = 0; i < c.length; i++) {//linha
                    for (j = 0; j < c.length; j++) {//coluna
                        c[i][j]=0;//pro resuldado de outras operações não afetar a multiplicação(por algum motivo so acontece com ela)
                        for (k = 0; k < c.length; k++) {//o k relaciona a coluna de A com a linha de B
                            c[i][j] += a[i][k] * b[k][j];//soma os produtos de cada multiplicação e acumula no C
                        }
                        coconut += c[i][j] + " \t ";
                    }
                    coconut += "\n";
                }
                JOptionPane.showMessageDialog(null, coconut);
            }
        }
    }
}