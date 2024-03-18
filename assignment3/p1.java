class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;
    
        public Organization(int organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }
    
        public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
    

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ass3 {
    public static void main(String[] args) {
        Organization org1 = new Organization(1001, "ABC Corp", "123 Main Street");
        
        
        Organization org2 = null;
        try {
            org2 = (Organization) org1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        
        System.out.println("Details of org1:");
        org1.printDetails();
        
        System.out.println("\nDetails of org2 (clone of org1):");
        org2.printDetails();
    }
}
