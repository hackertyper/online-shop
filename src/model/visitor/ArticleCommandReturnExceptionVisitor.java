
package model.visitor;

import persistence.*;

public interface ArticleCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException, E;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException, E;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException, E;
    
}
