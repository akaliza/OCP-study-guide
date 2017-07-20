class CannotSwimException extends Exception {}
class DangerInTheWater extends RuntimeException {}
class SharkInTheWaterException extends DangerInTheWater {}

public class Dolphin {
	public void swim() throws CannotSwimException {
		// logic here
	}
}