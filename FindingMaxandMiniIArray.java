// find mini and maximum size of an array
// {20,50,150} max =20 <-> 50 <-> 150
public class FindingMaxandMiniIArray {
    public static void main(String[] args) {
 int a[] = {10, 6, 324,45,9808 };
 int min =a[0];
 int max =a[0];
 for (int i=0; i<a.length;i++)
 {
  if (a[i]>max)
      max =a[i];
  if (a[i]<min)
      min=a[i];
 }
        System.out.println("Max value"+ max );
        System.out.println("Max value"+ min );

    }
}
