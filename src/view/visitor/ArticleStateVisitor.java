
package view.visitor;

import view.*;

public interface ArticleStateVisitor {
    
    public void handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException;
    public void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException;
    public void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException;
    
}
