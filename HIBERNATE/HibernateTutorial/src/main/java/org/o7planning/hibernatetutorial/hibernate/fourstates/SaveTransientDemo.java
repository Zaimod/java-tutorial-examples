package org.o7planning.hibernatetutorial.hibernate.fourstates;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.o7planning.hibernatetutorial.hibernate.DataUtils;
import org.o7planning.hibernatetutorial.hibernate.HibernateUtils;
import org.o7planning.hibernatetutorial.entities.Employee;
import org.o7planning.hibernatetutorial.entities.Timekeeper;


public class SaveTransientDemo {
	private static DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	
	private static Timekeeper persist_Transient(Session session, Employee emp) {
		//See configuration of timekeeperId:
		//@GeneratedValue(generator = "uuid")
		//@GenericGenerator(name = "uuid", strategy = "uuid2" )
		// Create an Object, Transitent state.
		Timekeeper tk = new Timekeeper();
		tk.setEmployee(emp);
		tk.setInOut(Timekeeper.IN);
		tk.setDateTime(new Date());
	}
}
