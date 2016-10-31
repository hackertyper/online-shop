package persistence;

import model.visitor.*;

/* Additional import section end */

public interface CustomerOrderState extends  SubjInterface {
    
    

    public void accept(CustomerOrderStateVisitor visitor) throws PersistenceException;
    public <R> R accept(CustomerOrderStateReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CustomerOrderStateExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CustomerOrderStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

