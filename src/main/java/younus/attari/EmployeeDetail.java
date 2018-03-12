package younus.attari;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_detail")
public class EmployeeDetail implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private String empId, empFirstName, empLastName, empMiddleName, empAddress, empManager, empHired, empDOJ, empExpiry;
	
	@Id
	@Column(name="empId")
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Column(name="empFirstName")
	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	@Column(name="empLastName")
	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	@Column(name="empMiddleName")
	public String getEmpMiddleName() {
		return empMiddleName;
	}

	public void setEmpMiddleName(String empMiddleName) {
		this.empMiddleName = empMiddleName;
	}

	
	@Column(name="empAddress")
	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Column(name="empManager")
	public String getEmpManager() {
		return empManager;
	}

	public void setEmpManager(String empManager) {
		this.empManager = empManager;
	}

	@Column(name="empHired")
	public String getEmpHired() {
		return empHired;
	}

	public void setEmpHired(String empHired) {
		this.empHired = empHired;
	}

	@Column(name="empDOJ")
	public String getEmpDOJ() {
		return empDOJ;
	}

	public void setEmpDOJ(String empDOJ) {
		this.empDOJ = empDOJ;
	}

	@Column(name="empExpiry")
	public String getEmpExpiry() {
		return empExpiry;
	}

	public void setEmpExpiry(String empExpiry) {
		this.empExpiry = empExpiry;
	}

}
