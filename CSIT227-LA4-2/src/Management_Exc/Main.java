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
        boolean flag = false;
        boolean flag2 = false;
        for(Person p : persons) {
            if(employee == p.getName()) {
                if(p instanceof Employee) {
                    flag2 = true;
                    emp = (Employee) p;
                }
                flag = true;
            }
        }

        for(Person p : persons) {
            if(manager == p.getName()) {
                if(p instanceof Manager) {
                    flag2 = true;
                    mng = (Manager) p;
                }
                flag = true;
            }
        }

        if (!flag) {
            throw new NoSuchElementException("name does not exist");
        } else if (!flag2) {
            throw new ClassCastException("name is not a/n type");
        } else {
            try {
                mng.giveRaise(emp, salary);
            } catch (IllegalArgumentException e) {
                System.out
            }

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
        return null;
    }
}
