
package model.visitor;

import persistence.*;

public interface ShopkeeperCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException, E;
    public R handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException, E;
    
}
