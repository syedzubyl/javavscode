import java.util.ArrayList;

public class main2 {
public static void main(String[] args) {
  int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
  int l=9;
  int x=5;
  //2 5 return are object arraylist integer
  firstandlast fa =new firstandlast();
  ArrayList<Integer> arrr = fa.find(arr, l, x);
  System.out.println(arrr);
}
}
