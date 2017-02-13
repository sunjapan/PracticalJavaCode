class User
{
  private String userName;
  private String userID;
  private int userNode;

  User(String name, int node)
  {
    userName = name;
    userNode = node;
  }
  public void setUserName(String name)
  {
    userName = name;
  }
  public void setUserID(String userid)
  {
    userID = userid;
  }
  public void setUserNode(int node)
  {
    userNode = node;
  }
  public String userName()
  {
    return userName;
  }
}