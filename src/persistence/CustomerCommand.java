package persistence;

import model.visitor.*;

/* Additional import section end */

public interface CustomerCommand extends  Command {
    
    

    public void accept(CustomerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(CustomerCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CustomerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CustomerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

