
package model.visitor;

import persistence.*;

public interface ShopkeeperCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException, E;
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException, E;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException, E;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException, E;
    public R handleChangeRetourePercentageCommand(PersistentChangeRetourePercentageCommand changeRetourePercentageCommand) throws PersistenceException, E;
    public R handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException, E;
    public R handlePresetBalanceCommand(PersistentPresetBalanceCommand presetBalanceCommand) throws PersistenceException, E;
    public R handlePresetLowerLimitCommand(PersistentPresetLowerLimitCommand presetLowerLimitCommand) throws PersistenceException, E;
    
}
