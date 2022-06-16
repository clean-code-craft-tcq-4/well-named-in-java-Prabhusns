package colorcoder;

public class Main {

	public static void main(String[] args) {
		ColorNumberPairTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		ColorNumberPairTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		ColorPairNumberTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		ColorPairNumberTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

		ColorPairMapper.printReferenceManual();
	}

}
