package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.updaters.NormalUpdater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalTest {

    @Test
    void updating_ReducesQualityBy_1(){
        NormalUpdater normalUpdater = new NormalUpdater();
        Item normal = new Item("+5 Dexterity Vest", 20, 40);
        normalUpdater.update(normal);
        assertEquals(19, normal.sellIn);
        assertEquals(39, normal.quality);
    }
}
