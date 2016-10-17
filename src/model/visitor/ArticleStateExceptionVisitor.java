
package model.visitor;

import persistence.*;

public interface ArticleStateExceptionVisitor<E extends model.UserException> {
    
    public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException, E;
    public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException, E;
    public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException, E;
    
}
