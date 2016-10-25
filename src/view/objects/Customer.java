
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Customer extends ViewObject implements CustomerView{
    
    protected AccountView myAccount;
    protected CartView myCart;
    protected java.util.Vector<ItemView> itemRange;
    
    public Customer(AccountView myAccount,CartView myCart,java.util.Vector<ItemView> itemRange,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.myAccount = myAccount;
        this.myCart = myCart;
        this.itemRange = itemRange;        
    }
    
    static public long getTypeId() {
        return 131;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public AccountView getMyAccount()throws ModelException{
        return this.myAccount;
    }
    public void setMyAccount(AccountView newValue) throws ModelException {
        this.myAccount = newValue;
    }
    public CartView getMyCart()throws ModelException{
        return this.myCart;
    }
    public void setMyCart(CartView newValue) throws ModelException {
        this.myCart = newValue;
    }
    public java.util.Vector<ItemView> getItemRange()throws ModelException{
        return this.itemRange;
    }
    public void setItemRange(java.util.Vector<ItemView> newValue) throws ModelException {
        this.itemRange = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomer(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomer(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomer(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomer(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        AccountView myAccount = this.getMyAccount();
        if (myAccount != null) {
            ((ViewProxi)myAccount).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myAccount.getClassId(), myAccount.getId())));
        }
        CartView myCart = this.getMyCart();
        if (myCart != null) {
            ((ViewProxi)myCart).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myCart.getClassId(), myCart.getId())));
        }
        java.util.Vector<?> itemRange = this.getItemRange();
        if (itemRange != null) {
            ViewObject.resolveVectorProxies(itemRange, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(this.getMyAccount() != null && index < this.getMyAccount().getTheObject().getChildCount())
            return this.getMyAccount().getTheObject().getChild(index);
        if(this.getMyAccount() != null) index = index - this.getMyAccount().getTheObject().getChildCount();
        if(this.getMyCart() != null && index < this.getMyCart().getTheObject().getChildCount())
            return this.getMyCart().getTheObject().getChild(index);
        if(this.getMyCart() != null) index = index - this.getMyCart().getTheObject().getChildCount();
        if(index < this.getItemRange().size()) return new ItemRangeCustomerWrapper(this, originalIndex, (ViewRoot)this.getItemRange().get(index));
        index = index - this.getItemRange().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getMyAccount() == null ? 0 : this.getMyAccount().getTheObject().getChildCount())
            + (this.getMyCart() == null ? 0 : this.getMyCart().getTheObject().getChildCount())
            + (this.getItemRange().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getMyAccount() == null ? true : this.getMyAccount().getTheObject().isLeaf())
            && (this.getMyCart() == null ? true : this.getMyCart().getTheObject().isLeaf())
            && (this.getItemRange().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getMyAccount() != null && this.getMyAccount().equals(child)) return result;
        if(this.getMyAccount() != null) result = result + 1;
        if(this.getMyCart() != null && this.getMyCart().equals(child)) return result;
        if(this.getMyCart() != null) result = result + 1;
        java.util.Iterator<?> getItemRangeIterator = this.getItemRange().iterator();
        while(getItemRangeIterator.hasNext()){
            if(getItemRangeIterator.next().equals(child)) return result;
            result = result + 1;
        }
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
