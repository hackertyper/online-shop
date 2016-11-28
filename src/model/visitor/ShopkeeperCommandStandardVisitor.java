
package model.visitor;

import persistence.*;

public abstract class ShopkeeperCommandStandardVisitor implements ShopkeeperCommandVisitor {
    
    public void handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException{
        this.standardHandling(changeChargeCommand);
    }
    public void handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException{
        this.standardHandling(changeTimeCommand);
    }
    protected abstract void standardHandling(ShopkeeperCommand shopkeeperCommand) throws PersistenceException;
}
