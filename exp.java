class AgeException extends Exception{
    AgeException(String str){
        super(str);
    }
}

public class exp {
    public static void main(String[] args) {
    
    try {
        int age = 19;
        if(age<18){
            throw new AgeException("Age must be valid");
        }
        else{
            System.out.println("Eligbile to  vote u are");
        }
        
    } catch (AgeException e) {
        System.out.println("Catcheddd" + e.getMessage());
    } 
    finally{
        System.out.println("Hii babes");
    }
    }
}
