package LW_03;

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class Bicycle {
    // Data Member changed to Owner object
    private Owner owner;

    // Constructor
    public Bicycle() {
        this.owner = new Owner("Unknown", "Unknown");
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Owner myOwner = new Owner("KAMAL", "0343645645342");
        Bicycle bike = new Bicycle(myOwner);

        System.out.println("Bike Owner: " + bike.getOwner().getOwnerName());
        System.out.println("Phone: " + bike.getOwner().getPhoneNo());
    }
}