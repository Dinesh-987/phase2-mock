package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.PrinterConfig;
import com.nt.officesys.OfficeSystem;


public class App {
    public static void main(String[] args) {
    	ApplicationContext context= new AnnotationConfigApplicationContext(PrinterConfig.class);
    	OfficeSystem os= context.getBean(OfficeSystem.class);
    	os.print();
    }
}
