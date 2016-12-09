
package model.visitor;

import persistence.*;

public interface ShopkeeperCommandReturnVisitor<R> {
    
    public R handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException;
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    public R handleChangeRetourePercentageCommand(PersistentChangeRetourePercentageCommand changeRetourePercentageCommand) throws PersistenceException;
    public R handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException;
    public R handlePresetBalanceCommand(PersistentPresetBalanceCommand presetBalanceCommand) throws PersistenceException;
    public R handlePresetLowerLimitCommand(PersistentPresetLowerLimitCommand presetLowerLimitCommand) throws PersistenceException;
    
}
