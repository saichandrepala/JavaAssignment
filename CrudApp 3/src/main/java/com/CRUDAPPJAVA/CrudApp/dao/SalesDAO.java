package com.CRUDAPPJAVA.CrudApp.dao;

import java.util.*;

import com.CRUDAPPJAVA.CrudApp.model.Sales;

public interface SalesDAO {
    List<Sales> getAllSales();

    Sales findSalesById(int theId);

    Sales saveSales(Sales theSales);

    void deleteSalesById(int theId);
}
