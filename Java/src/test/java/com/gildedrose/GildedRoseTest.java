package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GildedRoseTest {


    @Test
    void updateQualityUpdatesItems() {
        Item[] items = new Item[]{new Item("+5 Dexterity Vest", 10, 20)};

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(19, app.items[0].quality);
    }

    @Test
    public void whenNewItemWithoutSpecifiedUpdater_ThenThrowsRunTimeException() {
        Item item = new Item("Agility Cloak", 20, 5);
        Item[] items = new Item[]{item};

        GildedRose app = new GildedRose(items);
        Exception exception = assertThrows(RuntimeException.class, app::updateQuality);

        String expectedMessage = String.format("Please add an Updater for %s", item.name);
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}
