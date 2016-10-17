package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ArticleState extends AbstractPersistentProxi {
    
    

    public void accept(ArticleStateVisitor visitor) throws PersistenceException;
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

