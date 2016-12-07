package view.objects;


import view.ModelException;

import viewClient.ExceptionAndEventHandler;
import viewClient.ConnectionMaster;
import viewClient.ConnectionIndex;

import common.RPCConstantsAndServices;
import common.ProxiInformation;

import java.util.Vector;
import java.util.Iterator;

import javax.swing.event.TableModelListener;
import javax.swing.tree.TreePath;

abstract class ProxiFactory {
	  abstract ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey);
}

public abstract class ViewProxi extends ViewRoot {

  @SuppressWarnings("unchecked")
  public static <T> Vector<T> getProxiVector(Vector<String> hashtableVector, ExceptionAndEventHandler connectionKey) throws ModelException {
	Vector<T> result = new Vector<T>();
    Iterator<String> entries = hashtableVector.iterator();
    while (entries.hasNext()){
      String current = (String)entries.next();
      ProxiInformation currentProxiInformation = RPCConstantsAndServices.createProxiInformation(current);
      ViewProxi currentProxi = ViewProxi.createProxi(currentProxiInformation, connectionKey);
      currentProxi.setToString(currentProxiInformation.getToString());
      currentProxi.setIconInfo(currentProxiInformation.getIconInfo());
      currentProxi.setLeafInfo(currentProxiInformation.getLeafInfo());
      
      result.add((T) currentProxi);
    }
    return result;
  }
    
  public static ViewProxi createProxi(ProxiInformation proxi, ExceptionAndEventHandler connectionKey) throws ModelException{
	  ViewProxi result = createProxi(proxi.getObjectId(), proxi.getClassId(), connectionKey);
	  if (proxi.isDecorator()){
		  ViewDecoratorProxi resultAsDecorator = (ViewDecoratorProxi) result;
		  resultAsDecorator.setDecorateeId(proxi.getDecorateeObjectId());
		  resultAsDecorator.setDecorateeClassId(proxi.getDecorateeClassId());
	  }
	  result.setIconInfo(proxi.getIconInfo());
	  result.setLeafInfo(proxi.getLeafInfo());
	  return result;
  }

  private static ProxiFactory [] proxiFactories;
	
