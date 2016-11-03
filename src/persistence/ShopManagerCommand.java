package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ShopManagerCommand extends  Command {
    
    

    public void accept(ShopManagerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ShopManagerCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ShopManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ShopManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

