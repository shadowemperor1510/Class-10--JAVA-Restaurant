/** NAME: Aditya Shailesh Gupte
 * STD.: 10
 * DIV.: L
 * ROLL NO.: 02
 * SCHOOL: SMT. SULOCHANADEVI SINGHANIA SCHOOL
 */
/* This is a project designed for restaurant software
 * which enables the customer to order food, check 
 * history and also do the required enquiry. It helps
 * in easy processing of orders as well as cancellations.
 * The receptionist can easily alter the menu and add or
 * remove products and has all the features which a 
 * restaurant requires.
 */  
package Aditya_Gupte_schoolc.project;

import java.util.*;
public class restaurant
{

    Scanner sc=new Scanner(System.in);

    //Master File

    int m_id[]={0,1,2,3,4
        ,5,6,7,8,9
        ,10,11,12,13,14
        ,15,16,17,18,19
        ,20,21,22,23,24
        ,25,26,27,28,29
        ,30,31,32,33,34
        ,35,36,37,38,39
        ,40,41,42,43,44
        ,45};

    int m_qty[]={0,40,40,40,40,40
        ,40,40,40,40,40
        ,40,40,40,40,40
        ,40,40,40,40,40
        ,40,40,40,40,40
        ,40,40,40,40,40
        ,40,40,40,40,40
        ,40,40,40,40,40
        ,0,0,0,0,0};

    int m_cost[]={0,210,230,260,280,300
        ,320,330,350,360,370
        ,370,380,400,420
        ,450,460,480,500
        ,550,560,570,580
        ,600,600,620,610,640
        ,120,130,140,140,150,360
        ,450,480,480
        ,400,420,450,460
        ,0,0,0,0,0};   

    String m_cat[]={"","v_soup ","v_soup ",
            "nv_soup","nv_soup","nv_soup",
            "chinese","chinese","chinese","chinese","chinese",
            "veg    ","veg    ","veg    ","veg    ","veg    ",
            "veg    ","veg    ","veg    ",
            "n_veg  ","n_veg  ","n_veg  ","n_veg  ","n_veg  ",
            "n_veg  ","n_veg  ","n_veg  ","n_veg  ",
            "rotis  ","rotis  ","rotis  ","rotis  ","rotis  ",
            "rotis  ","rice   ","rice   ","rice   ",
            "dessert","dessert","dessert","dessert",
            "","","","",""};//7

    String m_nm[]={"","Royal Tomato Soup      ",
            "French Onion Soup      ","Chicken Royal Soup     ",
            "Chicken Hot & Sour Soup","Chicken sweet Corn Soup",
            "Burnt Garlic Noodles   ","Thai Noodles Red       ",
            "Manchurian Noodles     ",
            "Chinese Choup Suey     ","Triple Schezwan Rice   ",
            "Veg Crispy             ","Veg Lollypop           ",
            "Veg 65                 ","Potato 65              ",
            "Butter Paneer          ","Paneer Kadai           ",
            "Paneer Masala          ","Veg Kofta              ",
            "Chicken Lollypop       ","Chicken 65             ",
            "Chicken Tandoori       ","Chicken Crispy         ",
            "Butter Chicken         ","Chicken Kadai          ",
            "Chicken Handi          ","Mutton Kheema Masala   ",
            "Mutton Makhanwala      ","Butter Roti            ",
            "Tandoor Roti           ","Kulcha                 ",
            "Butter Naan            ","Cheese Garlic Naan     ",
            "Roti Ki Tokri          ","Steam Rice             ",
            "Jeera Rice             ","Veg Pulav              ",
            "Vanilla Ice-cream      ","Chocolate Ice-cream    ",
            "Chocolate Mousse       ","Caramel Custard        ",
            "","","","",""};

    // Master File over...

    //Transaction File
    int t_cid[]={0,1,2,3,4
        ,0,0,0,0,0
        ,0,0,0,0,0,0};

    int t_cqty[]={0,4,2,3,1
        ,0,0,0,0,0
        ,0,0,0,0,0
        ,0,0,0,0,0};

