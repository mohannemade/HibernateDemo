package com.Mohan.HibernateDemo;

import model.Product;
import model.ProductDAO;

public class App 
{
    public static void main( String[] args )
    {
    	int pId=1;
    	Product p=new Product();
    	p.setpId(pId);
    	ProductDAO pd=new ProductDAO();
    	pd.deleteProduct(p);
       	System.out.println("Successfully completed the task");
    }
}
