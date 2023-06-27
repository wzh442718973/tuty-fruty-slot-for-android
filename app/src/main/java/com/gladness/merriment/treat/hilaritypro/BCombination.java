package com.gladness.merriment.treat.hilaritypro;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;







 

 
class BCombination {
long clearCreate_mark = 0;
private String numberSettingsStr;




	 
	public static final XSelectorRegister COMBINATION_001_SYMBOL_01_CONFIGURATION_01 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	 
	public static final XSelectorRegister COMBINATION_002_SYMBOL_01_CONFIGURATION_02 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	 
	public static final XSelectorRegister COMBINATION_003_SYMBOL_01_CONFIGURATION_03 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	 
	public static final XSelectorRegister COMBINATION_004_SYMBOL_01_CONFIGURATION_04 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	 
	public static final XSelectorRegister COMBINATION_005_SYMBOL_01_CONFIGURATION_05 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	 
	public static final XSelectorRegister COMBINATION_006_SYMBOL_01_CONFIGURATION_06 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	 
	public static final XSelectorRegister COMBINATION_007_SYMBOL_01_CONFIGURATION_07 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	 
	public static final XSelectorRegister COMBINATION_008_SYMBOL_01_CONFIGURATION_08 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	 
	public static final XSelectorRegister COMBINATION_009_SYMBOL_01_CONFIGURATION_09 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	 
	public static final XSelectorRegister COMBINATION_010_SYMBOL_01_CONFIGURATION_10 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	 
	public static final XSelectorRegister COMBINATION_011_SYMBOL_01_CONFIGURATION_11 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	 
	public static final XSelectorRegister COMBINATION_012_SYMBOL_01_CONFIGURATION_12 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	 
	public static final XSelectorRegister COMBINATION_013_SYMBOL_01_CONFIGURATION_13 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	 
	public static final XSelectorRegister COMBINATION_014_SYMBOL_01_CONFIGURATION_14 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	 
	public static final XSelectorRegister COMBINATION_015_SYMBOL_01_CONFIGURATION_15 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	 
	public static final XSelectorRegister COMBINATION_016_SYMBOL_01_CONFIGURATION_16 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	 
	public static final XSelectorRegister COMBINATION_017_SYMBOL_01_CONFIGURATION_17 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	 
	public static final XSelectorRegister COMBINATION_018_SYMBOL_01_CONFIGURATION_18 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	 
	public static final XSelectorRegister COMBINATION_019_SYMBOL_01_CONFIGURATION_19 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	 
	public static final XSelectorRegister COMBINATION_020_SYMBOL_01_CONFIGURATION_20 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), AALines.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	 
	public static final XSelectorRegister COMBINATION_021_SYMBOL_01_CONFIGURATION_21 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	 
	public static final XSelectorRegister COMBINATION_022_SYMBOL_01_CONFIGURATION_22 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	 
	public static final XSelectorRegister COMBINATION_023_SYMBOL_01_CONFIGURATION_23 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	 
	public static final XSelectorRegister COMBINATION_024_SYMBOL_01_CONFIGURATION_24 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	 
	static final XSelectorRegister COMBINATION_025_SYMBOL_01_CONFIGURATION_25 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	 
	static final XSelectorRegister COMBINATION_026_SYMBOL_01_CONFIGURATION_26 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	 
	public static final XSelectorRegister COMBINATION_027_SYMBOL_01_CONFIGURATION_27 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	 
	public static final XSelectorRegister COMBINATION_028_SYMBOL_01_CONFIGURATION_28 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	 
	public static final XSelectorRegister COMBINATION_029_SYMBOL_02_CONFIGURATION_01 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	 
	public static final XSelectorRegister COMBINATION_030_SYMBOL_02_CONFIGURATION_02 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	 
	public static final XSelectorRegister COMBINATION_031_SYMBOL_02_CONFIGURATION_03 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	 
	public static final XSelectorRegister COMBINATION_032_SYMBOL_02_CONFIGURATION_04 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	 
	public static final XSelectorRegister COMBINATION_033_SYMBOL_02_CONFIGURATION_05 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	 
	public static final XSelectorRegister COMBINATION_034_SYMBOL_02_CONFIGURATION_06 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	 
	public static final XSelectorRegister COMBINATION_035_SYMBOL_02_CONFIGURATION_07 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	 
	public static final XSelectorRegister COMBINATION_036_SYMBOL_02_CONFIGURATION_08 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	 
	public static final XSelectorRegister COMBINATION_037_SYMBOL_02_CONFIGURATION_09 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	 
	public static final XSelectorRegister COMBINATION_038_SYMBOL_02_CONFIGURATION_10 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	 
	public static final XSelectorRegister COMBINATION_039_SYMBOL_02_CONFIGURATION_11 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");
	 
	public static final XSelectorRegister COMBINATION_040_SYMBOL_02_CONFIGURATION_12 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	 
	public static final XSelectorRegister COMBINATION_041_SYMBOL_02_CONFIGURATION_13 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	 
	public static final XSelectorRegister COMBINATION_042_SYMBOL_02_CONFIGURATION_14 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	 
	public static final XSelectorRegister COMBINATION_043_SYMBOL_02_CONFIGURATION_15 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	 
	public static final XSelectorRegister COMBINATION_044_SYMBOL_02_CONFIGURATION_16 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	 
	public static final XSelectorRegister COMBINATION_045_SYMBOL_02_CONFIGURATION_17 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	 
	public static final XSelectorRegister COMBINATION_046_SYMBOL_02_CONFIGURATION_18 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	 
	public static final XSelectorRegister COMBINATION_047_SYMBOL_02_CONFIGURATION_19 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	 
	public static final XSelectorRegister COMBINATION_048_SYMBOL_02_CONFIGURATION_20 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), AALines.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	 
	public static final XSelectorRegister COMBINATION_049_SYMBOL_02_CONFIGURATION_21 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");
	 
	public static final XSelectorRegister COMBINATION_050_SYMBOL_02_CONFIGURATION_22 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	 
	public static final XSelectorRegister COMBINATION_051_SYMBOL_02_CONFIGURATION_23 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	 
	public static final XSelectorRegister COMBINATION_052_SYMBOL_02_CONFIGURATION_24 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	 
	public static final XSelectorRegister COMBINATION_053_SYMBOL_02_CONFIGURATION_25 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	 
	public static final XSelectorRegister COMBINATION_054_SYMBOL_02_CONFIGURATION_26 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	 
	public static final XSelectorRegister COMBINATION_055_SYMBOL_02_CONFIGURATION_27 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	 
	public static final XSelectorRegister COMBINATION_056_SYMBOL_02_CONFIGURATION_28 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	 
	public static final XSelectorRegister COMBINATION_057_SYMBOL_03_CONFIGURATION_01 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	 
	public static final XSelectorRegister COMBINATION_058_SYMBOL_03_CONFIGURATION_02 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	 
	public static final XSelectorRegister COMBINATION_059_SYMBOL_03_CONFIGURATION_03 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	 
	public static final XSelectorRegister COMBINATION_060_SYMBOL_03_CONFIGURATION_04 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	 
	public static final XSelectorRegister COMBINATION_061_SYMBOL_03_CONFIGURATION_05 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	 
	public static final XSelectorRegister COMBINATION_062_SYMBOL_03_CONFIGURATION_06 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	 
	public static final XSelectorRegister COMBINATION_063_SYMBOL_03_CONFIGURATION_07 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	 
	public static final XSelectorRegister COMBINATION_064_SYMBOL_03_CONFIGURATION_08 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	 
	public static final XSelectorRegister COMBINATION_065_SYMBOL_03_CONFIGURATION_09 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	 
	public static final XSelectorRegister COMBINATION_066_SYMBOL_03_CONFIGURATION_10 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	 
	public static final XSelectorRegister COMBINATION_067_SYMBOL_03_CONFIGURATION_11 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	 
	public static final XSelectorRegister COMBINATION_068_SYMBOL_03_CONFIGURATION_12 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	 
	public static final XSelectorRegister COMBINATION_069_SYMBOL_03_CONFIGURATION_13 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	 
	public static final XSelectorRegister COMBINATION_070_SYMBOL_03_CONFIGURATION_14 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	 
	public static final XSelectorRegister COMBINATION_071_SYMBOL_03_CONFIGURATION_15 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	 
	public static final XSelectorRegister COMBINATION_072_SYMBOL_03_CONFIGURATION_16 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	 
	public static final XSelectorRegister COMBINATION_073_SYMBOL_03_CONFIGURATION_17 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	 
	public static final XSelectorRegister COMBINATION_074_SYMBOL_03_CONFIGURATION_18 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	 
	public static final XSelectorRegister COMBINATION_075_SYMBOL_03_CONFIGURATION_19 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	 
	public static final XSelectorRegister COMBINATION_076_SYMBOL_03_CONFIGURATION_20 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), AALines.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	 
	public static final XSelectorRegister COMBINATION_077_SYMBOL_03_CONFIGURATION_21 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	 
	public static final XSelectorRegister COMBINATION_078_SYMBOL_03_CONFIGURATION_22 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	 
	public static final XSelectorRegister COMBINATION_079_SYMBOL_03_CONFIGURATION_23 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	 
	public static final XSelectorRegister COMBINATION_080_SYMBOL_03_CONFIGURATION_24 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	 
	public static final XSelectorRegister COMBINATION_081_SYMBOL_03_CONFIGURATION_25 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	 
	public static final XSelectorRegister COMBINATION_082_SYMBOL_03_CONFIGURATION_26 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	 
	public static final XSelectorRegister COMBINATION_083_SYMBOL_03_CONFIGURATION_27 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	 
	public static final XSelectorRegister COMBINATION_084_SYMBOL_03_CONFIGURATION_28 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	 
	public static final XSelectorRegister COMBINATION_085_SYMBOL_04_CONFIGURATION_01 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");

	 
	public static final XSelectorRegister COMBINATION_086_SYMBOL_04_CONFIGURATION_02 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");

	 
	public static final XSelectorRegister COMBINATION_087_SYMBOL_04_CONFIGURATION_03 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");

	 
	public static final XSelectorRegister COMBINATION_088_SYMBOL_04_CONFIGURATION_04 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");

	 
	public static final XSelectorRegister COMBINATION_089_SYMBOL_04_CONFIGURATION_05 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");
	 
	public static final XSelectorRegister COMBINATION_090_SYMBOL_04_CONFIGURATION_06 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	 
	public static final XSelectorRegister COMBINATION_091_SYMBOL_04_CONFIGURATION_07 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	 
	public static final XSelectorRegister COMBINATION_092_SYMBOL_04_CONFIGURATION_08 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	 
	public static final XSelectorRegister COMBINATION_093_SYMBOL_04_CONFIGURATION_09 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	 
	public static final XSelectorRegister COMBINATION_094_SYMBOL_04_CONFIGURATION_10 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	 
	public static final XSelectorRegister COMBINATION_095_SYMBOL_04_CONFIGURATION_11 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	 
	public static final XSelectorRegister COMBINATION_096_SYMBOL_04_CONFIGURATION_12 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	 
	public static final XSelectorRegister COMBINATION_097_SYMBOL_04_CONFIGURATION_13 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	 
	public static final XSelectorRegister COMBINATION_098_SYMBOL_04_CONFIGURATION_14 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	 
	public static final XSelectorRegister COMBINATION_099_SYMBOL_04_CONFIGURATION_15 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	 
	public static final XSelectorRegister COMBINATION_100_SYMBOL_04_CONFIGURATION_16 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	 
	public static final XSelectorRegister COMBINATION_101_SYMBOL_04_CONFIGURATION_17 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	 
	public static final XSelectorRegister COMBINATION_102_SYMBOL_04_CONFIGURATION_18 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	 
	public static final XSelectorRegister COMBINATION_103_SYMBOL_04_CONFIGURATION_19 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	 
	public static final XSelectorRegister COMBINATION_104_SYMBOL_04_CONFIGURATION_20 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), AALines.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	 
	public static final XSelectorRegister COMBINATION_105_SYMBOL_04_CONFIGURATION_21 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	 
	public static final XSelectorRegister COMBINATION_106_SYMBOL_04_CONFIGURATION_22 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	 
	public static final XSelectorRegister COMBINATION_107_SYMBOL_04_CONFIGURATION_23 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	 
	public static final XSelectorRegister COMBINATION_108_SYMBOL_04_CONFIGURATION_24 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	 
	public static final XSelectorRegister COMBINATION_109_SYMBOL_04_CONFIGURATION_25 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	 
	public static final XSelectorRegister COMBINATION_110_SYMBOL_04_CONFIGURATION_26 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	 
	public static final XSelectorRegister COMBINATION_111_SYMBOL_04_CONFIGURATION_27 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	 
	public static final XSelectorRegister COMBINATION_112_SYMBOL_04_CONFIGURATION_28 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	 
	public static final XSelectorRegister COMBINATION_113_SYMBOL_05_CONFIGURATION_01 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	 
	public static final XSelectorRegister COMBINATION_114_SYMBOL_05_CONFIGURATION_02 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	 
	public static final XSelectorRegister COMBINATION_115_SYMBOL_05_CONFIGURATION_03 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	 
	public static final XSelectorRegister COMBINATION_116_SYMBOL_05_CONFIGURATION_04 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	 
	public static final XSelectorRegister COMBINATION_117_SYMBOL_05_CONFIGURATION_05 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	 
	public static final XSelectorRegister COMBINATION_118_SYMBOL_05_CONFIGURATION_06 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	 
	public static final XSelectorRegister COMBINATION_119_SYMBOL_05_CONFIGURATION_07 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	 
	public static final XSelectorRegister COMBINATION_120_SYMBOL_05_CONFIGURATION_08 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	 
	public static final XSelectorRegister COMBINATION_121_SYMBOL_05_CONFIGURATION_09 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	 
	public static final XSelectorRegister COMBINATION_122_SYMBOL_05_CONFIGURATION_10 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	 
	public static final XSelectorRegister COMBINATION_123_SYMBOL_05_CONFIGURATION_11 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	 
	public static final XSelectorRegister COMBINATION_124_SYMBOL_05_CONFIGURATION_12 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	 
	public static final XSelectorRegister COMBINATION_125_SYMBOL_05_CONFIGURATION_13 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	 
	public static final XSelectorRegister COMBINATION_126_SYMBOL_05_CONFIGURATION_14 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	 
	public static final XSelectorRegister COMBINATION_127_SYMBOL_05_CONFIGURATION_15 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	 
	public static final XSelectorRegister COMBINATION_128_SYMBOL_05_CONFIGURATION_16 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	 
	public static final XSelectorRegister COMBINATION_129_SYMBOL_05_CONFIGURATION_17 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	 
	public static final XSelectorRegister COMBINATION_130_SYMBOL_05_CONFIGURATION_18 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	 
	public static final XSelectorRegister COMBINATION_131_SYMBOL_05_CONFIGURATION_19 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	 
	public static final XSelectorRegister COMBINATION_132_SYMBOL_05_CONFIGURATION_20 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), AALines.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	 
	public static final XSelectorRegister COMBINATION_133_SYMBOL_05_CONFIGURATION_21 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	 
	public static final XSelectorRegister COMBINATION_134_SYMBOL_05_CONFIGURATION_22 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	 
	public static final XSelectorRegister COMBINATION_135_SYMBOL_05_CONFIGURATION_23 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	 
	public static final XSelectorRegister COMBINATION_136_SYMBOL_05_CONFIGURATION_24 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	 
	public static final XSelectorRegister COMBINATION_137_SYMBOL_05_CONFIGURATION_25 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	 
	public static final XSelectorRegister COMBINATION_138_SYMBOL_05_CONFIGURATION_26 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	 
	public static final XSelectorRegister COMBINATION_139_SYMBOL_05_CONFIGURATION_27 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	 
	public static final XSelectorRegister COMBINATION_140_SYMBOL_05_CONFIGURATION_28 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	 
	public static final XSelectorRegister COMBINATION_141_SYMBOL_06_CONFIGURATION_01 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	 
	public static final XSelectorRegister COMBINATION_142_SYMBOL_06_CONFIGURATION_02 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	 
	public static final XSelectorRegister COMBINATION_143_SYMBOL_06_CONFIGURATION_03 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	 
	public static final XSelectorRegister COMBINATION_144_SYMBOL_06_CONFIGURATION_04 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	 
	public static final XSelectorRegister COMBINATION_145_SYMBOL_06_CONFIGURATION_05 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	 
	public static final XSelectorRegister COMBINATION_146_SYMBOL_06_CONFIGURATION_06 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	 
	public static final XSelectorRegister COMBINATION_147_SYMBOL_06_CONFIGURATION_07 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	 
	public static final XSelectorRegister COMBINATION_148_SYMBOL_06_CONFIGURATION_08 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	 
	public static final XSelectorRegister COMBINATION_149_SYMBOL_06_CONFIGURATION_09 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	 
	public static final XSelectorRegister COMBINATION_150_SYMBOL_06_CONFIGURATION_10 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	 
	public static final XSelectorRegister COMBINATION_151_SYMBOL_06_CONFIGURATION_11 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	 
	public static final XSelectorRegister COMBINATION_152_SYMBOL_06_CONFIGURATION_12 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	 
	public static final XSelectorRegister COMBINATION_153_SYMBOL_06_CONFIGURATION_13 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	 
	public static final XSelectorRegister COMBINATION_154_SYMBOL_06_CONFIGURATION_14 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	 
	public static final XSelectorRegister COMBINATION_155_SYMBOL_06_CONFIGURATION_15 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	 
	public static final XSelectorRegister COMBINATION_156_SYMBOL_06_CONFIGURATION_16 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	 
	public static final XSelectorRegister COMBINATION_157_SYMBOL_06_CONFIGURATION_17 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	 
	public static final XSelectorRegister COMBINATION_158_SYMBOL_06_CONFIGURATION_18 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	 
	public static final XSelectorRegister COMBINATION_159_SYMBOL_06_CONFIGURATION_19 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	 
	public static final XSelectorRegister COMBINATION_160_SYMBOL_06_CONFIGURATION_20 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), AALines.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	 
	public static final XSelectorRegister COMBINATION_161_SYMBOL_06_CONFIGURATION_21 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	 
	public static final XSelectorRegister COMBINATION_162_SYMBOL_06_CONFIGURATION_22 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	 
	public static final XSelectorRegister COMBINATION_163_SYMBOL_06_CONFIGURATION_23 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	 
	public static final XSelectorRegister COMBINATION_164_SYMBOL_06_CONFIGURATION_24 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	 
	public static final XSelectorRegister COMBINATION_165_SYMBOL_06_CONFIGURATION_25 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	 
	public static final XSelectorRegister COMBINATION_166_SYMBOL_06_CONFIGURATION_26 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	 
	public static final XSelectorRegister COMBINATION_167_SYMBOL_06_CONFIGURATION_27 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	 
	public static final XSelectorRegister COMBINATION_168_SYMBOL_06_CONFIGURATION_28 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	 
	public static final XSelectorRegister COMBINATION_169_SYMBOL_07_CONFIGURATION_01 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	 
	public static final XSelectorRegister COMBINATION_170_SYMBOL_07_CONFIGURATION_02 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	 
	public static final XSelectorRegister COMBINATION_171_SYMBOL_07_CONFIGURATION_03 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	 
	public static final XSelectorRegister COMBINATION_172_SYMBOL_07_CONFIGURATION_04 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	 
	public static final XSelectorRegister COMBINATION_173_SYMBOL_07_CONFIGURATION_05 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	 
	public static final XSelectorRegister COMBINATION_174_SYMBOL_07_CONFIGURATION_06 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	 
	public static final XSelectorRegister COMBINATION_175_SYMBOL_07_CONFIGURATION_07 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	 
	public static final XSelectorRegister COMBINATION_176_SYMBOL_07_CONFIGURATION_08 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	 
	public static final XSelectorRegister COMBINATION_177_SYMBOL_07_CONFIGURATION_09 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	 
	public static final XSelectorRegister COMBINATION_178_SYMBOL_07_CONFIGURATION_10 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	 
	public static final XSelectorRegister COMBINATION_179_SYMBOL_07_CONFIGURATION_11 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	 
	public static final XSelectorRegister COMBINATION_180_SYMBOL_07_CONFIGURATION_12 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	 
	public static final XSelectorRegister COMBINATION_181_SYMBOL_07_CONFIGURATION_13 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	 
	public static final XSelectorRegister COMBINATION_182_SYMBOL_07_CONFIGURATION_14 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	 
	public static final XSelectorRegister COMBINATION_183_SYMBOL_07_CONFIGURATION_15 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	 
	public static final XSelectorRegister COMBINATION_184_SYMBOL_07_CONFIGURATION_16 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	 
	public static final XSelectorRegister COMBINATION_185_SYMBOL_07_CONFIGURATION_17 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	 
	public static final XSelectorRegister COMBINATION_186_SYMBOL_07_CONFIGURATION_18 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	 
	public static final XSelectorRegister COMBINATION_187_SYMBOL_07_CONFIGURATION_19 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	 
	public static final XSelectorRegister COMBINATION_188_SYMBOL_07_CONFIGURATION_20 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), AALines.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	 
	public static final XSelectorRegister COMBINATION_189_SYMBOL_07_CONFIGURATION_21 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	 
	public static final XSelectorRegister COMBINATION_190_SYMBOL_07_CONFIGURATION_22 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	 
	public static final XSelectorRegister COMBINATION_191_SYMBOL_07_CONFIGURATION_23 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	 
	public static final XSelectorRegister COMBINATION_192_SYMBOL_07_CONFIGURATION_24 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	 
	public static final XSelectorRegister COMBINATION_193_SYMBOL_07_CONFIGURATION_25 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	 
	public static final XSelectorRegister COMBINATION_194_SYMBOL_07_CONFIGURATION_26 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	 
	public static final XSelectorRegister COMBINATION_195_SYMBOL_07_CONFIGURATION_27 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	 
	public static final XSelectorRegister COMBINATION_196_SYMBOL_07_CONFIGURATION_28 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	 
	public static final XSelectorRegister COMBINATION_197_SYMBOL_08_CONFIGURATION_01 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	 
	public static final XSelectorRegister COMBINATION_198_SYMBOL_08_CONFIGURATION_02 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	 
	public static final XSelectorRegister COMBINATION_199_SYMBOL_08_CONFIGURATION_03 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	 
	public static final XSelectorRegister COMBINATION_200_SYMBOL_08_CONFIGURATION_04 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	 
	public static final XSelectorRegister COMBINATION_201_SYMBOL_08_CONFIGURATION_05 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	 
	public static final XSelectorRegister COMBINATION_202_SYMBOL_08_CONFIGURATION_06 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	 
	public static final XSelectorRegister COMBINATION_203_SYMBOL_08_CONFIGURATION_07 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	 
	public static final XSelectorRegister COMBINATION_204_SYMBOL_08_CONFIGURATION_08 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	 
	public static final XSelectorRegister COMBINATION_205_SYMBOL_08_CONFIGURATION_09 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	 
	public static final XSelectorRegister COMBINATION_206_SYMBOL_08_CONFIGURATION_10 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	 
	public static final XSelectorRegister COMBINATION_207_SYMBOL_08_CONFIGURATION_11 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	 
	public static final XSelectorRegister COMBINATION_208_SYMBOL_08_CONFIGURATION_12 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	 
	public static final XSelectorRegister COMBINATION_209_SYMBOL_08_CONFIGURATION_13 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	 
	public static final XSelectorRegister COMBINATION_210_SYMBOL_08_CONFIGURATION_14 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	 
	public static final XSelectorRegister COMBINATION_211_SYMBOL_08_CONFIGURATION_15 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	 
	public static final XSelectorRegister COMBINATION_212_SYMBOL_08_CONFIGURATION_16 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	 
	public static final XSelectorRegister COMBINATION_213_SYMBOL_08_CONFIGURATION_17 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	 
	public static final XSelectorRegister COMBINATION_214_SYMBOL_08_CONFIGURATION_18 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	 
	public static final XSelectorRegister COMBINATION_215_SYMBOL_08_CONFIGURATION_19 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	 
	public static final XSelectorRegister COMBINATION_216_SYMBOL_08_CONFIGURATION_20 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), AALines.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	 
	public static final XSelectorRegister COMBINATION_217_SYMBOL_08_CONFIGURATION_21 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	 
	public static final XSelectorRegister COMBINATION_218_SYMBOL_08_CONFIGURATION_22 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	 
	public static final XSelectorRegister COMBINATION_219_SYMBOL_08_CONFIGURATION_23 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	 
	public static final XSelectorRegister COMBINATION_220_SYMBOL_08_CONFIGURATION_24 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	 
	public static final XSelectorRegister COMBINATION_221_SYMBOL_08_CONFIGURATION_25 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	 
	public static final XSelectorRegister COMBINATION_222_SYMBOL_08_CONFIGURATION_26 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	 
	public static final XSelectorRegister COMBINATION_223_SYMBOL_08_CONFIGURATION_27 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	 
	public static final XSelectorRegister COMBINATION_224_SYMBOL_08_CONFIGURATION_28 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	 
	public static final XSelectorRegister COMBINATION_225_SYMBOL_09_CONFIGURATION_01 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	 
	public static final XSelectorRegister COMBINATION_226_SYMBOL_09_CONFIGURATION_02 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	 
	public static final XSelectorRegister COMBINATION_227_SYMBOL_09_CONFIGURATION_03 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	 
	public static final XSelectorRegister COMBINATION_228_SYMBOL_09_CONFIGURATION_04 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	 
	public static final XSelectorRegister COMBINATION_229_SYMBOL_09_CONFIGURATION_05 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	 
	public static final XSelectorRegister COMBINATION_230_SYMBOL_09_CONFIGURATION_06 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	 
	public static final XSelectorRegister COMBINATION_231_SYMBOL_09_CONFIGURATION_07 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	 
	public static final XSelectorRegister COMBINATION_232_SYMBOL_09_CONFIGURATION_08 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	 
	public static final XSelectorRegister COMBINATION_233_SYMBOL_09_CONFIGURATION_09 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	 
	public static final XSelectorRegister COMBINATION_234_SYMBOL_09_CONFIGURATION_10 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	 
	public static final XSelectorRegister COMBINATION_235_SYMBOL_09_CONFIGURATION_11 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	 
	public static final XSelectorRegister COMBINATION_236_SYMBOL_09_CONFIGURATION_12 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	 
	public static final XSelectorRegister COMBINATION_237_SYMBOL_09_CONFIGURATION_13 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	 
	public static final XSelectorRegister COMBINATION_238_SYMBOL_09_CONFIGURATION_14 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	 
	public static final XSelectorRegister COMBINATION_239_SYMBOL_09_CONFIGURATION_15 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	 
	public static final XSelectorRegister COMBINATION_240_SYMBOL_09_CONFIGURATION_16 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	 
	public static final XSelectorRegister COMBINATION_241_SYMBOL_09_CONFIGURATION_17 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	 
	public static final XSelectorRegister COMBINATION_242_SYMBOL_09_CONFIGURATION_18 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	 
	public static final XSelectorRegister COMBINATION_243_SYMBOL_09_CONFIGURATION_19 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), AALines.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	 
	public static final XSelectorRegister COMBINATION_244_SYMBOL_09_CONFIGURATION_20 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), AALines.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	 
	public static final XSelectorRegister COMBINATION_245_SYMBOL_09_CONFIGURATION_21 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	 
	public static final XSelectorRegister COMBINATION_246_SYMBOL_09_CONFIGURATION_22 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	 
	public static final XSelectorRegister COMBINATION_247_SYMBOL_09_CONFIGURATION_23 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	 
	public static final XSelectorRegister COMBINATION_248_SYMBOL_09_CONFIGURATION_24 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	 
	public static final XSelectorRegister COMBINATION_249_SYMBOL_09_CONFIGURATION_25 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	 
	public static final XSelectorRegister COMBINATION_250_SYMBOL_09_CONFIGURATION_26 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), AALines.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	 
	public static final XSelectorRegister COMBINATION_251_SYMBOL_09_CONFIGURATION_27 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), AALines.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	 
	public static final XSelectorRegister COMBINATION_252_SYMBOL_09_CONFIGURATION_28 = new XSelectorRegister(
			new KOTotalPrize(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), AALines.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	 
	public static final int NUMBER_OF_COMBINATIONS = 252;

	 
	public static final int NUMBER_OF_CONFIGURATIONS = 28;

	 
	public static final XSelectorRegister COMBINATIONS[] = {
			COMBINATION_001_SYMBOL_01_CONFIGURATION_01,
			COMBINATION_002_SYMBOL_01_CONFIGURATION_02,
			COMBINATION_003_SYMBOL_01_CONFIGURATION_03,
			COMBINATION_004_SYMBOL_01_CONFIGURATION_04,
			COMBINATION_005_SYMBOL_01_CONFIGURATION_05,
			COMBINATION_006_SYMBOL_01_CONFIGURATION_06,
			COMBINATION_007_SYMBOL_01_CONFIGURATION_07,
			COMBINATION_008_SYMBOL_01_CONFIGURATION_08,
			COMBINATION_009_SYMBOL_01_CONFIGURATION_09,
			COMBINATION_010_SYMBOL_01_CONFIGURATION_10,
			COMBINATION_011_SYMBOL_01_CONFIGURATION_11,
			COMBINATION_012_SYMBOL_01_CONFIGURATION_12,
			COMBINATION_013_SYMBOL_01_CONFIGURATION_13,
			COMBINATION_014_SYMBOL_01_CONFIGURATION_14,
			COMBINATION_015_SYMBOL_01_CONFIGURATION_15,
			COMBINATION_016_SYMBOL_01_CONFIGURATION_16,
			COMBINATION_017_SYMBOL_01_CONFIGURATION_17,
			COMBINATION_018_SYMBOL_01_CONFIGURATION_18,
			COMBINATION_019_SYMBOL_01_CONFIGURATION_19,
			COMBINATION_020_SYMBOL_01_CONFIGURATION_20,
			COMBINATION_021_SYMBOL_01_CONFIGURATION_21,
			COMBINATION_022_SYMBOL_01_CONFIGURATION_22,
			COMBINATION_023_SYMBOL_01_CONFIGURATION_23,
			COMBINATION_024_SYMBOL_01_CONFIGURATION_24,
			COMBINATION_025_SYMBOL_01_CONFIGURATION_25,
			COMBINATION_026_SYMBOL_01_CONFIGURATION_26,
			COMBINATION_027_SYMBOL_01_CONFIGURATION_27,
			COMBINATION_028_SYMBOL_01_CONFIGURATION_28,
			COMBINATION_029_SYMBOL_02_CONFIGURATION_01,
			COMBINATION_030_SYMBOL_02_CONFIGURATION_02,
			COMBINATION_031_SYMBOL_02_CONFIGURATION_03,
			COMBINATION_032_SYMBOL_02_CONFIGURATION_04,
			COMBINATION_033_SYMBOL_02_CONFIGURATION_05,
			COMBINATION_034_SYMBOL_02_CONFIGURATION_06,
			COMBINATION_035_SYMBOL_02_CONFIGURATION_07,
			COMBINATION_036_SYMBOL_02_CONFIGURATION_08,
			COMBINATION_037_SYMBOL_02_CONFIGURATION_09,
			COMBINATION_038_SYMBOL_02_CONFIGURATION_10,
			COMBINATION_039_SYMBOL_02_CONFIGURATION_11,
			COMBINATION_040_SYMBOL_02_CONFIGURATION_12,
			COMBINATION_041_SYMBOL_02_CONFIGURATION_13,
			COMBINATION_042_SYMBOL_02_CONFIGURATION_14,
			COMBINATION_043_SYMBOL_02_CONFIGURATION_15,
			COMBINATION_044_SYMBOL_02_CONFIGURATION_16,
			COMBINATION_045_SYMBOL_02_CONFIGURATION_17,
			COMBINATION_046_SYMBOL_02_CONFIGURATION_18,
			COMBINATION_047_SYMBOL_02_CONFIGURATION_19,
			COMBINATION_048_SYMBOL_02_CONFIGURATION_20,
			COMBINATION_049_SYMBOL_02_CONFIGURATION_21,
			COMBINATION_050_SYMBOL_02_CONFIGURATION_22,
			COMBINATION_051_SYMBOL_02_CONFIGURATION_23,
			COMBINATION_052_SYMBOL_02_CONFIGURATION_24,
			COMBINATION_053_SYMBOL_02_CONFIGURATION_25,
			COMBINATION_054_SYMBOL_02_CONFIGURATION_26,
			COMBINATION_055_SYMBOL_02_CONFIGURATION_27,
			COMBINATION_056_SYMBOL_02_CONFIGURATION_28,
			COMBINATION_057_SYMBOL_03_CONFIGURATION_01,
			COMBINATION_058_SYMBOL_03_CONFIGURATION_02,
			COMBINATION_059_SYMBOL_03_CONFIGURATION_03,
			COMBINATION_060_SYMBOL_03_CONFIGURATION_04,
			COMBINATION_061_SYMBOL_03_CONFIGURATION_05,
			COMBINATION_062_SYMBOL_03_CONFIGURATION_06,
			COMBINATION_063_SYMBOL_03_CONFIGURATION_07,
			COMBINATION_064_SYMBOL_03_CONFIGURATION_08,
			COMBINATION_065_SYMBOL_03_CONFIGURATION_09,
			COMBINATION_066_SYMBOL_03_CONFIGURATION_10,
			COMBINATION_067_SYMBOL_03_CONFIGURATION_11,
			COMBINATION_068_SYMBOL_03_CONFIGURATION_12,
			COMBINATION_069_SYMBOL_03_CONFIGURATION_13,
			COMBINATION_070_SYMBOL_03_CONFIGURATION_14,
			COMBINATION_071_SYMBOL_03_CONFIGURATION_15,
			COMBINATION_072_SYMBOL_03_CONFIGURATION_16,
			COMBINATION_073_SYMBOL_03_CONFIGURATION_17,
			COMBINATION_074_SYMBOL_03_CONFIGURATION_18,
			COMBINATION_075_SYMBOL_03_CONFIGURATION_19,
			COMBINATION_076_SYMBOL_03_CONFIGURATION_20,
			COMBINATION_077_SYMBOL_03_CONFIGURATION_21,
			COMBINATION_078_SYMBOL_03_CONFIGURATION_22,
			COMBINATION_079_SYMBOL_03_CONFIGURATION_23,
			COMBINATION_080_SYMBOL_03_CONFIGURATION_24,
			COMBINATION_081_SYMBOL_03_CONFIGURATION_25,
			COMBINATION_082_SYMBOL_03_CONFIGURATION_26,
			COMBINATION_083_SYMBOL_03_CONFIGURATION_27,
			COMBINATION_084_SYMBOL_03_CONFIGURATION_28,
			COMBINATION_085_SYMBOL_04_CONFIGURATION_01,
			COMBINATION_086_SYMBOL_04_CONFIGURATION_02,
			COMBINATION_087_SYMBOL_04_CONFIGURATION_03,
			COMBINATION_088_SYMBOL_04_CONFIGURATION_04,
			COMBINATION_089_SYMBOL_04_CONFIGURATION_05,
			COMBINATION_090_SYMBOL_04_CONFIGURATION_06,
			COMBINATION_091_SYMBOL_04_CONFIGURATION_07,
			COMBINATION_092_SYMBOL_04_CONFIGURATION_08,
			COMBINATION_093_SYMBOL_04_CONFIGURATION_09,
			COMBINATION_094_SYMBOL_04_CONFIGURATION_10,
			COMBINATION_095_SYMBOL_04_CONFIGURATION_11,
			COMBINATION_096_SYMBOL_04_CONFIGURATION_12,
			COMBINATION_097_SYMBOL_04_CONFIGURATION_13,
			COMBINATION_098_SYMBOL_04_CONFIGURATION_14,
			COMBINATION_099_SYMBOL_04_CONFIGURATION_15,
			COMBINATION_100_SYMBOL_04_CONFIGURATION_16,
			COMBINATION_101_SYMBOL_04_CONFIGURATION_17,
			COMBINATION_102_SYMBOL_04_CONFIGURATION_18,
			COMBINATION_103_SYMBOL_04_CONFIGURATION_19,
			COMBINATION_104_SYMBOL_04_CONFIGURATION_20,
			COMBINATION_105_SYMBOL_04_CONFIGURATION_21,
			COMBINATION_106_SYMBOL_04_CONFIGURATION_22,
			COMBINATION_107_SYMBOL_04_CONFIGURATION_23,
			COMBINATION_108_SYMBOL_04_CONFIGURATION_24,
			COMBINATION_109_SYMBOL_04_CONFIGURATION_25,
			COMBINATION_110_SYMBOL_04_CONFIGURATION_26,
			COMBINATION_111_SYMBOL_04_CONFIGURATION_27,
			COMBINATION_112_SYMBOL_04_CONFIGURATION_28,
			COMBINATION_113_SYMBOL_05_CONFIGURATION_01,
			COMBINATION_114_SYMBOL_05_CONFIGURATION_02,
			COMBINATION_115_SYMBOL_05_CONFIGURATION_03,
			COMBINATION_116_SYMBOL_05_CONFIGURATION_04,
			COMBINATION_117_SYMBOL_05_CONFIGURATION_05,
			COMBINATION_118_SYMBOL_05_CONFIGURATION_06,
			COMBINATION_119_SYMBOL_05_CONFIGURATION_07,
			COMBINATION_120_SYMBOL_05_CONFIGURATION_08,
			COMBINATION_121_SYMBOL_05_CONFIGURATION_09,
			COMBINATION_122_SYMBOL_05_CONFIGURATION_10,
			COMBINATION_123_SYMBOL_05_CONFIGURATION_11,
			COMBINATION_124_SYMBOL_05_CONFIGURATION_12,
			COMBINATION_125_SYMBOL_05_CONFIGURATION_13,
			COMBINATION_126_SYMBOL_05_CONFIGURATION_14,
			COMBINATION_127_SYMBOL_05_CONFIGURATION_15,
			COMBINATION_128_SYMBOL_05_CONFIGURATION_16,
			COMBINATION_129_SYMBOL_05_CONFIGURATION_17,
			COMBINATION_130_SYMBOL_05_CONFIGURATION_18,
			COMBINATION_131_SYMBOL_05_CONFIGURATION_19,
			COMBINATION_132_SYMBOL_05_CONFIGURATION_20,
			COMBINATION_133_SYMBOL_05_CONFIGURATION_21,
			COMBINATION_134_SYMBOL_05_CONFIGURATION_22,
			COMBINATION_135_SYMBOL_05_CONFIGURATION_23,
			COMBINATION_136_SYMBOL_05_CONFIGURATION_24,
			COMBINATION_137_SYMBOL_05_CONFIGURATION_25,
			COMBINATION_138_SYMBOL_05_CONFIGURATION_26,
			COMBINATION_139_SYMBOL_05_CONFIGURATION_27,
			COMBINATION_140_SYMBOL_05_CONFIGURATION_28,
			COMBINATION_141_SYMBOL_06_CONFIGURATION_01,
			COMBINATION_142_SYMBOL_06_CONFIGURATION_02,
			COMBINATION_143_SYMBOL_06_CONFIGURATION_03,
			COMBINATION_144_SYMBOL_06_CONFIGURATION_04,
			COMBINATION_145_SYMBOL_06_CONFIGURATION_05,
			COMBINATION_146_SYMBOL_06_CONFIGURATION_06,
			COMBINATION_147_SYMBOL_06_CONFIGURATION_07,
			COMBINATION_148_SYMBOL_06_CONFIGURATION_08,
			COMBINATION_149_SYMBOL_06_CONFIGURATION_09,
			COMBINATION_150_SYMBOL_06_CONFIGURATION_10,
			COMBINATION_151_SYMBOL_06_CONFIGURATION_11,
			COMBINATION_152_SYMBOL_06_CONFIGURATION_12,
			COMBINATION_153_SYMBOL_06_CONFIGURATION_13,
			COMBINATION_154_SYMBOL_06_CONFIGURATION_14,
			COMBINATION_155_SYMBOL_06_CONFIGURATION_15,
			COMBINATION_156_SYMBOL_06_CONFIGURATION_16,
			COMBINATION_157_SYMBOL_06_CONFIGURATION_17,
			COMBINATION_158_SYMBOL_06_CONFIGURATION_18,
			COMBINATION_159_SYMBOL_06_CONFIGURATION_19,
			COMBINATION_160_SYMBOL_06_CONFIGURATION_20,
			COMBINATION_161_SYMBOL_06_CONFIGURATION_21,
			COMBINATION_162_SYMBOL_06_CONFIGURATION_22,
			COMBINATION_163_SYMBOL_06_CONFIGURATION_23,
			COMBINATION_164_SYMBOL_06_CONFIGURATION_24,
			COMBINATION_165_SYMBOL_06_CONFIGURATION_25,
			COMBINATION_166_SYMBOL_06_CONFIGURATION_26,
			COMBINATION_167_SYMBOL_06_CONFIGURATION_27,
			COMBINATION_168_SYMBOL_06_CONFIGURATION_28,
			COMBINATION_169_SYMBOL_07_CONFIGURATION_01,
			COMBINATION_170_SYMBOL_07_CONFIGURATION_02,
			COMBINATION_171_SYMBOL_07_CONFIGURATION_03,
			COMBINATION_172_SYMBOL_07_CONFIGURATION_04,
			COMBINATION_173_SYMBOL_07_CONFIGURATION_05,
			COMBINATION_174_SYMBOL_07_CONFIGURATION_06,
			COMBINATION_175_SYMBOL_07_CONFIGURATION_07,
			COMBINATION_176_SYMBOL_07_CONFIGURATION_08,
			COMBINATION_177_SYMBOL_07_CONFIGURATION_09,
			COMBINATION_178_SYMBOL_07_CONFIGURATION_10,
			COMBINATION_179_SYMBOL_07_CONFIGURATION_11,
			COMBINATION_180_SYMBOL_07_CONFIGURATION_12,
			COMBINATION_181_SYMBOL_07_CONFIGURATION_13,
			COMBINATION_182_SYMBOL_07_CONFIGURATION_14,
			COMBINATION_183_SYMBOL_07_CONFIGURATION_15,
			COMBINATION_184_SYMBOL_07_CONFIGURATION_16,
			COMBINATION_185_SYMBOL_07_CONFIGURATION_17,
			COMBINATION_186_SYMBOL_07_CONFIGURATION_18,
			COMBINATION_187_SYMBOL_07_CONFIGURATION_19,
			COMBINATION_188_SYMBOL_07_CONFIGURATION_20,
			COMBINATION_189_SYMBOL_07_CONFIGURATION_21,
			COMBINATION_190_SYMBOL_07_CONFIGURATION_22,
			COMBINATION_191_SYMBOL_07_CONFIGURATION_23,
			COMBINATION_192_SYMBOL_07_CONFIGURATION_24,
			COMBINATION_193_SYMBOL_07_CONFIGURATION_25,
			COMBINATION_194_SYMBOL_07_CONFIGURATION_26,
			COMBINATION_195_SYMBOL_07_CONFIGURATION_27,
			COMBINATION_196_SYMBOL_07_CONFIGURATION_28,
			COMBINATION_197_SYMBOL_08_CONFIGURATION_01,
			COMBINATION_198_SYMBOL_08_CONFIGURATION_02,
			COMBINATION_199_SYMBOL_08_CONFIGURATION_03,
			COMBINATION_200_SYMBOL_08_CONFIGURATION_04,
			COMBINATION_201_SYMBOL_08_CONFIGURATION_05,
			COMBINATION_202_SYMBOL_08_CONFIGURATION_06,
			COMBINATION_203_SYMBOL_08_CONFIGURATION_07,
			COMBINATION_204_SYMBOL_08_CONFIGURATION_08,
			COMBINATION_205_SYMBOL_08_CONFIGURATION_09,
			COMBINATION_206_SYMBOL_08_CONFIGURATION_10,
			COMBINATION_207_SYMBOL_08_CONFIGURATION_11,
			COMBINATION_208_SYMBOL_08_CONFIGURATION_12,
			COMBINATION_209_SYMBOL_08_CONFIGURATION_13,
			COMBINATION_210_SYMBOL_08_CONFIGURATION_14,
			COMBINATION_211_SYMBOL_08_CONFIGURATION_15,
			COMBINATION_212_SYMBOL_08_CONFIGURATION_16,
			COMBINATION_213_SYMBOL_08_CONFIGURATION_17,
			COMBINATION_214_SYMBOL_08_CONFIGURATION_18,
			COMBINATION_215_SYMBOL_08_CONFIGURATION_19,
			COMBINATION_216_SYMBOL_08_CONFIGURATION_20,
			COMBINATION_217_SYMBOL_08_CONFIGURATION_21,
			COMBINATION_218_SYMBOL_08_CONFIGURATION_22,
			COMBINATION_219_SYMBOL_08_CONFIGURATION_23,
			COMBINATION_220_SYMBOL_08_CONFIGURATION_24,
			COMBINATION_221_SYMBOL_08_CONFIGURATION_25,
			COMBINATION_222_SYMBOL_08_CONFIGURATION_26,
			COMBINATION_223_SYMBOL_08_CONFIGURATION_27,
			COMBINATION_224_SYMBOL_08_CONFIGURATION_28,
			COMBINATION_225_SYMBOL_09_CONFIGURATION_01,
			COMBINATION_226_SYMBOL_09_CONFIGURATION_02,
			COMBINATION_227_SYMBOL_09_CONFIGURATION_03,
			COMBINATION_228_SYMBOL_09_CONFIGURATION_04,
			COMBINATION_229_SYMBOL_09_CONFIGURATION_05,
			COMBINATION_230_SYMBOL_09_CONFIGURATION_06,
			COMBINATION_231_SYMBOL_09_CONFIGURATION_07,
			COMBINATION_232_SYMBOL_09_CONFIGURATION_08,
			COMBINATION_233_SYMBOL_09_CONFIGURATION_09,
			COMBINATION_234_SYMBOL_09_CONFIGURATION_10,
			COMBINATION_235_SYMBOL_09_CONFIGURATION_11,
			COMBINATION_236_SYMBOL_09_CONFIGURATION_12,
			COMBINATION_237_SYMBOL_09_CONFIGURATION_13,
			COMBINATION_238_SYMBOL_09_CONFIGURATION_14,
			COMBINATION_239_SYMBOL_09_CONFIGURATION_15,
			COMBINATION_240_SYMBOL_09_CONFIGURATION_16,
			COMBINATION_241_SYMBOL_09_CONFIGURATION_17,
			COMBINATION_242_SYMBOL_09_CONFIGURATION_18,
			COMBINATION_243_SYMBOL_09_CONFIGURATION_19,
			COMBINATION_244_SYMBOL_09_CONFIGURATION_20,
			COMBINATION_245_SYMBOL_09_CONFIGURATION_21,
			COMBINATION_246_SYMBOL_09_CONFIGURATION_22,
			COMBINATION_247_SYMBOL_09_CONFIGURATION_23,
			COMBINATION_248_SYMBOL_09_CONFIGURATION_24,
			COMBINATION_249_SYMBOL_09_CONFIGURATION_25,
			COMBINATION_250_SYMBOL_09_CONFIGURATION_26,
			COMBINATION_251_SYMBOL_09_CONFIGURATION_27,
			COMBINATION_252_SYMBOL_09_CONFIGURATION_28 };
}
