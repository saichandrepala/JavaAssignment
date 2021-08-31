package com.CRUDAPPJAVA.CrudApp.service;
import java.util.*;

import com.CRUDAPPJAVA.CrudApp.model.Sales;

public interface SalesService {
    public List<Sales> findAllSales();

    public Sales findSalesById(int theId);

    public Sales saveSales(Sales theSales);

    public int deleteSalesById(int theId);
}
