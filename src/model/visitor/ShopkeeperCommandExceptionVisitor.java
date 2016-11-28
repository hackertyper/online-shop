
package model.visitor;

import persistence.*;

public interface ShopkeeperCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException, E;
    public void handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException, E;
    
}
