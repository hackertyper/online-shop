package persistence;


/* Additional import section end */

public interface ShopkeeperCommand extends  Command {
    
    

    public void accept(ShopkeeperCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ShopkeeperCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ShopkeeperCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ShopkeeperCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

