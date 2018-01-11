public class CheetahManager {
	private static /*final*/ CheetahManager cheetahManager;
	private CheetahManager() {}
	public static synchronized CheetahManager getCheetahManager() {
		if(cheetahManager == null) {
			cheetahManager = new CheetahManager();
		}
		return cheetahManager;
	}
}