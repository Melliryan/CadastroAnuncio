import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        CadastraAnuncio cadastraAnuncio = new CadastraAnuncio();
        GerarRelatorio gerarRelatorio = new GerarRelatorio();

        boolean sair = false;
        while(!sair){
            System.out.println("Escolha uma das opcoes:");
            System.out.println("=======================");
            System.out.println("1: Cadastrar Anuncio");
            System.out.println("2: Gerar Relatorio");
            System.out.println("3: Sair");
            System.out.println("=======================");
            System.out.print("Entre com a opcao: ");
            int opcao = ler.nextInt();
            switch (opcao){
                case 1:
                    cadastraAnuncio.cadastrarAnuncio();
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.print("Nome do Anuncio: ");
                    gerarRelatorio.gerarRelatorio(cadastraAnuncio.pegarAnuncio(ler.next()));
                    break;
                case 3:
                    System.out.println("sair");
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao errada");
                    break;
            }
        }
    }
}
