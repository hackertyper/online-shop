
package view.visitor;

import view.*;

public abstract class CustomerDeliveryStandardVisitor implements CustomerDeliveryVisitor {
    
    public void handleTestDelivery(TestDeliveryView testDelivery) throws ModelException{
        this.standardHandling(testDelivery);
    }
    public void handleOverNightDelivery(OverNightDeliveryView overNightDelivery) throws ModelException{
        this.standardHandling(overNightDelivery);
    }
    public void handleStandardDelivery(StandardDeliveryView standardDelivery) throws ModelException{
        this.standardHandling(standardDelivery);
    }
    protected abstract void standardHandling(CustomerDeliveryView customerDelivery) throws ModelException;
}
