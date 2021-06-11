import java.util.Scanner;

class details
{
  int menu()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("1:FEVER");
     System.out.println("2:CONSTIPATION");
     System.out.println("3:DIABETIS");
     System.out.println("4:COLD AND COUGH");
     System.out.println("5:MULTI-VITAMIN TABLETS");
     System.out.println("6:MIGRAIN");
     System.out.println("7:ASTHAMA INHALER");
     System.out.println("8:BODY PAINS");
     System.out.println("9:SKIN DISEASES");
     System.out.println("10:ENERGY DRINKS");
     System.out.println("11:EXIT\n");
     System.out.println("ENTER UR CHOICE");
     int ch=sc.nextInt();
     return ch;
  }
}


class pharmacy
{ 
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter ur name");
    String person=sc.nextLine();
    System.out.println("\n HELLO "+person);
    System.out.println("WELCOME TO OUR PHARMACY\n");
    
    details de=new details();
    int c;
    int i=0,n=1;
    String name;
    char a;
    int q[]=new int[10];
    char code[]=new char[10];
    int price[]=new int[10];
    int bill=0;
    do
    {
     c=de.menu();
     switch(c)
     {  
      case 1: 
              System.out.println("A:PARACETAMOL");
              System.out.println("B:DOLO 650");
              System.out.println("C:CALPOL");
              System.out.println("ENTER THE TABLET U WANT");
              a=sc.next().charAt(0);
              switch(a)
              {
               case 'A': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         name="PARACETAMOL";
                         code[i]='P';
                         price[i]=q[i]*35;
                         break;
               case 'B': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         name="DOLO 650";
                         code[i]='D';
                         price[i]=q[i]*32;
                         break;
               case 'C': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         name="CALPOL";
                         code[i]='C';
                         price[i]=q[i]*23;
                         break;
              }
               break;
      case 2: 
              System.out.println("A:DULCOLAX");
              System.out.println("B:SENOKOT");
              System.out.println("C:COLOXYL");
              System.out.println("ENTER THE TABLET U WANT");
              a=sc.next().charAt(0);
              switch(a)
              {
               case 'A': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='D';
                         price[i]=q[i]*43;
                         break; 
               case 'B': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='S';
                         price[i]=q[i]*35;
                         break;
               case 'C': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='O';
                         price[i]=q[i]*35;
                         break;
              }
               break;
      case 3:
              System.out.println("A:METFORMIN");
              System.out.println("B:COMFORT MAX");
              System.out.println("C:CUREVEDA");
              System.out.println("ENTER THE TABLET U WANT");
              a=sc.next().charAt(0);
              switch(a)
              {
               case 'A': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='M';
                         price[i]=q[i]*23;
                         break; 
               case 'B': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='F';
                         price[i]=q[i]*14;
                         break; 
               case 'C': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='V';
                         price[i]=q[i]*28;
                         break; 
              }
               break;
      case 4:
              System.out.println("A:NyQUIL");
              System.out.println("B:CHESTON COLD");
              System.out.println("C:ADVIL");
              System.out.println("ENTER THE TABLET U WANT");
              a=sc.next().charAt(0);
              switch(a)
              {
               case 'A': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='Y';
                         price[i]=q[i]*35;
                         break; 
               case 'B': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='H';
                         price[i]=q[i]*21;
                         break; 
               case 'C': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='V';
                         price[i]=q[i]*24;
                         break; 
              }
               break;
      case 5:
              System.out.println("A:FAST AND UP");
              System.out.println("B:INLIFE");
              System.out.println("C:CENTRUM");
              System.out.println("ENTER THE TABLET U WANT");
              a=sc.next().charAt(0);
              switch(a)
              {
               case 'A': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='F';
                         price[i]=q[i]*25;
                         break; 
               case 'B': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='I';
                         price[i]=q[i]*21;
                         break; 
               case 'C': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='R';
                         price[i]=q[i]*34;
                         break; 
              }
               break;
      case 6:
              System.out.println("A:MIGRALEVE");
              System.out.println("B:ALPHA-SH");
              System.out.println("C:MIGROKILL");
              System.out.println("ENTER THE TABLET U WANT");
              a=sc.next().charAt(0);
              switch(a)
              {
               case 'A': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='G';
                         price[i]=q[i]*34;
                         break; 
               case 'B': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='S';
                         price[i]=q[i]*25;
                         break; 
               case 'C': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='L';
                         price[i]=q[i]*34;
                         break; 
              }
               break;
      case 7: System.out.println("enter the number of sheets required");
              q[i]=sc.nextInt();
              name="ASTHAMA SPACER";
              code[i]='A';
              price[i]=q[i]*500;
              break;
              
      case 8:
              System.out.println("A:CROSIN");
              System.out.println("B:NUTROLIN");
              System.out.println("C:SEDEROM");
              System.out.println("ENTER THE TABLET U WANT");
              a=sc.next().charAt(0);
              switch(a)
              {
               case 'A': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='R';
                         price[i]=q[i]*23;
                         break; 
               case 'B': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='N';
                         price[i]=q[i]*12;
                         break; 
               case 'C': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='S';
                         price[i]=q[i]*45;
                         break; 
              }
               break;
      case 9:
              System.out.println("A:KETOSTAR");
              System.out.println("B:KZDUO");
              System.out.println("C:LULLIBURT");
              System.out.println("ENTER THE TABLET U WANT");
              a=sc.next().charAt(0);
              switch(a)
              {
               case 'A': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='K';
                         price[i]=q[i]*22;
                         break; 
               case 'B': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='U';
                         price[i]=q[i]*32;
                         break; 
               case 'C': System.out.println("enter the number of sheets required");
                         q[i]=sc.nextInt();
                         code[i]='L';
                         price[i]=q[i]*15;
                         break; 
              }
               break;
      case 10:
               System.out.println("enter the number of TINS/PACKS required");
               q[i]=sc.nextInt();
               name="ENERGY DRINKS";
               code[i]='Y';
               price[i]=q[i]*40;
               break;
      case 11: break;
      default:System.out.println("ENTER THE CORRECT CHOICE");
     
     }
     bill=bill+price[i];
     i=i+1;
     n=n+1;
   }while(c!=11);

   //printing bill

   System.out.println("****************INVOICE********************");
   System.out.println("------------------------------------------------------------");
   System.out.println("CODE\t\t    QUANTITY\t\tPRICE\t\t");
   System.out.println("------------------------------------------------------------");
   for(i=0;i<n;i++)
       System.out.println(code[i]+"\t\t\t"+q[i]+"\t\t"+price[i]+"\t\t");
   System.out.println("totalbill:"+bill);
   if(bill>500){
       System.out.println("discount:100");
       System.out.println("totalbill:"+(bill-100));
      }
   System.out.println("\t\t  THANK U FOR VISITING US");
  }
}