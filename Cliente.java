import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {

        Socket socketA = new Socket("localhost", 5000);
        Socket socketB = new Socket("localhost", 5001);

        // Cria um BufferedReader e um PrintWriter para leitura e escrita de dados com o servidor_A
        BufferedReader inA = new BufferedReader(new InputStreamReader(socketA.getInputStream()));
        PrintWriter outA = new PrintWriter(socketA.getOutputStream(), true);

        // Cria um BufferedReader e um PrintWriter para leitura e escrita de dados com o servidor_B
        BufferedReader inB = new BufferedReader(new InputStreamReader(socketB.getInputStream()));
        PrintWriter outB = new PrintWriter(socketB.getOutputStream(), true);

        // Lê a operação solicitada pelo usuário
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite a operação desejada (soma, subtracao, multiplicacao, divisao, porcentagem, raiz ou potencia): ");
        String operacao = stdIn.readLine();

        double resultado = 0;
        if (operacao.equals("soma") || operacao.equals("subtracao") || operacao.equals("multiplicacao") || operacao.equals("divisao")) {
            System.out.print("Digite o primeiro operando: ");
            double operando1 = Double.parseDouble(stdIn.readLine());
            System.out.print("Digite o segundo operando: ");
            double operando2 = Double.parseDouble(stdIn.readLine());
            outA.println(operacao);
            outA.println(operando1);
            outA.println(operando2);
            resultado = Double.parseDouble(inA.readLine());
        } else if (operacao.equals("porcentagem") || operacao.equals("potencia")) {
            System.out.print("Digite o primeiro operando: ");
            double operando1 = Double.parseDouble(stdIn.readLine());
            System.out.print("Digite o segundo operando: ");
            double operando2 = Double.parseDouble(stdIn.readLine());
            outB.println(operacao);
            outB.println(operando1);
            outB.println(operando2);
            resultado = Double.parseDouble(inB.readLine());
        } else if (operacao.equals("raiz")) {
            System.out.print("Digite o primeiro operando: ");
            double operando1 = Double.parseDouble(stdIn.readLine());
            outB.println(operacao);
            outB.println(operando1);
            resultado = Double.parseDouble(inB.readLine());
        } else {
            System.out.println("Operação inválida.");
        }

        // Imprime o resultado da operação
        System.out.println("Resultado: " + resultado);

        // Fecha as conexões com os servidores
        socketA.close();
        socketB.close();
    }
}
