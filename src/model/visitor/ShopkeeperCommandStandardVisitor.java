
package model.visitor;

import persistence.*;

public abstract class ShopkeeperCommandStandardVisitor implements ShopkeeperCommandVisitor {
    
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException{
        this.standardHandling(changeProductGroupCommand);
    }
    public void handlePresetBalanceCommand(PersistentPresetBalanceCommand presetBalanceCommand) throws PersistenceException{
        this.standardHandling(presetBalanceCommand);
    }
    public void handleChangeRetourePercentageCommand(PersistentChangeRetourePercentageCommand changeRetourePercentageCommand) throws PersistenceException{
        this.standardHandling(changeRetourePercentageCommand);
    }
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException{
        this.standardHandling(changePriceCommand);
    }
    public void handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException{
        this.standardHandling(changeChargeCommand);
    }
    public void handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException{
        this.standardHandling(changeTimeCommand);
    }
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException{
        this.standardHandling(changeDescriptionCommand);
    }
    public void handlePresetLowerLimitCommand(PersistentPresetLowerLimitCommand presetLowerLimitCommand) throws PersistenceException{
        this.standardHandling(presetLowerLimitCommand);
    }
    protected abstract void standardHandling(ShopkeeperCommand shopkeeperCommand) throws PersistenceException;
}
