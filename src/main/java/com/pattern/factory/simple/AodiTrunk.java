package com.pattern.factory.simple;

public class AodiTrunk implements Trunk {
    @Override
    public void run() {
        System.out.println("奥迪卡车启动");
    }
}
