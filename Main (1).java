/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {

  public static void main(String[] args) {
           Employee[] employee = new Employee[3];
           for(int i=0;i<3;i++)
           {
             employee[i] = new Employee();
             employee[i].getDetails();
               employee[i].displayDetails();
             
           }
           Engineer engineer = new Engineer();
           {
           
               
               
               engineer.project ();
               engineer.internship ();
               engineer.seminar ();
               }
             Doctor doctor = new Doctor ();
             {
               doctor.cardiologist ();
               doctor.orthopedic ();
               doctor.gynaecologist ();
               
             }
               
             Pilot pilot = new Pilot ();
             {
               pilot.groupInteractions();
               pilot.aviation();
               pilot.calculatingFuel();
             }
           }
           
  }