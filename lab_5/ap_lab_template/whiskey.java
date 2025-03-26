class whiskey{
private void pour(){
System.out.println("pour 30 ml of whiskey in a glass");
}

private void addcondiment(){
System.out.println("put ice in the glass");
}

private void stir(){
System.out.println("stir the glass");
}

private void serve(){
System.out.println("serve through waiter");
}

public void templateMethod(){
pour();
addcondiment();
stir();
serve();
}
}