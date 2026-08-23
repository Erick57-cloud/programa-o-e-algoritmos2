import javax.swing.JOptionPane;//importa as janelas de mensagem, input e menu
public class multiretangulo {//nome da classe
    public static void main(String[] args) {//inicia o programa
        JOptionPane.showMessageDialog(null,"Vamos começar a multiplicação de matrizes retangulares:A=2x4 e B=4x2");
        //essas strings acumulam os textos e numeros das matrizes A, B e C para mostrar depois
        String avocado = "Os numeros da matriz A: \n";
        String banana = "Os numeros da matriz B: \n";
        String coconut = "Os numeros da matriz C: \n";
        int[][] a = new int[2][4];//cria a matriz A com duas linhas e 4 colunas
        int[][] b = new int[4][2];//cria a matriz B com quatro linhas e 2 colunas
        int[][] c = new int[2][2];//cria a matriz C com duas linhas e 2 colunas, onde tambem será armazenado o resultado da multiplicação
        int laranjaA = a.length;//mede quanta linhas tem na matriz A
        int cucumberA = a[0].length;//mede o tamanho da primeira linha da matriz A,sendo usado para descobrir quantas colunas tem na matriz
        int laranjaB = b.length;//mede quantas linhas tem na matriz B
        int cucumberB = b[0].length;//mede o tamanho da primeira linha da matriz B,sendo usado para descobrir quantas colunas tem na matriz
        int i, j, k;//i escaneia as linhas, j as colunas e k serve para fazer a multiplicação
        JOptionPane.showMessageDialog(null,"Começaremos a preencher os numeros da matriz A");
        for (i = 0; i < laranjaA; i++) {//a.lenght mede o tamanho das linhas de A
            for (j = 0; j < cucumberA; j++) {//messma coisa do i
                //o usuario digita texto e o Integer.parseInt transforma em inteiro
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os numeros que compoem a matriz A: ("+i+"),("+j+")"));
                avocado += a[i][j] + " \t ";//+= adiciona os numeros da matriz na string e o \t da um espaço legal
            }
            avocado += "\n";//quando termina uma linha da matriz, o \n pula pra proxima
        }
        // mesma coisa para a matriz B
        JOptionPane.showMessageDialog(null,"Começaremos a preencher os numeros da matriz B");
        for (i = 0; i < laranjaB; i++) {
            for (j = 0; j < cucumberB; j++) {
                b[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os numeros que compoem a matriz B: ("+i+"), ("+j+")."));
                banana += b[i][j] + " \t ";
            }
            banana += "\n";
        }
        // mostra como ficou as matrizes A e B
        JOptionPane.showMessageDialog(null,"Vamos mostrar os numeros digitados nas duas matrizes");
        JOptionPane.showMessageDialog(null,avocado);
        JOptionPane.showMessageDialog(null,banana);
        JOptionPane.showMessageDialog(null,"Agora vamos mostrar o resultado da multiplicação entre as matrizes");
        for (i = 0; i < laranjaA; i++) {//linha
            for (j = 0; j < cucumberB; j++) {//coluna
                for (k = 0; k < cucumberA; k++) {//o k relaciona cada linha de A com cada coluna de B
                    c[i][j] += a[i][k] * b[k][j];//soma os produtos de cada multiplicação e acumula no C
                }
                coconut += c[i][j] + " \t ";
            }
            coconut += "\n";
        }
        //mostra o resultado da multiplicação
        JOptionPane.showMessageDialog(null, coconut);
    }
    }
