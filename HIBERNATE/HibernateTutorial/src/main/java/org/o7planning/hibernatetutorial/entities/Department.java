package org.o7planning.hibernatetutorial.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "DEPARTMENT", uniqueConstraints = { @UniqueConstraint(columnNames = { "DEPT_NO" }) })
public class Department {

	private Integer deptId;
	private String deptNo;
	private String deptName;
	private String location;
	private Set<Employee> employees = new HashSet<Employee>();

	public Department() {

	}

	public Department(Integer deptId, String deptName, String location) {
		super();
		this.deptId = deptId;
		this.deptNo = "D"+this.deptId;
		this.deptName = deptName;
		this.location = location;
	}

	/**
	 * @return the deptId
	 */
	@Id
	@Column(name = "DEPT_ID")
	public Integer getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId
	 *            the deptId to set
	 */
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the deptNo
	 */
	@Column(name = "DEPT_NO", length = 20, nullable = false)
	public String getDeptNo() {
		return deptNo;
	}

	/**
	 * @param deptNo
	 *            the deptNo to set
	 */
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	/**
	 * @return the deptName
	 */
	@Column(name = "DEPT_NAME", nullable = false)
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName
	 *            the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the location
	 */
	@Column(name = "LOCATION")
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the employees
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees
	 *            the employees to set
	 */
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
