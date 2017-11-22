import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.grocery.stock.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ItemTask {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int ch = Integer.valueOf(bf.readLine());
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		switch(ch)
		{
		case 1 : session.beginTransaction();
			String name = bf.readLine();
			int quantity = Integer.valueOf(bf.readLine());
			double price = Double.valueOf(bf.readLine());
			Item item = new Item(name, quantity, price);
		}
	}

}
