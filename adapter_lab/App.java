public class App{
public static void main(String args[]){
Crow crow = new IndianCrow();
Swan swan = new IndianSwan();
CrowAdapter crowadapter = new CrowAdapter(crow);
client(crowadapter);
}

public static void client(Swan swan){
swan.eat();
swan.sing();
swan.swim();
}
}