/*  I'M thankful to https://github.com/iamsomraj/Adapt-Stage-2-Java/blob/master/O%2C%20EH%20%26%20IO/1.OIJ/Product%20Analysis/Source.java because I took help for completing this code as I wass getting lot of errors.
DESCRIPTION
Problem Statement - Product Analysis
This exercise of Product Analysis is based on below two classes which are already provided. Refer and analyze these classes and do not edit them.

Product - Class used to store information about a product
ProductData - Contains a list of products as an array
Create a class ProductService with the following static methods

findNameByCode(int): String
findMaxPriceProduct(String): Product 
findNameByCode method : This method takes product code as a parameter and returns the name of the product from the list of products present in ProductData class. If no product is found for the given product, return null.

findMaxPriceProduct : This method takes product category as a parameter and returns the product object having the maximum price in the category provided. If no product is found for the given category, return null.

In the main method of class ProductAnalysis, do the following

Accept the inputs using Console as shown in the Example section
First input is choice based on which either of the static methods of ProductService class should be used
If the choice is 1, find the Name of the product by accepting the product code from user and display the name
if product is not found for given code display message "Product Not Found"
If the choice is 2, find the product having maximum price by accepting the product category from user. Display the product details as shown in Example section. case insensitive input for category can be provided by user.
If Product is not found for given category, display message "No products in given category"
If the choice is neither 1 or 2, display message "Invalid choice"
Refer Example section for Input and output format

Example
Sample Input:
1
101

Expected Output:
keyboard
1
999

Expected Output:
Product Not Found
Sample Input:
2
CLOthing

Expected Output:
105 | jeans | 2000.0
Instructions
Do not change the provided class/method names unless instructed
Ensure your code compiles without any errors/warning/deprecations
Follow best practices while coding
Avoid too many & unnecessary usage of white spaces (newline, spaces, tabs, ...), except to make the code readable
Use appropriate comments at appropriate places in your exercise, to explain the logic, rational, solutions, so that evaluator can know them
Try to retain the original code given in the exercise, to avoid any issues in compiling & running your programs
Always test the program thoroughly, before saving/submitting exercises/project
For any issues with your exercise, contact your coach
Warnings
Take care of whitespace/trailing whitespace
Trim the output and avoid special characters
Avoid printing unnecessary values other than expected/asked output


EXECUTION TIME LIMIT
10 seconds
*/
import java.util.*;
//DO NOT EDIT THIS CLASS
class Product {
	private int prodCode;
	private String prodName;
	private double price;
	private String category;
	
	public Product(int prodCode, String prodName, double price, String category) {
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.price = price;
		this.category = category;
	}

	public int getProdCode() {
		return prodCode;
	}

	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}


//DO NOT EDIT THIS CLASS
class ProductData {
	
	private static Product[] products;
				
	static {
		products = new Product[8];
		products[0] = new Product(101, "keyboard", 300, "computers");
		products[1] = new Product(102, "mouse", 600, "computers");
		products[2] = new Product(103, "monitor", 5000, "computers");
		products[3] = new Product(104, "t-shirt", 500, "clothing");
		products[4] = new Product(105, "jeans", 2000, "clothing");
		products[5] = new Product(106, "sweater", 1000, "clothing");
		products[6] = new Product(107, "doll", 500, "toys");
		products[7] = new Product(108, "car", 1000, "toys");
	}

	public static Product[] getProducts() {
		return products;
	}
}
class ProductSorter implements Comparator<Product> {
   @Override
   public int compare(Product o1, Product o2) {
      return (int) (o2.getPrice() - o1.getPrice());
   }
}

class ProductService 
{
        public static String findNameByCode(int code) {
        for (Product pdt : ProductData.getProducts()) {
        if (pdt.getProdCode() == code) {
            return pdt.getProdName();
        }
      }
      return null;
   }

   public static Product findMaxPriceProduct(String category) {

        ArrayList<Product> prdts = new ArrayList<Product>();
        for (Product pdt : ProductData.getProducts()) {
        if (pdt.getCategory().equals(category.toLowerCase())) {
            prdts.add(pdt);
        }
    }

        if (prdts.size() == 0) {
            return null;
    }

        Collections.sort(prdts, new ProductSorter());
        return prdts.get(0);
   } 
}

public class Source{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
        String res = ProductService.findNameByCode(sc.nextInt());
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("Product Not Found");
        }
    }   else if (opt == 2) {
        Product pt = ProductService.findMaxPriceProduct(sc.nextLine());
        if (pt != null) {
            System.out.println(pt.getProdCode() + " | " + pt.getProdName() + " | " + pt.getPrice());
        } else {
            System.out.println("No products in given category");
        }
    }   else {
            System.out.println("Invalid choice");
        } 
    }
}
