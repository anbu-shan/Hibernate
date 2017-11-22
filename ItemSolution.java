import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.grocery.stock.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ItemSolution {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Enter the choice\n1.Save Item into DB\n2.Display total number of products");
			int ch = Integer.valueOf(bf.readLine());
			switch(ch){
			case 1 :	
		            SessionFactory sf = new Configuration().configure().buildSessionFactory();
			        Session session = sf.openSession();
			        session.beginTransaction();
				
				      System.out.print("Enter Name :");
				      String name = bf.readLine();
				      System.out.print("Enter Quantity :");
				      int quantity = Integer.valueOf(bf.readLine());
				      System.out.print("Enter Price :");
				      double price = Double.valueOf(bf.readLine());
				
				      Item item = new Item(name, quantity, price);
				
				    session.save(item);
				    session.getTransaction().commit();
				
				    session.close();
				    break;
				
				
			case 2 : System.out.println("Total : " + Item.getTotalNumberOfProducts());
			        break;
				
			
			default : break;	
			}
			
			
		}

	}

}
