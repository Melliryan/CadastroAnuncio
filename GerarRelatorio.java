import java.util.concurrent.TimeUnit;

public class GerarRelatorio {

    private Calculadora calculadora = new Calculadora();

    public void gerarRelatorio(Anuncio anuncio){
        long quantidadeDeDias = TimeUnit.DAYS.convert((anuncio.getDataFim().getTime() - anuncio.getDataInicio().getTime()), TimeUnit.MILLISECONDS);
        Integer quantidadeInvestiga = anuncio.getDinheiroInvestido() * ((int) quantidadeDeDias);
        System.out.println("Total investido: " + quantidadeInvestiga);
        System.out.println("Total visualizacoes: " + calculadora.pegarNumeroDeVisualizacoes(quantidadeInvestiga));
        System.out.println("Total cliques: " + calculadora.pegarNumeroDeClicks(quantidadeInvestiga));
        System.out.println("Total compartilhamentos: " + calculadora.pegarNumeroDeCompartilhamento(quantidadeInvestiga));

        System.out.println(" ");
    }

}
