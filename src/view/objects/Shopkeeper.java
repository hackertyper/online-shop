
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Shopkeeper extends ViewObject implements ShopkeeperView{
    
    protected ProductGroupView basicProductGroup;
    protected CustomerPresetsView presets;
    protected StandardDeliveryView standardDelivery;
    protected OverNightDeliveryView onDelivery;
    
    public Shopkeeper(ProductGroupView basicProductGroup,CustomerPresetsView presets,StandardDeliveryView standardDelivery,OverNightDeliveryView onDelivery,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.basicProductGroup = basicProductGroup;
        this.presets = presets;
        this.standardDelivery = standardDelivery;
        this.onDelivery = onDelivery;        
    }
    
    static public long getTypeId() {
        return 107;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ProductGroupView getBasicProductGroup()throws ModelException{
        return this.basicProductGroup;
    }
    public void setBasicProductGroup(ProductGroupView newValue) throws ModelException {
        this.basicProductGroup = newValue;
    }
    public CustomerPresetsView getPresets()throws ModelException{
        return this.presets;
    }
    public void setPresets(CustomerPresetsView newValue) throws ModelException {
        this.presets = newValue;
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
        visitor.handleShopkeeper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShopkeeper(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShopkeeper(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShopkeeper(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ProductGroupView basicProductGroup = this.getBasicProductGroup();
        if (basicProductGroup != null) {
            ((ViewProxi)basicProductGroup).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(basicProductGroup.getClassId(), basicProductGroup.getId())));
        }
        CustomerPresetsView presets = this.getPresets();
        if (presets != null) {
            ((ViewProxi)presets).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(presets.getClassId(), presets.getId())));
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
        if(index == 0 && this.getBasicProductGroup() != null) return new BasicProductGroupShopkeeperWrapper(this, originalIndex, (ViewRoot)this.getBasicProductGroup());
        if(this.getBasicProductGroup() != null) index = index - 1;
        if(index == 0 && this.getPresets() != null) return new PresetsShopkeeperWrapper(this, originalIndex, (ViewRoot)this.getPresets());
        if(this.getPresets() != null) index = index - 1;
        if(index == 0 && this.getStandardDelivery() != null) return new StandardDeliveryShopkeeperWrapper(this, originalIndex, (ViewRoot)this.getStandardDelivery());
        if(this.getStandardDelivery() != null) index = index - 1;
        if(index == 0 && this.getOnDelivery() != null) return new OnDeliveryShopkeeperWrapper(this, originalIndex, (ViewRoot)this.getOnDelivery());
        if(this.getOnDelivery() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getBasicProductGroup() == null ? 0 : 1)
            + (this.getPresets() == null ? 0 : 1)
            + (this.getStandardDelivery() == null ? 0 : 1)
            + (this.getOnDelivery() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getBasicProductGroup() == null ? true : false)
            && (this.getPresets() == null ? true : false)
            && (this.getStandardDelivery() == null ? true : false)
            && (this.getOnDelivery() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getBasicProductGroup() != null && this.getBasicProductGroup().equals(child)) return result;
        if(this.getBasicProductGroup() != null) result = result + 1;
        if(this.getPresets() != null && this.getPresets().equals(child)) return result;
        if(this.getPresets() != null) result = result + 1;
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
