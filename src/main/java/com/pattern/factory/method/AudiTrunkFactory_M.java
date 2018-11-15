package com.pattern.factory.method;

public class AudiTrunkFactory_M implements TrunkFactory_M {
    @Override
    public Trunk_M produceTrunk() {
        return new AudiTrunk_M();
    }
}