    String t_cnm[]={"","Akhilesh Singh           ","Arnav Srivastav         ",
            "Nirmal Joshi             ","Anish Patil             "
        ,"","","","",""
        ,"","","","",""
        ,"","","","",""};

    String t_nm[]={"","Burnt Garlic Noodles   ","French Onion Soup      ",
            "Triple Schezwan Rice    ","Chicken Crispy         "
        ,"","","","",""
        ,"","","","",""
        ,"","","","",""};

    long phno[]={0l,9819375412l,9769851290l,8805732542l,8945321677l,
            0l,0l,0l,0l,0l};

    String t_cat[]={"","chinese","v_soup ","chinese","n_veg  "
        ,"","","","",""
        ,"","","","",""
        ,"","","","",""};

    int t_cost[]={0,1280,480,1170,580
        ,0,0,0,0,0
        ,0,0,0,0,0
        ,0,0,0,0,0};

    double t_cgst[]={0.0,32.0,12.0,29.25,14.5
        ,0.0,0.0,0.0,0.0,0.0
        ,0.0,0.0,0.0,0.0,0.0
        ,0.0,0.0,0.0,0.0,0.0};

    double t_sgst[]={0.0,32.0,12.0,29.25,14.5
        ,0.0,0.0,0.0,0.0,0.0
        ,0.0,0.0,0.0,0.0,0.0
        ,0.0,0.0,0.0,0.0,0.0};

    double t_tcost[]={0.0,1344.0,504.0,1228.5,609.0
        ,0.0,0.0,0.0,0.0,0.0
        ,0.0,0.0,0.0,0.0,0.0
        ,0.0,0.0,0.0,0.0,0.0};

    // Transaction File over...

    int again=0,out=0;
    int n=0;
    static int e=5;
    static int e1=5;
    static int e2=41;
    static int e3=5;
    long ph_no=0l;
    String pn="";
    static int ab1=1;
    static int ab2=5;
    static int ab3=12;
    int j=0;
    double bill=0.0;
    int choice_chn=0;
    String chn="";
    static int cancel=5;
    static int parcel=0;
    static int dine=0;

    static void main()
    {

        restaurant ob=new restaurant();
        int ch;

        ob.m_qty[11]=ob.m_qty[11]-4;
        ob.m_qty[3]=ob.m_qty[3]-2;
        ob.m_qty[19]=ob.m_qty[19]-3;
        ob.m_qty[42]=ob.m_qty[42]-1;

        do
        {

            System.out.println("\f");
            System.out.println("\t\t\t\t\t   ROYAL TULIP    \n\n\n");

            System.out.println("\t\t\t 1. ENQUIRY");
            System.out.println("\t\t\t 2. DINE NOW");
            System.out.println("\t\t\t 3. PARCEL");
            System.out.println("\t\t\t 4. OTHER OPTIONS");
            System.out.println("\t\t\t 5. EXIT        \n\n\n");

            System.out.print("\t\t Enter your CHOICE -->> ");
            ch=ob.sc.nextInt();

            switch(ch)
            {
                case 1:
                ob.enquiry();
                if(ob.again!=0)
                {
                    ob.out=1;
                }
                break;

                case 2:
                ob.dine_details();
                if(ob.again!=0)
                {
                    ob.out=1;
                }
                break;

                case 3:
                ob.parcel_details();
                if(ob.again!=0)
                {
                    ob.out=1;
                }
                break;

                case 4:
                ob.o_opt();
                if(ob.again!=0)
                {
                    ob.out=1;
                }
                break;

                case 5:
                System.out.println(" \n\n \t\t\t\t  PLEASE VISIT US AGAIN!!!");
                ob.again=0;
                break;

                default:
                System.out.println(" INVALID CHOICE");
                System.out.println(" PRESS 1 TO REMAIN IN MAIN MENU.");
                ob.again=ob.sc.nextInt();

            }
            if(ob.out==1 && ch!=5)
            {
                System.out.println(" \n\n \t\t\t\t  PLEASE VISIT US AGAIN!!!");
            }
        }
        while(ob.again==1);

    }

