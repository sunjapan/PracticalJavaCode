class NameInfo
{
  private String lastName;
  private String firstName;
  private String middleName;
  private String courtesyTitle;
  //...
}

class ContactNumbers
{
  private String homeNumber;
  private String officeNumber;
  private String mobileNumber;
  private String faxNumber;
  //...
}

class EmergencyContactInfo
{
  private NameInfo name1;
  private ContactNumbers number1;
  private NameInfo name2;
  private ContactNumbers number2;
  //...
}

class AddressInfo
{
  private String street;
  private String city;
  private String state;
  private int    zip;
  //...
}

class WorkAddressInfo
{
  private AddressInfo workAddress;
  private String mailStop;
  //...
}

class Employee
{
  private NameInfo name;
  private String jobTitle;
  private String emailAddress;
  private ContactNumbers phoneNumbers;
  private EmergencyContactInfo emergencyContact;

  private AddressInfo homeAddress;
  private WorkAddressInfo workAddress;

  public Employee(int employeeID)
  {
    //Make multiple queries to a database to gather the
    //information about an Employee. Then build all of the parts
    //of the Employee object with the data.
    name = new NameInfo(...);
    jobTitle = new String(...);
    emailAddress = new String(...);
    phoneNumbers = new ContactNumbers(...);
    emergencyContact = new EmergencyContactInfo(...);
    homeAddress = new AddressInfo(...);
    workAddress = new WorkAddressInfo(...);
    //...
  }

  public AddressInfo homeAddr()
  {
    return homeAddress;
  }
  //...
}