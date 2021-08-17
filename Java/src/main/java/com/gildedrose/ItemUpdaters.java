package com.gildedrose;

import com.gildedrose.updaters.*;

import java.util.HashMap;
import java.util.Map;

public class ItemUpdaters {
    public static final Map<String, ItemUpdater> UPDATERS = new HashMap<>();

    static {
        UPDATERS.put("Sulfuras, Hand of Ragnaros", new LegendaryUpdater());
        UPDATERS.put("Conjured Mana Cake", new ConjuredUpdater());
        UPDATERS.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesUpdater());
        UPDATERS.put("Aged Brie", new AgedBrieUpdater());
        UPDATERS.put("+5 Dexterity Vest", new NormalUpdater());
        UPDATERS.put("Elixir of the Mongoose", new NormalUpdater());
    }
}
