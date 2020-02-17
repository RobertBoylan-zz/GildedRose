package com.gildedrose.sulfuras;

import com.gildedrose.IUpdate;
import com.gildedrose.item.Item;

public class SulfurasUpdate implements IUpdate {
	
	@Override
	public Item updateQuality(Item item) {
		return item;
	}
	
	@Override
	public Item updateSellIn(Item item) {	
		return item;
	}
}