package persistence;

import java.util.Hashtable;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConnectionHandler {

	private static Hashtable<Thread,CommitConnectionHandler> connections = new Hashtable<Thread,CommitConnectionHandler>();

	private static ConnectionHandler theConnectionHandler;

	public static void disconnect() throws PersistenceException {
	}
	public static String openFile(File file) throws IOException {
		int size = (int) file.length();
		int chars_read = 0;
		FileReader in = new FileReader(file);
		char[] data = new char[size];
		while (in.ready()) {
			chars_read += in.read(data, chars_read, size - chars_read);
		}
		in.close();
		String raw = new String(data, 0, chars_read);
		return raw;
	}

	public static CommitConnectionHandler getNewConnection(Thread thread) throws PersistenceException {
		CommitConnectionHandler result = new CommitConnectionHandler();
		connections.put(thread, result);
		return result;
	}

	public static void releaseConnection() throws PersistenceException {
		connections.remove(Thread.currentThread());
	}

	protected static ConnectionHandler getDefaultConnectionHandler() throws PersistenceException{
		if (theConnectionHandler == null) theConnectionHandler = new ConnectionHandler();
		return theConnectionHandler;
	}
	
	public static ConnectionHandler getTheConnectionHandler() throws PersistenceException {
		ConnectionHandler result;
		CommitConnectionHandler commitHandler = connections.get(Thread.currentThread());
		if (commitHandler == null){
			if (theConnectionHandler == null) theConnectionHandler = new ConnectionHandler();
			result = theConnectionHandler;
		}else{
			result = commitHandler;
		}
		return result;
	}

	public static boolean isCommitConnectionHandler() {
		CommitConnectionHandler handler = connections.get(Thread.currentThread());
		return handler != null && handler.isInTransaction();
	}



    public AccountFacade theAccountFacade;
    public ProductGroupFacade theProductGroupFacade;
    public CustomerServiceFacade theCustomerServiceFacade;
    public OrderCommandFacade theOrderCommandFacade;
    public ServerFacade theServerFacade;
    public ShopkeeperFacade theShopkeeperFacade;
    public ErrorDisplayFacade theErrorDisplayFacade;
    public ArticleFacade theArticleFacade;
    public OfferedFSaleFacade theOfferedFSaleFacade;
    public CustomerOrderFacade theCustomerOrderFacade;
    public ArrivedOrderFacade theArrivedOrderFacade;
    public FindArticleCommandFacade theFindArticleCommandFacade;
    public RegisterServiceFacade theRegisterServiceFacade;
    public ItemFacade theItemFacade;
    public CommandCoordinatorFacade theCommandCoordinatorFacade;
    public WithdrawCommandFacade theWithdrawCommandFacade;
    public CustomerManagerFacade theCustomerManagerFacade;
    public ShopServiceFacade theShopServiceFacade;
    public ManufacturerFacade theManufacturerFacade;
    public NewlyAddedFacade theNewlyAddedFacade;
    public ShopManagerFacade theShopManagerFacade;
    public ChangeManuDeliveryCommandFacade theChangeManuDeliveryCommandFacade;
    public DepositCommandFacade theDepositCommandFacade;
    public CartFacade theCartFacade;
    public QuantifiedArticlesFacade theQuantifiedArticlesFacade;
    public ChangeProductGroupCommandFacade theChangeProductGroupCommandFacade;
    public SendOrderFacade theSendOrderFacade;
    public ChangePriceCommandFacade theChangePriceCommandFacade;
    public StartSellingCommandFacade theStartSellingCommandFacade;
    public ServiceFacade theServiceFacade;
    public ShopKeeperOrderFacade theShopKeeperOrderFacade;
    public ChangeDescriptionCommandFacade theChangeDescriptionCommandFacade;
    public AcceptDeliveryCommandFacade theAcceptDeliveryCommandFacade;
    public RemovedFSaleFacade theRemovedFSaleFacade;
    public ShopkeeperServiceFacade theShopkeeperServiceFacade;
    public RetoureFacade theRetoureFacade;
    public CartServiceFacade theCartServiceFacade;
    public AccountManagerFacade theAccountManagerFacade;
    public AddToCartCommandFacade theAddToCartCommandFacade;
    public DeliveryFacade theDeliveryFacade;
    public CheckOutCommandFacade theCheckOutCommandFacade;
    public AccountServiceFacade theAccountServiceFacade;
    public CommonDateFacade theCommonDateFacade;
    public CommandExecuterFacade theCommandExecuterFacade;
    public CartManagerFacade theCartManagerFacade;

	protected ConnectionHandler() throws PersistenceException {
	}
	public void connect(String databaseName, String currentSchemaName, String user, char[] pw, boolean autoCommit) throws PersistenceException {
            this.theAccountFacade= new AccountFacade();
            this.theProductGroupFacade= new ProductGroupFacade();
            this.theCustomerServiceFacade= new CustomerServiceFacade();
            this.theOrderCommandFacade= new OrderCommandFacade();
            this.theServerFacade= new ServerFacade();
            this.theShopkeeperFacade= new ShopkeeperFacade();
            this.theErrorDisplayFacade= new ErrorDisplayFacade();
            this.theArticleFacade= new ArticleFacade();
            this.theOfferedFSaleFacade= new OfferedFSaleFacade();
            this.theCustomerOrderFacade= new CustomerOrderFacade();
            this.theArrivedOrderFacade= new ArrivedOrderFacade();
            this.theFindArticleCommandFacade= new FindArticleCommandFacade();
            this.theRegisterServiceFacade= new RegisterServiceFacade();
            this.theItemFacade= new ItemFacade();
            this.theCommandCoordinatorFacade= new CommandCoordinatorFacade();
            this.theWithdrawCommandFacade= new WithdrawCommandFacade();
            this.theCustomerManagerFacade= new CustomerManagerFacade();
            this.theShopServiceFacade= new ShopServiceFacade();
            this.theManufacturerFacade= new ManufacturerFacade();
            this.theNewlyAddedFacade= new NewlyAddedFacade();
            this.theShopManagerFacade= new ShopManagerFacade();
            this.theChangeManuDeliveryCommandFacade= new ChangeManuDeliveryCommandFacade();
            this.theDepositCommandFacade= new DepositCommandFacade();
            this.theCartFacade= new CartFacade();
            this.theQuantifiedArticlesFacade= new QuantifiedArticlesFacade();
            this.theChangeProductGroupCommandFacade= new ChangeProductGroupCommandFacade();
            this.theSendOrderFacade= new SendOrderFacade();
            this.theChangePriceCommandFacade= new ChangePriceCommandFacade();
            this.theStartSellingCommandFacade= new StartSellingCommandFacade();
            this.theServiceFacade= new ServiceFacade();
            this.theShopKeeperOrderFacade= new ShopKeeperOrderFacade();
            this.theChangeDescriptionCommandFacade= new ChangeDescriptionCommandFacade();
            this.theAcceptDeliveryCommandFacade= new AcceptDeliveryCommandFacade();
            this.theRemovedFSaleFacade= new RemovedFSaleFacade();
            this.theShopkeeperServiceFacade= new ShopkeeperServiceFacade();
            this.theRetoureFacade= new RetoureFacade();
            this.theCartServiceFacade= new CartServiceFacade();
            this.theAccountManagerFacade= new AccountManagerFacade();
            this.theAddToCartCommandFacade= new AddToCartCommandFacade();
            this.theDeliveryFacade= new DeliveryFacade();
            this.theCheckOutCommandFacade= new CheckOutCommandFacade();
            this.theAccountServiceFacade= new AccountServiceFacade();
            this.theCommonDateFacade= new CommonDateFacade();
            this.theCommandExecuterFacade= new CommandExecuterFacade();
            this.theCartManagerFacade= new CartManagerFacade();
	}
	public static void initializeMapsForMappedFields() throws PersistenceException {
		
	}
	public void dltObjct(PersistentRoot object) throws PersistenceException{
		object.setDltd();
	}

}

