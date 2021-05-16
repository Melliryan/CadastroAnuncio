import java.util.Date;

public class Anuncio {

    private String nomeAnuncio;
    private String cliente;
    private Date dataInicio;
    private Date dataFim;
    private Integer dinheiroInvestido;

    public String getNomeAnuncio() {
        return nomeAnuncio;
    }

    public void setNomeAnuncio(String nomeAnuncio) {
        this.nomeAnuncio = nomeAnuncio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Integer getDinheiroInvestido() {
        return dinheiroInvestido;
    }

    public void setDinheiroInvestido(Integer dinheiroInvestido) {
        this.dinheiroInvestido = dinheiroInvestido;
    }
}
