package com.gildedrose.updaters;

import com.gildedrose.Item;

public class ConjuredUpdater extends ItemUpdater {
    public final static int CONJURED_QUALITY_CHANGE_RATE = 2;

    @Override
    public int getQualityChangeRate(Item item) {
        return CONJURED_QUALITY_CHANGE_RATE;
    }
}
