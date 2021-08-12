package com.gildedrose.updaters;

public class ConjuredUpdater extends ItemUpdater {
    int qualityChangeRate = 2;

    @Override
    public int getQualityChangeRate() {
        return qualityChangeRate;
    }
}
