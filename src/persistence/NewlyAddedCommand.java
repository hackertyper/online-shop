package persistence;

import model.visitor.*;

/* Additional import section end */

public interface NewlyAddedCommand extends  Command {
    
    

    public void accept(NewlyAddedCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(NewlyAddedCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(NewlyAddedCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(NewlyAddedCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

