
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class SendOrder extends ViewObject implements SendOrderView{
    
    protected java.util.Date arrivalDate;
    
    public SendOrder(java.util.Date arrivalDate,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.arrivalDate = arrivalDate;        
    }
    
    static public long getTypeId() {
        return 172;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Date getArrivalDate()throws ModelException{
        return this.arrivalDate;
    }
    public void setArrivalDate(java.util.Date newValue) throws ModelException {
        this.arrivalDate = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleSendOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleSendOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleSendOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleSendOrder(this);
    }
    public void accept(CustomerOrderStateVisitor visitor) throws ModelException {
        visitor.handleSendOrder(this);
    }
    public <R> R accept(CustomerOrderStateReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleSendOrder(this);
    }
    public <E extends view.UserException>  void accept(CustomerOrderStateExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleSendOrder(this);
    }
    public <R, E extends view.UserException> R accept(CustomerOrderStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleSendOrder(this);
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
    public int getArrivalDateIndex() throws ModelException {
        return 0;
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "arrivalDate";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return ViewRoot.toString(getArrivalDate(), true );
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
            this.setArrivalDate(new java.text.SimpleDateFormat(TIMESTAMPFORMAT).parse(newValue));
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
