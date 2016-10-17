
package model.visitor;

import persistence.*;

public interface ArticleCommandVisitor {
    
    public void handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException;
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    
}
