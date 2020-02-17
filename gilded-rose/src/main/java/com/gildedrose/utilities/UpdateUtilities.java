package com.gildedrose.utilities;

public class UpdateUtilities {

	private UpdateUtilities() {
		throw new IllegalStateException("Utility class");
	}

	public static boolean isQualityAboveMin(int quality, int qualityMin) {
		return quality > qualityMin;
	}

	public static boolean isQualityBelowMin(int quality, int qualityMin) {
		return quality < qualityMin;
	}

	public static boolean isQualityAboveMax(int quality, int qualityMax) {
		return quality > qualityMax;
	}

	public static boolean isQualityBelowMax(int quality, int qualityMax) {
		return quality < qualityMax;
	}

	public static boolean isSellInZeroOrBelow(int sellIn) {
		return sellIn <= 0;
	}
}
