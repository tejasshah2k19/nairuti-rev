import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductCRUD {

	public static void main(String[] args) {

		ProductCRUD p = new ProductCRUD();
//		p.addProduct();
//		p.printAllProducts();
//		p.deleteProduct(1);
		int productId = -1;
		Scanner scr = new Scanner(System.in);

		while (true) {

			System.out.println("1 For Add\n2 For Delete\n3 For Update\n4 for List\n5 For Exit\nEnter your choice");
			int choice = scr.nextInt();

			switch (choice) {
			case 1:
				p.addProduct();
				break;
			case 2:
				System.out.println("Enter productId for delete product");
				productId = scr.nextInt();
				p.deleteProduct(productId);
				break;
			case 3:
				System.out.println("Enter productId for Update product");
				productId = scr.nextInt();
				p.updateProduct(productId);
				break;
			case 4:
				p.printAllProducts();
				break;
			case 5:
				System.exit(1);
			default:
				break;
			}
		}
	}

	public void addProduct() {
		Scanner scr = new Scanner(System.in);
		String productName;
		int price;
		System.out.println("Enter productName and price");
		productName = scr.next();
		price = scr.nextInt();

		try {
			Connection con = DbConnection.openConnection();

			// query -> Statement PreparedStatement# CallableStatement

			PreparedStatement pstmt = con.prepareStatement("insert into product (productName,price) values (?,?)");

			pstmt.setString(1, productName);
			pstmt.setInt(2, price);

			// insert update delete
			int reocrds = pstmt.executeUpdate();// int
			System.out.println(reocrds + " record(s) inserted.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printAllProducts() {

		try {
			Connection con = DbConnection.openConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from product");

			// select
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {// first jump -> true
				System.out.println(
						rs.getInt("productId") + " " + rs.getString("productName") + "  " + rs.getInt("price"));
			}

		} catch (Exception e) {

		}

	}

	public void deleteProduct(int productId) {
		try {
			Connection con = DbConnection.openConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from product where productId =  ?");
			pstmt.setInt(1, productId);
			int rec = pstmt.executeUpdate();
			System.out.println(rec + " record deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateProduct(int productId) {
		Scanner scr = new Scanner(System.in);

		try {
			Connection con = DbConnection.openConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from product where productId = ? ");
			pstmt.setInt(1, productId);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("Old Values ");
				System.out.println(rs.getString("productName") + "  " + rs.getInt("price"));

				System.out.println("Enter new Value for ProductName ");
				String productName = scr.next();
				System.out.println("Enter new Value for Price");
				int price = scr.nextInt();

				pstmt = con.prepareStatement("update product set productName = ?, price =? where productId = ?");

				pstmt.setString(1, productName);
				pstmt.setInt(2, price);
				pstmt.setInt(3, productId);

				int rec = pstmt.executeUpdate();
				System.out.println(rec + " record updated....");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
