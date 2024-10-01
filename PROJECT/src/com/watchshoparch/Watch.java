package com.watchshoparch;

public class Watch {
	String Name;
    int Age;
    String Brand;
    String id;
    
  
	public String getBrand() {
	 return Brand;
}
	public String getId() {
        return id;
        }
	
  public void setId( String id) {
		this.id = id;
	}
  public void setBrand(String brand) {
	Brand = brand;
}
  public Watch(String name, int age) {
	  super();
	  Name = name;
	  Age = age;}
   public Watch() {
	   super();
	   }
 public String getName() {
	return Name;
 }
 public void setName(String name) {
  Name = name;
}
 public int getAge() {
     return Age;

	}
public void setAge(int age) {
	Age = age;
	}



	@Override
	public String toString() {
		return "Watch [Name=" + Name + ", Age=" + Age + ", Brand=" + Brand + ", id=" + id + "]";
	}
	
	public String getId1() {
		// TODO Auto-generated method stub
		return null;
	}

}
