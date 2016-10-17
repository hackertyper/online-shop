
package model.visitor;

import persistence.*;

public interface ArticleStateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException, E;
    public R handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException, E;
    public R handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException, E;
    
}
