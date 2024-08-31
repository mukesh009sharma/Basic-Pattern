import java.util.Scanner;
public class Edureka
{
public static void main(String args[])
{
int n, i, j, space = 1;
System.out.print("Enter the number of rows: ");
Scanner s = new Scanner(System.in);
n = s.nextInt();
space = n - 1;
for (j = 1; j&lt;= n; j++)
{
for (i = 1; i&lt;= space; i++)
{
System.out.print(" ");
}
space--;
for (i = 1; i &lt;= 2 * j - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
space = 1;
for (j = 1; j&lt;= n - 1; j++)
{
for (i = 1; i&lt;= space; i++)
{
System.out.print(" ");
}
space++;
for (i = 1; i&lt;= 2 * (n - j) - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
}
}
