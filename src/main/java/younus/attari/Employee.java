package younus.attari;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="employee")
@SecondaryTables(@SecondaryTable(name="employee_detail",pkJoinColumns=@PrimaryKeyJoinColumn(name="empId")))
public class Employee {

	@Id
	private String empId;

	private String empDesig, empProject, empReporting;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="employeeId")
	private EmployeeDetail empDetail;

	public EmployeeDetail getEmpDetail() {
		return empDetail;
	}

	public void setEmpDetail(EmployeeDetail empDetail) {
		this.empDetail = empDetail;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Id
	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public String getEmpProject() {
		return empProject;
	}

	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}

	public String getEmpReporting() {
		return empReporting;
	}

	public void setEmpReporting(String empReporting) {
		this.empReporting = empReporting;
	}

}
