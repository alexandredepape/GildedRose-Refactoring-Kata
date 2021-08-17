package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.updaters.BackstagePassesUpdater;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BackstagePassesUpdaterTest {
    @Test
    void usePassPutsQualityToZero(){
        BackstagePassesUpdater backstagePassesUpdater = new BackstagePassesUpdater();
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 20, 10);
        backstagePassesUpdater.usePass(backstagePasses);
        assertEquals(0, backstagePasses.quality);
    }

    @Test
    void updating_WhenSellinGreaterThan10_UpdatesQualityBy_1() {
        BackstagePassesUpdater backstagePassesUpdater = new BackstagePassesUpdater();
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 0);
        backstagePassesUpdater.update(backstagePasses);
        assertEquals(10, backstagePasses.sellIn);
        assertEquals(1, backstagePasses.quality);
    }

    @Test
    void updating_WhenSellinGreaterThan10_UpdatesQualityBy_2() {
        BackstagePassesUpdater backstagePassesUpdater = new BackstagePassesUpdater();
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 0);
        backstagePassesUpdater.update(backstagePasses);
        assertEquals(2, backstagePasses.quality);
    }

    @Test
    void updating_WhenSellinGreaterThan10_UpdatesQualityBy_3() {
        BackstagePassesUpdater backstagePassesUpdater = new BackstagePassesUpdater();
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 0);

        backstagePassesUpdater.update(backstagePasses);
        assertEquals(3, backstagePasses.quality);
    }
}
