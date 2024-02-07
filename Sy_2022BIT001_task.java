public class Sy_2022BIT001_task {
    public static void main(String[] args) {
        Character arr[]={'2','0','2','2','B','I','T','0','0','1'};
        if(verifyRegistrationNum(arr)){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
    public static boolean verifyRegistrationNum(Character arr[]){
        for(int i=0;i<=arr.length;i++){
            if(i<4||(i>=7&&i<arr.length)){
                boolean b=Character.isDigit(arr[i]);
                if(!b){
                    return false;
                }
                }
                if(i>=4&& i<7){
                    boolean c= Character.isAlphabetic(arr[i]);
                    if(!c){
                        return false;
                    }
                    }
                }
                return true;
    }
 }
    
