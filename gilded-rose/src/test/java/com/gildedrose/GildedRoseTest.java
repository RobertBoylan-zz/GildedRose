package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.gildedrose.item.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;

@TestInstance(Lifecycle.PER_CLASS)
public class GildedRoseTest {

	private Item[] items;
	private GildedRose gildedRose;
	
	@BeforeAll
	public void initializeTestData() {
		items = new Item[] { new Item("Normal Item", 5, 5) };
		gildedRose = new GildedRose(items);
	}
	
	@Test
    public void testGildedRoseNotNull() {
        assertNotNull(gildedRose);
    }
	
	@Test
    public void testUpdateItems() {
        assertEquals("Normal Item", items[0].getName());
        assertEquals(5, items[0].getSellIn());
        assertEquals(5, items[0].getQuality());
        
        gildedRose.updateItems();
        
        assertEquals("Normal Item", items[0].getName());
        assertEquals(4, items[0].getSellIn());
        assertEquals(4, items[0].getQuality());
    }
}
