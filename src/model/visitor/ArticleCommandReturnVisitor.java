
package model.visitor;

import persistence.*;

public interface ArticleCommandReturnVisitor<R> {
    
    public R handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    
}
