
package model.visitor;

import persistence.*;

public interface ArticleStateReturnVisitor<R> {
    
    public R handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    public R handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    public R handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    
}
