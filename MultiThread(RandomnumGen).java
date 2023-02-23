package oopj22;
import java.util.Random;
import java.util.Scanner;

class Randomnum extends Thread{
int lim;

public void run() {
Random r=new Random();
for(int i=0;i<=lim;i++) {
int num=r.nextInt(100);
System.out.println("Random number="+num);
if(num%2==0) {
Square sq=new Square(num);
sq.start();
}
else {
Cube cu=new Cube(num);
cu.start();
    }
try {
Thread.sleep(1000);
}
catch(InterruptedException e) {
System.out.println(e.getMessage());
 }
}
}
}
class Square extends Thread{
int n;
Square(int num){
n=num;
}
public void run(){
System.out.println("Square of the number "+n+" is "+n*n);

}


}
class Cube extends Thread{
int n;
Cube(int num){
n=num;
}
public void run() {
System.out.println("Cube of the number "+n+" is "+n*n*n);
}

}

public class MultiThreadDemo {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
Randomnum r1=new Randomnum();
System.out.println("How many times do you want to generate the number");
r1.lim=s.nextInt();
r1.start();

}

}
