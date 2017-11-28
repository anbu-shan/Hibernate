package com.books;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.grocery.stock.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookCart {

	public static void main(String[] args) throws IOException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1.Add item  2.Delete item  3.Find item  4.Update  5.Total items  6.Exit");
			int ch = Integer.valueOf(bf.readLine());
			Session session = sf.openSession();

			switch (ch) {

			case 1:
				System.out.println("1.EBOOK\n2.PAPERBOOK\nEnter your choice:");
				int in = Integer.valueOf(bf.readLine());
				if (in == 1) {
					session.beginTransaction();
					System.out.println("Enter Book Title:");
					String title = bf.readLine();
					System.out.println("Enter Book Author:");
					String author = bf.readLine();
					System.out.println("Enter Book Price:");
					double price = Double.valueOf(bf.readLine());
					System.out.println("Enter Book isbn:");
					long isbn = Long.valueOf(bf.readLine());
					System.out.println("Enter Book Url:");
					String downloadUrl = bf.readLine();
					System.out.println("Enter Book size(mb):");
					int sizeInMb = Integer.valueOf(bf.readLine());
					EBook eb = new EBook(title, author, price, isbn, downloadUrl, sizeInMb);
					session.save(eb);
					session.getTransaction().commit();
					break;
				}
				if (in == 2) {
					session.beginTransaction();
					System.out.println("Enter Book Title:");
					String title = bf.readLine();
					System.out.println("Enter Book Author:");
					String author = bf.readLine();
					System.out.println("Enter Book Price:");
					double price = Double.valueOf(bf.readLine());
					System.out.println("Enter Book isbn:");
					long isbn = Long.valueOf(bf.readLine());
					System.out.println("Enter shipping weight");
					float shippingWeight = Float.valueOf(bf.readLine());
					System.out.println("Enter no. of Books in stock:");
					int inStock = Integer.valueOf(bf.readLine());
					PaperBook pb = new PaperBook(title, author, price, isbn, shippingWeight, inStock);
					session.save(pb);
					session.getTransaction().commit();
					break;
				}

			case 2:
				session.beginTransaction();
				System.out.print("1.Ebook\n2.Paperbook");
				in = Integer.valueOf(bf.readLine());
				if (in == 1) {
					System.out.print("Enter Book id:");
					int id = Integer.valueOf(bf.readLine());
					EBook eb = new EBook();
					eb = session.get(EBook.class, id);
					session.delete(eb);
				}
				if (in == 2) {
					System.out.print("Enter Book id:");
					int id = Integer.valueOf(bf.readLine());
					PaperBook pb = new PaperBook();
					pb = session.get(PaperBook.class, id);
					session.delete(pb);
				}
				session.getTransaction().commit();
				break;

			case 3:
				System.out.print("Enter item id:");
                int id = Integer.valueOf(bf.readLine());
                EBook eb = new EBook();
                PaperBook pb = new PaperBook();
                eb = session.get(EBook.class, id);
                pb = session.get(PaperBook.class, id);
                if (eb == null)
                    System.out.println("Item not found !!!!");
                else if (eb != null)
                    System.out.println("Item found !!!!");
                if (pb == null)
                    System.out.println("Item not found !!!!");
                else if (pb != null)
                    System.out.println("Item found !!!!");
                break;
             
			case 4:
				System.out.println("1.EBOOK\n2.PAPERBOOK\nEnter your choice:");
				in = Integer.valueOf(bf.readLine());
				if (in == 1) {
					session.beginTransaction();
					System.out.print("Enter Book id:");
					int id1 = Integer.valueOf(bf.readLine());
					eb = session.get(EBook.class, id1);
					System.out.println("Enter Book Title:");
					String title = bf.readLine();
					System.out.println("Enter Book Author:");
					String author = bf.readLine();
					System.out.println("Enter Book Price:");
					double price = Double.valueOf(bf.readLine());
					System.out.println("Enter Book isbn:");
					long isbn = Long.valueOf(bf.readLine());
					System.out.println("Enter Book Url:");
					String downloadUrl = bf.readLine();
					System.out.println("Enter Book size(mb):");
					int sizeInMb = Integer.valueOf(bf.readLine());
					eb.setAuthor(title);
					eb.setTitle(title);
					eb.setPrice(price);
					eb.setPrice(price);
					eb.setIsbn(isbn);
					eb.setDownloadUrl(downloadUrl);
					eb.setSizeInMb(sizeInMb);
					session.update(eb);
					session.getTransaction().commit();
					break;
				}
				if (in == 2) {
					session.beginTransaction();
					System.out.println("Enter Book Title:");
					String title = bf.readLine();
					System.out.println("Enter Book Author:");
					String author = bf.readLine();
					System.out.println("Enter Book Price:");
					double price = Double.valueOf(bf.readLine());
					System.out.println("Enter Book isbn:");
					long isbn = Long.valueOf(bf.readLine());
					System.out.println("Enter shipping weight");
					float shippingWeight = Float.valueOf(bf.readLine());
					System.out.println("Enter no. of Books in stock:");
					int inStock = Integer.valueOf(bf.readLine());
					pb = new PaperBook();
					pb.setAuthor(author);
					pb.setTitle(title);
					pb.setPrice(price);
					pb.setPrice(price);
					pb.setIsbn(isbn);
					pb.setShippingWeight(shippingWeight);
					pb.setInStock(inStock);
					session.update(pb);
					session.getTransaction().commit();
					break;
				}

			}

		}
	}

}