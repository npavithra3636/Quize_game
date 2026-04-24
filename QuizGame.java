import java.util.Scanner;
class first{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int r,score=0;
System.out.println("WELCOME TO QUIZE GAME\n");
System.out.println("1.what is java\n");
System.out.println("1)programming language");
System.out.println("2)operating system");
System.out.println("3)database");
System.out.println("4)browser\n");
System.out.println("enter your option");
r=sc.nextInt();
if(r==2||r==3||r==4||r>=5){
System.out.println("invalid option\n");
}
else{
System.out.println(" correct answer\n");
score++;
}
System.out.println("2.which keyword is used to create a class in java\n");
System.out.println("1)define");
System.out.println("2)class");
System.out.println("3)struct");
System.out.println("4)object\n");
System.out.println("enter your option");
r=sc.nextInt();
if(r==1||r==3||r==4||r>=5){
System.out.println("invalid option\n");
}
else{
System.out.println(" correct answer\n");
score ++;
}
System.out.println("3.which method is the entry point of a java\n");
System.out.println("1)start()");
System.out.println("2)main()");
System.out.println("3)run()");
System.out.println("4)init()\n");
System.out.println("enter your option");
r=sc.nextInt();
if(r==1||r==3||r==4||r>=5){
System.out.println("invalid option\n");
}
else{
System.out.println(" correct answer\n");
score ++;
}
System.out.println("4.which of the following is used to take input in java\n");
System.out.println("1)cin");
System.out.println("2)inputReader");
System.out.println("3)console.log");
System.out.println("4)Scanner\n");
System.out.println("enter your option");
r=sc.nextInt();
if(r==1||r==2||r==3||r>=5){
System.out.println("invalid option\n");
}
else{
System.out.println(" correct answer\n");
score ++;
}
System.out.println("5.which datatype is used to store numbers\n");
System.out.println("1)String");
System.out.println("2)float");
System.out.println("3)int");
System.out.println("4)char\n");
System.out.println("enter your option");
r=sc.nextInt();
if(r==1||r==2||r==4||r>=5){
System.out.println("invalid option\n");
}
else{
System.out.println(" correct answer\n");
score ++;
}
System.out.println("final score:"+score+"/5");
}
}
