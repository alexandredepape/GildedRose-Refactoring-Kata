package com.gildedrose.updaters;

import com.gildedrose.Item;

public class LegendaryUpdater extends ItemUpdater {

    int qualityChangeRate = 0;

    @Override
    public int getQualityChangeRate() {
        return qualityChangeRate;
    }

    @Override
    protected void updateQuality(Item item) {
        // "Sulfuras", étant un objet légendaire, n'a pas de date de péremption et ne perd jamais en qualité (quality)
    }

    @Override
    protected void updateSellin(Item item) {
        // "Sulfuras", étant un objet légendaire, n'a pas de date de péremption et ne perd jamais en qualité (quality)

    }
}
