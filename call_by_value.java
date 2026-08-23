public class call_by_value{
    static void modify(int a){
        a+=10;
    }
    public static void main(String[] args){
        int x=5;
        modify(x);
        System.out.println(x);
    }
}