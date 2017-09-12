import java.util.*;

class Shoe {}
class IPhone {}
interface Fruit {}
class Apple implements Fruit {}
class Banana implements Fruit {}
class GrannySmith extends Apple {}

public class FruitHelper {
	public void eatAll(Collection<? extends Fruit> fruits) {}
	public void addApple(Collection<? super Apple> apples) {}
}