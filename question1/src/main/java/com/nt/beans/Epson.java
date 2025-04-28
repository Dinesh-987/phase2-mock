package com.nt.beans;

import org.springframework.stereotype.Component;

import com.nt.printer.Printer;

@Component
public class Epson implements Printer {

	@Override
	public void printDocument(String document) {
		System.out.println("The document printed in colour Epson");
	}

	@Override
	public void scanDocument(String document) {
		System.out.println("The document scan completed");
	}

	@Override
	public void faxDocument(String document) {
		System.out.println("The document faxed to bengaluru branch");
		
	}

}
