package com.gildedrose.normalitem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.item.Item;
import com.gildedrose.GildedRose;

public class NormalItemUpdateTest {

	@Test
    void normalItemName() {
        Item[] items = new Item[] { new Item("Normal Item", 0, 0) };
        GildedRose app = new GildedRose(items);
        
        assertEquals("Normal Item", app.getItems()[0].getName());
        app.updateItems();
        assertEquals("Normal Item", app.getItems()[0].getName());
    }
	
	@Test
    void normalItemSellIn() {
        Item[] items = new Item[] { new Item("Normal Item", 0, 0) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(0, app.getItems()[0].getSellIn());
        app.updateItems();
        assertEquals(-1, app.getItems()[0].getSellIn());
    }
	
	@Test
    void normalItemQuality0To0() {
        Item[] items = new Item[] { new Item("Normal Item", 0, 0) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(0, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(0, app.getItems()[0].getQuality());
    }
	
	@Test
    void normalItemQuality1To0() {
        Item[] items = new Item[] { new Item("Normal Item", 5, 1) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(1, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(0, app.getItems()[0].getQuality());
    }
	
	@Test
    void normalItemQuality50To49() {
        Item[] items = new Item[] { new Item("Normal Item", 10, 50) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(50, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(49, app.getItems()[0].getQuality());
    }
	
	@Test
    void normalItemQuality30To28() {
        Item[] items = new Item[] { new Item("Normal Item", 0, 30) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(30, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(28, app.getItems()[0].getQuality());
    }
	
	@Test
    void normalItemQuality10To8() {
        Item[] items = new Item[] { new Item("Normal Item", -1, 10) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(10, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(8, app.getItems()[0].getQuality());
    }
}
