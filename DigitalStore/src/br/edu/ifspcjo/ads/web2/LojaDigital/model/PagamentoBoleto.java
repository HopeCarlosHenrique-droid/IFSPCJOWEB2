package br.edu.ifspcjo.ads.web2.LojaDigital.model;

public class PagamentoBoleto extends Pagamento {

    private String codigoBarras;
    private int diasParaVencimento;
    
    public PagamentoBoleto(double valorBruto, String codigoTransacao, String codigoBarras, int diasParaVencimento) {
        super(valorBruto, codigoTransacao);
        this.codigoBarras = codigoBarras;
        this.diasParaVencimento = diasParaVencimento;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getDiasParaVencimento() {
        return diasParaVencimento;
    }

    public void setDiasParaVencimento(int diasParaVencimento) {
        this.diasParaVencimento = diasParaVencimento;
    }

    @Override
    public double calcularTaxa() {
        return 2.50;
    }

    @Override
    public String processarPagamento() {
        return "Boleto gerado com " + codigoBarras + ". Vencimento em " + diasParaVencimento + " dias.";
    }

}
