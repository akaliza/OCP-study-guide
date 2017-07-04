public interface Otter {
	default void play() { }
}

class RiverOtter implements Otter {
 //@Override public boolean equals(Object o) { return false; } CORRETO
 //@Override public boolean equals(Otter o) { return false; } ERRADO
 //@Override public int hashCode() { return 42; } CORRETO
 //@Override public long hashCode() { return 42; } ERRADO
 //@Override public void play() { } CORRETO
 //@Override void play() { } ERRADO
		
}
