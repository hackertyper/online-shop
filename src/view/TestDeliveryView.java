package view;

import view.visitor.*;

public interface TestDeliveryView extends CustomerDeliveryView {
    
    
    public void accept(CustomerDeliveryVisitor visitor) throws ModelException;
    public <R> R accept(CustomerDeliveryReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(CustomerDeliveryExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(CustomerDeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}
