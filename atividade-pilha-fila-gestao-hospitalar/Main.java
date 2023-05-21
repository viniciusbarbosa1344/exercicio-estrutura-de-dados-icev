import java.util.Scanner;

public class Main extends GestaoHospitalar{
    static GestaoHospitalar gestao_hospitalar = new GestaoHospitalar();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        menu();
        int opcao = input.nextInt();

        while (true) {
            if (opcao == 1) {
                gestao_hospitalar.adicionarPaciente();

            } else if (opcao == 2) {
                gestao_hospitalar.printarFilas();

            } else if (opcao == 3) {
                gestao_hospitalar.removerPacienteFilaEspecifica();

            } else if (opcao == 4) {
                
                // Ainda em desenvolvimento (tentar postar até dia 23/05)

            } else if (opcao == 5) {
                System.out.println("OBRIGADO POR UTILIZAR MEU PROGRAMA !!!");
                break;
            }
            
            menu();
            opcao = input.nextInt();
        }
    }
}
