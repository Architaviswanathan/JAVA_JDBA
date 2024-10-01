package com.watchshoparch;
import java.util.*;

public class Psort implements Comparator<Watch>
{
	 public int compare(Watch i, Watch j)
	 {
		 return i.getAge()>j.getAge()?1:-1;
	 }
}