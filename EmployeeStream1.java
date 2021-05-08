import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee1{
            private String id;
            private double sal;
            //constructor
            Employee1(String id,double sal){
                this.id = id;
                this.sal = sal;
            }

            double getSal() {
                return this.sal;
            }
            public String toString() {
                return "ID "+id+" Salary"+sal;
            }
        }
//Driver Class
        class EmployeeStream1{
            public static void main(String[] args){
                double bonus = 100;
                Employee1[] arrayofEmp ={        //Array Of Employee1 object
                        new Employee1("Jeff B",5000),
                        new Employee1("Bill G", 2000),
                        new Employee1("Mark Z",50000),
                        new Employee1("Sunder P",4000)
                };
                Stream.of(arrayofEmp);  //use of of()
                //use of stream() and terminal operation
                List<Employee1> employee1List = Arrays.asList(arrayofEmp);
                //emplist.stream().forEach(sout::)
                employee1List.stream().filter(x -> x.getSal()<5000).forEach(System.out::println);

                List newemplist = employee1List.stream().filter(x -> x.getSal()<50000).collect(Collectors.toList());
                System.out.println(newemplist);
            }
        }

