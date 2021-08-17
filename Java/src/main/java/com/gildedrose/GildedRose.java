package com.gildedrose;

import com.gildedrose.updaters.*;

import java.util.HashMap;
import java.util.Map;

class GildedRose {
    Item[] items;

    private static final Map<String, ItemUpdater> itemUpdaters = new HashMap<>();

    static {
        itemUpdaters.put("Sulfuras, Hand of Ragnaros", new LegendaryUpdater());
        itemUpdaters.put("Conjured Mana Cake", new ConjuredUpdater());
        itemUpdaters.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesUpdater());
        itemUpdaters.put("Aged Brie", new AgedBrieUpdater());
        itemUpdaters.put("+5 Dexterity Vest", new NormalUpdater());
        itemUpdaters.put("Elixir of the Mongoose", new NormalUpdater());
    }

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater itemUpdater = GildedRose.itemUpdaters.get(item.name);
            if (itemUpdater == null) {
                throw new RuntimeException(String.format("Please add an Updater for %s", item.name));
            }
            itemUpdater.update(item);
        }
    }
}
