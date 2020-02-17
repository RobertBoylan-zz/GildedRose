package com.gildedrose.sulfuras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.item.Item;

public class SulfurasUpdateTest {

	@Test
	void sulfurasName() {
      Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 2, 5) };
      GildedRose app = new GildedRose(items);
      
      assertEquals("Sulfuras, Hand of Ragnaros", app.getItems()[0].getName());
      app.updateItems();
      assertEquals("Sulfuras, Hand of Ragnaros", app.getItems()[0].getName());
	}
	
	@Test
    void sulfurasSellIn() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 20, 0) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(20, app.getItems()[0].getSellIn());
        app.updateItems();
        assertEquals(20, app.getItems()[0].getSellIn());
    }
	
	@Test
	void sulfurasQuality80To80() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 9, 80) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(80, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(80, app.getItems()[0].getQuality());
    }
	
	@Test
	void sulfurasQuality80To80AfterSellInDate() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -4, 80) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(80, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(80, app.getItems()[0].getQuality());
    }
}
