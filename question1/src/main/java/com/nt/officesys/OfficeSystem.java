package com.nt.officesys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.printer.Printer;
@Component
public class OfficeSystem {

    private final Printer printer;
	
	
	@Autowired
	public OfficeSystem(@Qualifier("hp")  Printer printer) {
		this.printer = printer;
	}
	 

	public void print() {
		System.out.println("The printer started");
		printer.printDocument("print");
		printer.scanDocument("Scan document");
		printer.faxDocument("fax document");
	}
		
	
}
