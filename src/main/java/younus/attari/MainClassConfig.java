package younus.attari;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClassConfig {

	public static void main(String[] args) {
		EmployeeDetail empDetail = new EmployeeDetail();
		empDetail.setEmpId("1");
		empDetail.setEmpFirstName("firstName");
		empDetail.setEmpMiddleName("middleName");
		empDetail.setEmpLastName("lastName");
		empDetail.setEmpDOJ("doj");
		empDetail.setEmpAddress("address");
		empDetail.setEmpHired("hired");
		empDetail.setEmpManager("manager");
		
		
		Employee emp = new Employee();
		emp.setEmpId("1");
		emp.setEmpDesig("desig");
		emp.setEmpProject("project");
		emp.setEmpReporting("reporting");
		emp.setEmpDetail(empDetail);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cascadingUnit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		
		manager.persist(emp);
		//manager.persist(empDetail);
		
		trans.commit();
		
	}
}
