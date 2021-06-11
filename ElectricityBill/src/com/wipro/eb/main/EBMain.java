package com.wipro.eb.main;
import com.wipro.eb.*;
import com.wipro.eb.service.ConnectionService;

import java.util.*;
public class EBMain {

	public static void main(String[] args) {
		 System.out.println (new ConnectionService().generateBill(-130,100,"Commercial"));
         System.out.println (new ConnectionService().generateBill(130,-100,"Commercial"));
         System.out.println (new ConnectionService().generateBill(30,100,"Commercial"));
         
         System.out.println (new ConnectionService().generateBill(130,100,"commercial"));
         System.out.println (new ConnectionService().generateBill(130,100,"mytype"));
         System.out.println (new ConnectionService().generateBill(130,100,""));
         
         System.out.println (new ConnectionService().generateBill(130,100,"Domestic"));
         System.out.println (new ConnectionService().generateBill(180,100,"Domestic"));
         System.out.println (new ConnectionService().generateBill(230,100,"Domestic"));
         
         System.out.println (new ConnectionService().generateBill(130,100,"Commercial"));
         System.out.println (new ConnectionService().generateBill(180,100,"Commercial"));
         System.out.println (new ConnectionService().generateBill(230,100,"Commercial"));

	}

}


