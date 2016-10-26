
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Account extends ViewObject implements AccountView{
    
    protected long lowerLimit;
    protected long balance;
    
    public Account(long lowerLimit,long balance,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.lowerLimit = lowerLimit;
        this.balance = balance;        
    }
    
    static public long getTypeId() {
        return 101;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public long getLowerLimit()throws ModelException{
        return this.lowerLimit;
    }
    public void setLowerLimit(long newValue) throws ModelException {
        this.lowerLimit = newValue;
    }
    public long getBalance()throws ModelException{
        return this.balance;
    }
    public void setBalance(long newValue) throws ModelException {
        this.balance = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleAccount(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleAccount(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleAccount(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleAccount(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        
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
    public int getLowerLimitIndex() throws ModelException {
        return 0;
    }
    public int getBalanceIndex() throws ModelException {
        return 0 + 1;
    }
    public int getRowCount(){
        return 0 
            + 1
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "lowerLimit";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "balance";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getLowerLimit());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getBalance());
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
            this.setLowerLimit(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setBalance(Long.parseLong(newValue));
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
