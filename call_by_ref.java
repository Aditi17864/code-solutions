class Wrapper{
    int value=5;
}

public class call_by_ref {
    static void modify(Wrapper obj){
        obj.value+=10;
    }
    public static void main(String[] args){
        Wrapper w = new Wrapper();
        modify(w);
        System.out.println(w.value);
    }
}
