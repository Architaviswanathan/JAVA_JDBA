package com.watchshoparch;

public class Login {

    public int check(User u) throws IncorrectPasswordException {
        if (u.getUname().equals("admin")) {
            if (u.getUpwd().equals("admin")) {
                return 1;
            } 
            else {
                throw new IncorrectPasswordException("Incorrect password for admin!!!");
            }
        } 
        else {
            return 5;
        }
    }
}
