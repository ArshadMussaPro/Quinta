package view;

public class MenuPrincipal {
    //Cliente cliente;
   public static void opcao() {
    
    System.out.println(""
        + "+-------------------------+\n"
        + "|           Menú          |\n"
        + "+-------------------------+\n"
        + "|Registar Cliente(1)      |\n"
        + "|-------------------------|\n"
        + "|Registar Colaborador(2)  |\n"
        + "|-------------------------|\n"
        + "|Vender(3)                |\n"
        + "|-------------------------|\n"
        + "|Reservar(4)              |\n"
        + "+-------------------------+");
    
    byte opcao = Validacao.validarByte("Insira a opção desejada:");
    
    switch(opcao) {
        case 1: // Registrar Cliente
            String nomeCliente = Validacao.validarString("Digite o nome do cliente: ", (byte)1);
            String telefoneCliente = Validacao.validarString("Digite o telefone do cliente (9 ou 12 dígitos): ", (byte)2);
            String emailCliente = Validacao.validarString("Digite o email do cliente: ", (byte)1);
            String endereco = Validacao.validarString("Insira o endereco", (byte)1);
            Cliente cliente = new Cliente(nomeCliente, telefoneCliente, emailCliente, endereco);
            System.out.println("Cliente registrado com sucesso!");
            break;
            
        case 2: // Registrar Colaborador
            String nomeColab = Validacao.validarString("Digite o nome do colaborador: ", (byte)1);
            String cargo = Validacao.validarString("Digite o cargo do colaborador: ", (byte)1);
            float salario = Validacao.validarFloat("Digite o salário do colaborador: ");
            System.out.println("Colaborador registrado com sucesso!");
            break;
            
        case 3: // Vender animais
            String produto = Validacao.validarString("Digite o nome do produto pecuário (animal): ", (byte)1);
            int quantidade = Validacao.validarInt("Digite a quantidade: ");
            float precoUnitario = Validacao.validarFloat("Digite o preço unitário: ");
            float total = quantidade * precoUnitario;
            System.out.printf("Venda registrada! Total: %.2f\n", total);
            break;
            
        case 4: // Reservar campos antes da época da colheita
            String nomeReserva = Validacao.validarString("Digite o nome para reserva: ", (byte)1);
            //String dataReserva = Validacao.validarData("Digite a data da reserva (dd/MM/yyyy): ");
            int numHectares = Validacao.validarInt("Número de hectares: ");
            String tipoCultura = Validacao.validarString("Nome da Cultura Agrícola:", (byte)1);
            System.out.println("Reserva realizada com sucesso!");
            break;
            
        default:
            System.out.println("Opção inválida!");
    }
}
   // Foi criado um objecto do tipo cliente para teste, em produção seriam criados e registados permanentemente em um ficheiro de texto
   //de objecto ou até mesmo numa base de dados.
}
