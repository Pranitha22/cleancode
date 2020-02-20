package com.epam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class App {
	public static Logger LOGGER=LogManager.getLogger(App.class);
	public static void main(String args[]) {
	Scanner c=new Scanner(System.in);
	LOGGER.info("enter material standard required\n1.material standard\n2.above material standarad\n3.high standard\n4.fully automated home");
	LOGGER.info("enter type of material");
	int n=c.nextInt();
	LOGGER.info("enter number of square feets");
	int squarefeet=c.nextInt();
	int result=0;
		switch(n) {
		case 1:
			result=result+(squarefeet)*1200;
			break;
		case 2:
			result=result+(squarefeet)*1500;
			break;
		case 3:
			result=result+(squarefeet)*1800;
			break;
		case 4:
			result=result+(squarefeet)*2500;
			break;
		}
	LOGGER.error("cost of house is");
	LOGGER.error(result);
	}
}