    void enquiry()
    {

        System.out.print("\f");
        System.out.print("\t\t\t\t\t ENQUIRY \n\n\n");
        System.out.println("\t Welcome to ROYAL TULIP.");
        System.out.println("\t The customer's comfort and liking is our top priority.");
        System.out.println("\t We have a quick and a customer friendly staff.");
        System.out.println("\n\n"); 
        menu();

        System.out.print(" \n\n");
        System.out.print("\t Enter 1 to return to Main Menu-->> ");
        again=sc.nextInt();

    }

    void menu()
    {
        int c;

        System.out.print("\t\t\t\t\t MENU \n\n\n");
        System.out.println("ID  \t DISH \t\t\tCATEGORY\tQUANTITY\tCOST");

        for(c=1;c<m_nm.length;c++)
        {
            if(m_qty[c] > 0)
            {               
               System.out.println(m_id[c]+" "+m_nm[c]+"\t"+m_cat[c]+"\t\t   "+m_qty[c]+"\t\t"+m_cost[c]);                
            }
        }
    }

    void dine_details()
    {

        int a2,a3,x,len,k=0;
        long i;
        int choice,g,o;
        char ch=0,a;
        int counter;
        dine=1;

        System.out.println(" \f");
        System.out.println("\t\t\t\t\t DINE \n\n\n");
        System.out.print(" Enter your name -->>  ");
        sc.nextLine();
        t_cnm[e1]=sc.nextLine();

        len=t_cnm[e1].length();
        for(x=len;x<25;x++)
        {
            t_cnm[e1] = t_cnm[e1] + " ";
        }

        System.out.println("\n");

        while(true)
        {
            System.out.print(" Enter your phone number -->> ");
            pn=sc.nextLine();

            if(pn.length()==10)
            {
                for(j=0;j<10;j++)
                {
                    a=pn.charAt(j);
                    if(Character.isDigit(a))
                    k++;
                }
                if(k==10)
                {
                    ph_no=Long.parseLong(pn);
                    if(ph_no>0l)
                    break;
                }                
                else
                System.out.println(" Number NOT Valid ");
            }
            else
            {
                System.out.println(" Number NOT Valid ");
            }

        }

        phno[e1]=ph_no;
        ph_no=0l;

        System.out.println("\n\n");
        System.out.print(" Enter the no. of your family members -->> ");
        n=sc.nextInt();
        n=Math.abs(n);
        System.out.println(" \n\n");

        System.out.println("\f");

        for(i=0;i<=1000000l;i++)
        {

        }

        if(n>=1 && n<=2)
        {
            System.out.println(" Please seat yourself at table no.-->> "+ ab1);
            ++ab1;
        }
        if(n>=3 && n<=6)
        {
            System.out.println(" Please seat yourself at table no.-->> "+ ab2);
            ++ab2;
        }
        if(n>=7)
        {
            System.out.println(" Please seat yourself at table no.-->> "+ ab3);
            ++ab3;
        }
        System.out.println(" Your Customer Id is -->> "+ e1);
        t_cid[e1]=e1;

        dine_parcel();

        if(bill>0.0)
        {
            System.out.print(" If you want to rate us, Press 1 -->> ");
            a2=sc.nextInt();

            if(a2==1)
            {
                ratings();
            }

            System.out.println("\n\n");

            bill();
        }

        else
        {
            System.out.println("\f");
            System.out.println(" You haven't ordered any dish...");
            System.out.print(" Press 1 to Order -->> ");
            a3=sc.nextInt();
            if(a3==1)
            {
                dine_parcel();
            }
            else
            {
                t_cnm[e1]="";
                for(x=e1;x<=cancel;x++)
                {
                    t_nm[x]="";
                    t_cqty[x]=0;
                    t_cid[x]=0;
                    t_cat[x]="";
                    phno[x]=0l;
                    t_cgst[x]=0.0;
                    t_sgst[x]=0.0;
                    t_cost[x]=0;
                    t_tcost[x]=0.0;
                }
            }
        }

        System.out.print(" Press 1 to remain in MAIN MENU -->> ");
        again=sc.nextInt();

    }

