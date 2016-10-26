
package model.visitor;

import persistence.*;

public interface CommonDateExceptionVisitor<E extends model.UserException> {
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException, E;
    public void handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException, E;
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException, E;
    public void handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException, E;
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException, E;
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException, E;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException, E;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException, E;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException, E;
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException, E;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException, E;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException, E;
    
}
