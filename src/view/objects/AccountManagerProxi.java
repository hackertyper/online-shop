package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class AccountManagerProxi extends ViewProxi implements AccountManagerView{
    
    public AccountManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public AccountManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi myAccount = null;
        String myAccount$String = (String)resultTable.get("myAccount");
        if (myAccount$String != null) {
            common.ProxiInformation myAccount$Info = common.RPCConstantsAndServices.createProxiInformation(myAccount$String);
            myAccount = view.objects.ViewProxi.createProxi(myAccount$Info,connectionKey);
            myAccount.setToString(myAccount$Info.getToString());
        }
        AccountManagerView result$$ = new AccountManager((AccountView)myAccount, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getMyAccount() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getMyAccount() != null && this.getMyAccount().equals(child)) return result;
        if(this.getMyAccount() != null) result = result + 1;
        return -1;
    }
    
    public AccountView getMyAccount()throws ModelException{
        return ((AccountManager)this.getTheObject()).getMyAccount();
    }
    public void setMyAccount(AccountView newValue) throws ModelException {
        ((AccountManager)this.getTheObject()).setMyAccount(newValue);
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
    
    public boolean hasTransientFields(){
        return false;
    }
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    private final int RemoteDepth = 1;
    
    /* End of protected part that is not overridden by persistence generator */
    
}
