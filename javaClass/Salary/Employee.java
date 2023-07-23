package java101.javaClass.Salary;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireyear;

    Employee(String name,int workHours,int salary, int hireyear){
        this.hireyear = hireyear;
        this.name = name;
        this.workHours = workHours;
        this.salary = salary;
    }

    void tax(){
        if (Employee.this.salary < 1000){
            System.out.println("Maaşınız : "+Employee.this.salary);
        }else {
            System.out.println("Maaşınız : "+Employee.this.salary);
            int vergi = Employee.this.salary*3/100;
            Employee.this.salary-=vergi;
            System.out.println("Maaşınızın vergili hali " +vergi);
            System.out.println("Vergi Kesilince Maaşınız " +Employee.this.salary);
        }
    }
    void bonus(){
        if (Employee.this.workHours < 40){
            System.out.println("Bonus Kazanamadınız");
        }else{
            int bonuscount;
            for (int i=40;i<Employee.this.workHours;i++){
                bonuscount = 0;
                bonuscount++;
                int bonuzscash = 30 * bonuscount;
                Employee.this.salary+=bonuzscash;
                System.out.println("40 Saatten Fazla Çalıştığınız İçin Bonus Ödül : " +bonuzscash);
                System.out.println("Bonus Ekleniyor Maasınıza "+Employee.this.salary);
            }
        }
    }
    void  raiseSalary(){
        int year = 2021;
        int netyear = year-Employee.this.hireyear;
        if (netyear < 10){
          int bonussalary = Employee.this.salary * 5/100;
           Employee.this.salary +=bonussalary;
            System.out.println("10 yıldan az sürede çalıştığınız için maas %5 zammınız " +Employee.this.salary);
        } else if (netyear < 20) {
            int bonussalary = Employee.this.salary * 10/100;
            Employee.this.salary +=bonussalary;
            System.out.println("10 yıldan az sürede çalıştığınız için maas %5 zammınız " +Employee.this.salary);
        }else if (netyear<100)
        {
            int bonussalary = Employee.this.salary * 15/100;
            Employee.this.salary +=bonussalary;
            System.out.println("10 yıldan az sürede çalıştığınız için maas %5 zammınız " +Employee.this.salary);
        }

    }
    void Yazdir(){
        tax();
        bonus();
        raiseSalary();
    }



}
