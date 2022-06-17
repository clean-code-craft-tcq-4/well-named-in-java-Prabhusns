package colorcoder;

import java.util.Arrays;
import java.util.List;

public enum MajorColor {
	WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);

	private int index;

	private MajorColor(int index) {
		this.index = index;
	}

	int getIndex() {
		return index;
	}

	public static MajorColor fromIndex(int index) {
		List<MajorColor> majorColorList = Arrays.asList(MajorColor.class.getEnumConstants());
		return majorColorList.stream().filter(e -> e.getIndex() == index).findFirst().orElse(null);
	}
}
