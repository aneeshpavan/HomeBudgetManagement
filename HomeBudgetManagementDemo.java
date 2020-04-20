import java.util.*;
interface HomeDemo//An interface named HomeDemo
{
    public void setPrices();//Abstract method which will be overridden in future in child classes
    public void showPrices();//Abstract method to show prices
    public void compareToGivenAmount(int amount);//Abstract method for comparison
}

abstract class Home implements HomeDemo // class Home which implements the interface HomeDemo
{
    //data members to store values
    public  int w;
    public  int defaultAmount=12000;
    public  int vegetables = 1500;
    public  int MilkEggs = 2500;
    public  int Medicines = 1000;
    public  int ElectricityBill = 600;
    public  int Waterbill = 600;
    public  int Rent = 5000;
    public  void showPrices()//member method to show prices
    {
        System.out.println("\tYour Budget is : "+defaultAmount);
        String s="\t\t\t\tvegetables Price : "+this.vegetables+"\n\t\t\t\tMilkEggs Price : "+this.MilkEggs+"\n\t\t\t\tMedicines Price : "+this.Medicines+"\n\t\t\t\tElectricity Bill : "+this.ElectricityBill+"\n\t\t\t\tWater Bill "+this.Waterbill+"\n\t\t\t\tRent : "+this.Rent;
        System.out.println(s);
        System.out.println("\n\n");
    }
    public  void compareToGivenAmount(int amount)//member method for comparison
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

class HomeBudgetManagementDemo extends Home implements HomeDemo //Class HomeBudgetManagementDemo which inherits Home and implements HomeDemo. It is the subclass of Home
{
    public  void setPrices()//Member method to set prices.
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

    public static void main(String[] args)//Main function
    {
        HomeBudgetManagementDemo h=new HomeBudgetManagementDemo();
        Scanner sc=new Scanner(System.in);
    
    while(true)//Infinite while loop to keep menu visible
    {
        System.out.println("\t\t\t1.Show Prices\n\t\t\t2.Set Prices\n\t\t\t3.Comparing OUT OF BUDGET/IN BUDGET? \n\t\t\t4.EXIT\nEnter your option : ");
        int input=sc.nextInt();//input for choosing option
        if(input==1)
            h.showPrices();//method showPrices is invoked using the object of HomeBudgetManagementDemo
        else if(input==2)
            h.setPrices();//method setPrices is invoked using the object of HomeBudgetManagementDemo
        else if(input==3)
        {
            
            System.out.println("enter the sum of your budget amount : ");
            int amt=sc.nextInt();
            h.compareToGivenAmount(amt);//method compareToGivenAmount(amt) is invoked using the object of HomeBudgetManagementDemo
        }
        else
            return ;

    }
   
    }
   
}