    void parcel_details()
    {

        long i;int k=0;
        int choice,a,g,o;
        char ch=0;
        int counter;
        int len,x,a3;

        System.out.println(" \f");
        System.out.println("\t\t\t\t\t PARCEL \n\n\n");
        System.out.print(" Enter your name -->>  ");
        sc.nextLine();
        t_cnm[e1]=sc.nextLine();

        len=t_cnm[e1].length();
        for(x=len;x<25;x++)
        {
            t_cnm[e1] = t_cnm[e1] + " ";
        }

        System.out.println("\n");

        while(true)
        {
            System.out.print(" Enter your phone number -->> ");
            pn=sc.nextLine();

            if(pn.length()==10)
            {
                for(j=0;j<10;j++)
                {
                    a=pn.charAt(j);
                    if(Character.isDigit(a))
                    k++;
                }
                if(k==10)
                {
                    ph_no=Long.parseLong(pn);
                    if(ph_no>0l)
                    break;
                }                
                else
                System.out.println(" Number NOT Valid ");
            }
            else
            {
                System.out.println(" Number NOT Valid ");
            }

        }

        phno[e1]=ph_no;
        ph_no=0l;

        System.out.println("\f");
        System.out.println(" Please wait in the waiting room after placing");
        System.out.println(" your order till the parcel is prepared. \n\n");
        System.out.println(" Your Customer Id is -->> "+e1);

        t_cid[e1]=e1;

        dine_parcel();

        for(i=0;i<=100000l;i++)
        {
        }

        if(bill>0.0)
        {
            bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println(" You haven't ordered any dish...");
            System.out.print(" Press 1 to Order -->> ");
            a3=sc.nextInt();
            if(a3==1)
            {
                dine_parcel();
            }
            else
            {
                t_cnm[e1]="";
                for(x=e1;x<=cancel;x++)
                {
                    t_nm[x]="";
                    t_cqty[x]=0;
                    t_cid[x]=0;
                    t_cat[x]="";
                    phno[x]=0l;
                    t_cgst[x]=0.0;
                    t_sgst[x]=0.0;
                    t_cost[x]=0;
                    t_tcost[x]=0.0;
                }
            }
        }

        System.out.print(" Press 1 to remain in MAIN MENU -->> ");
        again=sc.nextInt();
    }

    void dine_parcel()
    {

        int a1;
        long i;
        int choice,a;
        char ch=0;

        do
        {

            System.out.print(" Displaying Menu");
            for(j=0;j<3;j++)
            {
                System.out.print(".");
                for(i=0;i<1000000000l;i++)
                {
                }
            }
            System.out.println(" \n ");

            System.out.println("\t\t\t\t\t MENU \n\n");

            System.out.println("\t\t\t 1. SOUPS ");
            System.out.println("\t\t\t 2. CHINESE ");
            System.out.println("\t\t\t 3. VEG ");
            System.out.println("\t\t\t 4. NON VEG ");
            System.out.println("\t\t\t 5. INDIAN BREADS ");
            System.out.println("\t\t\t 6. RICE");
            System.out.println("\t\t\t 7. DESSERTS \n\n\n ");

            System.out.print("\t Enter your choice -->> ");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                ch=soup();
                ch=Character.toUpperCase(ch);
                break;

                case 2:
                ch=chinese();
                ch=Character.toUpperCase(ch);
                break;

                case 3:
                ch=veg();
                ch=Character.toUpperCase(ch);
                break;

                case 4:
                ch=non_veg();
                ch=Character.toUpperCase(ch);
                break;

                case 5:
                ch=I_breads();
                ch=Character.toUpperCase(ch);
                break;

                case 6:
                ch=rice();
                ch=Character.toUpperCase(ch);
                break;

                case 7:
                ch=desserts();
                ch=Character.toUpperCase(ch);
                break;

                default:
                System.out.println("\n Press 'Y' to continue.\n\n");
                ch=sc.next().charAt(0);
                ch=Character.toUpperCase(ch);
            }
        }

        while(ch=='Y');

        System.out.println("\n\n For any Cancellations in order, Press 1.    Or Else, Press 0 to continue ");
        System.out.println(" PLEASE REMEMBER THE DISH Id TO BE CANCELLED.");

        System.out.print("\t\t CHOICE -->> ");
        a=sc.nextInt();
        System.out.println(" \n");

