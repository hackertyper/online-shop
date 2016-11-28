
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class CartManager extends ViewObject implements CartManagerView{
    
    protected CartView myCart;
    protected java.util.Vector<QuantifiedArticlesView> articleList;
    protected StandardDeliveryView standardDelivery;
    protected OverNightDeliveryView onDelivery;
    protected CustomerManagerView customerManager;
    protected CartServiceView myCartServer;
    
    public CartManager(CartView myCart,java.util.Vector<QuantifiedArticlesView> articleList,StandardDeliveryView standardDelivery,OverNightDeliveryView onDelivery,CustomerManagerView customerManager,CartServiceView myCartServer,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.myCart = myCart;
        this.articleList = articleList;
        this.standardDelivery = standardDelivery;
        this.onDelivery = onDelivery;
        this.customerManager = customerManager;
        this.myCartServer = myCartServer;        
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
    public java.util.Vector<QuantifiedArticlesView> getArticleList()throws ModelException{
        return this.articleList;
    }
    public void setArticleList(java.util.Vector<QuantifiedArticlesView> newValue) throws ModelException {
        this.articleList = newValue;
    }
    public StandardDeliveryView getStandardDelivery()throws ModelException{
        return this.standardDelivery;
    }
    public void setStandardDelivery(StandardDeliveryView newValue) throws ModelException {
        this.standardDelivery = newValue;
    }
    public OverNightDeliveryView getOnDelivery()throws ModelException{
        return this.onDelivery;
    }
    public void setOnDelivery(OverNightDeliveryView newValue) throws ModelException {
        this.onDelivery = newValue;
    }
    public CustomerManagerView getCustomerManager()throws ModelException{
        return this.customerManager;
    }
    public CartServiceView getMyCartServer()throws ModelException{
        return this.myCartServer;
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
        java.util.Vector<?> articleList = this.getArticleList();
        if (articleList != null) {
            ViewObject.resolveVectorProxies(articleList, resultTable);
        }
        StandardDeliveryView standardDelivery = this.getStandardDelivery();
        if (standardDelivery != null) {
            ((ViewProxi)standardDelivery).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(standardDelivery.getClassId(), standardDelivery.getId())));
        }
        OverNightDeliveryView onDelivery = this.getOnDelivery();
        if (onDelivery != null) {
            ((ViewProxi)onDelivery).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(onDelivery.getClassId(), onDelivery.getId())));
        }
        CustomerManagerView customerManager = this.getCustomerManager();
        if (customerManager != null) {
            ((ViewProxi)customerManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(customerManager.getClassId(), customerManager.getId())));
        }
        CartServiceView myCartServer = this.getMyCartServer();
        if (myCartServer != null) {
            ((ViewProxi)myCartServer).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myCartServer.getClassId(), myCartServer.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getMyCart() != null) return new MyCartCartManagerWrapper(this, originalIndex, (ViewRoot)this.getMyCart());
        if(this.getMyCart() != null) index = index - 1;
        if(index < this.getArticleList().size()) return new ArticleListCartManagerWrapper(this, originalIndex, (ViewRoot)this.getArticleList().get(index));
        index = index - this.getArticleList().size();
        if(index == 0 && this.getStandardDelivery() != null) return new StandardDeliveryCartManagerWrapper(this, originalIndex, (ViewRoot)this.getStandardDelivery());
        if(this.getStandardDelivery() != null) index = index - 1;
        if(index == 0 && this.getOnDelivery() != null) return new OnDeliveryCartManagerWrapper(this, originalIndex, (ViewRoot)this.getOnDelivery());
        if(this.getOnDelivery() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getMyCart() == null ? 0 : 1)
            + (this.getArticleList().size())
            + (this.getStandardDelivery() == null ? 0 : 1)
            + (this.getOnDelivery() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getMyCart() == null ? true : false)
            && (this.getArticleList().size() == 0)
            && (this.getStandardDelivery() == null ? true : false)
            && (this.getOnDelivery() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getMyCart() != null && this.getMyCart().equals(child)) return result;
        if(this.getMyCart() != null) result = result + 1;
        java.util.Iterator<?> getArticleListIterator = this.getArticleList().iterator();
        while(getArticleListIterator.hasNext()){
            if(getArticleListIterator.next().equals(child)) return result;
            result = result + 1;
        }
        if(this.getStandardDelivery() != null && this.getStandardDelivery().equals(child)) return result;
        if(this.getStandardDelivery() != null) result = result + 1;
        if(this.getOnDelivery() != null && this.getOnDelivery().equals(child)) return result;
        if(this.getOnDelivery() != null) result = result + 1;
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
