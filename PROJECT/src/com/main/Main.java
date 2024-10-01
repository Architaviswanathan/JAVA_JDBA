package com.main;

import com.watchshoparch.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    
        Scanner sc = new Scanner(System.in);
        Inventory in = new Inventory();
        Watch w=new Watch();
        in.show();
    

        Login l = new Login();
        User u = new User();
        
        while (true) {
            System.out.println("Enter username (enter 0 to exit):");
            u.setUname(sc.next());
            System.out.println("Enter the password:");
            u.setUpwd(sc.next());
            
            if (u.getUname().equals("0")) { 
                System.out.println("Exiting...");
                break;
            }

            int opt;
            try {
                if (l.check(u) == 1) { 
                    do {
                        System.out.println("1.Add 2.Update 3.Search 4.Remove 5.Show 6.Sort 7.Logout 0.Exit");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                /*Watch p = new Watch();
                                System.out.println("Enter Name, Price, Brand, and ID:");
                                p.setName(sc.next());
                                p.setAge(sc.nextInt());
                                p.setBrand(sc.next());
                                p.setId(sc.next());
                                boolean addSts=p.add(
                                in.add(p);
                                break;*/
                                System.out.println("Enter Name, Price, Brand, and ID:");
                                w.setName(sc.next());
                                w.setAge(sc.nextInt());
                                w.setBrand(sc.next());
                                w.setId(sc.next());
                                in.add(w);
                                break;
                            case 2:
                                /*System.out.println("Enter the ID to update:");
                                String id1 = sc.next();
                                in.update(id1);
                                break;*/
                                System.out.println("Enter the ID to update:");
                                String id1 = sc.next();
                                w.setId(id1);
                                System.out.println("Enter Name to Update:");
                                w.setName(sc.next());
                                in.update(w);
                                break;

                            case 3:
//                                System.out.println("Enter the ID to search:");
//                                String id = sc.next();
//                                in.Search(id);
                            	
                                
                                break;
                            case 4:
//                                System.out.println("Enter the ID to remove:");
//                                String id2 = sc.next();
//                                in.Remove(id2);
//                                break;
                            	 System.out.println("Enter the ID to remove:");
                                  String id2 = sc.next();
                                  in.Remove(id2);
                            case 5:
                                in.show();
                                break;
                            case 6:
                                System.out.println("Sort By \n1.Price\n2.Name");
                                int sortopt = sc.nextInt();
                                if (sortopt == 1) {
                                    in.sort3();
                                    in.show();
                                } else if (sortopt == 2) {
                                    in.sort2();
                                    in.show();
                                } else {
                                    System.out.println("Invalid sort option");
                                }
                                break;
                            case 7:  
                                System.out.println("Logged out");
                                break;
                            case 0: 
                                System.out.println("Exiting...");
                                sc.close();
                                return; 
                            default:
                                System.out.println("Invalid option!");
                                break;
                        }
                    } while (opt != 7); 
                } else {
                	in.show();
                }
            } catch (IncorrectPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}