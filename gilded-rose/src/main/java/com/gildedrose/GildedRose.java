package com.gildedrose;

import com.gildedrose.factory.UpdateTypeFactory;
import com.gildedrose.item.Item;

public class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateItems() {
    	for(Item item : items) {
    		IUpdate updateType = UpdateTypeFactory.getUpdateType(item.getName());
    		
    		updateType.updateSellIn(item);
    		updateType.updateQuality(item);
    	}
    }
    
    public Item[] getItems() {
    	return items;
    }
}