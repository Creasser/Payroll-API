package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRespository extends JpaRespository<Employee, Long> {

}