package com.gildedrose;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.gildedrose.item.Item;

public class TexttestFixture {
	
	private static final Logger logger = LogManager.getLogger(TexttestFixture.class);
	
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Conjured Mana Cake", 3, 6) 
                };

        GildedRose app = new GildedRose(items);

        int days = 2;
        
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
        	logger.info("-------- day " + i + " --------");
        	logger.info("name, sellIn, quality");
        	
            for (Item item : items) {
            	logger.info(item);
            }
            
            logger.info("\n");
            
            app.updateItems();
        }
    }
}
