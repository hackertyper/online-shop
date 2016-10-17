
package model.visitor;

import persistence.*;

public abstract class CommandStandardVisitor implements CommandVisitor {
    
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException{
        this.standardHandling(changeProductGroupCommand);
    }
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException{
        this.standardHandling(orderCommand);
    }
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException{
        this.standardHandling(changePriceCommand);
    }
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException{
        this.standardHandling(withdrawCommand);
    }
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException{
        this.standardHandling(startSellingCommand);
    }
    public void handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException{
        this.standardHandling(addToCartCommand);
    }
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException{
        this.standardHandling(changeDescriptionCommand);
    }
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException{
        this.standardHandling(findArticleCommand);
    }
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException{
        this.standardHandling(checkOutCommand);
    }
    public void handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException{
        this.standardHandling(changeManuDeliveryCommand);
    }
    public void handlePayCommand(PersistentPayCommand payCommand) throws PersistenceException{
        this.standardHandling(payCommand);
    }
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException{
        this.standardHandling(depositCommand);
    }
    protected abstract void standardHandling(Command command) throws PersistenceException;
}
