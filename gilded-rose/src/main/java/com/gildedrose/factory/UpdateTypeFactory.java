package com.gildedrose.factory;

import com.gildedrose.IUpdate;
import com.gildedrose.agedbrie.AgedBrieUpdate;
import com.gildedrose.backstagepass.BackstagePassUpdate;
import com.gildedrose.conjureditem.ConjuredItemUpdate;
import com.gildedrose.normalitem.NormalItemUpdate;
import com.gildedrose.sulfuras.SulfurasUpdate;

public class UpdateTypeFactory {

	private UpdateTypeFactory() {
		throw new IllegalStateException("Utility class");
	}

	public static IUpdate getUpdateType(String name) {
		if (name.contains("Aged Brie")) {
			return new AgedBrieUpdate();
		}
		else if (name.contains("Sulfuras")) {
			return new SulfurasUpdate();
		}
		else if (name.contains("Backstage passes")) {
			return new BackstagePassUpdate();
		}
		else if (name.contains("Conjured")) {
			return new ConjuredItemUpdate();
		}

		return new NormalItemUpdate();
	}
}
