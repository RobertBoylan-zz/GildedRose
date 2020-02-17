package com.gildedrose.normalitem;

import com.gildedrose.IUpdate;
import com.gildedrose.item.Item;
import com.gildedrose.utilities.UpdateUtilities;

public class NormalItemUpdate implements IUpdate {

	private static final int QUALITY_MIN = 0;
	private static final int QUALITY_INCREMENT = 1;

	@Override
	public Item updateQuality(Item item) {
		int newQuality = QUALITY_MIN;

		if(UpdateUtilities.isQualityAboveMin(item.getQuality(), QUALITY_MIN)) {	
			newQuality = item.getQuality() - (UpdateUtilities.isSellInZeroOrBelow(item.getSellIn()) ? QUALITY_INCREMENT * 2 : QUALITY_INCREMENT);
		}

		item.setQuality(newQuality);

		if(UpdateUtilities.isQualityBelowMin(newQuality, QUALITY_MIN)) {
			item.setQuality(QUALITY_MIN);
		}

		return item;
	}

	@Override
	public Item updateSellIn(Item item) {
		item.setSellIn(item.getSellIn()-1);

		return item;
	}
}
