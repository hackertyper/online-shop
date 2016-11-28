
package view.objects;

import view.*;


/* Additional import section end */

public abstract class CustomerDelivery extends ViewObject implements CustomerDeliveryView{
    
    protected long time;
    protected long extraCharge;
    
    public CustomerDelivery(long time,long extraCharge,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.time = time;
        this.extraCharge = extraCharge;        
    }
    
    public long getTime()throws ModelException{
        return this.time;
    }
    public void setTime(long newValue) throws ModelException {
        this.time = newValue;
    }
    public long getExtraCharge()throws ModelException{
        return this.extraCharge;
    }
    public void setExtraCharge(long newValue) throws ModelException {
        this.extraCharge = newValue;
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
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
