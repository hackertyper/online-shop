package persistence;

import model.visitor.*;

/* Additional import section end */

public interface OrderManagerCommand extends  Command {
    
    

    public void accept(OrderManagerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(OrderManagerCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(OrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(OrderManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

