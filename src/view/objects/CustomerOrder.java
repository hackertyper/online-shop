
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class CustomerOrder extends view.objects.Delivery implements CustomerOrderView{
    
    protected java.util.Vector<QuantifiedArticlesView> articleList;
    protected OrderManagerView ordermngr;
    protected CustomerOrderState myState;
    
    public CustomerOrder(long remainingTimeToDelivery,java.util.Date sendDate,java.util.Vector<QuantifiedArticlesView> articleList,OrderManagerView ordermngr,CustomerOrderState myState,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super((long)remainingTimeToDelivery,(java.util.Date)sendDate,id, classId);
        this.articleList = articleList;
        this.ordermngr = ordermngr;
        this.myState = myState;        
    }
    
    static public long getTypeId() {
        return 111;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<QuantifiedArticlesView> getArticleList()throws ModelException{
        return this.articleList;
    }
    public void setArticleList(java.util.Vector<QuantifiedArticlesView> newValue) throws ModelException {
        this.articleList = newValue;
    }
    public OrderManagerView getOrdermngr()throws ModelException{
        return this.ordermngr;
    }
    public void setOrdermngr(OrderManagerView newValue) throws ModelException {
        this.ordermngr = newValue;
    }
    public CustomerOrderState getMyState()throws ModelException{
        return this.myState;
    }
    public void setMyState(CustomerOrderState newValue) throws ModelException {
        this.myState = newValue;
    }
    
    public void accept(DeliveryVisitor visitor) throws ModelException {
        visitor.handleCustomerOrder(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerOrder(this);
    }
    public <E extends view.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerOrder(this);
    }
    public <R, E extends view.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomerOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerOrder(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> articleList = this.getArticleList();
        if (articleList != null) {
            ViewObject.resolveVectorProxies(articleList, resultTable);
        }
        OrderManagerView ordermngr = this.getOrdermngr();
        if (ordermngr != null) {
            ((ViewProxi)ordermngr).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(ordermngr.getClassId(), ordermngr.getId())));
        }
        CustomerOrderState myState = this.getMyState();
        if (myState != null) {
            ((ViewProxi)myState).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myState.getClassId(), myState.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticleList().size()) return new ArticleListCustomerOrderWrapper(this, originalIndex, (ViewRoot)this.getArticleList().get(index));
        index = index - this.getArticleList().size();
        if(this.getOrdermngr() != null && index < this.getOrdermngr().getTheObject().getChildCount())
            return this.getOrdermngr().getTheObject().getChild(index);
        if(this.getOrdermngr() != null) index = index - this.getOrdermngr().getTheObject().getChildCount();
        if(this.getMyState() != null && index < this.getMyState().getTheObject().getChildCount())
            return this.getMyState().getTheObject().getChild(index);
        if(this.getMyState() != null) index = index - this.getMyState().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticleList().size())
            + (this.getOrdermngr() == null ? 0 : this.getOrdermngr().getTheObject().getChildCount())
            + (this.getMyState() == null ? 0 : this.getMyState().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getArticleList().size() == 0)
            && (this.getOrdermngr() == null ? true : this.getOrdermngr().getTheObject().isLeaf())
            && (this.getMyState() == null ? true : this.getMyState().getTheObject().isLeaf());
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getArticleListIterator = this.getArticleList().iterator();
        while(getArticleListIterator.hasNext()){
            if(getArticleListIterator.next().equals(child)) return result;
            result = result + 1;
        }
        if(this.getOrdermngr() != null && this.getOrdermngr().equals(child)) return result;
        if(this.getOrdermngr() != null) result = result + 1;
        if(this.getMyState() != null && this.getMyState().equals(child)) return result;
        if(this.getMyState() != null) result = result + 1;
        return -1;
    }
    public int getRemainingTimeToDeliveryIndex() throws ModelException {
        return 0;
    }
    public int getSendDateIndex() throws ModelException {
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
                if(rowIndex == 0) return "remainingTimeToDelivery";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "sendDate";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getRemainingTimeToDelivery());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return ViewRoot.toString(getSendDate(), true );
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
            this.setRemainingTimeToDelivery(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setSendDate(new java.text.SimpleDateFormat(TIMESTAMPFORMAT).parse(newValue));
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
