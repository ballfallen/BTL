/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package test;

/**
 *
 * @author Minh Nghia
 */
public class BTL {

    public static void main(String[] args) {
       int choice=0;
       MenuQLSP qlsp = new MenuQLSP();
       do{
           System.out.println("---------------THAO TAC---------------");
           System.out.println("1.Quan ly thuc an nuoc uong");
           System.out.println("2.Quan ly thuc an nuoc uong");
           System.out.println("3.Quan ly dich vu");
           System.out.println("--------------------------------------");
           System.out.println("Hay chon mot hanh dong");
           choice=CauHinh.sc.nextInt();
           CauHinh.sc.nextLine();
           switch(choice){
            case 1: qlsp.hienThi();
            break;
            case 2:
            break;
                
           }
                   
       }while(choice!=0);
    }

   
}
