							//final keyword in java
// 1. if u declare any class as final in java then u cannot inherit that class
// 2. if u declare any variable as final than u cannot change the value of that variable
// 3. if u declare any method as final then u cannot override that method

public final class Base1 //here we have used final keyword it will throw an error! (reference point 1.)
{
public final int area(int l, int b)
{
return l*b;
}
}