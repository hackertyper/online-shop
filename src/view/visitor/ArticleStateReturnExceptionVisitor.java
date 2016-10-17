
package view.visitor;

import view.*;

public interface ArticleStateReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException, E;
    public R handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException, E;
    public R handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException, E;
    
}
