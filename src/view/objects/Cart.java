
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Cart extends ViewObject implements CartView{
    
    protected long currentSum;
    protected CartManagerView cartMngr;
    
    public Cart(long currentSum,CartManagerView cartMngr,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.currentSum = currentSum;
        this.cartMngr = cartMngr;        
    }
    
    static public long getTypeId() {
        return 123;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public long getCurrentSum()throws ModelException{
        return this.currentSum;
    }
    public void setCurrentSum(long newValue) throws ModelException {
        this.currentSum = newValue;
    }
    public CartManagerView getCartMngr()throws ModelException{
        return this.cartMngr;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCart(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCart(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCart(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        CartManagerView cartMngr = this.getCartMngr();
        if (cartMngr != null) {
            ((ViewProxi)cartMngr).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(cartMngr.getClassId(), cartMngr.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 ;
    }
    public boolean isLeaf() throws ModelException {
        return true;
    }
    public int getIndexOfChild(Object child) throws ModelException {
        
        return -1;
    }
    public int getCurrentSumIndex() throws ModelException {
        return 0;
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "currentSum";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getCurrentSum());
                rowIndex = rowIndex - 1;
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
        if(rowIndex == 0){
            this.setCurrentSum(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
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
