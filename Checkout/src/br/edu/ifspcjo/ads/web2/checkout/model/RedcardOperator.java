package br.edu.ifspcjo.ads.web2.checkout.model;

public class RedcardOperator implements Operator{

    @Override
    public boolean authorize(Authorizable authorizable, Card card) {
        return card.getCardNumber().startsWith("4321");
    }
    

}
