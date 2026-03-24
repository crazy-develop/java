public class countgreater {
    public static void main (String[] args){

    
    int[] arr = {3, 7, 9, 2, 5};
int X = 5;
int count = 0;

for (int num : arr) {
    if (num > X) count++;
}

System.out.println(count);
}
}