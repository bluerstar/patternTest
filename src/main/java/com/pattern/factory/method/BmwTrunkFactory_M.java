package com.pattern.factory.method;

public class BmwTrunkFactory_M implements TrunkFactory_M {
    @Override
    public Trunk_M produceTrunk() {
        return new BmwTrunk_M();
    }
}
