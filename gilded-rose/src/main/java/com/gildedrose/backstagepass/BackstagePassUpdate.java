package com.gildedrose.backstagepass;

import com.gildedrose.IUpdate;
import com.gildedrose.item.Item;
import com.gildedrose.utilities.UpdateUtilities;

public class BackstagePassUpdate implements IUpdate {

	private static final int QUALITY_MIN = 0;
	private static final int QUALITY_MAX = 50;
	private static final int QUALITY_INCREMENT = 1;

	@Override
	public Item updateQuality(Item item) {
		int newQuality;
		
		if (UpdateUtilities.isSellInZeroOrBelow(item.getSellIn())) {
			newQuality = QUALITY_MIN;
        }
        else if(isSellInBetween6And10(item)) {
        	newQuality = item.getQuality() + QUALITY_INCREMENT * 2;
        }
        else if(isSellInBetween1And5(item)) {
        	newQuality = item.getQuality() + QUALITY_INCREMENT * 3;
        }
        else {
        	newQuality = item.getQuality() + QUALITY_INCREMENT;
        }

        if(UpdateUtilities.isQualityAboveMax(newQuality, QUALITY_MAX)) {
        	newQuality = QUALITY_MAX;
        }
        else if (UpdateUtilities.isQualityBelowMin(newQuality, QUALITY_MIN)) {
			newQuality = QUALITY_MIN;
        }

        item.setQuality(newQuality);
        
		return item;
	}

	@Override
	public Item updateSellIn(Item item) {
		item.setSellIn(item.getSellIn()-1);

		return item;
	}
	
	private boolean isSellInBetween6And10(Item item) {
        return item.getSellIn() > 5 && item.getSellIn() <= 10;
    }

    private boolean isSellInBetween1And5(Item item) {
        return item.getSellIn() > 0 && item.getSellIn() <= 5;
    }
}