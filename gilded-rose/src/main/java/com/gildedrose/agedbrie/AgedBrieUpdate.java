package com.gildedrose.agedbrie;

import com.gildedrose.IUpdate;
import com.gildedrose.item.Item;
import com.gildedrose.utilities.UpdateUtilities;

public class AgedBrieUpdate implements IUpdate {

	private static final int QUALITY_MAX = 50;
	private static final int QUALITY_INCREMENT = 1;
	
	@Override
	public Item updateQuality(Item item) {
		int newQuality = QUALITY_MAX;
		
		if(UpdateUtilities.isQualityBelowMax(item.getQuality(), QUALITY_MAX)) {
			newQuality = item.getQuality() + (UpdateUtilities.isSellInZeroOrBelow(item.getSellIn()) ? QUALITY_INCREMENT * 2 : QUALITY_INCREMENT);
		}
		
		if(UpdateUtilities.isQualityAboveMax(newQuality, QUALITY_MAX)) {
			newQuality = QUALITY_MAX;
		}
		
		item.setQuality(newQuality);
		
		return item;
	}
	
	@Override
	public Item updateSellIn(Item item) {
		item.setSellIn(item.getSellIn()-1);
		
		return item;
	}
}
