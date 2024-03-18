import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String category;
    private double price;


    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

public class p2 {
    public static void main(String[] args) {
 
        Product product = new Product(1, "Laptop", "Electronics", 999.99);
        String filename = "product.ser";
        serializeObject(product, filename);


        Product deserializedProduct = (Product) deserializeObject(filename);
        System.out.println("Deserialized Product Details:");
        System.out.println("ID: " + deserializedProduct.getId());
        System.out.println("Name: " + deserializedProduct.getName());
        System.out.println("Category: " + deserializedProduct.getCategory());
        System.out.println("Price: $" + deserializedProduct.getPrice());
    }

    private static void serializeObject(Object object, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(object);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static Object deserializeObject(String filename) {
        Object object = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            object = objectIn.readObject();
            System.out.println("Object deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
