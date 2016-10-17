
package model.visitor;

import persistence.*;

public interface ArticleStateVisitor {
    
    public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    
}
