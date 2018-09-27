package com.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;


public class PropertiesFile {
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("config.properties");

			// set the properties value
			prop.setProperty("databaseurl", "jdbc:h2:~/test");
			prop.setProperty("dbuser", "sa");
			prop.setProperty("dbpassword", "sa");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	  }
	
	}
