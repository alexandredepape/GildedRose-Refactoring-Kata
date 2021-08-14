package com.gildedrose.updaters;

import com.gildedrose.Item;

public class NormalUpdater extends ItemUpdater{
    int qualityChangeRate = -1;

    @Override
    public int getQualityChangeRate(Item item) {
        return qualityChangeRate;
    }
}
