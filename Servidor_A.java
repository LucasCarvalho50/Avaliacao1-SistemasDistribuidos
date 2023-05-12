import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor_A {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Servidor A iniciado.");

        while (true) {
            // Espera uma conexão com um cliente
            Socket clientSocket = serverSocket.accept();

            // Cria um BufferedReader e um PrintWriter para leitura e escrita de dados com o cliente
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Lê a operação solicitada pelo cliente e os operandos
            String operacao = in.readLine();
            double operando1 = Double.parseDouble(in.readLine());
            double operando2 = Double.parseDouble(in.readLine());

            // Realiza a operação solicitada
            double resultado = 0;
            switch (operacao) {
                case "soma":
                    resultado = operando1 + operando2;
                    break;
                case "subtracao":
                    resultado = operando1 - operando2;
                    break;
                case "multiplicacao":
                    resultado = operando1 * operando2;
                    break;
                case "divisao":
                    resultado = operando1 / operando2;
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

            // Envia o resultado para o cliente
            out.println(resultado);

            // Fecha a conexão com o cliente
            clientSocket.close();
        }
    }
}
