package com.pattern.factory.method;

public class Customer_M {

    public static void main(String[] args) {
        TrunkFactory_M bm = new BmwTrunkFactory_M();
        bm.produceTrunk().run();

        TrunkFactory_M audi = new AudiTrunkFactory_M();
        audi.produceTrunk().run();

        TrunkFactory_M daz = new DazTrunkFactory_M();
        daz.produceTrunk().run();

    }
}
