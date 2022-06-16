package colorcoder;

public class ColorPairMapper {

	static ColorPair GetColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / Constants.numberOfMinorColors);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % Constants.numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * Constants.numberOfMinorColors + minor.getIndex() + 1;
	}

	static void printReferenceManual() {
		System.out.println("Color Reference Manual");
		System.out.println("---------------------------------------------");
		System.out.printf("%2s %15s %15s", "Pair no.", "Major Color", "Minor Color");
		System.out.println();
		System.out.println("---------------------------------------------");
		for (MajorColor majorColor : MajorColor.values()) {
			for (MinorColor minorColor : MinorColor.values()) {
				System.out.format("%2s %15s %15s", GetPairNumberFromColor(majorColor, minorColor), majorColor,
						minorColor);
				System.out.println();
			}
			System.out.println("---------------------------------------------");
		}
	}
}
