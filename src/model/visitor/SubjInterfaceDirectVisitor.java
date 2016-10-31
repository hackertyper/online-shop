
package model.visitor;

import persistence.*;

public abstract class SubjInterfaceDirectVisitor implements SubjInterfaceVisitor {
    
    public abstract void handleAccount(PersistentAccount account) throws PersistenceException;
    
    public abstract void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException;
    
    public abstract void handleServer(PersistentServer server) throws PersistenceException;
    
    public abstract void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    
    public abstract void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    
    public abstract void handleService(PersistentService service) throws PersistenceException;
    
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException{
        this.handleService(registerService);
    }
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException{
        this.handleService(customerService);
    }
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException{
        this.handleService(shopkeeperService);
    }
    public void handleShopService(PersistentShopService shopService) throws PersistenceException{
        this.handleService(shopService);
    }
    public void handleCartService(PersistentCartService cartService) throws PersistenceException{
        this.handleService(cartService);
    }
    public void handleAccountService(PersistentAccountService accountService) throws PersistenceException{
        this.handleService(accountService);
    }
    public abstract void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException;
    
    public abstract void handleCartState(PersistentCartState cartState) throws PersistenceException;
    
    public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException{
        this.handleCartState(openCart);
    }
    public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException{
        this.handleCartState(checkedOut);
    }
    public abstract void handleSubj(PersistentSubj subj) throws PersistenceException;
    
    public abstract void handleItem(PersistentItem item) throws PersistenceException;
    
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.handleItem(productGroup);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.handleItem(article);
    }
    public abstract void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    
    public abstract void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException;
    
    public abstract void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    
    public abstract void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    
    public abstract void handleShopManager(PersistentShopManager shopManager) throws PersistenceException;
    
    public abstract void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException;
    
    public abstract void handleDelivery(PersistentDelivery delivery) throws PersistenceException;
    
    public void handleRetoure(PersistentRetoure retoure) throws PersistenceException{
        this.handleDelivery(retoure);
    }
    public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException{
        this.handleDelivery(customerOrder);
    }
    public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException{
        this.handleDelivery(shopKeeperOrder);
    }
    public abstract void handleCart(PersistentCart cart) throws PersistenceException;
    
    public abstract void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    
    public abstract void handleCartManager(PersistentCartManager cartManager) throws PersistenceException;
    
    
}