  private static ProxiFactory [] getTheProxiFactories(){
	if (proxiFactories == null){
		proxiFactories = new ProxiFactory [169];
        proxiFactories[98] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new AccountProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[1] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ProductGroupProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[2] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[4] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ServerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[7] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ErrorDisplayProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[10] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerOrderProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[127] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OverNightDeliveryProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[128] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new StandardDeliveryProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[11] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ArrivedOrderProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[115] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OpenCartProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[83] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[84] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ShopServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[18] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ManufacturerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[19] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new NewlyAddedProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[85] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ShopManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[25] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new SendOrderProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[29] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ShopKeeperOrderProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[130] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new TestDeliveryProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[31] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new RemovedFSaleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[33] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new RetoureProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[87] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new AccountManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[122] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OrderServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[88] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new AccountServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[123] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OrderManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[137] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ArticleWrapperProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[6] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ShopkeeperProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[8] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ArticleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[9] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OfferedFSaleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[139] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new PreOrderProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[14] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new RegisterServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[22] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CartProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[23] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new QuantifiedArticlesProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[32] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ShopkeeperServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[86] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CartServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[117] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CheckedOutProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[89] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CartManagerProxi(objectId, classId, connectionKey);
            }
        };
	}
	return proxiFactories;
  }
	
  public static ViewProxi createProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) throws ModelException {
	if (classId == 0) return null;
    int index = (int) classId;
	if (index < 0) index = index * -1;
    index = index - 101;
    if (index > getTheProxiFactories().length) throw new ModelException("Unknown class :" + Long.toString(classId),0);
    ProxiFactory factory = getTheProxiFactories()[index];
    if (factory == null)  throw new ModelException("Unknown class :" + Long.toString(classId),0);
    ViewProxi result =  factory.create(objectId, classId, connectionKey);
    return result;
  }


	protected ViewObject object;

	private ExceptionAndEventHandler connectionKey;

	private boolean expanded;
	

	protected ViewProxi(long id, long classId, ExceptionAndEventHandler connectionKey) {
		super(id, classId);
		this.connectionKey = connectionKey;
		this.expanded = false;
	}
	public void setExpanded(boolean b) {
		this.expanded = true;
	}

	public boolean expand(){
		if (!expanded){
			try {
				this.getRemote(new java.util.Vector<ViewRoot>(), true);
			} catch (ModelException e) {
				this.setToString(e.getMessage());
				return !(e.getMessage().equals(RPCConstantsAndServices.ObjectNotAvailableErrorMessage) &&
						 e.getErrorNumber() == RPCConstantsAndServices.ObjectNotAvailableErrorNo);
			}
			this.expanded = true;
		}
		return true;
	}

	public ViewObject getTheObject() throws ModelException {
		if (this.object == null)
			getRemote(new java.util.Vector<ViewRoot>(), false);
		return this.object;
	}

	public void setObject(ViewObject object) {
		this.object = object;
	}

	protected ConnectionMaster getConnection() {
		return ConnectionIndex.getTheConnectionIndex().getConnection(this.connectionKey);
	}


	@SuppressWarnings("unchecked")
	public void getRemote(java.util.Vector<ViewRoot> context, boolean forTreeView) throws ModelException {
        ConnectionMaster connection = this.getConnection();
        java.util.HashMap<Object,Object> table = connection.getObject(getRemoteDepth(), context, forTreeView, this);
        if(((Boolean)table.get("?OK?")).booleanValue()) {
            java.util.HashMap<String,Object> resultTable = (java.util.HashMap<String,Object>)table.get(RPCConstantsAndServices.ResultFieldName);
            ViewProxi.resolveReferences(resultTable, this.connectionKey);
            this.setObject((ViewObject) resultTable.get(RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId())));
        }else{
            throw new ModelException((String)table.get("?Message?"), ((Integer)table.get("?ExceptionNumber?")).intValue());
        }
    }
	@SuppressWarnings("unchecked")
	public static void resolveReferences(java.util.HashMap<String, Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        for (String current : resultTable.keySet()) {
			ProxiInformation info = RPCConstantsAndServices.createProxiInformation(current);
			ViewProxi proxi = ViewProxi.createProxi(info, connectionKey);
			resultTable.put(current, proxi.getRemoteObject((java.util.HashMap<String,Object>) resultTable.get(current), connectionKey));
		}
        for (String current : resultTable.keySet()) {
			ViewObject currentEntry = (ViewObject) resultTable.get(current);
			if (currentEntry != null)currentEntry.resolveProxies(resultTable);
		}    	
        for (String current : resultTable.keySet()) {
			ViewObject currentEntry = (ViewObject) resultTable.get(current);
			if (currentEntry != null)currentEntry.sortSetValuedFields();
		}    	
    }

	abstract protected AbstractViewRoot getRemoteObject(java.util.HashMap<String, Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException;

	public String toString() {
		try {
			return this.object == null ? this.toString : this.getTheObject().toString();
		} catch (ModelException me) {
			return me.getMessage();
		}
	}

	public void valueForPathChanged(TreePath path, Object newValue) {
		try {
			this.getTheObject().valueForPathChanged(path, newValue);
		} catch (ModelException e) {
			return;
		}		
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public int getRowCount() {
		try {
			return this.getTheObject().getRowCount();
		} catch (ModelException e) {
			return 0;
		}
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		try {
			return this.getTheObject().getValueAt(rowIndex, columnIndex);
		} catch (ModelException e) {
			return e.getMessage();
		}
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		try {
			return this.getTheObject().isCellEditable(rowIndex, columnIndex);
		} catch (ModelException e) {
			return false;
		}
	}

	public boolean isRowEditable(int index) {
		try {
			return this.getTheObject().isRowEditable(index);
		} catch (ModelException e) {
			return false;
		}
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		try {
			this.getTheObject().setValueAt(aValue, rowIndex, columnIndex);
		} catch (ModelException e) {
			return;
		}
	}

	public void addTableModelListener(TableModelListener l) {
		try {
			this.getTheObject().addTableModelListener(l);
		} catch (ModelException e) {
			throw new Error(e.getMessage());
		}
	}

	public void removeTableModelListener(TableModelListener l) {
		try {
			this.getTheObject().removeTableModelListener(l);
		} catch (ModelException e) {
			throw new Error(e.getMessage());
		}
	}
	public String createProxiInformation() {
		return RPCConstantsAndServices.createFromClientProxiRepresentation(this.getClassId(), this.getId(), this.getRemoteDepth());
	}

}
