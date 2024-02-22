class Praffull
{
public void show()
{
System.out.println("I follow chelsea and ferrari racing");
}
}

class Soham extends Praffull
{
public void show()
{
System.out.println("soham follows liverpool and aston martin");
}
}


class MethodOverriding
{
public static void main(String args[])
{
/*
Soham so=new Soham();
so.show();
so.show();
soham follows liverpool and aston martin
soham follows liverpool and aston martin
*/
Praffull ref;
Praffull x=new Praffull();
Soham y=new Soham();

ref=x;
ref.show();

ref=y;
ref.show();

}
}





