import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
    System.out.print("何人分の情報を入力しますか：");
    int n = scanner.nextInt();
    int maxAge =0;
    
    for (int i= 0; i<n ;i++){
    System.out.println(n+"人目");
    
    System.out.print("名前：");
    String firstName = scanner.next();
    
    System.out.print("名字：");
    String lastName = scanner.next();

    System.out.print("年齢：");
    int age = scanner.nextInt();
    
   if (age > maxAge) {
    maxAge = age;
     
   }
    
    System.out.print("身長(m)：");
    Double height = scanner.nextDouble();
    
    System.out.print("体重(kg)：");
    Double weight = scanner.nextDouble();

    Person.printData(firstName, lastName, age, height, weight);

    }
    
    System.out.println("最高年齢は"+maxAge+"歳です");
  }
  
}



  
  
  