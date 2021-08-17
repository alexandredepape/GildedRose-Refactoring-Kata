package com.gildedrose.updaters;

import com.gildedrose.Item;

public class BackstagePassesUpdater extends ItemUpdater {
    public static final int BACKSTAGE_PASS_QUALITY_CHANGE = 1;
    private boolean usedPass = false;

    @Override
    public int getQualityChangeRate(Item item) {
        // "Backstage passes", comme le "Aged Brie", augmente sa qualité (quality) plus le temps
        // passe (sellIn) ; La qualité augmente de 2 quand il reste 10 jours ou moins et de 3 quand
        // il reste 5 jours ou moins, mais la qualité tombe à 0 après le concert.
        if (usedPass) {
            return 0;
        }
        int qualityChangeRate = BACKSTAGE_PASS_QUALITY_CHANGE;
        if (item.sellIn <= 10) {
            qualityChangeRate = 2;
        }
        if (item.sellIn <= 5) {
            qualityChangeRate = 3;
        }
        return qualityChangeRate;
    }

    public void usePass(Item item){
        item.quality = 0;
        usedPass = true;
    }
}
