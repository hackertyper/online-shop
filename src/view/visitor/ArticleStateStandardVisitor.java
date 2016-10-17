
package view.visitor;

import view.*;

public abstract class ArticleStateStandardVisitor implements ArticleStateVisitor {
    
    public void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException{
        this.standardHandling(removedFSale);
    }
    public void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException{
        this.standardHandling(offeredFSale);
    }
    public void handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException{
        this.standardHandling(newlyAdded);
    }
    protected abstract void standardHandling(ArticleState articleState) throws ModelException;
}
