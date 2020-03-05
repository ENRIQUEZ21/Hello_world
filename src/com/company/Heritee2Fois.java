package com.company;

import javax.xml.transform.stream.StreamSource;

public class Heritee2Fois extends Heritee {

    public Heritee2Fois() {
        super();
    }
    public void returnNbreTransform2() {
        nbre+=3;
        System.out.println("Bonjour "+nbre);
        nbre1+=3;
        System.out.println("Bonjour "+nbre1);
    }
}
