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
    public ServerFacade theServerFacade;
    public RemoveFCartCommandFacade theRemoveFCartCommandFacade;
    public ErrorDisplayFacade theErrorDisplayFacade;
    public CustomerOrderFacade theCustomerOrderFacade;
    public ArrivedOrderFacade theArrivedOrderFacade;
    public ItemFacade theItemFacade;
    public CommandCoordinatorFacade theCommandCoordinatorFacade;
    public OpenCartFacade theOpenCartFacade;
    public CustomerManagerFacade theCustomerManagerFacade;
    public ShopServiceFacade theShopServiceFacade;
    public AddArticleCommandFacade theAddArticleCommandFacade;
    public ManufacturerFacade theManufacturerFacade;
    public NewlyAddedFacade theNewlyAddedFacade;
    public ShopManagerFacade theShopManagerFacade;
    public DepositCommandFacade theDepositCommandFacade;
    public ChangeProductGroupCommandFacade theChangeProductGroupCommandFacade;
    public SendOrderFacade theSendOrderFacade;
    public StartSellingCommandFacade theStartSellingCommandFacade;
    public ShopKeeperOrderFacade theShopKeeperOrderFacade;
    public ChangeDescriptionCommandFacade theChangeDescriptionCommandFacade;
    public AcceptDeliveryCommandFacade theAcceptDeliveryCommandFacade;
    public RemovedFSaleFacade theRemovedFSaleFacade;
    public RetoureFacade theRetoureFacade;
    public AccountManagerFacade theAccountManagerFacade;
    public AccountServiceFacade theAccountServiceFacade;
    public CommonDateFacade theCommonDateFacade;
    public ShopManagerItemRangeFacade theShopManagerItemRangeFacade;
    public OrderCommandFacade theOrderCommandFacade;
    public ShopkeeperFacade theShopkeeperFacade;
    public ArticleFacade theArticleFacade;
    public OfferedFSaleFacade theOfferedFSaleFacade;
    public CartStateFacade theCartStateFacade;
    public FindArticleCommandFacade theFindArticleCommandFacade;
    public RegisterServiceFacade theRegisterServiceFacade;
    public WithdrawCommandFacade theWithdrawCommandFacade;
    public CartManagerArticleListFacade theCartManagerArticleListFacade;
    public ChangeManuDeliveryCommandFacade theChangeManuDeliveryCommandFacade;
    public CartFacade theCartFacade;
    public QuantifiedArticlesFacade theQuantifiedArticlesFacade;
    public ChangePriceCommandFacade theChangePriceCommandFacade;
    public ServiceFacade theServiceFacade;
    public SubjFacade theSubjFacade;
    public ShopkeeperServiceFacade theShopkeeperServiceFacade;
    public CartServiceFacade theCartServiceFacade;
    public DeliveryFacade theDeliveryFacade;
    public CheckOutCommandFacade theCheckOutCommandFacade;
    public ChangeAmountCommandFacade theChangeAmountCommandFacade;
    public CheckedOutFacade theCheckedOutFacade;
    public CommandExecuterFacade theCommandExecuterFacade;
    public CartManagerFacade theCartManagerFacade;

	protected ConnectionHandler() throws PersistenceException {
	}
	public void connect(String databaseName, String currentSchemaName, String user, char[] pw, boolean autoCommit) throws PersistenceException {
            this.theAccountFacade= new AccountFacade();
            this.theProductGroupFacade= new ProductGroupFacade();
            this.theCustomerServiceFacade= new CustomerServiceFacade();
            this.theServerFacade= new ServerFacade();
            this.theRemoveFCartCommandFacade= new RemoveFCartCommandFacade();
            this.theErrorDisplayFacade= new ErrorDisplayFacade();
            this.theCustomerOrderFacade= new CustomerOrderFacade();
            this.theArrivedOrderFacade= new ArrivedOrderFacade();
            this.theItemFacade= new ItemFacade();
            this.theCommandCoordinatorFacade= new CommandCoordinatorFacade();
            this.theOpenCartFacade= new OpenCartFacade();
            this.theCustomerManagerFacade= new CustomerManagerFacade();
            this.theShopServiceFacade= new ShopServiceFacade();
            this.theAddArticleCommandFacade= new AddArticleCommandFacade();
            this.theManufacturerFacade= new ManufacturerFacade();
            this.theNewlyAddedFacade= new NewlyAddedFacade();
            this.theShopManagerFacade= new ShopManagerFacade();
            this.theDepositCommandFacade= new DepositCommandFacade();
            this.theChangeProductGroupCommandFacade= new ChangeProductGroupCommandFacade();
            this.theSendOrderFacade= new SendOrderFacade();
            this.theStartSellingCommandFacade= new StartSellingCommandFacade();
            this.theShopKeeperOrderFacade= new ShopKeeperOrderFacade();
            this.theChangeDescriptionCommandFacade= new ChangeDescriptionCommandFacade();
            this.theAcceptDeliveryCommandFacade= new AcceptDeliveryCommandFacade();
            this.theRemovedFSaleFacade= new RemovedFSaleFacade();
            this.theRetoureFacade= new RetoureFacade();
            this.theAccountManagerFacade= new AccountManagerFacade();
            this.theAccountServiceFacade= new AccountServiceFacade();
            this.theCommonDateFacade= new CommonDateFacade();
            this.theShopManagerItemRangeFacade= new ShopManagerItemRangeFacade();
            this.theOrderCommandFacade= new OrderCommandFacade();
            this.theShopkeeperFacade= new ShopkeeperFacade();
            this.theArticleFacade= new ArticleFacade();
            this.theOfferedFSaleFacade= new OfferedFSaleFacade();
            this.theCartStateFacade= new CartStateFacade();
            this.theFindArticleCommandFacade= new FindArticleCommandFacade();
            this.theRegisterServiceFacade= new RegisterServiceFacade();
            this.theWithdrawCommandFacade= new WithdrawCommandFacade();
            this.theCartManagerArticleListFacade= new CartManagerArticleListFacade();
            this.theChangeManuDeliveryCommandFacade= new ChangeManuDeliveryCommandFacade();
            this.theCartFacade= new CartFacade();
            this.theQuantifiedArticlesFacade= new QuantifiedArticlesFacade();
            this.theChangePriceCommandFacade= new ChangePriceCommandFacade();
            this.theServiceFacade= new ServiceFacade();
            this.theSubjFacade= new SubjFacade();
            this.theShopkeeperServiceFacade= new ShopkeeperServiceFacade();
            this.theCartServiceFacade= new CartServiceFacade();
            this.theDeliveryFacade= new DeliveryFacade();
            this.theCheckOutCommandFacade= new CheckOutCommandFacade();
            this.theChangeAmountCommandFacade= new ChangeAmountCommandFacade();
            this.theCheckedOutFacade= new CheckedOutFacade();
            this.theCommandExecuterFacade= new CommandExecuterFacade();
            this.theCartManagerFacade= new CartManagerFacade();
	}
	public static void initializeMapsForMappedFields() throws PersistenceException {
		
	}
	public void dltObjct(PersistentRoot object) throws PersistenceException{
		object.setDltd();
	}

}

