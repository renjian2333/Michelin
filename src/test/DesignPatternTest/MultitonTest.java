package test.DesignPatternTest;

import com.tongji.michelin.person.staff.Manager;

import java.util.Scanner;

/**
 * @author yfh
 * @classname MultitonTest
 * @description MultitonTest
 */
public class MultitonTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Multiton] Test ------------------------------------");

        System.out.println("");
        System.out.println("Manager : getDiningRoomManager() : Get dining room's manager which is single.");
        System.out.println("Manager : getOfficeManager() : Get office's manager which is single.");
        System.out.println("Manager : getCookshopManager() : Get workshop's manager which is single.");
        System.out.println("Manager : getWareHouseManager() : Get warehouse's manager which is single.");
        System.out.println("");

        System.out.println("");
        System.out.println("********************************* Multiton Test ************************************");
        System.out.println("***                 1. get instance of dining room's manager                     ***");
        System.out.println("***                 2. get instance of office's manager                          ***");
        System.out.println("***                 3. get instance of cookshop's manager                        ***");
        System.out.println("***                 4. get instance of warehouse's manager                       ***");
        System.out.println("************************************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Let's get an instance of dining room's manager for the first time: ");
                    Manager diningRoomManager1 = Manager.getDiningRoomManager();
                    System.out.println("");
                    System.out.println("Get an instance of dining room's manager manager again: ");
                    Manager diningRoomManager2 = Manager.getDiningRoomManager();
                    System.out.println("Let's check whether the two instances are the same:");
                    System.out.println("Print the result of \"diningRoomManager1 == diningRoomManager2 \", which should be true.");
                    System.out.println(diningRoomManager1 == diningRoomManager2);
                    break;
                }
                case 2: {
                    System.out.println("Let's get an instance of office's manager for the first time: ");
                    Manager officeManager1 = Manager.getOfficeManager();
                    System.out.println("");
                    System.out.println("Get an instance of office's manager again: ");
                    Manager officeManager2 = Manager.getOfficeManager();
                    System.out.println("Let's check whether the two instances are the same:");
                    System.out.println("Print the result of \"officeManager1 == officeManager2 \", which should be true.");
                    System.out.println(officeManager1 == officeManager2);
                    break;

                }
                case 3: {
                    System.out.println("Let's get an instance of workshop's manager for the first time: ");
                    Manager cookshopManager1 = Manager.getCookShopManager();
                    System.out.println("");
                    System.out.println("Get an instance of cookshop's manager again: ");
                    Manager cookshopManager2 = Manager.getCookShopManager();
                    System.out.println("Let's check whether the two instances are the same:");
                    System.out.println("Print the result of \"cookManager1 == cookshopManager2 \", which should be true.");
                    System.out.println(cookshopManager1 == cookshopManager2);
                    break;
                }
                case 4: {
                    System.out.println("Let's get an instance of warehouse's manager for the first time: ");
                    Manager warehouseManager1 = Manager.getWarehouseManager();
                    System.out.println("");
                    System.out.println("Get an instance of warehouse's manager again: ");
                    Manager warehouseManager2 = Manager.getWarehouseManager();
                    System.out.println("Let's check whether the two instances are the same:");
                    System.out.println("Print the result of \"warehouseManager1 == warehouseManager2 \", which should be true.");
                    System.out.println(warehouseManager1 == warehouseManager2);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
