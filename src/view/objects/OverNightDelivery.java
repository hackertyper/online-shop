
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class OverNightDelivery extends view.objects.CustomerDelivery implements OverNightDeliveryView{
    
    
    public OverNightDelivery(long time,long extraCharge,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super((long)time,(long)extraCharge,id, classId);        
    }
    
    static public long getTypeId() {
        return 228;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    
    public void accept(CustomerDeliveryVisitor visitor) throws ModelException {
        visitor.handleOverNightDelivery(this);
    }
    public <R> R accept(CustomerDeliveryReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOverNightDelivery(this);
    }
    public <E extends view.UserException>  void accept(CustomerDeliveryExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOverNightDelivery(this);
    }
    public <R, E extends view.UserException> R accept(CustomerDeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOverNightDelivery(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOverNightDelivery(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOverNightDelivery(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOverNightDelivery(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOverNightDelivery(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        
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
    public int getTimeIndex() throws ModelException {
        return 0;
    }
    public int getExtraChargeIndex() throws ModelException {
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
                if(rowIndex == 0) return "time";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "extraCharge";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getTime());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getExtraCharge());
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
            this.setTime(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setExtraCharge(Long.parseLong(newValue));
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
