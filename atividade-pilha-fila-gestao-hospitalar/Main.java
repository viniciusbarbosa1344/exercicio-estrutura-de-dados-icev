import java.util.Scanner;

public class Main extends GestaoHospitalar{
    static GestaoHospitalar gestao = new GestaoHospitalar();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        menu();
        int opcao = input.nextInt();

        while (true) {
            if (opcao == 1) {
                gestao.adicionarPaciente();

            } else if (opcao == 2) {
                gestao.printarFilas();

            } else if (opcao == 3) {
                gestao.removerPacienteFilaEspecifica();

            } else if (opcao == 4) {
                System.out.println("OBRIGADO POR UTILIZAR MEU PROGRAMA !!!");
                break;
            }
            
            menu();
            opcao = input.nextInt();
        }
    }
}
