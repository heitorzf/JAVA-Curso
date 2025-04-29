package Vetores.Listas.entities;

public class Employee {
    private Integer id;
    private Double salary;
    private String name;


    public Employee(Integer id , Double salary , String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getId() {
        return id;
    }
    public Double aumento(double porcentagem){
        salary = salary * (1 +porcentagem / 100);
        return salary;
    }
}
