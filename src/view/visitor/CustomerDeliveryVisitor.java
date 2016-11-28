
package view.visitor;

import view.*;

public interface CustomerDeliveryVisitor {
    
    public void handleOverNightDelivery(OverNightDeliveryView overNightDelivery) throws ModelException;
    public void handleStandardDelivery(StandardDeliveryView standardDelivery) throws ModelException;
    public void handleTestDelivery(TestDeliveryView testDelivery) throws ModelException;
    
}
