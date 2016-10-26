
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class CartManager extends ViewObject implements CartManagerView{
    
    protected CartView myCart;
    
    public CartManager(CartView myCart,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.myCart = myCart;        
    }
    
    static public long getTypeId() {
        return 190;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public CartView getMyCart()throws ModelException{
        return this.myCart;
    }
    public void setMyCart(CartView newValue) throws ModelException {
        this.myCart = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCartManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCartManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCartManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCartManager(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        CartView myCart = this.getMyCart();
        if (myCart != null) {
            ((ViewProxi)myCart).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myCart.getClassId(), myCart.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getMyCart() != null) return new MyCartCartManagerWrapper(this, originalIndex, (ViewRoot)this.getMyCart());
        if(this.getMyCart() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getMyCart() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getMyCart() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getMyCart() != null && this.getMyCart().equals(child)) return result;
        if(this.getMyCart() != null) result = result + 1;
        return -1;
    }
    public int getRowCount(){
        return 0 ;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
            } else {
            }
            throw new ModelException("Table index out of bounds!", -1);
        } catch (ModelException e){
            return e.getMessage();
        }
    }
    
    public boolean isRowEditable(int index){
        return true;
    }
    public void setValueAt(String newValue, int rowIndex) throws Exception {
        
    }
    public boolean hasTransientFields(){
        return false;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
