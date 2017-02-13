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
  private int employeeID;

  public Employee(int eid)
  {
    employeeID = eid;
  }

  public AddressInfo homeAddr()
  {
    if (homeAddress == null)
    {
      //query database based on stored employeeID and gather
      //information to create the AddressInfo object.
    }
    return homeAddress;
  }
  //...
}
