
package model.visitor;

import persistence.*;

public interface ShopkeeperCommandReturnVisitor<R> {
    
    public R handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException;
    public R handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException;
    
}
