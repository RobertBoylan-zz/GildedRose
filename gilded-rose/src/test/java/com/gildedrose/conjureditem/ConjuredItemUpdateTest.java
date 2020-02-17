package com.gildedrose.conjureditem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.item.Item;

public class ConjuredItemUpdateTest {

	@Test
	void conjuredItemName() {
      Item[] items = new Item[] { new Item("Conjured Mana Cake", 1, 0) };
      GildedRose app = new GildedRose(items);
      
      assertEquals("Conjured Mana Cake", app.getItems()[0].getName());
      app.updateItems();
      assertEquals("Conjured Mana Cake", app.getItems()[0].getName());
	}
	
	@Test
    void conjuredItemSellIn() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 5, 2) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(5, app.getItems()[0].getSellIn());
        app.updateItems();
        assertEquals(4, app.getItems()[0].getSellIn());
    }
	
	@Test
	void conjuredItemQuality80To78() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 3, 80) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(80, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(78, app.getItems()[0].getQuality());
    }
	
	@Test
	void conjuredItemQuality1To0() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 5, 1) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(1, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(0, app.getItems()[0].getQuality());
    }
	
	@Test
	void conjuredItemQuality5To1() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", -4, 5) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(5, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(1, app.getItems()[0].getQuality());
    }
	
	@Test
	void conjuredItemQuality2To0() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", -5, 2) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(2, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(0, app.getItems()[0].getQuality());
    }
}
