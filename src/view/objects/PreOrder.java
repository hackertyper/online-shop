
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class PreOrder extends ViewObject implements PreOrderView{
    
    protected CartManagerView cartManager;
    protected long sum;
    protected java.util.Vector<QuantifiedArticlesView> articleList;
    protected StandardDeliveryView standardDelivery;
    protected OverNightDeliveryView onDelivery;
    
    public PreOrder(CartManagerView cartManager,long sum,java.util.Vector<QuantifiedArticlesView> articleList,StandardDeliveryView standardDelivery,OverNightDeliveryView onDelivery,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.cartManager = cartManager;
        this.sum = sum;
        this.articleList = articleList;
        this.standardDelivery = standardDelivery;
        this.onDelivery = onDelivery;        
    }
    
    static public long getTypeId() {
        return 240;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public CartManagerView getCartManager()throws ModelException{
        return this.cartManager;
    }
    public void setCartManager(CartManagerView newValue) throws ModelException {
        this.cartManager = newValue;
    }
    public long getSum()throws ModelException{
        return this.sum;
    }
    public void setSum(long newValue) throws ModelException {
        this.sum = newValue;
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
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handlePreOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handlePreOrder(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        CartManagerView cartManager = this.getCartManager();
        if (cartManager != null) {
            ((ViewProxi)cartManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(cartManager.getClassId(), cartManager.getId())));
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
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticleList().size()) return new ArticleListPreOrderWrapper(this, originalIndex, (ViewRoot)this.getArticleList().get(index));
        index = index - this.getArticleList().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticleList().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getArticleList().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getArticleListIterator = this.getArticleList().iterator();
        while(getArticleListIterator.hasNext()){
            if(getArticleListIterator.next().equals(child)) return result;
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