        if(a==1)
        {
            cancel();
        }

        System.out.println(" Your order has been placed successfully \n");
        System.out.print(" Your meal is being prepared");
        for(j=0;j<3;j++)
        {
            System.out.print(".");
            for(i=0;i<1000000000l;i++)
            {
            }
        }

        System.out.println("\n\n");

        System.out.println(" Your meal is ready!!!");
        for(i=0;i<=1000000000l;i++)
        {
            //  customer(s) eating their meal. 

        }

        //  customer(s) eating their meal. 

        System.out.println("\n\n");
        if(dine==1)
        {
            System.out.println("\t We hoped you enjoyed our meal.\n\n\n");
        }
        else if(parcel==1)
        {
            System.out.println("\t We hope you will enjoy our meal.\n\n\n");
        }

        System.out.print("\t If you want to order anythng else, PRESS 1... OR any other number to continue forward -->> ");
        a1=sc.nextInt();

        System.out.println("\f");
        if(a1==1)
        {
            dine_parcel();
        }
    }

    void cancel()
    {
        int j5,j1,j2,l;

        do
        {
            System.out.println("\n");
            System.out.print(" Enter the dish Id to be cancelled -->> ");
            j1=sc.nextInt();

            System.out.print(" Enter its quantity -->> ");
            j2=sc.nextInt();

            for(j5=e1;j5<=cancel;j5++)
            {
                if(t_nm[j5]==m_nm[j1])    
                {
                    t_cqty[j5]=t_cqty[j5]-j2;
                }
            }

            for(j5=e1;j5<cancel;j5++)
            {
                if(t_cqty[j5]==0)
                {
                    t_nm[j5]=t_nm[j5+1];

                    t_cat[j5]=t_cat[j5+1];

                    t_cqty[j5]=t_cqty[j5+1];

                    t_cost[j5]=t_cost[j5+1];
                }
            }

            m_qty[j1]=m_qty[j1]+j2;
            bill=bill-(m_cost[j1]*j2);

            System.out.print(" Enter 1 to cancel another dish or 0 to continue -->> ");
            l=sc.nextInt();
        }
        while(l==1);
    }

    void o_opt()
    {
        int ch,j6,j4,j3,l=0,f;
        long i;
        int j,l1=0;
        int len,x;
        int s=0;
        double sum=0.0;
        String str="";
        do
        {
            l1=0;
            System.out.println("\f ");
            System.out.print("\t\t\t\t\t OTHER OPTIONS \n\n\n");
            System.out.println("\t\t 1. HISTORY ");
            System.out.println("\t\t 2. ADD ");
            System.out.println("\t\t 3. REMOVE ");
            System.out.println("\t\t 4. EXIT \n\n\n");

            System.out.println(" NOTE:- Options 2 and 3 are for STAFF MEMBERS ONLY.\n");
            System.out.print(" Enter your choice-->>  ");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                if(e>e1)
                    j4=e1;
                else
                    j4=e1-1;

                System.out.println("\n\n");
                System.out.print("Uploading History");
                for(j=0;j<3;j++)
                {
                    System.out.print(".");
                    for(i=0;i<100000l;i++)
                    {
                    }
                }

                System.out.println("\n\n");
                System.out.println("C.Id  \t   NAME \t\t\t T.COST");
                for(j3=1;j3<=j4;j3++)
                {
                    if(t_cid[j3]>0)
                    {
                        System.out.println("  "+t_cid[j3]+" \t "+t_cnm[j3]+"\t"+t_tcost[j3]);
                        sum=sum+t_tcost[j3];
                    }
                }
                System.out.println("\n\n \t\t\t TOTAL EARNINGS-->> "+sum);
                break;

                case 2:

                System.out.print(" Enter password -->> ");
                s=sc.nextInt();
                
                
                if(s==1234)
                {
                    System.out.println("\f");
                    System.out.println(" ADDING new products -->>\n\n");

                    m_id[e2]=e2;
                    
                    String dustbin = sc.nextLine();
                    
                    System.out.print(" Enter name of product -->> ");
                    str=sc.nextLine();
                
                    m_nm[e2]=str;
                    
                    len=m_nm[e2].length();
                    for(x=len;x<23;x++)
                    {
                        m_nm[e2] = m_nm[e2] + " ";
                    }

                    
                    
                    System.out.print(" Enter category of product -->> ");
                    m_cat[e2]=sc.nextLine();

                    len=m_cat[e2].length();
                    for(x=len;x<7;x++)
                    {
                        m_cat[e2] = m_cat[e2] + " ";
                    }

                    System.out.print(" Enter quantity of product -->> ");
                    m_qty[e2]=sc.nextInt();
                    sc.nextLine();
                    System.out.print(" Enter cost of product -->> ");
                    m_cost[e2]=sc.nextInt();
                    sc.nextLine();
                    s=0;
                    e2=e2+1;
                }
                else
                {
                    System.out.println(" YOU ARE AN UNAUTHORISED MEMBER...  YOU CANNOT ACCESS THIS OPTION.");
                    s=0;
                }

                break;

                case 3:
                System.out.print(" Enter password -->> ");
                s=sc.nextInt(); 

                if(s==1234)
                {
                    System.out.println("\f");
                    System.out.println(" REMOVING products -->>\n\n");

                    System.out.print(" Enter Id of product -->> ");
                    f=sc.nextInt();
                    
                    m_id[f]=0;
                    m_nm[f]="";
                    m_cat[f]="";
                    m_qty[f]=0;
                    m_cost[f]=0;
                    s=0;
                }
                else
                {
                    System.out.println(" YOU ARE AN UNAUTHORISED MEMBER...  YOU CANNOT ACCESS THIS OPTION.");
                    s=0;                   
                }

                break;

                case 4:
                l=0;
                l1=1;
                break;

                default:
                System.out.println(" INVALID CHOICE.");

            }
            System.out.println("\n");
            if(l1!=1)
            {
                System.out.print(" Press 1 to remain in this menu -->> ");
                l=sc.nextInt();
            }
        }
        while(l==1);

        System.out.print(" Press 1 to remain in MAIN MENU -->> ");
        again=sc.nextInt();

    }

    char soup()
    {
        int c;
        char ans=0;
        System.out.println("ID  \t DISH \t\t\tCATEGORY\tQUANTITY\tCOST");
        for(c=1;c<m_cat.length;c++)
        {
            if(m_cat[c].trim().equalsIgnoreCase("v_soup") || m_cat[c].trim().equalsIgnoreCase("nv_soup"))
            {
                System.out.println(" "+m_id[c]+" "+m_nm[c]+"\t"+m_cat[c]+"\t\t   "+m_qty[c]+"\t\t"+m_cost[c]);
            }
        }

        calc();

        System.out.println(" Press 'Y' to order next Dish or any other character to start preparing your meal.");
        ans=sc.next().charAt(0);

        return ans;
    }

    char chinese()
    {
        int c;
        char ans=0;
        System.out.println("ID  \t DISH \t\t\tCATEGORY\tQUANTITY\tCOST");
        for(c=1;c<m_cat.length;c++)
        {
            if(c==10)
            {
                if(m_cat[c].trim().equalsIgnoreCase("chinese"))
                    System.out.println(m_id[c]+" "+m_nm[c]+"\t"+m_cat[c]+"\t\t   "+m_qty[c]+"\t\t"+m_cost[c]);  
            }
            else
            {
                if(m_cat[c].trim().equalsIgnoreCase("chinese"))
                    System.out.println(" "+m_id[c]+" "+m_nm[c]+"\t"+m_cat[c]+"\t\t   "+m_qty[c]+"\t\t"+m_cost[c]);
            }
        }

        choice_chn=1;
        calc();

        System.out.println(" Press 'Y' to order next Dish or any other character to start preparing your meal.");
        ans=sc.next().charAt(0);

        return ans;
    }

    char veg()
    {
        int c;
        char ans=0;

        System.out.println("ID  \t DISH \t\t\tCATEGORY\tQUANTITY\tCOST");
        for(c=1;c<m_cat.length;c++)
        {
            if(m_cat[c].trim().equalsIgnoreCase("veg"))
                System.out.println(m_id[c]+" "+m_nm[c]+"\t"+m_cat[c]+"\t\t   "+m_qty[c]+"\t\t"+m_cost[c]); 
        }

        calc();

        System.out.println(" Press 'Y' to order next Dish or any other character to start preparing your meal.");
        ans=sc.next().charAt(0);

        return ans;
    }

    char non_veg()
    {
        int c;
        char ans=0;

        System.out.println("ID  \t DISH \t\t\tCATEGORY\tQUANTITY\tCOST");
        for(c=19;c<m_cat.length;c++)
        {
            if(m_cat[c].trim().equalsIgnoreCase("n_veg") )
                System.out.println(m_id[c]+" "+m_nm[c]+"\t"+m_cat[c]+"\t\t   "+m_qty[c]+"\t\t"+m_cost[c]);
        }

        calc();

        System.out.println(" Press 'Y' to order next Dish or any other character to start preparing your meal.");
        ans=sc.next().charAt(0);

        return ans;
    }

    char I_breads()
    {
        int c;
        char ans=0;
        System.out.println("ID  \t DISH \t\t\tCATEGORY\tQUANTITY\tCOST");
        for(c=1;c<m_cat.length;c++)
        {
            if(m_cat[c].trim().equalsIgnoreCase("rotis"))
                System.out.println(m_id[c]+" "+m_nm[c]+"\t"+m_cat[c]+"\t\t   "+m_qty[c]+"\t\t"+m_cost[c]);   
        }

        calc();

        System.out.println(" Press 'Y' to order next Dish or any other character to start preparing your meal.");
        ans=sc.next().charAt(0);

        return ans;
    }

    char rice()
    {
        int c;
        char ans=0;
        System.out.println("ID  \t DISH \t\t\tCATEGORY\tQUANTITY\tCOST");

        for(c=1;c<m_cat.length;c++)
        {
            if(m_cat[c].trim().equalsIgnoreCase("rice"))
                System.out.println(m_id[c]+" "+m_nm[c]+"\t"+m_cat[c]+"\t\t   "+m_qty[c]+"\t\t"+m_cost[c]);
        }

        calc();

        System.out.println(" Press 'Y' to order next Dish or any other character to start preparing your meal.");
        ans=sc.next().charAt(0);

        return ans;
    }

    char desserts()
    {
        int c;
        char ans=0;
        System.out.println("ID  \t DISH \t\t\tCATEGORY\tQUANTITY\tCOST");
        for(c=1;c<m_cat.length;c++)
        {
            if(m_cat[c].trim().equalsIgnoreCase("dessert"))
                System.out.println(m_id[c]+" "+m_nm[c]+"\t"+m_cat[c]+"\t\t   "+m_qty[c]+"\t\t"+m_cost[c]);   
        }

        calc();

        System.out.println(" Press 'Y' to order next Dish or any other character to start preparing your meal.");
        ans=sc.next().charAt(0);

        return ans;
    }

    void calc()
    {
        int h=e1;
        int t;
        System.out.print("\n\n\n Enter the Dish Id(from given range) -->> ");
        j=sc.nextInt();

        sc.nextLine();

        if(choice_chn==1)
        {
            System.out.print(" Enter V for Veg and N-V for Non-Veg for Rice -->> ");
            chn=sc.nextLine();
            choice_chn=0;
        }

        System.out.println("\n");

        System.out.print(" Enter the quantity of Dish -->> ");
        t_cqty[e]=sc.nextInt();

        if(m_qty[j]<t_cqty[e])
        {
            System.out.println(" SORRY, Not Enough quantity is available...");
            t_cqty[e]=0;
            System.out.println("\n");
            System.out.print(" Please enter quantity again... -->> ");
            t_cqty[e]=sc.nextInt();
        }

        if(m_qty[j]<=5)
        {
            m_qty[j]=m_qty[j]+35;
        }

        m_qty[j]=m_qty[j]-t_cqty[e];

        bill=bill+(m_cost[j]*t_cqty[e]);

        t_nm[e]=m_nm[j];;
        t_cat[e]=m_cat[j];
        t_cost[e]=m_cost[j];

        System.out.println("\n\n");
        while(e>e1)
        {
            for(t=e1;t<e;t++)
            {
                h++;
                if(t_nm[t].equalsIgnoreCase(t_nm[h]))
                {
                    t_nm[h]="";
                    t_cqty[h-1]=t_cqty[h-1]+t_cqty[h];
                    t_cqty[h]=0;
                    e--;
                    cancel--;
                    break;
                }
            }
            break;
        }
        e++;
        cancel++;
    }

    void ratings()
    {
        long i;

        int choice1=0,choice2=0,choice3=0,choice4=0,choice5=0,a2=0;
        String comment="";

        System.out.println("\t\t 1 -->> EXCELLENT ");
        System.out.println("\t\t 2 -->> GOOD ");
        System.out.println("\t\t 3 -->> OK...OK");
        System.out.println("\t\t 4 -->> BAD      \n\n\n");

        System.out.print("\t 1.STAFF & SERVICE          -->> ");
        choice1=sc.nextInt();
        System.out.print("\n");
        System.out.print("\t 2.FOOD QUALITY             -->> ");
        choice2=sc.nextInt();
        System.out.print("\n");
        System.out.print("\t 3.HOSPITALITY              -->> ");
        choice3=sc.nextInt();
        System.out.print("\n");
        System.out.print("\t 4.AMBIENCE                 -->> ");
        choice4=sc.nextInt();
        System.out.print("\n");
        System.out.print("\t 5.YOUR EXPERIENCE          -->> ");
        choice5=sc.nextInt();

        System.out.println("\n\n\n");

        System.out.print(" Press 1 to add a comment(Press 'enter' only when you have finished the comment) -->> ");
        a2=sc.nextInt();
        sc.nextLine();

        System.out.println("\n");
        if(a2==1)
        {
            System.out.print(" COMMENT -->> ");
            comment=sc.nextLine();
        }

    }

    void bill()
    {
        int o=0;
        long i;

        System.out.print(" Displaying bill");
        for(j=0;j<5;j++)
        {
            System.out.print(".");
            for(i=0;i<10000000l;i++)
            {
            }
        }
        System.out.println("\f");

        System.out.println("\t\t\t\t\t ROYAL TULIP ");
        System.out.println("\t\t\t  26/B,Sector 7,Kharghar,Navi Mumbai,Maharashtra,410210.");

        System.out.println("******************************************************************************************************************************************************");
        System.out.println("                                     \t\tTAX INVOICE                      ");
        System.out.println("******************************************************************************************************************************************************\n");

        System.out.println(" NAME         : "+t_cnm[e1]);
        System.out.println(" PHONE NUMBER : "+phno[e1]);
        System.out.println(" CUSTOMER ID  : "+t_cid[e1]);
        System.out.println(" TABLE NO.    : "+e1);
        System.out.println();
        System.out.println("  \t DISH  \t\t\tCATEGORY\tPRICE\tQUANTITY\tCOST");

        for(o=e3;o<=e;o++)
        {

            if(t_nm[o].length()==0)
            {
                break; 
            }

            System.out.println(" "+t_nm[o]+"\t"+t_cat[o]+"\t\t"+t_cost[o]+"\t   "+t_cqty[o]+"\t\t"+(t_cost[o]*t_cqty[o]));

        }

        System.out.println("\n\n");
        t_cgst[e1]=(2.5/100.0)*bill;
        t_sgst[e1]=(2.5/100.0)*bill;
        t_tcost[e1]=bill+t_cgst[e1]+t_sgst[e1];
        System.out.println(" CGST(2.5%) : "+(t_cgst[e1]));
        System.out.println(" SGST(2.5%) : "+(t_sgst[e1]));
        System.out.println();
        System.out.println(" TOTAL COST : "+(t_tcost[e1]));

        System.out.println("\n\n\n******************************************************************************************************************************************************\n\n\n");

        e1=e1+1;
        System.out.println(" \t\t\t\t THANK YOU...  PLEASE VISIT AGAIN.");
        System.out.println("\n\n\n******************************************************************************************************************************************************");
        bill=0.0;
        e3=e;
    }
}        