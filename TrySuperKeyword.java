class Sports
{
public Sports()
{
System.out.println("BASE...sports make life live");
}
public Sports(String club)
{
System.out.println("club name is "+club);
}
}

class Football extends Sports
{
public Football()
{
//super(); automatically called
super("chelsea");
System.out.println("DERIVED...i follow english premier league football");
}
}


class TrySuperKeyword
{
public static void main(String args[])
{
Football f=new Football();
}
}