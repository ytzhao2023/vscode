import java.util.ArrayList;
import java.util.List;

class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String zip;
    private String state;

    public Address(String addressLine1, String addressLine2, String city, String zip, String state) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    @Override
    public String toString() {
        return addressLine1 + ", " + addressLine2 + ", " + city + ", " + state + " " + zip;
    }
}

class Car {
    private String VIN;
    private String make;
    private String model;
    private int year;

    public Car(String VIN, String make, String model, int year) {
        this.VIN = VIN;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " (VIN: " + VIN + ")";
    }
}

class Person {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String socialSecurityNumber;
    private Address homeAddress;
    private Address workAddress;
    private Address localAddress;

    public Person(String firstName, String lastName, String dateOfBirth, String socialSecurityNumber,
                  Address homeAddress, Address workAddress, Address localAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.localAddress = localAddress;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (DOB: " + dateOfBirth + ", SSN: " + socialSecurityNumber + ")\n"
                + "Home Address: " + homeAddress + "\n"
                + "Work Address: " + workAddress + "\n"
                + "Local Address: " + localAddress;
    }
}

class InsurancePolicy {
    private Person policyHolder;
    private Person secondDriver;
    private double premiumAmount;
    private String startDate;
    private String endDate;
    private List<Car> cars;
    private double maxCoverageLimit;

    public InsurancePolicy(Person policyHolder, Person secondDriver, double premiumAmount, String startDate,
                           String endDate, List<Car> cars, double maxCoverageLimit) {
        this.policyHolder = policyHolder;
        this.secondDriver = secondDriver;
        this.premiumAmount = premiumAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cars = cars;
        this.maxCoverageLimit = maxCoverageLimit;
    }

    @Override
    public String toString() {
        StringBuilder policyInfo = new StringBuilder();
        policyInfo.append("Policy Holder:\n").append(policyHolder).append("\n");
        if (secondDriver != null) {
            policyInfo.append("Second Driver:\n").append(secondDriver).append("\n");
        }
        policyInfo.append("Premium Amount: $").append(premiumAmount).append("\n");
        policyInfo.append("Coverage Period: ").append(startDate).append(" to ").append(endDate).append("\n");
        policyInfo.append("Maximum Coverage Limit: $").append(maxCoverageLimit).append("\n");
        policyInfo.append("Insured Cars:\n");
        for (Car car : cars) {
            policyInfo.append(car).append("\n");
        }
        return policyInfo.toString();
    }
}

class InsurancePolicyRegister {
    private String companyName;
    private List<InsurancePolicy> policyList;

    public InsurancePolicyRegister(String companyName) {
        this.companyName = companyName;
        this.policyList = new ArrayList<>();
    }

    public void addPolicy(InsurancePolicy policy) {
        policyList.add(policy);
    }

    public void printPolicies() {
        System.out.println("Company Name: " + companyName);
        for (InsurancePolicy policy : policyList) {
            System.out.println(policy);
            System.out.println("------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Insurance Policy Register
        InsurancePolicyRegister register = new InsurancePolicyRegister("XYZ Insurance Company");

        // Create Addresses
        Address address1 = new Address("123 Main St", "", "City1", "12345", "State1");
        Address address2 = new Address("456 Elm St", "", "City2", "67890", "State2");
        Address address3 = new Address("789 Oak St", "", "City3", "98765", "State3");

        // Create Cars
        Car car1 = new Car("VIN123", "Toyota", "Camry", 2022);
        Car car2 = new Car("VIN456", "Honda", "Civic", 2021);

        // Create Persons
        Person person1 = new Person("John", "Doe", "01/15/1985", "123-45-6789", address1, address2, address3);
        Person person2 = new Person("Jane", "Smith", "05/20/1990", "987-65-4321", address2, address3, address1);

        // Create Insurance Policies
        InsurancePolicy policy1 = new InsurancePolicy(person1, null, 1200.0, "01/01/2023", "12/31/2023", List.of(car1), 50000.0);
        InsurancePolicy policy2 = new InsurancePolicy(person2, person1, 1500.0, "02/01/2023", "01/31/2024", List.of(car1, car2), 75000.0);

        // Add Policies to Register
        register.addPolicy(policy1);
        register.addPolicy(policy2);

        // Print Policies
        register.printPolicies();
    }
}
