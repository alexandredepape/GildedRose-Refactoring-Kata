package com.gildedrose.updaters;

public class AgedBrieUpdater extends ItemUpdater {
    int qualityChangeRate = 1;

    @Override
    public int getQualityChangeRate() {
        return qualityChangeRate;
    }
}
