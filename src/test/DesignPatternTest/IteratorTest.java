package test.DesignPatternTest;

import com.tongji.michelin.person.Person;
import com.tongji.michelin.person.staff.worker.OfficeWorker;
import com.tongji.michelin.person.staff.worker.Worker;
import com.tongji.michelin.person.staff.worker.CookShopWorker;
import com.tongji.michelin.scene.staffarea.Office;
import com.tongji.michelin.scene.staffarea.WorkerIterator.WorkerListIterator;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.ChineseCookshop;

import java.util.Scanner;

/**
 * @author zqr
 * @classname IteratorTest
 * @description test for iterator pattern
 */
public class IteratorTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Iterator] Test ---------------------------------");
        System.out.println("");
        System.out.println("StaffArea:getIterator() : Gets an iterator for an employee created from");
        System.out.println("an aggregate class at the workplace");
        System.out.println("WorkerListIterator:first(): get the first worker.");
        System.out.println("WorkerListIterator:next(): get next worker.");
        System.out.println("WorkerListIterator:hasNext(): to judge whether it has next one.");
        System.out.println("");

        System.out.println("*********************************** Iterator Test ***********************************");
        System.out.println("***                                                                               ***");
        System.out.println("***       0. exit                                                                 ***");
        System.out.println("***       1. Get the first workers in the ChineseCookshop                         ***");
        System.out.println("***       2. Traverse all staff of the staffs in the office                       ***");
        System.out.println("***                                                                               ***");
        System.out.println("*************************************************************************************");

        Scanner input = new Scanner(System.in);
        // create a chineseCook workshop and add 3 workers.
        ChineseCookshop chineseCookshop = new ChineseCookshop();
        chineseCookshop.addWorker(new CookShopWorker("Anna", 22, Person.Sex.FEMALE, 30, chineseCookshop));
        chineseCookshop.addWorker(new CookShopWorker("Billie", 19, Person.Sex.FEMALE, 40, chineseCookshop));
        chineseCookshop.addWorker(new CookShopWorker("Justin", 24, Person.Sex.MALE, 80, chineseCookshop));
        WorkerListIterator workerIterator = new WorkerListIterator();
        workerIterator.setWorkerList(chineseCookshop.getWorkerList());
        Worker firstStaff;

        // create an office and add 3 staffs.
        Office office = new Office();
        office.addWorker(new OfficeWorker("Brian", 20, Person.Sex.MALE, 0, office));
        office.addWorker(new OfficeWorker("Kerr", 20, Person.Sex.FEMALE, 500, office));
        office.addWorker(new OfficeWorker("Young", 20, Person.Sex.MALE, 1, office));
        WorkerListIterator staffIterator = new WorkerListIterator();
        staffIterator.setWorkerList(office.getWorkerList());
        Worker currentStaff;
        boolean flag = true;
        int op;
        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    firstStaff = workerIterator.first();
                    System.out.println(" name: " + firstStaff.getName() + " sex: " + firstStaff.getSex() + " age: "
                            + firstStaff.getAge() + " salary: " + firstStaff.getSalary()  + " department: " + firstStaff.getDepartment());
                    break;
                }
                case 2: {
                    currentStaff = staffIterator.first();
                    while (true) {
                        System.out.println("name: " + currentStaff.getName() + " sex: " + currentStaff.getSex() + " age: "
                                + currentStaff.getAge() + " salary: " + currentStaff.getSalary() + " department: " + currentStaff.getDepartment());
                        if (staffIterator.hasNext()) {
                            currentStaff = staffIterator.next();
                        } else {
                            break;
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
