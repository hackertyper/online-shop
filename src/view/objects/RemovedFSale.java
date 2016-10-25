
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class RemovedFSale extends ViewObject implements RemovedFSaleView{
    
    protected ArticleView myArticle;
    
    public RemovedFSale(ArticleView myArticle,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.myArticle = myArticle;        
    }
    
    static public long getTypeId() {
        return 161;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ArticleView getMyArticle()throws ModelException{
        return this.myArticle;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleRemovedFSale(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleRemovedFSale(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleRemovedFSale(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleRemovedFSale(this);
    }
    public void accept(ArticleStateVisitor visitor) throws ModelException {
        visitor.handleRemovedFSale(this);
    }
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleRemovedFSale(this);
    }
    public <E extends view.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleRemovedFSale(this);
    }
    public <R, E extends view.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleRemovedFSale(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ArticleView myArticle = this.getMyArticle();
        if (myArticle != null) {
            ((ViewProxi)myArticle).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myArticle.getClassId(), myArticle.getId())));
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
