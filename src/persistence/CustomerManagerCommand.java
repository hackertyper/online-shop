package persistence;

import model.visitor.*;

/* Additional import section end */

public interface CustomerManagerCommand extends  Command {
    
    

    public void accept(CustomerManagerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(CustomerManagerCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CustomerManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CustomerManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

