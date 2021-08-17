package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.updaters.AgedBrieUpdater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieUpdaterTest {
    @Test
    void qualityGoesUp() {
        AgedBrieUpdater agedBrieUpdater = new AgedBrieUpdater();
        Item ageBrie = new Item("Aged Brie", 20, 0);
        agedBrieUpdater.update(ageBrie);
        assertEquals(19, ageBrie.sellIn);
        assertEquals(1, ageBrie.quality);
    }

    @Test
    void qualityGoesUpTwiceAsFast(){
        AgedBrieUpdater agedBrieUpdater = new AgedBrieUpdater();
        Item ageBrie = new Item("Aged Brie", 0, 0);
        agedBrieUpdater.update(ageBrie);
        assertEquals(-1, ageBrie.sellIn);
        assertEquals(2, ageBrie.quality);
    }
}
