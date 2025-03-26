class rum{
private void pour(){
System.out.println("pour 30 ml of rum in a glass");
}

private void addcondiment(){
System.out.println("put soda in the glass");
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