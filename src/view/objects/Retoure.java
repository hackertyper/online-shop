
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Retoure extends view.objects.Delivery implements RetoureView{
    
    protected java.util.Vector<QuantifiedArticlesView> articleList;
    
    public Retoure(long remainingTimeToDelivery,java.util.Vector<QuantifiedArticlesView> articleList,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super((long)remainingTimeToDelivery,id, classId);
        this.articleList = articleList;        
    }
    
    static public long getTypeId() {
        return 175;
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
    
    public void accept(DeliveryVisitor visitor) throws ModelException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleRetoure(this);
    }
    public <E extends view.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends view.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleRetoure(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleRetoure(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleRetoure(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> articleList = this.getArticleList();
        if (articleList != null) {
            ViewObject.resolveVectorProxies(articleList, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticleList().size()) return new ArticleListRetoureWrapper(this, originalIndex, (ViewRoot)this.getArticleList().get(index));
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
    public int getRemainingTimeToDeliveryIndex() throws ModelException {
        return 0;
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "remainingTimeToDelivery";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getRemainingTimeToDelivery());
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
