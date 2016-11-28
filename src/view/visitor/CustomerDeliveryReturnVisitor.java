
package view.visitor;

import view.*;

public interface CustomerDeliveryReturnVisitor<R> {
    
    public R handleOverNightDelivery(OverNightDeliveryView overNightDelivery) throws ModelException;
    public R handleStandardDelivery(StandardDeliveryView standardDelivery) throws ModelException;
    public R handleTestDelivery(TestDeliveryView testDelivery) throws ModelException;
    
}
