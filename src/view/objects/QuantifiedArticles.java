
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class QuantifiedArticles extends ViewObject implements QuantifiedArticlesView{
    
    protected ArticleView article;
    protected long amount;
    
    public QuantifiedArticles(ArticleView article,long amount,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.article = article;
        this.amount = amount;        
    }
    
    static public long getTypeId() {
        return 124;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ArticleView getArticle()throws ModelException{
        return this.article;
    }
    public void setArticle(ArticleView newValue) throws ModelException {
        this.article = newValue;
    }
    public long getAmount()throws ModelException{
        return this.amount;
    }
    public void setAmount(long newValue) throws ModelException {
        this.amount = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleQuantifiedArticles(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleQuantifiedArticles(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleQuantifiedArticles(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleQuantifiedArticles(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ArticleView article = this.getArticle();
        if (article != null) {
            ((ViewProxi)article).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(article.getClassId(), article.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getArticle() != null) return new ArticleQuantifiedArticlesWrapper(this, originalIndex, (ViewRoot)this.getArticle());
        if(this.getArticle() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticle() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getArticle() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getArticle() != null && this.getArticle().equals(child)) return result;
        if(this.getArticle() != null) result = result + 1;
        return -1;
    }
    public int getAmountIndex() throws ModelException {
        return 0 + (this.getArticle() == null ? 0 : 1);
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "amount";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getAmount());
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
            this.setAmount(Long.parseLong(newValue));
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
