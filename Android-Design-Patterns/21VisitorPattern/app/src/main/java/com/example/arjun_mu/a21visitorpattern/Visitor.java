package com.example.arjun_mu.a21visitorpattern;

public interface Visitor {

    int visit(FreshFood freshFood);
    int visit(CannedFood cannedFood);

    int visit(SpecialOffer specialOffer);
}
