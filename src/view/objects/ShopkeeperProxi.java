package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ShopkeeperProxi extends ViewProxi implements ShopkeeperView{
    
    public ShopkeeperProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ShopkeeperView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi basicProductGroup = null;
        String basicProductGroup$String = (String)resultTable.get("basicProductGroup");
        if (basicProductGroup$String != null) {
            common.ProxiInformation basicProductGroup$Info = common.RPCConstantsAndServices.createProxiInformation(basicProductGroup$String);
            basicProductGroup = view.objects.ViewProxi.createProxi(basicProductGroup$Info,connectionKey);
            basicProductGroup.setToString(basicProductGroup$Info.getToString());
        }
        ViewProxi presets = null;
        String presets$String = (String)resultTable.get("presets");
        if (presets$String != null) {
            common.ProxiInformation presets$Info = common.RPCConstantsAndServices.createProxiInformation(presets$String);
            presets = view.objects.ViewProxi.createProxi(presets$Info,connectionKey);
            presets.setToString(presets$Info.getToString());
        }
        ViewProxi standardDelivery = null;
        String standardDelivery$String = (String)resultTable.get("standardDelivery");
        if (standardDelivery$String != null) {
            common.ProxiInformation standardDelivery$Info = common.RPCConstantsAndServices.createProxiInformation(standardDelivery$String);
            standardDelivery = view.objects.ViewProxi.createProxi(standardDelivery$Info,connectionKey);
            standardDelivery.setToString(standardDelivery$Info.getToString());
        }
        ViewProxi onDelivery = null;
        String onDelivery$String = (String)resultTable.get("onDelivery");
        if (onDelivery$String != null) {
            common.ProxiInformation onDelivery$Info = common.RPCConstantsAndServices.createProxiInformation(onDelivery$String);
            onDelivery = view.objects.ViewProxi.createProxi(onDelivery$Info,connectionKey);
            onDelivery.setToString(onDelivery$Info.getToString());
        }
        ShopkeeperView result$$ = new Shopkeeper((ProductGroupView)basicProductGroup,(CustomerPresetsView)presets,(StandardDeliveryView)standardDelivery,(OverNightDeliveryView)onDelivery, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
        if (this.object == null) return this.getLeafInfo() == 0;
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
    
    public ProductGroupView getBasicProductGroup()throws ModelException{
        return ((Shopkeeper)this.getTheObject()).getBasicProductGroup();
    }
    public void setBasicProductGroup(ProductGroupView newValue) throws ModelException {
        ((Shopkeeper)this.getTheObject()).setBasicProductGroup(newValue);
    }
    public CustomerPresetsView getPresets()throws ModelException{
        return ((Shopkeeper)this.getTheObject()).getPresets();
    }
    public void setPresets(CustomerPresetsView newValue) throws ModelException {
        ((Shopkeeper)this.getTheObject()).setPresets(newValue);
    }
    public StandardDeliveryView getStandardDelivery()throws ModelException{
        return ((Shopkeeper)this.getTheObject()).getStandardDelivery();
    }
    public void setStandardDelivery(StandardDeliveryView newValue) throws ModelException {
        ((Shopkeeper)this.getTheObject()).setStandardDelivery(newValue);
    }
    public OverNightDeliveryView getOnDelivery()throws ModelException{
        return ((Shopkeeper)this.getTheObject()).getOnDelivery();
    }
    public void setOnDelivery(OverNightDeliveryView newValue) throws ModelException {
        ((Shopkeeper)this.getTheObject()).setOnDelivery(newValue);
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
