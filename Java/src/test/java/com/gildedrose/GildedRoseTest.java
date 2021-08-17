package com.gildedrose;

import com.gildedrose.updaters.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void agedBrieTest() {
        AgedBrieUpdater agedBrieUpdater = new AgedBrieUpdater();
        Item ageBrie = new Item("Aged Brie", 20, 0);
        agedBrieUpdater.update(ageBrie);
        assertEquals(19, ageBrie.sellIn);
        assertEquals(1, ageBrie.quality);

        ageBrie = new Item("Aged Brie", 0, 0);
        agedBrieUpdater.update(ageBrie);
        assertEquals(-1, ageBrie.sellIn);
        assertEquals(2, ageBrie.quality);
    }

    @Test
    void backstagePassesTest() {
        BackstagePassesUpdater backstagePassesUpdater = new BackstagePassesUpdater();
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 0);
        backstagePassesUpdater.update(backstagePasses);
        assertEquals(10, backstagePasses.sellIn);
        assertEquals(1, backstagePasses.quality);

        backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 1);
        backstagePassesUpdater.update(backstagePasses);
        assertEquals(3, backstagePasses.quality);

        backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 1);

        backstagePassesUpdater.update(backstagePasses);
        assertEquals(4, backstagePasses.quality);
    }

    @Test
    void conjuredTest(){
        ConjuredUpdater backstagePassesUpdater = new ConjuredUpdater();
        Item conjured = new Item("Conjured Mana Cake", 20, 0);
        backstagePassesUpdater.update(conjured);
        assertEquals(19, conjured.sellIn);
        assertEquals(2, conjured.quality);

    }

    @Test
    void legendaryTest(){
        LegendaryUpdater legendaryUpdater = new LegendaryUpdater();
        Item legendary = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        legendaryUpdater.update(legendary);
        assertEquals(0, legendary.sellIn);
        assertEquals(80, legendary.quality);

    }
    @Test
    void normalTest(){
        NormalUpdater normalUpdater = new NormalUpdater();
        Item normal = new Item("+5 Dexterity Vest", 20, 40);
        normalUpdater.update(normal);
        assertEquals(19, normal.sellIn);
        assertEquals(39, normal.quality);
    }

    @Test
    void minMaxQualityTest(){
        ConjuredUpdater conjuredUpdater = new ConjuredUpdater();
        Item normal = new Item("+5 Dexterity Vest", 20, 50);
        conjuredUpdater.update(normal);
        assertEquals(50, normal.quality);

        NormalUpdater normalUpdater = new NormalUpdater();
        normal = new Item("+5 Dexterity Vest", 20, 0);
        normalUpdater.update(normal);
        assertEquals(0, normal.quality);
    }
}
