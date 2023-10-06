package Excercise_2;

import Excercise_2.Interfaces.ILocal;
import Excercise_2.dto.LocalDTO;
import Excercise_2.services.LocalImplements;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PrincipalLocal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc;
        ILocal repo = new LocalImplements();

        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Menu: \n1.Add local \n2.Search local \n3.Upgrade local \n4.See all locals \n5.Delete local \n6.Exit");
            opc = s.next();
            switch (opc){
                case "1"->{
                    System.out.println("ADD LOCAL");
                    System.out.println("Enter the local id");
                    Integer id = s.nextInt();
                    System.out.println("Enter the local name");
                    String name = s.next();
                    System.out.println("Enter the local category");
                    String category = s.next();
                    System.out.println("Enter the service hours");
                    String schedule = s.next();
                    repo.save(new LocalDTO(id,category,schedule,name));
                    System.out.println("The local has been successfully added");
                }
                case "2"->{
                    System.out.println("SEARCH LOCAL");
                    System.out.println("Enter the local id");
                    Integer id = s.nextInt();
                    boolean search = repo.findById(id)==null;
                    if(!search){
                        System.out.println(repo.findById(id));
                    } else {
                        System.out.println("Local not found");
                    }
                }
                case "3"->{
                    System.out.println("UPGRADE LOCAL");
                    System.out.println("Enter the local id to upgrade");
                    Integer id = s.nextInt();
                    System.out.println("Enter the ner name");
                    String name = s.next();
                    System.out.println("Enter the new local category");
                    String category = s.next();
                    System.out.println("Enter the new service hours");
                    String schedule = s.next();
                    repo.update(new LocalDTO(id,category,schedule,name));
                    System.out.println("Your local was successfully updated");
                }
                case "4"->{
                    System.out.println("SEE ALL LOCALS");
                    List<LocalDTO> local = repo.findAll();
                    if(!local.isEmpty()){
                        local.forEach(System.out::println);
                    } else {
                        System.out.println("There is not locals");
                    }
                }
                case "5"->{
                    System.out.println("DELETE LOCALS");
                    System.out.println("Enter the local id to delete");
                    Integer id = s.nextInt();
                    boolean search = repo.findById(id)==null;
                    if(!search){
                        System.out.println("The next local will be removed: "+repo.findById(id));
                        repo.delete(repo.findById(id));
                        System.out.println("Local successfully removed");
                    }
                }
                case "6"->{
                    opc ="6";
                }
            }
        }while(!opc.equals("6"));
    }
}
