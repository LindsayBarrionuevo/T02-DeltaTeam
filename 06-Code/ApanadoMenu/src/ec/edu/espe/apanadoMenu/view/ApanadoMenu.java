/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.apanadoMenu.view;

import ec.edu.espe.apanadoMenu.model.Customer;
import java.util.Scanner;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class ApanadoMenu {
    public static void main (String[] args){
        int choiceOfTheMenu=0;
        int choiceOfTheMenuOrder=0;
        Customer client ;
        client =  new Customer();
        Scanner imputEscan = new Scanner (System.in);
        do{
            principalMenu();
            choiceOfTheMenu = imputEscan.nextInt();
            switch (choiceOfTheMenu){
                case 1:{
                    menuFood();
                    break;
                }
                case 2:{
                    do{
                        menuFood();
                        System.out.print("Please, Choose an option: ");
                        choiceOfTheMenu = imputEscan.nextInt();
                        switch(choiceOfTheMenu){
                            case 1:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Salchipapa+Bebida                          |$2.00");
                                    System.out.println("2. Papipollo                                  |$2.50");
                                    System.out.println("3. Salchipapa+Huevo                           |$2.30");
                                    System.out.println("4. Porcion de Papas Fritas                    |$1.50");
                                    System.out.println("5. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            client.setOrder("Salchipapa+Bebida");
                                            client.setOrderCost((float) 2);
                                            break;
                                        }
                                        case 2:{
                                            client.setOrder("Papipollo");
                                            client.setOrderCost((float) 2.3);
                                            break;
                                        }
                                        case 3:{
                                            client.setOrder("Salchipapa+Huevo");
                                            client.setOrderCost((float) 2.3);
                                            break;
                                        }   
                                        case 4:{
                                            client.setOrder("Porcion de Papas Fritas");
                                            client.setOrderCost((float) 1.5);
                                            break;
                                        }
                                        case 5:{
                                            break;
                                        }                                        
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=5);
                                break;
                            }
                            case 2:{
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Precio de Super Completo                    |$4.50");
                                System.out.println("Contiene:");
                                System.out.println("Papas Fritas+pollo+huevo+salchicha+bebida");
                                client.setOrder("Super Completo");
                                System.out.println("-----------------------------------------------------");
                                client.setOrderCost((float) 4.5);
                                break;
                            }
                            case 3:{
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Pollo o Carne a la Plancha         |$4.50");
                                System.out.println("Contiene:");
                                System.out.println("Pollo o Carne");
                                System.out.println("Arroz+Menestra+Papasfritas+Ensalada+bebida");
                                client.setOrder("Pollo o Carne a la Plancha");
                                System.out.println("-----------------------------------------------------");
                                client.setOrderCost((float) 4.5);
                                break;
                            }
                            case 4:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Apanado de Pollo o Carne                  |$4.50");
                                    System.out.println("Contiene:");
                                    System.out.println("Pollo o Carne");
                                    System.out.println("Arroz+Menestra+Papasfritas+Ensalada+bebida");
                                    System.out.println("2. Medio Apanado de Pollo                     |$2.50");
                                    System.out.println("Contiene:");
                                    System.out.println("Pollo+Papas fritas+Ensalada+bebida");
                                    System.out.println("3. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            client.setOrder("Apanado de Pollo o Carne");
                                            client.setOrderCost((float) 4.5);
                                            break;
                                        }
                                        case 2:{
                                            client.setOrder("Medio Apanado de Pollo");
                                            client.setOrderCost((float) 2.5);
                                            break;
                                        }
                                        case 3:{
                                            break;
                                        }   
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=3);
                                break;
                            }
                            case 5:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Completa                                   |$3.00");
                                    System.out.println("Contiene:");
                                    System.out.println("Hamburguesa+Huevo+Queso+Papas Fritas+Bebida");
                                    System.out.println("2. Simple                                     |$2.50");
                                    System.out.println("Contiene:");
                                    System.out.println("Hamburguesa Simple+Papas Fritas+Bebida");
                                    System.out.println("3. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            client.setOrder("Hamburguesa Completa");
                                            client.setOrderCost((float) 3);
                                            break;
                                        }
                                        case 2:{
                                            client.setOrder("Hamburguesa Simple");
                                            client.setOrderCost((float) 2.5);
                                            break;
                                        }
                                        case 3:{
                                            break;
                                        }   
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=3);                                
                                break;
                            }
                            case 6:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Churrasco de Pollo o Carne                 |$4.90");
                                    System.out.println("Contiene:");
                                    System.out.println("Pollo o Carne");
                                    System.out.println("PapasFritas+2Huevos+Ensalada+Bebida");
                                    System.out.println("2. Medio Churrasco+Bebida                     |$3.00");
                                    System.out.println("3. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            client.setOrder("Churrasco de Pollo o Carne");
                                            client.setOrderCost((float) 4.9);
                                            break;
                                        }
                                        case 2:{
                                            client.setOrder("Medio Churrasco+Bebida");
                                            client.setOrderCost((float) 3);
                                            break;
                                        }
                                        case 3:{
                                            break;
                                        }   
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=3);                                   
                                break;
                            }
                            case 7:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Te                                         |$0.50");
                                    System.out.println("2. Agua                                       |$0.60");
                                    System.out.println("3. Gaseosa                                    |$0.50");
                                    System.out.println("4. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            client.setOrder("Te");
                                            client.setOrderCost((float) 0.5);
                                            break;
                                        }
                                        case 2:{
                                            client.setOrder("Agua");
                                            client.setOrderCost((float) 0.6);
                                            break;
                                        }
                                        case 3:{
                                            client.setOrder("Gaseosa");
                                            client.setOrderCost((float) 0.5);
                                            break;
                                        }
                                        case 4:{
                                            break;
                                        }
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=4);   
                                break;
                            }
                            case 8:{
                                break;
                            }
                            default:{
                                System.out.println("Wrong option");
                                break;
                            }
                            
                        }
                    }while(choiceOfTheMenu!=8); 
                    break;
                }
                case 3:{
                    break;
                }
                default:{
                    System.out.println("Wrong option");
                    break;
                }
                    
            }
        }while(choiceOfTheMenu!=3);
    }
    public static void principalMenu(){
        
        System.out.println("-------------------------------------------------");
        System.out.println("           LOS MEGA APANADOS DE LA ESPE");
        System.out.println("-------------------------------------------------");
        System.out.println("1. View Menu");
        System.out.println("2. Place Order");
        System.out.println("3. Exit");
        System.out.print("Please, Choose an option: ");
    }
    public static void menuFood(){
        System.out.println("-----------------------------------------------------");
        System.out.println("1. Salchipapas");
        System.out.println("2. Super Completo");
        System.out.println("3. A la Plancha");
        System.out.println("4. Apanados");
        System.out.println("5. Hamburguesa");
        System.out.println("6. Churrascos");
        System.out.println("7. Bebidas");
        System.out.println("8. Back");
    }
    
    
}
