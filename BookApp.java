import java.util.*;
import java.io.*;

public class BookApp
{
    public static void main (String args[])throws FileNotFoundException,IOException,Exception
    {
      try
      {        
            Scanner in = new Scanner(System.in);
            Scanner inLine = new Scanner (System.in);
            
            File infile= new File("bookDetail.txt");
            FileReader fr = new FileReader(infile);
            BufferedReader br = new BufferedReader(fr);
            
            double p = 0.00;
            double tot = 0.00;
            int found = 0 ;
            double tp = 0.00 ;
            char proceed = 'y' ;
            char mem ;
            int q = 0;
            int counter = 0 ;
            Book high = new Book() ;
            Queue cust = new Queue();
            Book huhu = new Book() ;
            LinkedList BookList = new LinkedList();

            String str = br.readLine();
            
            while(str!=null)
            {
                 StringTokenizer token = new StringTokenizer(str, ";");
                 String title = token.nextToken();
                 String author = token.nextToken();
                 String yearP = token.nextToken();
                 double price = Double.parseDouble(token.nextToken());
                 Book b = new Book(title,author,yearP,price,counter);
                 BookList.addLast(b);
                 str = br.readLine();
            }    
            
            System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t                         WELCOME TO OUR SHOP                    ");
            System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\tHi guys... Our shop provides a wide variety of interesting books. \n\t\tWe also provide discounts on every purchase to our member customer.");
            System.out.println("\nPlease choose step to proceed");
            System.out.println("1) Search Book");
            System.out.println("2) Order Book");
            System.out.println("3) Exit");
            System.out.println("\nEnter your choice: ");
            int c = in.nextInt();
            
            while(proceed=='Y' || proceed =='y')
            {
             //find book
             if(c == 1){  
                System.out.println("\nPlease enter book title");
                String bookTitle = inLine.nextLine();
                
                Book s =(Book)BookList.getFirst();
                while(s != null)
                {                                  
                    if(s.getBookTitle().equalsIgnoreCase(bookTitle)){
                        System.out.println ("Book Title : " + s.getBookTitle() + "\nBook Author: " + s.getBookAuthor() + 
                                        "\nYear Publish : " + s.getYearPublish() + "\nPrice:RM " + s.getPrice());
                        found = 1 ;
                        
                        break ;
                    }                
                    else
                    {
                        found = 0 ;
                    
                    }
                    s = (Book)BookList.getNext();
                    
                }             
                if (found == 0 ){
                  System.out.println ("_________________________________________________");
                  System.out.println ("| Hi sorry we didn't provide book that you want |");   
                  System.out.println ("-------------------------------------------------");
                }
             }
           
             //oder buku
             else if(c == 2){
                  System.out.println ("\nEnter name: ");
                  String name = inLine.nextLine();
                  System.out.println ("\nEnter gender: ");
                  String g = in.next();
                  System.out.println("\nPhone Number: ");
                  String phone = inLine.nextLine();
                  System.out.println ("------------------------- ");
                  System.out.println ("Do you want to order(Y/N):");
                  System.out.println ("--------------------------");
                  char order = in.next().charAt(0);
                  System.out.println ("--------------------------");
                  System.out.println (" Are you a member?(Y/N) : ");
                  System.out.println ("--------------------------");
                  mem = in.next().charAt(0);
                  int jumpa = 1; 
                  
                  if (mem == 'Y' || mem == 'y')
                  {
                      Member m = new Member();
                      System.out.print(m.Note()); 
                      
                      while(order == 'y' || order == 'Y'){
                      System.out.println ("\n\nEnter book title: ");
                      String bookTitle = inLine.nextLine(); 
                     
                      Book s =(Book)BookList.getFirst();
                      while(s != null)
                      {
                          if(bookTitle.equalsIgnoreCase(s.getBookTitle())){                                                             
                                p = s.getPrice();
                                jumpa = 1 ;
                                break;
                          }
                          else
                          {
                             jumpa = 0 ;  
                          }
                          
                          s = (Book)BookList.getNext();
                      }             
                      
                      if(jumpa==0){
                          System.out.println("Incorrect title. try again?(y/n): ");
                          char cuba = in.next().charAt(0);
                          if (cuba =='y' || cuba == 'Y'){
                              System.out.println("-------------------------------");
                              System.out.println("\nPlease choose step to proceed");
                              System.out.println("1) Search Book");
                              System.out.println("2) Order Book");
                              System.out.println("3) Exit");
                              System.out.println("\nEnter your choice: ");
                              System.out.println("\n-------------------------------");
                              c = in.nextInt();
                          }
                          else{
                              break;
                          }
                     }
                     else{
                      System.out.println ("\nQuantity : ");
                      q = in.nextInt();
                      int count = s.getCounter()+ q ;
                      s.setCounter(count) ;
                      
                      tot = tot + q * p; 
                      System.out.println ("*************************************");
                      System.out.println ("Do you want to add any order ?(Y/N): ");
                      System.out.println ("*************************************");
                      order = in.next().charAt(0);
                    }                    
                  }
                   tp = tot - (m.calculateDisc(tot));
                }
                  else
                {
                      NonMember n = new NonMember();
                      System.out.print(n.Note());
                      
                      while(order == 'y' || order == 'Y'){
                      System.out.println ("\nEnter book title: ");
                      String bookTitle = inLine.nextLine(); 
                      
                      Book s =(Book)BookList.getFirst();
                      while(s != null)
                      {
                          if(bookTitle.equalsIgnoreCase(s.getBookTitle())){                                                             
                                  p = s.getPrice();
                                  jumpa = 1 ;
                                  break;
                          }
                          else
                          {
                             jumpa = 0 ;  
                          }
                          
                          s = (Book)BookList.getNext();
                      }             
                      
                      if(jumpa==0){
                          System.out.println("Incorrect title. try again?(y/n): ");
                          char cuba = in.next().charAt(0);
                          if (cuba =='y' || cuba == 'Y'){
                              System.out.println("-------------------------------");
                              System.out.println("\nPlease choose step to proceed");
                              System.out.println("1) Search Book");
                              System.out.println("2) Order Book");
                              System.out.println("3) Exit");
                              System.out.println("\nEnter your choice: ");
                              System.out.println("\n-------------------------------");
                              c = in.nextInt();
                          }
                          else{
                              break;
                          }
                     }
                     else{
                      System.out.println ("\nQuantity : ");
                      q = in.nextInt();
                      int count = s.getCounter()+ q ;
                      s.setCounter(count) ;
                      
                      tot = tot + q * p;
                      System.out.println ("*************************************");
                      System.out.println ("Do you want to add any order ?(Y/N): ");
                      System.out.println ("*************************************");
                      order = in.next().charAt(0);
                    }
                   }
                   tp = tot ;
                  } 
                                     
                  Customer come = new Customer(name,g,mem,phone,tp);
                  cust.enqueue(come);
             } 
                                                                      
             else 
             {
                System.out.println("--------------------------------------------------");
                System.out.println("Thank you for visit us. Please come again. Bye ^-^") ;                
                System.out.println("\n" + cust.toString());
                Queue temp =new Queue();
                int i = 1 ;
                System.out.println("\n| Customer that come today |");
                Customer hi =(Customer)cust.dequeue();
                while(hi != null)
                {
                    System.out.print("\n" + i +")" + hi.getCustName());
                    i++ ;
                    temp.enqueue(hi);
                    hi = (Customer)cust.dequeue();                    
                }
                
                break ;
                
             }
             System.out.println ("\nDo you wish to continue the transaction?(y/n) :");
             proceed = in.next().charAt(0);
             if(proceed == 'n' || proceed == 'N')
             {                
                 System.out.println("\n" + cust.toString());
                 System.out.println("\nThank you") ;
             }
             else
             {
                System.out.println("-------------------------------");
                System.out.println("\nPlease choose step to proceed");
                System.out.println("1) Search Book");
                System.out.println("2) Order Book");
                System.out.println("3) Exit");
                System.out.println("\nEnter your choice: ");
                System.out.println("\n-------------------------------");
                c = in.nextInt();
             }
             
             //highest book                              
                 int highest = -99999 ;

                 Book j = (Book)BookList.getFirst();
                 while(j != null)
                 {
                     if(highest < j.getCounter())
                     {
                         highest = j.getCounter();
                         huhu = j;
                     }
                  j = (Book)BookList.getNext();
                 }
              
            }
            System.out.print("\n| The most popular book : |" + huhu.toString());
            br.close();
            fr.close();
      }
       catch(FileNotFoundException e1)
       {
           System.err.println(e1.getMessage());
        }
       catch(IOException e2)
       {
           System.err.println(e2.getMessage());
        }
       catch(Exception e3)
       {
           System.err.println(e3.getMessage());
        }
       finally
       {
           System.out.println("\nPlease come again later");
           
       }    
    }  
}
