public class Triangle {
    public static void main(String[] args) {
            pattern(4,0);
            triangle2(4, 0);

    }
    public static void pattern(int r, int c){
        if(r==0){
            return;
        }
        if(c<r) {
            System.out.print("*");
            pattern(r, c + 1);
        }
        else{
            System.out.println();
            pattern(r-1, 0);
        }
    }
    public static void triangle2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle2(r, c+1);
            System.out.print("*");
        }
        else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }
}
