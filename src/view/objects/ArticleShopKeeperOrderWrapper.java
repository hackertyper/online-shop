package view.objects;


/* Additional import section end */

public class ArticleShopKeeperOrderWrapper extends AssociationInTreeWrapper {

	public ArticleShopKeeperOrderWrapper(ViewRoot parent, int index, ViewRoot object) {
		super(parent, index, object);
	}
    
    /*Start of protected part that is not overridden by persistence generator*/
	public javafx.scene.image.Image getImage() {
    	 return this.getWrappedObject().getImage();
    }
	
	
	public String toString(){
    	//TODO: Implement toString in wrapper class for association article in class ShopKeeperOrder
    	return this.getWrappedObject().toString();
    }

    /*End of protected part that is not overridden by persistence generator*/

}
