package com.gildedrose.updaters;

import com.gildedrose.Item;

public class AgedBrieUpdater extends ItemUpdater {
    public final static int AGED_BRIE_QUALITY_CHANGE_RATE = 1;

    @Override
    public int getQualityChangeRate(Item item) {
        return AGED_BRIE_QUALITY_CHANGE_RATE;
    }
}
