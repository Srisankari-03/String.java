package String;

public class RevomeSpace {
    public void main(String[] args){
        //Approach-1 Using replace
        String str = "Java Programming Language";
        System.out.println("Replace: "+str.replace(" ",""));

        //Approach-2 Using for loop 
        String newString = "";
        for(int i=0;i<str.length();i++){
            char ch =  str.chatAt(i);
            if(ch !=' '){
                newString = newString + ch;
            }
        }
        System.out.println("After remove space(for loop):"+)

    }
}