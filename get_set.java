package my_comp;
class Myemployee
{
	  private int id;
      private String name;
      public void setname(String n)
      {
    	  name=n;
      }
      public String getname()
      {
    	  return name;
      }
      public void setid(int i)
      {
    	  id=i;
      }
      public int getid()
      {
    	  return id;
      }
}
public class get_set {
	public static void main(String[] args) {
		Myemployee nishant =new Myemployee();
		nishant.setname("Nishantpatel");
		nishant.setid(45);
		System.out.println("id:" +nishant.getid());
		System.out.println("name:"+nishant.getname());
		
		
	}

}
