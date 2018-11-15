package com.pattern.factory.method;

public class DazTrunkFactory_M implements TrunkFactory_M {
    @Override
    public Trunk_M produceTrunk() {
        return new DazTrunk_M();
    }
}
