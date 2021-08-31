package com.CRUDAPPJAVA.CrudApp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.CRUDAPPJAVA.CrudApp.model.Sales;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SalesDAOJpaImpl implements SalesDAO{

    private EntityManager entityManager;

    @Autowired
    public SalesDAOJpaImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Sales> getAllSales() {
        Query theQuery = (Query) entityManager.createQuery("from Sales");
        List<Sales> sales = theQuery.getResultList();

        return sales;
    }

    @Override
    public Sales findSalesById(int theId) {
        Sales theSales = entityManager.find(Sales.class, theId);
        return theSales;
    }

    @Override
    public Sales saveSales(Sales theSales) {
        Sales dbSales = entityManager.merge(theSales);
        theSales.setSalesId(dbSales.getSalesId());
        return theSales;
    }

    @Override
    public void deleteSalesById(int theId) {
        Query theQuery = (Query)entityManager.createQuery("delete from Sales where id=:salesId");
        theQuery.setParameter("salesId", theId);
        theQuery.executeUpdate();
        
    }
    
}
