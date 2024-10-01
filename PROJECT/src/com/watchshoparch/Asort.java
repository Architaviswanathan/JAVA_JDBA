package com.watchshoparch;
import java.util.*;

public class Asort implements Comparator<Watch> {

			public int compare(Watch i, Watch j)
			 {
				 return (i.getName()).compareTo(j.getName());
			 }
			
			

		
	}

