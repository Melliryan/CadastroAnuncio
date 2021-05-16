import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastraAnuncio {

    private List<Anuncio> listaDeAnuncio =  new ArrayList<>();
    private Scanner ler = new Scanner(System.in);

    public void cadastrarAnuncio()  {
        Anuncio anuncio = new Anuncio();

        System.out.println(" ");
        System.out.println(" Cadastrando Anuncio ");
        System.out.println(" ");
        System.out.println("================");

        System.out.print("Nome do Anuncio: ");
        anuncio.setNomeAnuncio(ler.next());

        System.out.print("Nome do Cliente: ");
        anuncio.setCliente(ler.next());

        System.out.print("Data de inicio (dd/mm/aa): ");
        try {
            anuncio.setDataInicio(new SimpleDateFormat("dd/MM/yy").parse(ler.next()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Data final (dd/mm/aa): ");
        try {
            anuncio.setDataFim(new SimpleDateFormat("dd/MM/yy").parse(ler.next()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Dinheiro investido por dia: ");
        anuncio.setDinheiroInvestido(ler.nextInt());

        System.out.println("================");
        System.out.println(" ");
        listaDeAnuncio.add(anuncio);
    }

    public Anuncio pegarAnuncio(String nomeAnuncio) {

        for(Anuncio anuncio : listaDeAnuncio){
            if(anuncio.getNomeAnuncio().equalsIgnoreCase(nomeAnuncio)){
                return anuncio;
            }
        }

        return null;
    }
}
