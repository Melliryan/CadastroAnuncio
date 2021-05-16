public class Calculadora {

    public Integer pegarNumeroDeVisualizacoes(Integer dinheiroInvestido){

        Integer numeroTotalDeVisualizacoes = dinheiroInvestido * 30;
        Integer numeroDeVisualizacoesPorSequencia = numeroTotalDeVisualizacoes;
        int contador = 0;

        while(contador<3 && ((numeroDeVisualizacoesPorSequencia/100)>0)){

            Integer numeroDeClicks = (numeroDeVisualizacoesPorSequencia/100) * 12;
            Integer numeroDeCompartilhamento = (numeroDeClicks/20) * 3;

            numeroDeVisualizacoesPorSequencia = (numeroDeCompartilhamento*40);
            numeroTotalDeVisualizacoes = numeroTotalDeVisualizacoes + numeroDeVisualizacoesPorSequencia;

            contador++;
        }
        return numeroTotalDeVisualizacoes;
    }

    public Integer pegarNumeroDeClicks(Integer dinheiroInvestido){

        Integer numeroTotalDeClicks = 0;
        Integer numeroDeVisualizacoesPorSequencia = dinheiroInvestido * 30;
        int contador = 0;

        while(contador<3 && ((numeroDeVisualizacoesPorSequencia/100)>0)){

            Integer numeroDeClicks = (numeroDeVisualizacoesPorSequencia/100) * 12;
            numeroTotalDeClicks = numeroTotalDeClicks + numeroDeClicks;
            Integer numeroDeCompartilhamento = (numeroDeClicks/20) * 3;

            numeroDeVisualizacoesPorSequencia = (numeroDeCompartilhamento*40);

            contador++;
        }
        return numeroTotalDeClicks;
    }

    public Integer pegarNumeroDeCompartilhamento(Integer dinheiroInvestido){

        Integer numeroTotalDeCompartilhamento = 0;
        Integer numeroDeVisualizacoesPorSequencia = dinheiroInvestido * 30;
        int contador = 0;

        while(contador<3 && ((numeroDeVisualizacoesPorSequencia/100)>0)){

            Integer numeroDeClicks = (numeroDeVisualizacoesPorSequencia/100) * 12;
            Integer numeroDeCompartilhamento = (numeroDeClicks/20) * 3;
            numeroTotalDeCompartilhamento = numeroTotalDeCompartilhamento + numeroDeCompartilhamento;

            numeroDeVisualizacoesPorSequencia = (numeroDeCompartilhamento*40);

            contador++;
        }
        return numeroTotalDeCompartilhamento;
    }
}
