package serverConstants;

/**
 * Class for configuration constants used to preset variables
 */
public class ConfigConstants {
	
	private static long RetourePercentage = 10;
	private static long PresetAccountBalance = 1000;
	private static long PresetAccountLowerLimit = 0;

	
	private ConfigConstants() {}

	/**
	 * @return the retourePercentage
	 */
	public static final long getRetourePercentage() {
		return RetourePercentage;
	}

	/**
	 * @param retourePercentage the retourePercentage to set
	 */
	public static final void setRetourePercentage(long retourePercentage) {
		RetourePercentage = retourePercentage;
	}

	/**
	 * @return the presetAccountBalance
	 */
	public static final long getPresetAccountBalance() {
		return PresetAccountBalance;
	}

	/**
	 * @param presetAccountBalance the presetAccountBalance to set
	 */
	public static final void setPresetAccountBalance(long presetAccountBalance) {
		PresetAccountBalance = presetAccountBalance;
	}

	/**
	 * @return the presetAccountLowerLimit
	 */
	public static final long getPresetAccountLowerLimit() {
		return PresetAccountLowerLimit;
	}

	/**
	 * @param presetAccountLowerLimit the presetAccountLowerLimit to set
	 */
	public static final void setPresetAccountLowerLimit(long presetAccountLowerLimit) {
		PresetAccountLowerLimit = presetAccountLowerLimit;
	}
}
