package com.pattern.factory.simple;

public class TrunkFactory {
    public static Trunk produceTrunk(String trunkName) {
        switch (trunkName) {
            case "宝马":
                return new BmwTrunk();
            case "奥迪":
                return new AodiTrunk();
            default :
                return null;
        }
    }
}
