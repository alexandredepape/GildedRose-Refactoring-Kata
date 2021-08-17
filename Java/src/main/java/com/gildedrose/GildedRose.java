package com.gildedrose;

import com.gildedrose.updaters.*;

class GildedRose {
    Item[] items;



    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater itemUpdater = ItemUpdaters.UPDATERS.get(item.name);
            if (itemUpdater == null) {
                throw new RuntimeException(String.format("Please add an Updater for %s", item.name));
            }
            itemUpdater.update(item);
        }
    }
}
