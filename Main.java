package String;

public class Main {
    public static void main(String[] args){
        String str="Java Programming";
        //len of the string
        int len=str.length();
        System.out.println("Length:"+len);
        //charAt()->access a specific char
        char ch=str.charAt(13);
        System.out.println("Access char:"+ch);
        //to get a substring(begin index, end index+1)
        String subStr=str.substring(5,12);
        System.out.println("Substring:"+subStr);
        // to upper case
        System.out.println("UpperCase:"+str.toUpperCase());
        //to lower case
        System.out.println("LowerCase:"+str.toLowerCase());
        //to check  substring contains by the string
        System.out.println("Java contains:"+str.contains("Java"));
        //to replace substring or char
        System.out.println("Replace Python:"+str.replace("Java","Python"));

        //----------Compare------------
        String name="Rahul";
        boolean isSame=str.equals("Java Programming");
        System.out.println("Same Compare:"+isSame);//false
        boolean isSameCase=name.equalsIgnoreCase("rahul");
        System.out.println("Without Case sensitive:"+isSameCase);//true

    }

}
