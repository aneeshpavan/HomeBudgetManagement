import java.util.*;
interface HomeDemo
{
    public void setPrices();
    public void showPrices();
    public void compareToGivenAmount(int amount);
}

abstract class Home implements HomeDemo
{
    public  int w;
    public  int defaultAmount=12000;
    public  int vegetables = 1500;
    public  int MilkEggs = 2500;
    public  int Medicines = 1000;
    public  int ElectricityBill = 600;
    public  int Waterbill = 600;
    public  int Rent = 5000;
    public  void showPrices()
    {
        System.out.println("\tYour Budget is : "+defaultAmount);
        String s="\t\t\t\tvegetables Price : "+this.vegetables+"\n\t\t\t\tMilkEggs Price : "+this.MilkEggs+"\n\t\t\t\tMedicines Price : "+this.Medicines+"\n\t\t\t\tElectricity Bill : "+this.ElectricityBill+"\n\t\t\t\tWater Bill "+this.Waterbill+"\n\t\t\t\tRent : "+this.Rent;
        System.out.println(s);
        System.out.println("\n\n");
    }
    public  void compareToGivenAmount(int amount)
    {
        if(amount>this.defaultAmount){
            System.out.println("\t\t\t\tOUT OF BUDGET");
            System.out.println("\t\t\t\tOur Budget is : "+defaultAmount);
            System.out.println("\t\t\t\tSum of Our set budget is : \n\n"+w);
             }
        else
            System.out.println("\t\t\t\tHOORAY! WE ARE IN BUDGET!!!\n\n");
    }
}

class HomeBudgetManagementDemo extends Home implements HomeDemo
{
    public  void setPrices()
    {
        int a,b,c,d,e,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t\tMaintain everything in your Budget :"+defaultAmount);
        System.out.println("\nEnter NEW PRICES for (Vegetables,Milk&Eggs,Medicines,Electricity Bill,Water bill,Rent) one after other respectively : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        f=sc.nextInt();
        w=a+b+c+d+e+f;
        System.out.println("Sum of Our set budget is : "+w);
    
        this.vegetables=a;
        this.MilkEggs=b;
        this.Medicines=c;
        this.ElectricityBill=d;
        this.Waterbill=e;
        this.Rent=f;
        
        
        
        
    }

    public static void main(String[] args)
    {
        HomeBudgetManagementDemo h=new HomeBudgetManagementDemo();
        Scanner sc=new Scanner(System.in);
    
    while(true)
    {
        System.out.println("\t\t\t1.Show Prices\n\t\t\t2.Set Prices\n\t\t\t3.Comparing OUT OF BUDGET/IN BUDGET? \n\t\t\t4.EXIT\nEnter your option : ");
        int input=sc.nextInt();
        if(input==1)
            h.showPrices();
        else if(input==2)
            h.setPrices();
        else if(input==3)
        {
            
            System.out.println("enter the sum of your budget amount : ");
            int amt=sc.nextInt();
            h.compareToGivenAmount(amt);
        }
        else
            return ;

    }
   
    }
   
}