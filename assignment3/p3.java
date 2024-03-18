class Parent {
    public void display() {
        System.out.println("This is the display method in Parent class");
    }
    
    public void display(String message) {
        System.out.println("Message from Parent class: " + message);
    }
    
    

    public void greet() {
        System.out.println("Hello from Parent class");
    }
}

class Child extends Parent {
    

    @Override
    public void display() {
        System.out.println("This is the overridden display method in Child class");
    }
    


    public void display(int number) {
        System.out.println("Number from Child class: " + number);
    }
    
 
    @Override
    public void greet() {
        System.out.println("Hello from Child class");
    }
}

public class p3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); 
        parent.display("Welcome"); 
        parent.greet(); 
        
        System.out.println(" ");
        
        Child child = new Child();
        child.display(); 
        child.display(100); 
        child.greet(); 
    }
}
