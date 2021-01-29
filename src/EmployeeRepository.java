
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {

    Department department11=new Department(1,"Human Resourse",3321);
    Department department12=new Department(2,"IT",3452);
    Department department13=new Department(3,"Accounting and Finance",3478);
    Department department14=new Department(4,"Marketing",3542);
    Department department15=new Department(5,"Research and Development",3212);
    Department department16=new Department(6,"Purchasing",3348);
    Department department17=new Department(6,"BPO",3414);



    Employee employee1=new Employee(21,3414,"likhitha","vn","9945768888","likhitha@gmail.com","software engineer",65000,LocalDate.of(2019,4,6),department12);

    Employee employee2=new Employee(22,3414,"kushi","k","994568889","kushi@gmail.com","technical support",35000,LocalDate.of(2018,3,8),department12);


    Employee employee3=new Employee(23,3321,"kanasu","s","735678321","kanasu@gmail.com","HR",50000,LocalDate.of(2020,4,4),department11);

    Employee employee4=new Employee(24,3478,"mythili","m","5678934213","mythili@gmail.com","accountant",40000,LocalDate.of(2020,7,4),department13);

    Employee employee5=new Employee(25,3542,"monisha","mn","9945768753","monisha@gmail.com","digital marketing analyst",55000,LocalDate.of(2019,4,6),null);


    List<Employee> employees= Arrays.asList(employee1,employee2,employee3,employee4,employee5);

    public List<Employee> getEmployeesList() {
        return employees;
    }
}
