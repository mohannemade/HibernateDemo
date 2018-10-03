package model;

import org.hibernate.Session;

public class ProductDAO {
	private DBConfig dbc;
	private Session sess;
	public ProductDAO()
	{
		dbc=new DBConfig();
	}
	
	public void insertProduct(Product product)
	{	try 
		{
		sess=dbc.getSession();
		sess.beginTransaction();
		sess.save(product);
		sess.getTransaction().commit();
		
		}
		catch(Exception e)
		{
			sess.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	public void updateProduct(Product product)
	{	try 
		{
		sess=dbc.getSession();
		sess.beginTransaction();
		sess.update(product);
		sess.getTransaction().commit();
		
		}
		catch(Exception e)
		{
			sess.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	public void deleteProduct(Product product)
	{	try 
		{
		sess=dbc.getSession();
		sess.beginTransaction();
		sess.delete(product);
		sess.getTransaction().commit();
		
		}
		catch(Exception e)
		{
			sess.getTransaction().rollback();
			e.printStackTrace();
		}
	}
}
