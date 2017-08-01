public enum AnimalClasses {
	MAMMAL(true), FISH(Boolean.FALSE), BIRD(false),
	REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false) ; /*add semicolons */
	boolean hasHair;
 
	/*public*/ private AnimalClasses(boolean hasHair) {
		this.hasHair = hasHair;
	}
 
	public boolean hasHair() {
		return hasHair;
	}
 
	public void giveWig() {
		hasHair = true;
	} 
}