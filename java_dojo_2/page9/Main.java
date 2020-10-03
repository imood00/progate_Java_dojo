import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle ("ビアンキ","緑",0);
    Scanner scanner = new Scanner (System.in);
    
      System.out.println("【自転車の情報】");
      bicycle.printData();
      System.out.println("-----------------");
      System.out.print("走る距離を入力してください：");
      int bicycleDistance =scanner.nextInt();
      bicycle.run(bicycleDistance);
      
      System.out.println("=================");
      Car car = new Car ("フェラーリ","赤");
      System.out.println("【車の情報】");
      car.printData();
      
      System.out.println("-----------------");
      System.out.print("走る距離を入力してください：");
      int carFuel =scanner.nextInt();
      car.run(carFuel);
      }
}