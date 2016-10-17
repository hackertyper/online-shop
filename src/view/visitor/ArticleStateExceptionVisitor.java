
package view.visitor;

import view.*;

public interface ArticleStateExceptionVisitor<E extends view.UserException> {
    
    public void handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException, E;
    public void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException, E;
    public void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException, E;
    
}
