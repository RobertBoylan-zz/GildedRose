package com.gildedrose.backstagepass;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.item.Item;

public class BackstagePassUpdateTest {

	@Test
	void backstagePassName() {
      Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -3, 0) };
      GildedRose app = new GildedRose(items);
      
      assertEquals("Backstage passes to a TAFKAL80ETC concert", app.getItems()[0].getName());
      app.updateItems();
      assertEquals("Backstage passes to a TAFKAL80ETC concert", app.getItems()[0].getName());
	}
	
	@Test
    void backstagePassSellIn() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 2) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(4, app.getItems()[0].getSellIn());
        app.updateItems();
        assertEquals(3, app.getItems()[0].getSellIn());
    }
	
	@Test
	void backstagePassQuality20To21() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 12, 20) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(20, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(21, app.getItems()[0].getQuality());
    }
	
	@Test
	void backstagePassQuality40To42() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 40) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(40, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(42, app.getItems()[0].getQuality());
    }
	
	@Test
	void backstagePassQuality22To24() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 7, 22) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(22, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(24, app.getItems()[0].getQuality());
    }
	
	@Test
	void backstagePassQuality16To19() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6, 16) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(16, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(19, app.getItems()[0].getQuality());
    }
	
	@Test
	void backstagePassQuality4To7() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 2, 4) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(4, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(7, app.getItems()[0].getQuality());
    }
	
	@Test
	void backstagePassQuality5To0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 5) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(5, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(0, app.getItems()[0].getQuality());
    }
	
	@Test
	void backstagePassQuality15To0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 15) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(15, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(0, app.getItems()[0].getQuality());
    }
	
	@Test
	void backstagePassQuality40To0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 40) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(40, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(0, app.getItems()[0].getQuality());
    }
	
	@Test
	void backstagePassQuality48To50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 2, 48) };
        GildedRose app = new GildedRose(items);
        
        assertEquals(48, app.getItems()[0].getQuality());
        app.updateItems();
        assertEquals(50, app.getItems()[0].getQuality());
    }	
}
