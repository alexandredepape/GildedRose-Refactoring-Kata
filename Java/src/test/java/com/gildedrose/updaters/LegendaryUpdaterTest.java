package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.updaters.LegendaryUpdater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LegendaryUpdaterTest {

    @Test
    void updating_KeepsQualityAt_80() {
        LegendaryUpdater legendaryUpdater = new LegendaryUpdater();
        Item legendary = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        legendaryUpdater.update(legendary);
        assertEquals(0, legendary.sellIn);
        assertEquals(80, legendary.quality);

    }
}
