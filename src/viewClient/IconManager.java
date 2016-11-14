package viewClient;

import javafx.scene.image.Image;

public class IconManager {
	
	private static String RESOURCE_DIR = "/viewResources/";
	
	private IconManager(){}

	public static Image getImage(int iconInfo) {
		switch (iconInfo) {
		case common.IconNumbers.NewlyAddedArticleIconNumber: return getRedIcon();
		case common.IconNumbers.SellingArticleIconNumber: return getGreenIcon();
		case common.IconNumbers.ProductGroupIconNumber: return getBlueIcon();
		case common.IconNumbers.OrderIconNumber: return getOrangeIcon();
		// TODO provide images for icon info numbers!
		default:
			return getDefaultIcon();
		}
	}
	
	private static final String DefaultIcon = RESOURCE_DIR + "default.gif";
	private static Image defaultIcon = null;
	public static Image getDefaultIcon() {
		if (defaultIcon == null)
			defaultIcon = new Image(DefaultIcon);
		return defaultIcon;
	}
	
	private static final String BlueIcon = RESOURCE_DIR + "blue.gif";
	private static Image blueIcon = null;
	public static Image getBlueIcon() {
		if (blueIcon == null)
			blueIcon = new Image(BlueIcon);
		return blueIcon;
	}
	
	private static final String OrangeIcon = RESOURCE_DIR + "orange.gif";
	private static Image orangeIcon = null;
	public static Image getOrangeIcon() {
		if (orangeIcon == null)
			orangeIcon = new Image(OrangeIcon);
		return orangeIcon;
	}
	
	private static final String GreenIcon = RESOURCE_DIR + "green.gif";
	private static Image greenIcon = null;
	public static Image getGreenIcon() {
		if (greenIcon == null)
			greenIcon = new Image(GreenIcon);
		return greenIcon;
	}
	
	private static final String RedIcon = RESOURCE_DIR + "red.gif";
	private static Image redIcon = null;
	public static Image getRedIcon() {
		if (redIcon == null)
			redIcon = new Image(RedIcon);
		return redIcon;
	}
}
