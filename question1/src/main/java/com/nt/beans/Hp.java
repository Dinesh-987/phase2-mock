package com.nt.beans;

import org.springframework.stereotype.Component;

import com.nt.printer.Printer;

@Component

public class Hp implements Printer{

	@Override
	public void printDocument(String document) {
		System.out.println("The document printed clear Hp");
	}

	@Override
	public void scanDocument(String document) {
		System.out.println("The document scanned completed");
	}

	@Override
	public void faxDocument(String document) {
		System.out.println("The document faxed to Bengaluru branch");
	}

}
