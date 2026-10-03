package br.edu.ifspcjo.ads.web2.LojaDigital.model;

public class PagamentoCartao extends Pagamento {

    private String numeroCartao;
    private int qtdParcelas;
    
    public PagamentoCartao(double valorBruto, String codigoTransacao, String numeroCartao, int qtdParcelas) {
        super(valorBruto, codigoTransacao);
        this.numeroCartao = numeroCartao;
        this.qtdParcelas = qtdParcelas;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    @Override
    public double calcularTaxa() {
        return 0.035 * getValorBruto();
    }

    @Override
    public String processarPagamento() {
        return "Pagamento em: " + qtdParcelas + "x no cartão " + numeroCartao + "autorizado com sucesso! ";
    }
    
}
