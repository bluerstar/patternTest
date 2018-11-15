package com.pattern.factory.simple;

public class Customer {

    public static void main(String[] args) {
        TrunkFactory.produceTrunk("奥迪").run();
    }

}
