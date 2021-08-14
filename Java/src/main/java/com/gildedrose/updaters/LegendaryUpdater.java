package com.gildedrose.updaters;

import com.gildedrose.Item;

public class LegendaryUpdater extends ItemUpdater {

    public static final int LEGENDARY_QUALITY_CHANGE_RATE = 0;

    @Override
    public int getQualityChangeRate(Item item) {
        return LEGENDARY_QUALITY_CHANGE_RATE;
    }

    @Override
    public void update(Item item) {
        // "Sulfuras", étant un objet légendaire, ne perd jamais en qualité (quality) et n'a pas de date de péremption
    }
}
