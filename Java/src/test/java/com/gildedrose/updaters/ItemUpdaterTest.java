package com.gildedrose.updaters;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemUpdaterTest {
    @Test
    void qualityCantGoAbove50() {
        ConjuredUpdater conjuredUpdater = new ConjuredUpdater();
        Item normal = new Item("+5 Dexterity Vest", 20, 50);
        conjuredUpdater.update(normal);
        assertEquals(50, normal.quality);
    }
    @Test
    void qualityCantGoBelow0() {
        NormalUpdater normalUpdater = new NormalUpdater();
        Item normal = new Item("+5 Dexterity Vest", 20, 0);
        normalUpdater.update(normal);
        assertEquals(0, normal.quality);
    }

}
