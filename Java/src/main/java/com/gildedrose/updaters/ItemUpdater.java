package com.gildedrose.updaters;

import com.gildedrose.Item;

public abstract class ItemUpdater {

    public static final int MIN_QUALITY = 0;
    public static final int MAX_QUALITY = 50;

    public abstract int getQualityChangeRate(Item item);

    public void update(Item item) {
        updateQuality(item);
        updateSellin(item);

    }
    protected void updateSellin(Item item){
        item.sellIn -= 1;
    }

    protected void updateQuality(Item item) {
        int qualityChangeRate = getQualityChangeRate(item);
        if (item.sellIn <= 0)
            qualityChangeRate *= 2;
        item.quality += qualityChangeRate;
        item.quality = clampQuality(item.quality);
    }

    protected static int clampQuality(int quality) {
        int result = Math.max(MIN_QUALITY, quality); // La qualité (quality) d'un produit ne peut jamais être négative.
        return Math.min(result, MAX_QUALITY); // La qualité d'un produit n'est jamais de plus de 50.
    }

}
