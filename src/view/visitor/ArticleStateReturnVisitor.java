
package view.visitor;

import view.*;

public interface ArticleStateReturnVisitor<R> {
    
    public R handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException;
    public R handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException;
    public R handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException;
    
}
