package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validacao {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Método auxiliar para ler strings
    private static String lerString(String mensagem) throws IOException {
        System.out.print(mensagem);
        return reader.readLine();
    }

    // Método auxiliar para ler números inteiros
    private static int lerInt(String mensagem) throws IOException {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
            }
        }
    }

    // Método auxiliar para ler bytes
    private static byte lerByte(String mensagem) throws IOException {
        while (true) {
            try {
                System.out.print(mensagem);
                return Byte.parseByte(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número entre -128 e 127.");
            }
        }
    }

    
    public static String validarString(String mensagem, byte tipo) {
        try {
            //System.out.println(mensagem);
           // System.out.println("1 - Verificar se não está vazia");
            //System.out.println("2 - Verificar se é um número de telefone válido (9 ou 12 dígitos)");

            //byte tipo = lerByte("Escolha o tipo de validação (1 ou 2): ");
            String valor = lerString(mensagem);

            switch (tipo) {
                case 1:
                    return valor.trim().isEmpty() ? null : valor;

                case 2:
                    String numero = valor.replaceAll("\\s+", "").replace("+", "");
                    if ((numero.length() == 9 || numero.length() == 12) && numero.matches("\\d+")) {
                        return valor;
                    }
                    return null;

                default:
                    System.out.println("Tipo de validação inválido!");
                    return null;
            }
        } catch (IOException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
            return null;
        }
    }

    
    public static Integer validarInt(String mensagem) {
        try {
            int valor = lerInt(mensagem);
            int min = 0;
            int max = 500;

            return (valor >= min && valor <= max) ? valor : null;
        } catch (IOException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
            return null;
        }
    }

    
    public static Byte validarByte(String mensagem) {
        try {
            byte valor = lerByte(mensagem);
            byte min = 1;
            byte max = 4;

            return (valor >= min && valor <= max) ? valor : null;
        } catch (IOException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
            return null;
        }
    }

    
    public static String validarData() {
        try {
            String data = lerString("Digite uma data (no formato dd/MM/yyyy): ");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(data, formatter); // Apenas para validação
            return data;
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida! Formato correto: dd/MM/yyyy");
            return null;
        } catch (IOException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
            return null;
        }
    }

    
    public static Boolean validarBooleano() {
        try {
            String entrada = lerString("Digite 'true' ou 'false': ").toLowerCase();

            if (entrada.equals("true")) {
                return true;
            }
            if (entrada.equals("false")) {
                return false;
            }

            System.out.println("Valor inválido! Digite 'true' ou 'false'.");
            return null;
        } catch (IOException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
            return null;
        }
    }

   
    public static float validarFloat(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Float.parseFloat(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número válido (ex: 15.5 ou 100).");
            } catch (IOException e) {
                System.out.println("Erro de leitura. Tente novamente.");
            }
        }
    }
}
