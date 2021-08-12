package com.gildedrose.updaters;

public class NormalUpdater extends ItemUpdater{
    int qualityChangeRate = -1;

    @Override
    public int getQualityChangeRate() {
        return qualityChangeRate;
    }
}
