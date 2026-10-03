package br.edu.ifspcjo.ads.web2.LojaDigital.GerenciadorVendas;

import java.util.ArrayList;

import br.edu.ifspcjo.ads.web2.LojaDigital.model.Pagamento;
import br.edu.ifspcjo.ads.web2.LojaDigital.model.PagamentoBoleto;
import br.edu.ifspcjo.ads.web2.LojaDigital.model.PagamentoCartao;
import br.edu.ifspcjo.ads.web2.LojaDigital.model.PagamentoPix;

public class GerenciadorVendas {
    public static void main(String[] args) throws Exception {

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new PagamentoPix(100.00, "0987654321", "claudio*******.com"));
        pagamentos.add(new PagamentoBoleto(300.00, "1234567890", "***1234", 7));
        pagamentos.add(new PagamentoCartao(500.00, "1415726838", "***0077", 12));
        
        for (Pagamento pagamento : pagamentos) {
            System.out.println(pagamento.processarPagamento());
            System.out.printf("Valor bruto: R$ %.2f%n", pagamento.getValorBruto());
            System.out.printf("Taxa: R$ %.2f%n", pagamento.calcularTaxa());
            System.out.printf("Valor Final: R$ %.2f%n", pagamento.calcularValorFinal());
        }
    
    }

        
    }


    
    