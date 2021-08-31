package com.CRUDAPPJAVA.CrudApp.model;

import javax.persistence.*;

@Entity
@Table(name = "Sales")
public class Sales {

    @Id
   
    @Column(name = "sales_id")
    private Integer sales_id;

   

    public Sales(){

    }

    public Sales(Integer sales_id){

        this.sales_id = sales_id;

    }

    public int getSalesId(){
        return sales_id;
    }

    public void setSalesId(int sales_id){
        this.sales_id = sales_id;
    }

    
    
}
