package com.watchshoparch;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Inventory {

	 List<Watch>list=new ArrayList();

	 Scanner scan=new Scanner(System.in);
	  Connection con;
	  Statement stmt;
	  ResultSet rs;
	  String qry=null;
	  
	 
	

     public void add( Watch p) {
         
//    	 list.add(p);
//
//    	 System.out.println("Sucessfully added");
    	 
    	 int count=0;
    	 try {
    		 Dbutil db =new Dbutil();
    		 Connection con=db.getDBConnection();
    		 stmt=con.createStatement();
    		qry=("insert into watch(Name,Age,Brand,Id) values('"+p.getName()+"','"+p.getAge()+"','"+p.getBrand()+"','"+p.getId()+"')");
    		count=stmt.executeUpdate(qry);
    		
    	 }
    	 catch(Exception ex)
    	 {
    		 System.out.println(ex.getMessage());
    	 }

 	 System.out.println("Sucessfully added");
     }

     public void show()

 	{
    	 try {
    		 Dbutil db =new Dbutil();
    		 con=db.getDBConnection();
    		 stmt=con.createStatement();
    		 rs=stmt.executeQuery("select * from watch");
    		 while(rs.next())
    			 System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4));
    		 }
    	 catch(Exception ex)
    	 {
    		 System.out.println(ex.getMessage());
    	 }
 	}
    	 /*if(list.isEmpty())
    		 System.out.println("no products");
    	 else

 		System.out.println(list);

 	}*/
     public void update(Watch w) {
    	 //Watch w=new Watch();
//         boolean found = false;
//         for (Watch watch : list) {
//             if (id.equals(watch.getId())) {
//                 found = true;
//                 System.out.println("Enter the field you want to update (Name/Age/Brand):");
//                 String field = scan.next();
//                 switch (field.toLowerCase()) {
//                     case "name":
//                         System.out.println("Enter new name:");
//                         watch.setName(scan.next());
//                         break;
//                     case "age":
//                         System.out.println("Enter new age:");
//                         watch.setAge(scan.nextInt());
//                         break;
//                     case "brand":
//                         System.out.println("Enter new brand:");
//                         watch.setBrand(scan.next());
//                         break;
//                     default:
//                         System.out.println("Invalid field");
//                         return;
//                 }
//                 System.out.println("Updated successfully");
//                 break;
//             }
//         }
//         if (!found) {
//             System.out.println("Watch with ID " + id + " not found");
//         }
    	 try {
    		 
    		 Dbutil db =new Dbutil();
    		con=db.getDBConnection();
    		  stmt=con.createStatement();
//    		  qry = "UPDATE watch SET Name='" + w.getName() + "' WHERE id='" + w.getId() + "'";
    		  stmt.executeUpdate("update watch set name='"+w.getName()+"'where id='"+w.getId()+"'");
             //stmt.executeUpdate(qry);
    	 }
    	
    		 catch(Exception ex)
        	 {
        		 System.out.println(ex.getMessage());
        	 }
    	 System.out.println("Updated successfully");
     }
     public void sort3() {
 		Collections.sort(list,new Psort());
 	}
      public void sort2() {
  		Collections.sort(list,new Asort());
  	}
      public void Search(String id)

  	{

  		for(int i=0;i<list.size();i++)

  		{
  			if(id.equals(list.get(i).getId())) {
  				System.out.println(list.get(i));
  			}
  			else
  				System.out.println("Null");

  		}

  	}
      public void Remove(String id)

   	{
    	  Watch w=new Watch();
//        int flag=0;
//   		for(int i=0;i<list.size();i++)
//
//   		{
//   			if(id.equals(list.get(i).getId())) {
//   				 list.remove(i);
//   				System.out.println("removed sucessfully");
//   				 flag=1;}
//   			
//   		}
//   		if(flag!=1) {
//   			System.out.println("id not found");
//   		}
//   		
    	  try {
    		  Dbutil db =new Dbutil();
    		  con=db.getDBConnection();
    		  stmt=con.createStatement();
    		  qry= "delete from watch where id="+id;
    		  stmt.executeUpdate(qry);
    	  }
    	  catch(Exception ex)
     	 {
     		 System.out.println(ex.getMessage());
     	 }
 	 System.out.println("Updated successfully");

   	}
		public String generateId(Watch wat)

		{

			String bid=wat.getName().toUpperCase().substring(0,2);

			String s=bid+wat.getBrand().toUpperCase().substring(0,2);

			return s;

		}

		
		
}


