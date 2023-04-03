import java.util.Scanner;

class Animal {
    String name;
    double height;
    int weight;
    double speed;

    void show(){
        System.out.println("姓名:"+name+" 身高:"+height+"(m)"+" 體重:"+weight+"(kg)"+" 速度:"+speed+"(m/min)");
    }

    double distance(int x ,double y){
        double k=x*y*speed;
        return k;
    }

    double distance(int x){
        double k=x*speed;
        return k;
    }

    public void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    
    }
}















public class A1103316_0331 {
    public static void main(String[] args) {
        
    

    Animal snowbaby = new Animal();
    snowbaby.name="雪寶";
    snowbaby.height=1.1;
    snowbaby.weight=52;
    snowbaby.speed=100;

    Animal donkey = new Animal();
    donkey.name="驢子";
    donkey.height=1.5;
    donkey.weight=99;
    donkey.speed=200;
    
    human ark = new human();
    ark.name="阿克";
    ark.height=1.9;
    ark.weight=80;
    ark.sex="男";
    ark.speed=150;

    human hansse = new human();
    hansse.name="漢斯";
    hansse.height=1.8;
    hansse.weight=78;
    hansse.sex="男";
    hansse.speed=130;

    human anna = new human();
    anna.name="安那";
    anna.height=1.7;
    anna.weight=48;
    anna.sex="女";
    anna.speed=120;

    snow aisa = new snow();
    aisa.name="愛沙";
    aisa.height=1.7;
    aisa.weight=50;
    aisa.sex="女";
    aisa.snowskill="Yes";
    aisa.speed=120;



    snowbaby.showinfo();
    snowbaby.show();
    Scanner sc = new Scanner(System.in);
    System.out.print("請輸入"+snowbaby.name+"的時間(min):");
    int x =sc.nextInt();
    System.out.print("請輸入"+snowbaby.name+"的加速度(不需要可以隨便案):");
    double y =sc.hasNextDouble() ? sc.nextDouble() : 1;

    if (y == 1) {
        System.out.println(snowbaby.name+"的奔跑距離為"+snowbaby.distance(x));    
    }else if (y==0){
        System.out.println("不知道題目要幹嘛");
    } 
    else {
        System.out.println(snowbaby.name+"的奔跑距離為"+snowbaby.distance(x,y));
    }

    donkey.showinfo();
    donkey.show();
    Scanner sc1 = new Scanner(System.in);
    System.out.print("請輸入"+donkey.name+"的時間(min):");
    int x1 =sc1.nextInt();
    System.out.print("請輸入"+donkey.name+"的加速度(不需要可以隨便案):");
    double y1 =sc1.hasNextDouble() ? sc1.nextDouble() : 1;

    if (y1 == 1) {
        System.out.println(donkey.name+"的奔跑距離為"+donkey.distance(x1));    
    }else if (y1==0){
        System.out.println("不知道題目要幹嘛");
    }else {
        System.out.println(donkey.name+"的奔跑距離為"+donkey.distance(x1,y1));
    }

    ark.showinfo();
    ark.show();
    Scanner sc2 = new Scanner(System.in);
    System.out.print("請輸入"+ark.name+"的時間(min):");
    int x2 =sc2.nextInt();
    System.out.print("請輸入"+ark.name+"的加速度(不需要可以隨便案):");
    double y2 =sc2.hasNextDouble() ? sc2.nextDouble() : 1;

    if (y2 == 1) {
        System.out.println(ark.name+"的奔跑距離為"+ark.distance(x2));    
    }else if (y2 == 0){
        System.out.println("不知道題目要幹嘛");
    }else {
        System.out.println(ark.name+"的奔跑距離為"+ark.distance(x2,y2));
    }


    hansse.showinfo();
    hansse.show();
    Scanner sc3 = new Scanner(System.in);
    System.out.print("請輸入"+hansse.name+"的時間(min):");
    int x3 =sc3.nextInt();
    System.out.print("請輸入"+hansse.name+"的加速度(不需要可以隨便案):");
    double y3 =sc3.hasNextDouble() ? sc3.nextDouble() : 1;

    if (y3 == 1) {
        System.out.println(hansse.name+"的奔跑距離為"+hansse.distance(x3));    
    }else if (y3 == 0){
        System.out.println("不知道題目要幹嘛");
    }else {
        System.out.println(hansse.name+"的奔跑距離為"+hansse.distance(x3,y3));
    }


    anna.showinfo();
    anna.show();
    Scanner sc4 = new Scanner(System.in);
    System.out.print("請輸入"+anna.name+"的時間(min):");
    int x4 =sc4.nextInt();
    System.out.print("請輸入"+anna.name+"的加速度(不需要可以隨便案):");
    double y4 =sc4.hasNextDouble() ? sc4.nextDouble() : 1;

    if (y4 == 1) {
        System.out.println(anna.name+"的奔跑距離為"+anna.distance(x4));    
    }else if (y4 == 0){
        System.out.println("不知道題目要幹嘛");
    } else {
        System.out.println(anna.name+"的奔跑距離為"+anna.distance(x4,y4));
    }

    aisa.showinfo();
    aisa.show();
    Scanner sc5 = new Scanner(System.in);
    System.out.print("請輸入"+aisa.name+"的時間(min):");
    int x5 =sc5.nextInt();
    System.out.print("請輸入"+aisa.name+"的加速度(不需要可以隨便案):");
    double y5 =sc5.hasNextDouble() ? sc5.nextDouble() : 1;

    if (y5 == 1) {
        System.out.println(aisa.name+"的奔跑距離為"+aisa.distance(x5));    
    }else if (y5 == 0){
        System.out.println("不知道題目要幹嘛");
    } else {
        System.out.println(aisa.name+"的奔跑距離為"+aisa.distance(x5,y5));
    }








    }
}


class human extends Animal{
    String sex;


    void show(){
        System.out.println("姓名:"+name+" 身高:"+height+"(m)"+" 體重:"+weight+"(kg)"+" 性別"+sex+" 速度:"+speed+"(m/min)"); 
    }
}

class snow extends human{
    String snowskill;

    void show(){
        System.out.println("姓名:"+name+" 身高:"+height+"(m)"+" 體重:"+weight+"(kg)"+" 性別"+sex+" 冰雪技能:"+snowskill+" 速度:"+speed+"(m/min)"); 
    }

    double distance(int x ,double y){
        double k=x*y*speed;
        return 2*k;
    }

    double distance(int x){
        double k=x*speed;
        return 2*k;
    }


}