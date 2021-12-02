
package com.day9;public class Product {
private int prodId;
private String prodName;
private int qty;
private int price; public Product(int prodId, String prodName, int qty, int price) {
this.prodId = prodId;
this.prodName = prodName;
this.qty = qty;
this.price = price;
} public int getProdId() {
return prodId;
} public void setProdId(int prodId) {
this.prodId = prodId;
} public String getProdName() {
return prodName;
} public void setProdName(String prodName) {
this.prodName = prodName;
} public int getQty() {
return qty;
} public void setQty(int qty) {
this.qty = qty;
} public int getPrice() {
return price;
} public void setPrice(int price) {
this.price = price;
} @Override
public String toString() {
return "Product{" +
"prodId=" + prodId +
", prodName='" + prodName + '\'' +
", qty=" + qty +
", price=" + price +
'}';
}
}


package com.day9;import com.collections.Student;import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;public class ProductMain {
static Scanner sc = new Scanner(System.in);
static List<Product> prodList = new ArrayList<Product>(); public static void main(String[] args) {
int choice = 0;
do {
System.out.println("1>Create\n 2>Search\n 3>Update\n 4>Delete\n 5>Display\n 6>Exit\n");
System.out.println("Please chose your choice");
choice = sc.nextInt();
switch (choice) {
case 1:
createProd();
break;
case 2:
int id;
System.out.println("Enter the id you want to search");
id = sc.nextInt();
searchProd(id);
break;
case 3:
updateProd();
System.out.println("Updated successfully...");
break;
case 4:
System.out.println("Enter the id you want to delete");
id = sc.nextInt();
removeProd(id);
System.out.println("Student removed successfully...");
break;
case 5:
System.out.println(prodList);
break;
case 6:
System.out.println("Program ends....");
System.exit(0);
break; }
}while(choice != -1);
System.out.println("Program ends");
} private static void createProd() {
System.out.println("Enter product id");
int prodId = sc.nextInt(); System.out.println("Enter product name");
String prodName = sc.next(); System.out.println("Enter the quantity");
int qty = sc.nextInt(); System.out.println("Enter the price");
int price = sc.nextInt(); Product newProd = new Product(prodId,prodName,qty,price); prodList.add(newProd);
} private static void searchProd(int id) {
for (int index = 0; index <prodList.size(); index++) {
Product prod = prodList.get(index);
if(prod.getProdId()==id)
System.out.println(prod);
} } private static void updateProd() {
System.out.println("Enter product id");
int prodId = sc.nextInt(); System.out.println("Enter product name");
String prodName = sc.next(); System.out.println("Enter the quantity");
int qty = sc.nextInt(); System.out.println("Enter the price");
int price = sc.nextInt();
for(int i = 0;i<prodList.size();i++){
Product p = prodList.get(i);
if(p.getProdId()==prodId){
p.setProdName(prodName);
p.setQty(qty);
p.setPrice(price); }
}
}
private static void removeProd(int id ){
for(int i = 0; i < prodList.size();i++){
Product prod = prodList.get(i);
if(prod.getProdId()==id)
prodList.remove(prod);
System.out.println("Product removed...");
} }
}


