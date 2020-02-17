package com.gildedrose.agedbrie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.item.Item;

public class AgedBrieUpdateTest {

	@Test
	void agedBrieName() {
      Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
      GildedRose app = new GildedRose(items);
      
      assertEquals("Aged Brie", app.getItems()[0].getName());
      app.updateItems();
      assertEquals("Aged Brie", app.getItems()[0].getName());
	}
	
	@Test
    void agedBrieSellIn() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 20) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(5, app.getItems()[0].getSellIn());
        app.updateItems();
        assertEquals(4, app.getItems()[0].getSellIn());
    }
	
	@Test
	void agedBrieQuality5To6() {
        Item[] items = new Item[] { new Item("Aged Brie", 3, 5) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(5, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(6, app.getItems()[0].getQuality());
    }
	
	@Test
	void agedBrieQuality10To12() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10) };
        GildedRose app = new GildedRose(items);
        assertEquals(10, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(12, app.getItems()[0].getQuality());
    }
	
	@Test
	void agedBrieQuality15To17() {
        Item[] items = new Item[] { new Item("Aged Brie", -2, 15) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(15, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(17, app.getItems()[0].getQuality());
    }
	
	@Test
	void agedBrieQuality49To50() {
        Item[] items = new Item[] { new Item("Aged Brie", 7, 49) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(49, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(50, app.getItems()[0].getQuality());
    }
	
	@Test
	void agedBrieQuality49To50AfterSellInDate() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, 49) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(49, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(50, app.getItems()[0].getQuality());
    }
	
	@Test
	void agedBrieQuality50To50() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 50) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(50, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(50, app.getItems()[0].getQuality());
    }
}
