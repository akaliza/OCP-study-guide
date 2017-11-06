class Consonants {

	private static boolean removeVowels(int c) {
		switch(c) {
			case 'a': case 'e': case 'i': case 'o': case 'u': return true;
		}
		return false;
	}
	
	public static void main(String []args) {
		"avada kedavra".chars().filter(Consonants::removeVowels).forEach(ch -> System.out.printf("%c", ch));
		/*vd kdvr*/
	}
}