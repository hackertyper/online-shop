package serverConstants;

public class ConfigConstants {
	
	private static Integer RetourePercentage = 10;
	private static Integer PresetAccountBalance = 1000;
	private static Integer PresetAccountLowerLimit = 100;

	
	public ConfigConstants() {}

	/**
	 * @return the retourePercentage
	 */
	public static final Integer getRetourePercentage() {
		return RetourePercentage;
	}


	/**
	 * @param retourePercentage the retourePercentage to set
	 */
	public static final void setRetourePercentage(Integer retourePercentage) {
		RetourePercentage = retourePercentage;
	}


	/**
	 * @return the presetAccountBalance
	 */
	public static final Integer getPresetAccountBalance() {
		return PresetAccountBalance;
	}


	/**
	 * @param presetAccountBalance the presetAccountBalance to set
	 */
	public static final void setPresetAccountBalance(Integer presetAccountBalance) {
		PresetAccountBalance = presetAccountBalance;
	}


	/**
	 * @return the presetAccountLowerLimit
	 */
	public static final Integer getPresetAccountLowerLimit() {
		return PresetAccountLowerLimit;
	}


	/**
	 * @param presetAccountLowerLimit the presetAccountLowerLimit to set
	 */
	public static final void setPresetAccountLowerLimit(Integer presetAccountLowerLimit) {
		PresetAccountLowerLimit = presetAccountLowerLimit;
	}

}
