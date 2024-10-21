package Management_Exc;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param manager the manager to give the salary
     * @param employee the employee to receive the raise
     * @param salary the salary increase to be given
     * @throws ClassCastException when manager or employee is not a manager or employee
     * @throws IllegalArgumentException when salary is invalid
     * @throws NoSuchElementException when given manager or employee does not exist in the list of persons
     */
    public static void giveRaise(List<Person> persons, String manager, String employee, double salary)  {
        Employee emp = null;
        Manager mng = null;
        boolean flag1 = false, flag2 = false;
        boolean flag_Man = false, flag_Emp = false;
        for(Person p : persons) {
            if(employee.equals(p.getName())) {
                if(p instanceof Employee) {
                    flag_Emp = true;
                    emp = (Employee) p;
                }
                flag1 = true;
            }
        }

        for(Person p : persons) {
            if(manager.equals(p.getName())) {
                if(p instanceof Manager) {
                    flag_Man = true;
                    mng = (Manager)p;
                }
                flag2 = true;
            }
        }

        if (!flag1 || !flag2) {
            if(!flag1) {
                throw new NoSuchElementException(employee + " does not exist");
            } else {
                throw new NoSuchElementException(manager + " does not exist");
            }

        } else if (!flag_Man || !flag_Emp) {
            if(!flag_Man) {
                throw new ClassCastException(manager + " is not a manager");
            } else {
                throw new ClassCastException(employee + " is not an employee");
            }
        } else {
            mng.giveRaise(emp, salary);
        }


    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param developer the developer to be assigned
     * @param manager the manager assigned to the dev
     * @throws ClassCastException when manager or developer is not a manager or employee
     * @throws NoSuchElementException when given manager or developer does not exist in the list of persons
     * @throws IllegalStateException when developer already has a manager
     */
    public static void assignPM(List<Person> persons, String developer, String manager) {
        Developer dev = null;
        Manager mng = null;
        boolean flag1 = false, flag2 = false;
        boolean flag_Man = false, flag_Emp = false;
        for(Person p : persons) {
            if(developer.equals(p.getName())) {
                if(p instanceof Developer) {
                    flag_Emp = true;
                    dev = (Developer) p;
                }
                flag1 = true;
            }
        }

        for(Person p : persons) {
            if(manager.equals(p.getName())) {
                if(p instanceof Manager) {
                    flag_Man = true;
                    mng = (Manager)p;
                }
                flag2 = true;
            }
        }

        if (!flag1 || !flag2) {
            if(!flag1) {
                throw new NoSuchElementException(developer + " does not exist");
            } else {
                throw new NoSuchElementException(manager + " does not exist");
            }
        } else if (!flag_Man || !flag_Emp) {
            if(!flag_Man) {
                throw new ClassCastException(manager + " is not a manager");
            } else {
                throw new ClassCastException(developer + " is not a developer");
            }
        } else {
            dev.setProjectManager(mng);
        }
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param customer the customer to speak to the employee
     * @param employee the employee to be spoken to
     * @return the dialogue of the customer to the employee
     * @throws IllegalArgumentException when given customer or employee is not what they are
     * @throws NoSuchElementException when given customer or employee is not in the list of persons
     */
    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        Customer cus = null;
        Employee emp = null;
        boolean flag1 = false, flag2 = false;

        boolean flag_Cus = false, flag_Emp = false;
        for(Person p : persons) {
            if(customer.equals(p.getName())) {
                if(p instanceof Customer) {
                    flag_Cus = true;
                    cus = (Customer)p;
                }
                flag2 = true;
            }
        }

        for(Person p : persons) {
            if(employee.equals(p.getName())) {
                if(p instanceof Employee) {
                    flag_Emp = true;
                    emp = (Employee)p;
                }
                flag1 = true;
            }
        }
        if (!flag1 || !flag2) {
            if (!flag1) {
                throw new NoSuchElementException(employee+ " does not exist");
            } else {
                throw new NoSuchElementException(customer + " does not exist");
            }

        } else if(!flag_Cus || !flag_Emp) {
            if(!flag_Cus) {
                throw new ClassCastException(customer + " is not a customer");
            } else {
                throw new ClassCastException(employee + " is not an employee");
            }
        } else {
            return cus.speak(emp);
        }


    }
}
