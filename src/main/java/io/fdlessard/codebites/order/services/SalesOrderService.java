package io.fdlessard.codebites.order.services;

import io.fdlessard.codebites.order.domain.SalesOrder;

/**
 * Created by fdlessard on 16-08-12.
 */
public interface SalesOrderService {

    void createSalesOrder(SalesOrder salesOrder);

    SalesOrder getSalesOrder(Long id);

    Iterable<SalesOrder> getAllSalesOrder();

    void deleteSalesOrder(Long id);

    SalesOrder updateSalesOrder(SalesOrder salesOrder);
}
