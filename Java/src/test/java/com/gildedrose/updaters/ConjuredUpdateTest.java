package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.updaters.ConjuredUpdater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredUpdateTest {
    @Test
    void updating_IncreasesQualityBy_2(){
        ConjuredUpdater backstagePassesUpdater = new ConjuredUpdater();
        Item conjured = new Item("Conjured Mana Cake", 20, 0);
        backstagePassesUpdater.update(conjured);
        assertEquals(19, conjured.sellIn);
        assertEquals(2, conjured.quality);

    }
}
