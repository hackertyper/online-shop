package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class AccountProxi extends ViewProxi implements AccountView{
    
    public AccountProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public AccountView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long lowerLimit = new Long((String)resultTable.get("lowerLimit")).longValue();
        long balance = new Long((String)resultTable.get("balance")).longValue();
        ViewProxi manager = null;
        String manager$String = (String)resultTable.get("manager");
        if (manager$String != null) {
            common.ProxiInformation manager$Info = common.RPCConstantsAndServices.createProxiInformation(manager$String);
            manager = view.objects.ViewProxi.createProxi(manager$Info,connectionKey);
            manager.setToString(manager$Info.getToString());
        }
        AccountView result$$ = new Account((long)lowerLimit,(long)balance,(CustomerView)manager, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
    
    public long getLowerLimit()throws ModelException{
        return ((Account)this.getTheObject()).getLowerLimit();
    }
    public void setLowerLimit(long newValue) throws ModelException {
        ((Account)this.getTheObject()).setLowerLimit(newValue);
    }
    public long getBalance()throws ModelException{
        return ((Account)this.getTheObject()).getBalance();
    }
    public void setBalance(long newValue) throws ModelException {
        ((Account)this.getTheObject()).setBalance(newValue);
    }
    public CustomerView getManager()throws ModelException{
        return ((Account)this.getTheObject()).getManager();
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
