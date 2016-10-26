
package model.visitor;

import persistence.*;

public interface CommonDateVisitor {
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public void handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException;
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    public void handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException;
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    
}
