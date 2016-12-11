
package view.objects;

import view.*;


/* Additional import section end */

public abstract class Delivery extends ViewObject implements DeliveryView{
    
    protected long remainingTimeToDelivery;
    protected java.util.Date sentDate;
    
    public Delivery(long remainingTimeToDelivery,java.util.Date sentDate,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.remainingTimeToDelivery = remainingTimeToDelivery;
        this.sentDate = sentDate;        
    }
    
    public long getRemainingTimeToDelivery()throws ModelException{
        return this.remainingTimeToDelivery;
    }
    public void setRemainingTimeToDelivery(long newValue) throws ModelException {
        this.remainingTimeToDelivery = newValue;
    }
    public java.util.Date getSentDate()throws ModelException{
        return this.sentDate;
    }
    public void setSentDate(java.util.Date newValue) throws ModelException {
        this.sentDate = newValue;
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
    public int getRemainingTimeToDeliveryIndex() throws ModelException {
        return 0;
    }
    public int getSentDateIndex() throws ModelException {
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
                if(rowIndex == 0) return "sentDate";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getRemainingTimeToDelivery());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return ViewRoot.toString(getSentDate(), true );
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
            this.setSentDate(new java.text.SimpleDateFormat(TIMESTAMPFORMAT).parse(newValue));
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
