
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Article extends view.objects.Item implements ArticleView{
    
    protected ManufacturerView manufacturer;
    protected ArticleState state;
    protected ArticleWrapperView myWrapper;
    protected long price;
    protected long minStock;
    protected long maxStock;
    protected long stock;
    protected long reserved;
    
    public Article(String description,ManufacturerView manufacturer,ArticleState state,ArticleWrapperView myWrapper,long price,long minStock,long maxStock,long stock,long reserved,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super((String)description,id, classId);
        this.manufacturer = manufacturer;
        this.state = state;
        this.myWrapper = myWrapper;
        this.price = price;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.stock = stock;
        this.reserved = reserved;        
    }
    
    static public long getTypeId() {
        return 193;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ManufacturerView getManufacturer()throws ModelException{
        return this.manufacturer;
    }
    public void setManufacturer(ManufacturerView newValue) throws ModelException {
        this.manufacturer = newValue;
    }
    public ArticleState getState()throws ModelException{
        return this.state;
    }
    public void setState(ArticleState newValue) throws ModelException {
        this.state = newValue;
    }
    public ArticleWrapperView getMyWrapper()throws ModelException{
        return this.myWrapper;
    }
    public void setMyWrapper(ArticleWrapperView newValue) throws ModelException {
        this.myWrapper = newValue;
    }
    public long getPrice()throws ModelException{
        return this.price;
    }
    public void setPrice(long newValue) throws ModelException {
        this.price = newValue;
    }
    public long getMinStock()throws ModelException{
        return this.minStock;
    }
    public void setMinStock(long newValue) throws ModelException {
        this.minStock = newValue;
    }
    public long getMaxStock()throws ModelException{
        return this.maxStock;
    }
    public void setMaxStock(long newValue) throws ModelException {
        this.maxStock = newValue;
    }
    public long getStock()throws ModelException{
        return this.stock;
    }
    public void setStock(long newValue) throws ModelException {
        this.stock = newValue;
    }
    public long getReserved()throws ModelException{
        return this.reserved;
    }
    public void setReserved(long newValue) throws ModelException {
        this.reserved = newValue;
    }
    
    public void accept(ItemVisitor visitor) throws ModelException {
        visitor.handleArticle(this);
    }
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticle(this);
    }
    public <E extends view.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends view.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticle(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticle(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ManufacturerView manufacturer = this.getManufacturer();
        if (manufacturer != null) {
            ((ViewProxi)manufacturer).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(manufacturer.getClassId(), manufacturer.getId())));
        }
        ArticleState state = this.getState();
        if (state != null) {
            ((ViewProxi)state).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(state.getClassId(), state.getId())));
        }
        ArticleWrapperView myWrapper = this.getMyWrapper();
        if (myWrapper != null) {
            ((ViewProxi)myWrapper).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myWrapper.getClassId(), myWrapper.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getManufacturer() != null) return new ManufacturerArticleWrapper(this, originalIndex, (ViewRoot)this.getManufacturer());
        if(this.getManufacturer() != null) index = index - 1;
        if(index == 0 && this.getState() != null) return new StateArticleWrapper(this, originalIndex, (ViewRoot)this.getState());
        if(this.getState() != null) index = index - 1;
        if(this.getMyWrapper() != null && index < this.getMyWrapper().getTheObject().getChildCount())
            return this.getMyWrapper().getTheObject().getChild(index);
        if(this.getMyWrapper() != null) index = index - this.getMyWrapper().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getManufacturer() == null ? 0 : 1)
            + (this.getState() == null ? 0 : 1)
            + (this.getMyWrapper() == null ? 0 : this.getMyWrapper().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getManufacturer() == null ? true : false)
            && (this.getState() == null ? true : false)
            && (this.getMyWrapper() == null ? true : this.getMyWrapper().getTheObject().isLeaf());
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getManufacturer() != null && this.getManufacturer().equals(child)) return result;
        if(this.getManufacturer() != null) result = result + 1;
        if(this.getState() != null && this.getState().equals(child)) return result;
        if(this.getState() != null) result = result + 1;
        if(this.getMyWrapper() != null && this.getMyWrapper().equals(child)) return result;
        if(this.getMyWrapper() != null) result = result + 1;
        return -1;
    }
    public int getDescriptionIndex() throws ModelException {
        return 0;
    }
    public int getPriceIndex() throws ModelException {
        return 0 + 1 + (this.getManufacturer() == null ? 0 : 1) + (this.getState() == null ? 0 : 1) + (this.getMyWrapper() == null ? 0 : 1);
    }
    public int getMinStockIndex() throws ModelException {
        return 0 + 1 + (this.getManufacturer() == null ? 0 : 1) + (this.getState() == null ? 0 : 1) + (this.getMyWrapper() == null ? 0 : 1) + 1;
    }
    public int getMaxStockIndex() throws ModelException {
        return 0 + 1 + (this.getManufacturer() == null ? 0 : 1) + (this.getState() == null ? 0 : 1) + (this.getMyWrapper() == null ? 0 : 1) + 1 + 1;
    }
    public int getStockIndex() throws ModelException {
        return 0 + 1 + (this.getManufacturer() == null ? 0 : 1) + (this.getState() == null ? 0 : 1) + (this.getMyWrapper() == null ? 0 : 1) + 1 + 1 + 1;
    }
    public int getReservedIndex() throws ModelException {
        return 0 + 1 + (this.getManufacturer() == null ? 0 : 1) + (this.getState() == null ? 0 : 1) + (this.getMyWrapper() == null ? 0 : 1) + 1 + 1 + 1 + 1;
    }
    public int getRowCount(){
        return 0 
            + 1
            + 1
            + 1
            + 1
            + 1
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "description";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "price";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "minStock";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "maxStock";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "stock";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "reserved";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return this.getDescription();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getPrice());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getMinStock());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getMaxStock());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getStock());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getReserved());
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
            this.setDescription(newValue);
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setPrice(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setMinStock(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setMaxStock(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setStock(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setReserved(Long.parseLong(newValue));
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
