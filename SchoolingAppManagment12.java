class Student
{
 private int id;
 private String name;
 private int per; 
  	void setId(int i)
		{
		 id =i;
		}
	int getId()
		{
		 return id;	
		}
		
	void setName(String n)
		{
		 name=n;
		}
	String getName()
		{
		 return name;	
		}

	void setPer(int p)
		{
		 per =p;
		}
	int getPer()
		{
		 return per;	
		}
   }


class Bus
{
 private int busid;
 private int  busnum;
 private String  bussrc;
 private String  busdest;
  	void setIdb(int i)
		{
		 busid =i;
		}
	int getIdb()
		{
		 return  busid;	
		}
		
	void setNumb(int n)
		{
		 busnum=n;
		}
	int getNumb()
		{
		 return  busnum;	
		}

	void setSrcb(String a)
		{
		 bussrc=a;
		}
	String getSrcb()
		{
		 return  bussrc;	
		}
		
	void setDestb(String e )
		{
		 busdest=e;
		}
	String getDestb()
		{
		 return  busdest;	
		}
     }
	

	
class School
{
 private String namesc;
 private String addsc;

  void setNamesc(String n)
	{
	 namesc=n;	
	}
  String getNamesc()
	{
	return namesc;
	}

  void setAddsc(String a)
	{
	 addsc=a;	
	}
  String getAddsc()
	{
	return addsc;
	}
  }

	class ClasRoom
	{
         School[] schol;

        
   	 void addScol(School ...s)
   		{ 
		schol=s;
   		}
   	void showschol()
   		{
                   if(schol==null  || schol.length ==0)
			{
			 System.out.println("No available");
				return;
			}
      		 for(int i=0; i<schol.length; i++)
	  		 {
	    			 System.out.println("School Name:"+schol[i].getNamesc()+"\t"+"Address:"+schol[i].getAddsc());
	  		 }
		
System.out.println("__________________________________________________________________________________________________________");

   		}

	 	


		 Bus[] bus;

		 void setBuses(Bus... b)
		{
		bus= b;
		}
	
		void showBusWiseStudList()	
		{
		for(int i=0;i<bus.length;i++)
		{
System.out.println("BusId"+"\t"+"Bus Number:"+"\t"+"Source"+"\t"+"Destination:"+"\n"+bus[i].getIdb()+"\t"+bus[i].getNumb()+"\t"+"\t"+bus[i].getSrcb()+"\t"+bus[i].getDestb()+"\t");


		}
System.out.println("__________________________________________________________________________________________________________");

	         }

	 	
		Student [] stu;
		void setStudent(Student... s)
		{
		 stu= s;
		}
	
		void getStudents()
		{
			System.out.println("Student Id"+"\t"+"\t"+"Student  Name:"+"\t"+"\t"+"Percentage"+"\t"+"\t");
			for(int i=0;i<stu.length;i++)
				{
				 
				 System.out.println(stu[i].getId()+"\t"+"\t"+"\t"+stu[i].getName()+"\t"+"\t"+"\t"+stu[i].getPer()+"\t"+"\t"+"\t");

				}
System.out.println("__________________________________________________________________________________________________________");

		}
	


	       
		
	 }


	       
		
	 


    public class SchoolingAppManagment12
  { 
    public static void main(String args[])
	{
	 
	School s = new School();
	  s.setNamesc("ABC");
	  s.setAddsc("Warje,pune");
	
	Bus b = new Bus();
	 b.setIdb(1);
	 b.setNumb(100);
	 b.setSrcb("Warje");
	 b.setDestb("Kothrud");

	 Student sr1 =new Student();
	 sr1.setId(100);
	 sr1.setName("Ram");
	 sr1.setPer(88);
		 
	 Student sr2 =new Student();
	 sr2.setId(101);
	 sr2.setName("Ram");
	 sr2.setPer(88);
  		 
	 Student sr3 =new Student();
	 sr3.setId(100);
	 sr3.setName("RamRaje");
	 sr3.setPer(80);
	
       	 Student sr4 =new Student();
	 sr4.setId(102);
	 sr4.setName("Radha");
	 sr4.setPer(89);

	  Bus b1 = new Bus();
	 b1.setIdb(2);
	 b1.setNumb(102);
	 b1.setSrcb("Swarget");
	 b1.setDestb("Hinjewadi");
        
 Student sr5 =new Student();
	 sr5.setId(1001);
	 sr5.setName("Sham");
	 sr5.setPer(81);
		 
	 Student sr6 =new Student();
	 sr6.setId(1002);
	 sr6.setName("Ram");
	 sr6.setPer(82);
  		 
	 Student sr7 =new Student();
	 sr7.setId(1003);
	 sr7.setName("Shree");
	 sr7.setPer(86);

	
	ClasRoom  room= new   ClasRoom();
	   room.addScol(s);
	   room.showschol();
	   room.setBuses(b);
	   room.showBusWiseStudList();
	   room.setStudent(sr1,sr2,sr3,sr4);
	   room.getStudents();
	
	room.setBuses(b1);
	room.showBusWiseStudList();
	room.setStudent(sr5,sr6,sr7);
	room.getStudents();

	}
   }

/*

C:\Users\DELL\OneDrive\Pictures\Documents\Class&Obj\App>java SchoolingAppManagment12
School Name:ABC Address:Warje,pune
__________________________________________________________________________________________________________
BusId   Bus Number:     Source  Destination:
1       100             Warje   Kothrud
__________________________________________________________________________________________________________
Student Id              Student  Name:          Percentage
100                     Ram                     88
101                     Ram                     88
100                     RamRaje                 80
102                     Radha                   89
__________________________________________________________________________________________________________
BusId   Bus Number:     Source  Destination:
2       102             Swarget Hinjewadi
__________________________________________________________________________________________________________
Student Id              Student  Name:          Percentage
1001                    Sham                    81
1002                    Ram                     82
1003                    Shree                   86
__________________________________________________________________________________________________________


*/























