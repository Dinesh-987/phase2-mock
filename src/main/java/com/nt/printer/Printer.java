package com.nt.printer;

import org.springframework.stereotype.Component;

@Component
public interface Printer {
	
	public void printDocument(String document);
	public void scanDocument(String document);
	public void faxDocument(String document);
}
