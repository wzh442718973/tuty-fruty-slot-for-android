package com.gladness.merriment.treat.hilaritypro;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;







 

 
class GDSymbolDroplet {
long selectedPercentIdx = 0;
private HashMap<String,Double> slotEntry_map;
private long prizesGradlewNumber_idx = 0;




	 
	public static final int LINES_AVAILABLE_09 = 9;

	 
	public static final int LINES_AVAILABLE_15 = 15;

	 
	public static final int LINES_AVAILABLE_21 = 21;

	 
	public static final int LINES_AVAILABLE = LINES_AVAILABLE_09;

	 
	public static final int NUMBER_OF_LEFT_LINES = LINES_AVAILABLE / 2
			+ LINES_AVAILABLE % 2;

	 
	public static final int NUMBER_OF_RIGHT_LINES = LINES_AVAILABLE
			- NUMBER_OF_LEFT_LINES;

	 
	public static final int SELECTED = 1;

	 
	public static final int NOT_SELECTED = 0;

	 
	public static final int LINES_CHANGE_STEP = 1;

	 
	public static final XSelectorRegister CORRESPONDANCE[][][] = {
			{
					{ BCombination.COMBINATION_001_SYMBOL_01_CONFIGURATION_01,
							BCombination.COMBINATION_002_SYMBOL_01_CONFIGURATION_02,
							BCombination.COMBINATION_003_SYMBOL_01_CONFIGURATION_03,
							BCombination.COMBINATION_004_SYMBOL_01_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_029_SYMBOL_02_CONFIGURATION_01,
							BCombination.COMBINATION_030_SYMBOL_02_CONFIGURATION_02,
							BCombination.COMBINATION_031_SYMBOL_02_CONFIGURATION_03,
							BCombination.COMBINATION_032_SYMBOL_02_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_057_SYMBOL_03_CONFIGURATION_01,
							BCombination.COMBINATION_058_SYMBOL_03_CONFIGURATION_02,
							BCombination.COMBINATION_059_SYMBOL_03_CONFIGURATION_03,
							BCombination.COMBINATION_060_SYMBOL_03_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_085_SYMBOL_04_CONFIGURATION_01,
							BCombination.COMBINATION_086_SYMBOL_04_CONFIGURATION_02,
							BCombination.COMBINATION_087_SYMBOL_04_CONFIGURATION_03,
							BCombination.COMBINATION_088_SYMBOL_04_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_113_SYMBOL_05_CONFIGURATION_01,
							BCombination.COMBINATION_114_SYMBOL_05_CONFIGURATION_02,
							BCombination.COMBINATION_115_SYMBOL_05_CONFIGURATION_03,
							BCombination.COMBINATION_116_SYMBOL_05_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_141_SYMBOL_06_CONFIGURATION_01,
							BCombination.COMBINATION_142_SYMBOL_06_CONFIGURATION_02,
							BCombination.COMBINATION_143_SYMBOL_06_CONFIGURATION_03,
							BCombination.COMBINATION_144_SYMBOL_06_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_169_SYMBOL_07_CONFIGURATION_01,
							BCombination.COMBINATION_170_SYMBOL_07_CONFIGURATION_02,
							BCombination.COMBINATION_171_SYMBOL_07_CONFIGURATION_03,
							BCombination.COMBINATION_172_SYMBOL_07_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_197_SYMBOL_08_CONFIGURATION_01,
							BCombination.COMBINATION_198_SYMBOL_08_CONFIGURATION_02,
							BCombination.COMBINATION_199_SYMBOL_08_CONFIGURATION_03,
							BCombination.COMBINATION_200_SYMBOL_08_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_225_SYMBOL_09_CONFIGURATION_01,
							BCombination.COMBINATION_226_SYMBOL_09_CONFIGURATION_02,
							BCombination.COMBINATION_227_SYMBOL_09_CONFIGURATION_03,
							BCombination.COMBINATION_228_SYMBOL_09_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ BCombination.COMBINATION_005_SYMBOL_01_CONFIGURATION_05,
							BCombination.COMBINATION_006_SYMBOL_01_CONFIGURATION_06,
							BCombination.COMBINATION_007_SYMBOL_01_CONFIGURATION_07,
							BCombination.COMBINATION_008_SYMBOL_01_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_033_SYMBOL_02_CONFIGURATION_05,
							BCombination.COMBINATION_034_SYMBOL_02_CONFIGURATION_06,
							BCombination.COMBINATION_035_SYMBOL_02_CONFIGURATION_07,
							BCombination.COMBINATION_036_SYMBOL_02_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_061_SYMBOL_03_CONFIGURATION_05,
							BCombination.COMBINATION_062_SYMBOL_03_CONFIGURATION_06,
							BCombination.COMBINATION_063_SYMBOL_03_CONFIGURATION_07,
							BCombination.COMBINATION_064_SYMBOL_03_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_089_SYMBOL_04_CONFIGURATION_05,
							BCombination.COMBINATION_090_SYMBOL_04_CONFIGURATION_06,
							BCombination.COMBINATION_091_SYMBOL_04_CONFIGURATION_07,
							BCombination.COMBINATION_092_SYMBOL_04_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_117_SYMBOL_05_CONFIGURATION_05,
							BCombination.COMBINATION_118_SYMBOL_05_CONFIGURATION_06,
							BCombination.COMBINATION_119_SYMBOL_05_CONFIGURATION_07,
							BCombination.COMBINATION_120_SYMBOL_05_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_145_SYMBOL_06_CONFIGURATION_05,
							BCombination.COMBINATION_146_SYMBOL_06_CONFIGURATION_06,
							BCombination.COMBINATION_147_SYMBOL_06_CONFIGURATION_07,
							BCombination.COMBINATION_148_SYMBOL_06_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_173_SYMBOL_07_CONFIGURATION_05,
							BCombination.COMBINATION_174_SYMBOL_07_CONFIGURATION_06,
							BCombination.COMBINATION_175_SYMBOL_07_CONFIGURATION_07,
							BCombination.COMBINATION_176_SYMBOL_07_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_201_SYMBOL_08_CONFIGURATION_05,
							BCombination.COMBINATION_202_SYMBOL_08_CONFIGURATION_06,
							BCombination.COMBINATION_203_SYMBOL_08_CONFIGURATION_07,
							BCombination.COMBINATION_204_SYMBOL_08_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_229_SYMBOL_09_CONFIGURATION_05,
							BCombination.COMBINATION_230_SYMBOL_09_CONFIGURATION_06,
							BCombination.COMBINATION_231_SYMBOL_09_CONFIGURATION_07,
							BCombination.COMBINATION_232_SYMBOL_09_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ BCombination.COMBINATION_009_SYMBOL_01_CONFIGURATION_09,
							BCombination.COMBINATION_010_SYMBOL_01_CONFIGURATION_10,
							BCombination.COMBINATION_011_SYMBOL_01_CONFIGURATION_11,
							BCombination.COMBINATION_012_SYMBOL_01_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_037_SYMBOL_02_CONFIGURATION_09,
							BCombination.COMBINATION_038_SYMBOL_02_CONFIGURATION_10,
							BCombination.COMBINATION_039_SYMBOL_02_CONFIGURATION_11,
							BCombination.COMBINATION_040_SYMBOL_02_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_065_SYMBOL_03_CONFIGURATION_09,
							BCombination.COMBINATION_066_SYMBOL_03_CONFIGURATION_10,
							BCombination.COMBINATION_067_SYMBOL_03_CONFIGURATION_11,
							BCombination.COMBINATION_068_SYMBOL_03_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_093_SYMBOL_04_CONFIGURATION_09,
							BCombination.COMBINATION_094_SYMBOL_04_CONFIGURATION_10,
							BCombination.COMBINATION_095_SYMBOL_04_CONFIGURATION_11,
							BCombination.COMBINATION_096_SYMBOL_04_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_121_SYMBOL_05_CONFIGURATION_09,
							BCombination.COMBINATION_122_SYMBOL_05_CONFIGURATION_10,
							BCombination.COMBINATION_123_SYMBOL_05_CONFIGURATION_11,
							BCombination.COMBINATION_124_SYMBOL_05_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_149_SYMBOL_06_CONFIGURATION_09,
							BCombination.COMBINATION_150_SYMBOL_06_CONFIGURATION_10,
							BCombination.COMBINATION_151_SYMBOL_06_CONFIGURATION_11,
							BCombination.COMBINATION_152_SYMBOL_06_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_177_SYMBOL_07_CONFIGURATION_09,
							BCombination.COMBINATION_178_SYMBOL_07_CONFIGURATION_10,
							BCombination.COMBINATION_179_SYMBOL_07_CONFIGURATION_11,
							BCombination.COMBINATION_180_SYMBOL_07_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_205_SYMBOL_08_CONFIGURATION_09,
							BCombination.COMBINATION_206_SYMBOL_08_CONFIGURATION_10,
							BCombination.COMBINATION_207_SYMBOL_08_CONFIGURATION_11,
							BCombination.COMBINATION_208_SYMBOL_08_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_233_SYMBOL_09_CONFIGURATION_09,
							BCombination.COMBINATION_234_SYMBOL_09_CONFIGURATION_10,
							BCombination.COMBINATION_235_SYMBOL_09_CONFIGURATION_11,
							BCombination.COMBINATION_236_SYMBOL_09_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ BCombination.COMBINATION_013_SYMBOL_01_CONFIGURATION_13,
							BCombination.COMBINATION_014_SYMBOL_01_CONFIGURATION_14,
							BCombination.COMBINATION_015_SYMBOL_01_CONFIGURATION_15,
							BCombination.COMBINATION_016_SYMBOL_01_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_041_SYMBOL_02_CONFIGURATION_13,
							BCombination.COMBINATION_042_SYMBOL_02_CONFIGURATION_14,
							BCombination.COMBINATION_043_SYMBOL_02_CONFIGURATION_15,
							BCombination.COMBINATION_044_SYMBOL_02_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_069_SYMBOL_03_CONFIGURATION_13,
							BCombination.COMBINATION_070_SYMBOL_03_CONFIGURATION_14,
							BCombination.COMBINATION_071_SYMBOL_03_CONFIGURATION_15,
							BCombination.COMBINATION_072_SYMBOL_03_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_097_SYMBOL_04_CONFIGURATION_13,
							BCombination.COMBINATION_098_SYMBOL_04_CONFIGURATION_14,
							BCombination.COMBINATION_099_SYMBOL_04_CONFIGURATION_15,
							BCombination.COMBINATION_100_SYMBOL_04_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_125_SYMBOL_05_CONFIGURATION_13,
							BCombination.COMBINATION_126_SYMBOL_05_CONFIGURATION_14,
							BCombination.COMBINATION_127_SYMBOL_05_CONFIGURATION_15,
							BCombination.COMBINATION_128_SYMBOL_05_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_153_SYMBOL_06_CONFIGURATION_13,
							BCombination.COMBINATION_154_SYMBOL_06_CONFIGURATION_14,
							BCombination.COMBINATION_155_SYMBOL_06_CONFIGURATION_15,
							BCombination.COMBINATION_156_SYMBOL_06_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_181_SYMBOL_07_CONFIGURATION_13,
							BCombination.COMBINATION_182_SYMBOL_07_CONFIGURATION_14,
							BCombination.COMBINATION_183_SYMBOL_07_CONFIGURATION_15,
							BCombination.COMBINATION_184_SYMBOL_07_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_209_SYMBOL_08_CONFIGURATION_13,
							BCombination.COMBINATION_210_SYMBOL_08_CONFIGURATION_14,
							BCombination.COMBINATION_211_SYMBOL_08_CONFIGURATION_15,
							BCombination.COMBINATION_212_SYMBOL_08_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_237_SYMBOL_09_CONFIGURATION_13,
							BCombination.COMBINATION_238_SYMBOL_09_CONFIGURATION_14,
							BCombination.COMBINATION_239_SYMBOL_09_CONFIGURATION_15,
							BCombination.COMBINATION_240_SYMBOL_09_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ BCombination.COMBINATION_017_SYMBOL_01_CONFIGURATION_17,
							BCombination.COMBINATION_018_SYMBOL_01_CONFIGURATION_18,
							BCombination.COMBINATION_019_SYMBOL_01_CONFIGURATION_19,
							BCombination.COMBINATION_020_SYMBOL_01_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_045_SYMBOL_02_CONFIGURATION_17,
							BCombination.COMBINATION_046_SYMBOL_02_CONFIGURATION_18,
							BCombination.COMBINATION_047_SYMBOL_02_CONFIGURATION_19,
							BCombination.COMBINATION_048_SYMBOL_02_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_073_SYMBOL_03_CONFIGURATION_17,
							BCombination.COMBINATION_074_SYMBOL_03_CONFIGURATION_18,
							BCombination.COMBINATION_075_SYMBOL_03_CONFIGURATION_19,
							BCombination.COMBINATION_076_SYMBOL_03_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_101_SYMBOL_04_CONFIGURATION_17,
							BCombination.COMBINATION_102_SYMBOL_04_CONFIGURATION_18,
							BCombination.COMBINATION_103_SYMBOL_04_CONFIGURATION_19,
							BCombination.COMBINATION_104_SYMBOL_04_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_129_SYMBOL_05_CONFIGURATION_17,
							BCombination.COMBINATION_130_SYMBOL_05_CONFIGURATION_18,
							BCombination.COMBINATION_131_SYMBOL_05_CONFIGURATION_19,
							BCombination.COMBINATION_132_SYMBOL_05_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_157_SYMBOL_06_CONFIGURATION_17,
							BCombination.COMBINATION_158_SYMBOL_06_CONFIGURATION_18,
							BCombination.COMBINATION_159_SYMBOL_06_CONFIGURATION_19,
							BCombination.COMBINATION_160_SYMBOL_06_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_185_SYMBOL_07_CONFIGURATION_17,
							BCombination.COMBINATION_186_SYMBOL_07_CONFIGURATION_18,
							BCombination.COMBINATION_187_SYMBOL_07_CONFIGURATION_19,
							BCombination.COMBINATION_188_SYMBOL_07_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_213_SYMBOL_08_CONFIGURATION_17,
							BCombination.COMBINATION_214_SYMBOL_08_CONFIGURATION_18,
							BCombination.COMBINATION_215_SYMBOL_08_CONFIGURATION_19,
							BCombination.COMBINATION_216_SYMBOL_08_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_241_SYMBOL_09_CONFIGURATION_17,
							BCombination.COMBINATION_242_SYMBOL_09_CONFIGURATION_18,
							BCombination.COMBINATION_243_SYMBOL_09_CONFIGURATION_19,
							BCombination.COMBINATION_244_SYMBOL_09_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ BCombination.COMBINATION_017_SYMBOL_01_CONFIGURATION_17,
							BCombination.COMBINATION_018_SYMBOL_01_CONFIGURATION_18,
							BCombination.COMBINATION_021_SYMBOL_01_CONFIGURATION_21,
							BCombination.COMBINATION_022_SYMBOL_01_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_045_SYMBOL_02_CONFIGURATION_17,
							BCombination.COMBINATION_046_SYMBOL_02_CONFIGURATION_18,
							BCombination.COMBINATION_049_SYMBOL_02_CONFIGURATION_21,
							BCombination.COMBINATION_050_SYMBOL_02_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_073_SYMBOL_03_CONFIGURATION_17,
							BCombination.COMBINATION_074_SYMBOL_03_CONFIGURATION_18,
							BCombination.COMBINATION_077_SYMBOL_03_CONFIGURATION_21,
							BCombination.COMBINATION_078_SYMBOL_03_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_101_SYMBOL_04_CONFIGURATION_17,
							BCombination.COMBINATION_102_SYMBOL_04_CONFIGURATION_18,
							BCombination.COMBINATION_105_SYMBOL_04_CONFIGURATION_21,
							BCombination.COMBINATION_106_SYMBOL_04_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_129_SYMBOL_05_CONFIGURATION_17,
							BCombination.COMBINATION_130_SYMBOL_05_CONFIGURATION_18,
							BCombination.COMBINATION_133_SYMBOL_05_CONFIGURATION_21,
							BCombination.COMBINATION_134_SYMBOL_05_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_157_SYMBOL_06_CONFIGURATION_17,
							BCombination.COMBINATION_158_SYMBOL_06_CONFIGURATION_18,
							BCombination.COMBINATION_161_SYMBOL_06_CONFIGURATION_21,
							BCombination.COMBINATION_162_SYMBOL_06_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_185_SYMBOL_07_CONFIGURATION_17,
							BCombination.COMBINATION_186_SYMBOL_07_CONFIGURATION_18,
							BCombination.COMBINATION_189_SYMBOL_07_CONFIGURATION_21,
							BCombination.COMBINATION_190_SYMBOL_07_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_213_SYMBOL_08_CONFIGURATION_17,
							BCombination.COMBINATION_214_SYMBOL_08_CONFIGURATION_18,
							BCombination.COMBINATION_217_SYMBOL_08_CONFIGURATION_21,
							BCombination.COMBINATION_218_SYMBOL_08_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_241_SYMBOL_09_CONFIGURATION_17,
							BCombination.COMBINATION_242_SYMBOL_09_CONFIGURATION_18,
							BCombination.COMBINATION_245_SYMBOL_09_CONFIGURATION_21,
							BCombination.COMBINATION_246_SYMBOL_09_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ BCombination.COMBINATION_013_SYMBOL_01_CONFIGURATION_13,
							BCombination.COMBINATION_014_SYMBOL_01_CONFIGURATION_14,
							BCombination.COMBINATION_023_SYMBOL_01_CONFIGURATION_23,
							BCombination.COMBINATION_024_SYMBOL_01_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_041_SYMBOL_02_CONFIGURATION_13,
							BCombination.COMBINATION_042_SYMBOL_02_CONFIGURATION_14,
							BCombination.COMBINATION_051_SYMBOL_02_CONFIGURATION_23,
							BCombination.COMBINATION_052_SYMBOL_02_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_069_SYMBOL_03_CONFIGURATION_13,
							BCombination.COMBINATION_070_SYMBOL_03_CONFIGURATION_14,
							BCombination.COMBINATION_079_SYMBOL_03_CONFIGURATION_23,
							BCombination.COMBINATION_080_SYMBOL_03_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_097_SYMBOL_04_CONFIGURATION_13,
							BCombination.COMBINATION_098_SYMBOL_04_CONFIGURATION_14,
							BCombination.COMBINATION_107_SYMBOL_04_CONFIGURATION_23,
							BCombination.COMBINATION_108_SYMBOL_04_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_125_SYMBOL_05_CONFIGURATION_13,
							BCombination.COMBINATION_126_SYMBOL_05_CONFIGURATION_14,
							BCombination.COMBINATION_135_SYMBOL_05_CONFIGURATION_23,
							BCombination.COMBINATION_136_SYMBOL_05_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_153_SYMBOL_06_CONFIGURATION_13,
							BCombination.COMBINATION_154_SYMBOL_06_CONFIGURATION_14,
							BCombination.COMBINATION_163_SYMBOL_06_CONFIGURATION_23,
							BCombination.COMBINATION_164_SYMBOL_06_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_181_SYMBOL_07_CONFIGURATION_13,
							BCombination.COMBINATION_182_SYMBOL_07_CONFIGURATION_14,
							BCombination.COMBINATION_191_SYMBOL_07_CONFIGURATION_23,
							BCombination.COMBINATION_192_SYMBOL_07_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_209_SYMBOL_08_CONFIGURATION_13,
							BCombination.COMBINATION_210_SYMBOL_08_CONFIGURATION_14,
							BCombination.COMBINATION_219_SYMBOL_08_CONFIGURATION_23,
							BCombination.COMBINATION_220_SYMBOL_08_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_237_SYMBOL_09_CONFIGURATION_13,
							BCombination.COMBINATION_238_SYMBOL_09_CONFIGURATION_14,
							BCombination.COMBINATION_247_SYMBOL_09_CONFIGURATION_23,
							BCombination.COMBINATION_248_SYMBOL_09_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ BCombination.COMBINATION_005_SYMBOL_01_CONFIGURATION_05,
							BCombination.COMBINATION_006_SYMBOL_01_CONFIGURATION_06,
							BCombination.COMBINATION_025_SYMBOL_01_CONFIGURATION_25,
							BCombination.COMBINATION_026_SYMBOL_01_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_033_SYMBOL_02_CONFIGURATION_05,
							BCombination.COMBINATION_034_SYMBOL_02_CONFIGURATION_06,
							BCombination.COMBINATION_053_SYMBOL_02_CONFIGURATION_25,
							BCombination.COMBINATION_054_SYMBOL_02_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_061_SYMBOL_03_CONFIGURATION_05,
							BCombination.COMBINATION_062_SYMBOL_03_CONFIGURATION_06,
							BCombination.COMBINATION_081_SYMBOL_03_CONFIGURATION_25,
							BCombination.COMBINATION_082_SYMBOL_03_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_089_SYMBOL_04_CONFIGURATION_05,
							BCombination.COMBINATION_090_SYMBOL_04_CONFIGURATION_06,
							BCombination.COMBINATION_109_SYMBOL_04_CONFIGURATION_25,
							BCombination.COMBINATION_110_SYMBOL_04_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_117_SYMBOL_05_CONFIGURATION_05,
							BCombination.COMBINATION_118_SYMBOL_05_CONFIGURATION_06,
							BCombination.COMBINATION_137_SYMBOL_05_CONFIGURATION_25,
							BCombination.COMBINATION_138_SYMBOL_05_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_145_SYMBOL_06_CONFIGURATION_05,
							BCombination.COMBINATION_146_SYMBOL_06_CONFIGURATION_06,
							BCombination.COMBINATION_165_SYMBOL_06_CONFIGURATION_25,
							BCombination.COMBINATION_166_SYMBOL_06_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_173_SYMBOL_07_CONFIGURATION_05,
							BCombination.COMBINATION_174_SYMBOL_07_CONFIGURATION_06,
							BCombination.COMBINATION_193_SYMBOL_07_CONFIGURATION_25,
							BCombination.COMBINATION_194_SYMBOL_07_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_201_SYMBOL_08_CONFIGURATION_05,
							BCombination.COMBINATION_202_SYMBOL_08_CONFIGURATION_06,
							BCombination.COMBINATION_221_SYMBOL_08_CONFIGURATION_25,
							BCombination.COMBINATION_222_SYMBOL_08_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_229_SYMBOL_09_CONFIGURATION_05,
							BCombination.COMBINATION_230_SYMBOL_09_CONFIGURATION_06,
							BCombination.COMBINATION_249_SYMBOL_09_CONFIGURATION_25,
							BCombination.COMBINATION_250_SYMBOL_09_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ BCombination.COMBINATION_009_SYMBOL_01_CONFIGURATION_09,
							BCombination.COMBINATION_010_SYMBOL_01_CONFIGURATION_10,
							BCombination.COMBINATION_027_SYMBOL_01_CONFIGURATION_27,
							BCombination.COMBINATION_028_SYMBOL_01_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_037_SYMBOL_02_CONFIGURATION_09,
							BCombination.COMBINATION_038_SYMBOL_02_CONFIGURATION_10,
							BCombination.COMBINATION_055_SYMBOL_02_CONFIGURATION_27,
							BCombination.COMBINATION_056_SYMBOL_02_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_065_SYMBOL_03_CONFIGURATION_09,
							BCombination.COMBINATION_066_SYMBOL_03_CONFIGURATION_10,
							BCombination.COMBINATION_083_SYMBOL_03_CONFIGURATION_27,
							BCombination.COMBINATION_084_SYMBOL_03_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_093_SYMBOL_04_CONFIGURATION_09,
							BCombination.COMBINATION_094_SYMBOL_04_CONFIGURATION_10,
							BCombination.COMBINATION_111_SYMBOL_04_CONFIGURATION_27,
							BCombination.COMBINATION_112_SYMBOL_04_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_121_SYMBOL_05_CONFIGURATION_09,
							BCombination.COMBINATION_122_SYMBOL_05_CONFIGURATION_10,
							BCombination.COMBINATION_139_SYMBOL_05_CONFIGURATION_27,
							BCombination.COMBINATION_140_SYMBOL_05_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_149_SYMBOL_06_CONFIGURATION_09,
							BCombination.COMBINATION_150_SYMBOL_06_CONFIGURATION_10,
							BCombination.COMBINATION_167_SYMBOL_06_CONFIGURATION_27,
							BCombination.COMBINATION_168_SYMBOL_06_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_177_SYMBOL_07_CONFIGURATION_09,
							BCombination.COMBINATION_178_SYMBOL_07_CONFIGURATION_10,
							BCombination.COMBINATION_195_SYMBOL_07_CONFIGURATION_27,
							BCombination.COMBINATION_196_SYMBOL_07_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_205_SYMBOL_08_CONFIGURATION_09,
							BCombination.COMBINATION_206_SYMBOL_08_CONFIGURATION_10,
							BCombination.COMBINATION_223_SYMBOL_08_CONFIGURATION_27,
							BCombination.COMBINATION_224_SYMBOL_08_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ BCombination.COMBINATION_233_SYMBOL_09_CONFIGURATION_09,
							BCombination.COMBINATION_234_SYMBOL_09_CONFIGURATION_10,
							BCombination.COMBINATION_251_SYMBOL_09_CONFIGURATION_27,
							BCombination.COMBINATION_252_SYMBOL_09_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, } };

	 
	public static final double LINES_MULTIPLIERS[] = { 0.00, 0.65, 0.65, 0.65,
			0.65, 0.65, 0.65, 0.65, 0.65, 1.00 };

	 
	private char selected[] = new char[LINES_AVAILABLE];

	 
	

 public  boolean linesSpins() {
     String centerGreen = "substate";
     String screenCombination = "overwrite";
     int homeSum = 328;
     HashMap<String,Integer> gradlewUtil = new HashMap();
    boolean codeDividedPull = false;
    homeSum = homeSum;
    codeDividedPull = homeSum > 78;

    return codeDividedPull;

}



private void setAllSeleceted() {

         
boolean dfctCrlissuer =  this.linesSpins();

      if (dfctCrlissuer) {
          System.out.println("ok");
      }



		for (int i = 0; i < selected.length; i++) {
			selected[i] = SELECTED;
            double modityi = 1531.0;
             if (modityi == 65) {}
		}
	}

	public GDSymbolDroplet() {
		setAllSeleceted();
	}

	 
	public char[] getSelected() {
		char flags[] = new char[selected.length];

		for (int i = 0; i < selected.length; i++) {
			flags[i] = selected[i];
		}

		return flags;
	}

	 
	public void setSelected(final char flags[]) {
		for (int i = 0; i < flags.length && i < selected.length; i++) {
			selected[i] = flags[i];
		}
	}

	 
	

 public  HashMap increaseSymbolSpins(double winnerActivity, boolean slotWin, HashMap<String,String> androidReel) {
     float winTable = 8283.0f;
     boolean configClear = false;
     long centerActivity = 2661L;
     String resetDistribution = "fetcher";
    HashMap<String,Integer> approveXxchTimestamped = new HashMap();
         approveXxchTimestamped.put("nonce", 88);
     approveXxchTimestamped.put("referene", 423);
     approveXxchTimestamped.put("automatically", 648);
    winTable *= 50;
    approveXxchTimestamped.put("imitateCpuused", (int)(winTable));
    configClear = false;
    approveXxchTimestamped.put("configurableLogs", 0);

    return approveXxchTimestamped;

}



public void linesUp() {

         
HashMap firstlineNoround =  this.increaseSymbolSpins(5354.0,true,new HashMap());

      ArrayList _firstlineNoroundtemp = new ArrayList(firstlineNoround.keySet());
      for(int index_o = 0; index_o < _firstlineNoroundtemp.size(); index_o++) {
          Object key_index_o = _firstlineNoroundtemp.get(index_o);
          Object value_index_o = firstlineNoround.get(key_index_o);
          if (index_o  >  88) {
                        System.out.println(key_index_o);
              System.out.println(value_index_o);
              break;
          }
      }
      int firstlineNoround_len = firstlineNoround.size();



		int nextSelectionIndex = LINES_AVAILABLE - 1;
            HashMap<String,Boolean> pincs = new HashMap<String,Boolean>();
     pincs.put("finalize", true);
     pincs.put("swap", true);
     pincs.put("prf", true);
     pincs.put("truncate", false);
             while (pincs.size() > 28) { break; }

		 
		for (nextSelectionIndex = LINES_AVAILABLE - 1; nextSelectionIndex >= 0; nextSelectionIndex--) {
			if (selected[nextSelectionIndex] == SELECTED) {
				break;
			}
		}

		 
		if (nextSelectionIndex < 0) {
			nextSelectionIndex = 0;
            float frequency4 = 9394.0f;
             if (frequency4 > 44) {}
		}

		 
		if (selected[nextSelectionIndex] == SELECTED) {
			nextSelectionIndex++;
            float gradlewL = 6972.0f;
             if (gradlewL >= 176) {}
		}

		 
		if (nextSelectionIndex == LINES_AVAILABLE) {
			for (int i = 0; i < LINES_AVAILABLE; i++) {
				selected[i] = NOT_SELECTED;
            ArrayList<Boolean> winH = new ArrayList<Boolean>();
     winH.add(true);
     winH.add(true);
     winH.add(false);
     winH.add(false);
     winH.add(false);
     winH.add(true);
             if (winH.size() > 113) {}
			}
			nextSelectionIndex = 0;
            HashMap<String,Boolean> betv = new HashMap<String,Boolean>();
     betv.put("capable", true);
     betv.put("reduction", false);
             while (betv.size() > 132) { break; }
		}

		 
		for (int i = 0; i < LINES_CHANGE_STEP
				&& nextSelectionIndex + i < LINES_AVAILABLE; i++) {
			selected[nextSelectionIndex + i] = SELECTED;
            long buildD = 6733L;
             while (buildD < 87) { break; }
		}
	}

	 
	public void linesDown() {
		
	}

	

 public  long sortSelectorFound() {
     HashMap<String,String> symbolMain = new HashMap();
     ArrayList<Double> configReels = new ArrayList();
     boolean spinEdit = false;
    long pushingNosimdSubscribable = 0;
    spinEdit = false;
    pushingNosimdSubscribable += spinEdit ? 73 : 76;

    return pushingNosimdSubscribable;

}



public void maximum() {

         
long aliasesQuickcompress =  this.sortSelectorFound();

      System.out.println(aliasesQuickcompress);



		setAllSeleceted();
            long distribution4 = 2738L;
             if (distribution4 <= 147) {}
	}

	 
	public int numberOfSelectedLines() {
		int numberLines = 0;
            boolean active_ = false;
             if (!active_) {}

		for (int i = 0; i < LINES_AVAILABLE; i++) {
			if (selected[i] == SELECTED) {
				numberLines++;
            boolean winO = true;
			}
		}

		return numberLines;
	}

	 
	

 public  ArrayList coefficientMaximum() {
     double pincDroplet = 7215.0;
     String combinationIncrement = "virtual";
     ArrayList<Long> numberIncrease = new ArrayList();
     HashMap<String,Integer> tableActivity = new HashMap();
    ArrayList bfstmDdct = new ArrayList();
    pincDroplet = 6986;
      int lines_len1 = bfstmDdct.size();
    int measure_u = Math.min(new Random().nextInt(58), 1) % Math.max(1, bfstmDdct.size());
    bfstmDdct.add(measure_u, (float)(pincDroplet));
      if (combinationIncrement.equals("register_u")) {
              System.out.println(combinationIncrement);
      }
      for(int i = 0; i < Math.min(1, combinationIncrement.length()); i++) {
          System.out.println(combinationIncrement.charAt(i));
      }
    for(int btobin = 0; btobin < tableActivity.keySet().size(); btobin++) {
        bfstmDdct.add(tableActivity.get(tableActivity.keySet().toArray()[btobin]).floatValue());
    if (bfstmDdct.size() > 0) {
        break;
}
    
}

    return bfstmDdct;

}



public boolean isActive(final XSelectorRegister combination) {

         
ArrayList tdscOnly =  this.coefficientMaximum();

      int tdscOnly_len = tdscOnly.size();
      for(int index_g = 0; index_g < tdscOnly.size(); index_g++) {
          Object obj_index_g = tdscOnly.get(index_g);
          if (index_g  ==  44) {
                              System.out.println(obj_index_g);
          }
      }



   this.selectedPercentIdx = 7571L;

   this.slotEntry_map = new HashMap<String,Double>();

   this.prizesGradlewNumber_idx = 922L;

		for (int i = 0; i < LINES_AVAILABLE; i++) {
			if (selected[i] == SELECTED) {
				for (int j = 0; j < AALines.TOTAL_NUMBER_OF_SYMBOLS; j++) {
					for (int k = 0; k < BCombination.NUMBER_OF_CONFIGURATIONS; k++) {
						if (combination != null
								&& CORRESPONDANCE[i][j][k] != null
								&& combination.equals(CORRESPONDANCE[i][j][k])) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}
}
