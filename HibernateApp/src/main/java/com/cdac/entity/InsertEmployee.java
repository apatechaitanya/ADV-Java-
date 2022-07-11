package com.cdac.entity;

import java.util.List;

import com.cdac.dao.EmployeeDao;

public class InsertEmployee {

//	public static void main1(String[] args) {
//		Employee emp = new Employee();
//		emp.setEmpno(1005);
//		emp.setName("ANiket Patil");
//		emp.setSalary(20000);
//		emp.setDateOfJoining(LocalDate.of(2020,10,10));
//		EmployeeDao dao = new EmployeeDao();
//		dao.add(emp);
		
	//}
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		Employee empp= dao.fetch(1002);
		System.out.println(empp.getName()+" "+empp.getSalary());
		
		List<Employee> list = dao.fetchAll();
		for(Employee emp:list)
			System.out.println(emp.getEmpno()+"   "+emp.getName()+"    "+emp.getSalary()+"   "+emp.getDateOfJoining());
	
		System.out.println("----------------------------");
		
		List<String> names = dao.fetchAllName();
		for(String name:names)
			System.out.println(name);
		System.out.println("----------------------------");
		List<Object[]> namesAndSalaries = dao.fetchAllNameAndSalaries();
		for (Object[] objects : namesAndSalaries) {
			System.out.println(objects[0]+" "+objects[1]);
		}
	}

	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//During this step the persistence .xml file will be read
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		
//		Employee emp = new Employee();
//		emp.setEmpno(1003);
//		emp.setName("Bhushan Patil");
//		emp.setSalary(20000);
//		emp.setDateOfJoining(LocalDate.of(2020,10,10));
//		em.persist(emp);  //it will generate query
//		tx.commit();
//		emf.close();
//	}   IN ABOVE CODE WE JUST FORM MODULARITY

}
