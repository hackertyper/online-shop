
package model.visitor;

import persistence.*;

public abstract class AnythingStandardVisitor implements AnythingVisitor {
    
    public void handleAccount(PersistentAccount account) throws PersistenceException{
        this.standardHandling(account);
    }
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException{
        this.standardHandling(customerService);
    }
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException{
        this.standardHandling(orderCommand);
    }
    public void handleServer(PersistentServer server) throws PersistenceException{
        this.standardHandling(server);
    }
    public void handleCustomer(PersistentCustomer customer) throws PersistenceException{
        this.standardHandling(customer);
    }
    public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException{
        this.standardHandling(shopkeeper);
    }
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException{
        this.standardHandling(errorDisplay);
    }
    public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException{
        this.standardHandling(offeredFSale);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException{
        this.standardHandling(customerOrder);
    }
    public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException{
        this.standardHandling(arrivedOrder);
    }
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException{
        this.standardHandling(findArticleCommand);
    }
    public void handlePayCommand(PersistentPayCommand payCommand) throws PersistenceException{
        this.standardHandling(payCommand);
    }
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException{
        this.standardHandling(registerService);
    }
    public void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException{
        this.standardHandling(commandCoordinator);
    }
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException{
        this.standardHandling(withdrawCommand);
    }
    public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException{
        this.standardHandling(manufacturer);
    }
    public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException{
        this.standardHandling(newlyAdded);
    }
    public void handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException{
        this.standardHandling(changeManuDeliveryCommand);
    }
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException{
        this.standardHandling(depositCommand);
    }
    public void handleCart(PersistentCart cart) throws PersistenceException{
        this.standardHandling(cart);
    }
    public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException{
        this.standardHandling(quantifiedArticles);
    }
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException{
        this.standardHandling(changeProductGroupCommand);
    }
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException{
        this.standardHandling(sendOrder);
    }
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException{
        this.standardHandling(changePriceCommand);
    }
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException{
        this.standardHandling(startSellingCommand);
    }
    public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException{
        this.standardHandling(shopKeeperOrder);
    }
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException{
        this.standardHandling(changeDescriptionCommand);
    }
    public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException{
        this.standardHandling(removedFSale);
    }
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException{
        this.standardHandling(shopkeeperService);
    }
    public void handleRetoure(PersistentRetoure retoure) throws PersistenceException{
        this.standardHandling(retoure);
    }
    public void handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException{
        this.standardHandling(addToCartCommand);
    }
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException{
        this.standardHandling(checkOutCommand);
    }
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException{
        this.standardHandling(commonDate);
    }
    public void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException{
        this.standardHandling(commandExecuter);
    }
    protected abstract void standardHandling(Anything anything) throws PersistenceException;
}
