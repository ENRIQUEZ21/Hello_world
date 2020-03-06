package com.company;

public class Main {
    protected int nbre = 0;



    public static void main(String[] args) {
        Heritee heritee = new Heritee();
        heritee.returnNbre();
        Heritee2Fois heritee2Fois = new Heritee2Fois();
        heritee2Fois.returnNbreTransform2();
        System.out.println("Hello world");
        System.out.println("SALUT");
        System.out.println("Bonjour le monde");
        System.out.println("Bonjour");
        System.out.println(functionCalculs());
        System.out.println(functionCalculsExp(6));
        System.out.println("Salut tout le monde !!! ");
        System.out.println("On a : 45 * 2 = " + functionCalculsMultiPar2(45));
        System.out.println("On a aussi : 46* 2 = " + functionCalculsMultiPar2(46));
        System.out.println("On essaie les branches, pas facile ...");
        System.out.println("Qu'est-ce que je peux faire de ma vie, je ne suis pas très bon ... A méditer");
    }

    public static int functionCalculs() {
        return 2;
    }

    public static int functionCalculsExp(double n) {
        return (int) ((Math.exp(n) * n) + (n * n * Math.getExponent(n)));
    }

    public static int functionCalculsMultiPar2(int n) {
        return 2 * n;
    }


}
