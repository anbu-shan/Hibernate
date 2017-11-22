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
		Item item = new Item();
				            SessionFactory sf = new Configuration().configure().buildSessionFactory();
			        Session session = sf.openSession();
			        session.beginTransaction();
			        item.setId(2);
			        item.setName("Paste");
			        session.update(item);
			        session.delete(item);
			        
			         /* Item itm = session.get(Item.class, 2);
			          System.out.print(itm.getName() + "\n");
			          System.out.print(itm.getPrice() + "\n");
			          System.out.print(itm.getQuantity() + "\n");
				      System.out.print("Enter Name :");
				      String name = bf.readLine();
				      System.out.print("Enter Quantity :");
				      int quantity = Integer.valueOf(bf.readLine());
				      System.out.print("Enter Price :");
				      double price = Double.valueOf(bf.readLine());*/

				    session.getTransaction().commit();
				
				    session.close();
				
				
			

	}

}
