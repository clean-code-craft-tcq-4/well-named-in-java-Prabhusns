package colorcoder;

public class ColorUtils {

	static ColorPair GetColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / Constants.numberOfMinorColors);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % Constants.numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * Constants.numberOfMinorColors + minor.getIndex() + 1;
	}

	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = GetColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.ToString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = GetPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

	static void printReferenceManual() {
		System.out.println("Color Reference Manual");
		System.out.println("---------------------------------------------");
		System.out.printf("%2s %15s %15s", "Pair no.", "Major Color", "Minor Color");
		System.out.println();
		System.out.println("---------------------------------------------");
		for (MajorColor majorColor : MajorColor.values()) {
			for (MinorColor minorColor : MinorColor.values()) {
				System.out.format("%2s %15s %15s", ColorUtils.GetPairNumberFromColor(majorColor, minorColor),
						majorColor, minorColor);
				System.out.println();
			}
			System.out.println("---------------------------------------------");
		}
	}
}
