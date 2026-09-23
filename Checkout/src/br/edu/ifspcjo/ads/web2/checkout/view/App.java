package br.edu.ifspcjo.ads.web2.checkout.view;

import br.edu.ifspcjo.ads.web2.checkout.model.Buy;
import br.edu.ifspcjo.ads.web2.checkout.model.Card;
import br.edu.ifspcjo.ads.web2.checkout.model.Checkout;
//import br.edu.ifspcjo.ads.web2.checkout.model.CieloOperator;
//import br.edu.ifspcjo.ads.web2.checkout.model.EpsonPrinter;
import br.edu.ifspcjo.ads.web2.checkout.model.Operator;
import br.edu.ifspcjo.ads.web2.checkout.model.Printer;
import br.edu.ifspcjo.ads.web2.checkout.model.RedcardOperator;
import br.edu.ifspcjo.ads.web2.checkout.model.XinglingPrinter;

public class App {
    public static void main(String[] args) throws Exception {
        Operator operator = new RedcardOperator();
        Printer printer = new XinglingPrinter();
        Card card = new Card("Juliana Lopes", "4321");
        Buy buy = new Buy("Juliana Lopes", 40, "Hamburguer Sensacional");
        Checkout checkout = new Checkout(printer, operator);
        checkout.closeBuy(buy, card);
    }
}

