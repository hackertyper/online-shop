package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ItemCommand extends  Command {
    
    

    public void accept(ItemCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ItemCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ItemCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ItemCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

