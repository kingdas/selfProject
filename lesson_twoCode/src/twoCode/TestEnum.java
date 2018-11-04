package twoCode;

public class TestEnum {
	public static void main(String[] args) {
		ColorEnum colorEnum = ColorEnum.blue;

		switch (colorEnum) {
		case red:
			System.out.println("red");
			break;
		case blue:
			System.out.println("blue");
			break;
		default:
			break;
		}

		System.out.println(colorEnum.ordinal());
		System.out.println(colorEnum.name());
	}
}
