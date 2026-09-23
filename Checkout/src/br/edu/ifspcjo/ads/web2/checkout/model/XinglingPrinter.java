package br.edu.ifspcjo.ads.web2.checkout.model;

public class XinglingPrinter implements Printer {

    @Override
    public void print(Printable printable) {
        System.out.println("**************************");
        System.out.println(printable.getPageHeader());
        System.out.println("**************************");
        System.out.println(printable.gtePageBody());
        System.out.println("**************************");
        System.out.println("===Xingling Printer===");
        System.out.println("**************************");
    }

}
