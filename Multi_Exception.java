public class Multi_Exception {
    public static void main(String[] args){
    
    try{
        int[] num = {1,2,3,4,5};
        System.out.println(num[10]);
        int result = 10 / 3;
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index does not exits..");
    }catch(ArithmeticException e){
        System.out.println("Can not divide by zero..");
    }catch(Exception e){
        System.out.println("Somthing else went wrong..");
    } 
}
    int[] num = {1,2,3,4,5};
        System.out.println(num[10]);
        int result = 10 / 3;
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index does not exits..");
    }catch(ArithmeticException e){
        System.out.println("Can not divide by zero..");
    }catch(Exception e){
        System.out.println("Somthing else went wrong..");
    } 
}
    
    
}
