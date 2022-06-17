package colorcoder;

import java.util.Arrays;
import java.util.List;

public enum MinorColor {
	BLUE(0), ORANGE(1), GREEN(2), BROWN(3), SLATE(4);

	private int index;

	private MinorColor(int index) {
		this.index = index;
	}

	int getIndex() {
		return index;
	}

	public static MinorColor fromIndex(int index) {
		List<MinorColor> MinorColorList = Arrays.asList(MinorColor.class.getEnumConstants());
		return MinorColorList.stream().filter(e -> e.getIndex() == index).findFirst().orElse(null);
	}
}
