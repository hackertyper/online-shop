
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class AccountManager extends ViewObject implements AccountManagerView{
    
    protected AccountView myAccount;
    
    public AccountManager(AccountView myAccount,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.myAccount = myAccount;        
    }
    
    static public long getTypeId() {
        return 188;
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
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleAccountManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleAccountManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleAccountManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleAccountManager(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        AccountView myAccount = this.getMyAccount();
        if (myAccount != null) {
            ((ViewProxi)myAccount).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myAccount.getClassId(), myAccount.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getMyAccount() != null) return new MyAccountAccountManagerWrapper(this, originalIndex, (ViewRoot)this.getMyAccount());
        if(this.getMyAccount() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getMyAccount() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getMyAccount() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getMyAccount() != null && this.getMyAccount().equals(child)) return result;
        if(this.getMyAccount() != null) result = result + 1;
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
