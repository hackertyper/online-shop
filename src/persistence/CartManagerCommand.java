package persistence;

import model.visitor.*;

/* Additional import section end */

public interface CartManagerCommand extends  Command {
    
    

    public void accept(CartManagerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(CartManagerCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CartManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CartManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

