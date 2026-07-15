public class stringsCC {
    public static boolean isPalindrome(String str){
        for(int i=0;i<(str.length())/2;i++){
             int n=str.length();
             if(str.charAt(i) != str.charAt(n-i-1)){//focus on when unequal
                return false;
             }
                
             }return true;
    }
}




//SHORTEST PATH DIRECTION WALA Q 
    public static float getShortestPath(String path ){  //why float not int as at such lace jaha sq root nhi exist karta uske liye float value 
        float x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
                if(dir=='N'){
                    y++;
                }
                else if(dir=='S'){
                    y--;
                }
                else if(dir=='W'){
                    x--;
                }
                else{
                    x++;
                }

        }
        float X2=x*x;               //we consider starting from the origin always 
        float Y2=y*y;
        return (float)Math.sqrt(X2+Y2);     
    }









// public static void main(String args[]){
//     String S1="RITIKA";
//     String S2="RITIKA";
//     String S3= new String("RITIKA");

//         if(S1==S2){
//             System.out.println("equal");
//         }
//         else{
//              System.out.println(" not equal");
//         }

//          if(S1==S3){
//             System.out.println("equal");
//         }
//         else{
//              System.out.println(" not equal");
//         }
    
//          if(S1.equals(S3)){
//             System.out.println("equal");
//         }
//         else{
//              System.out.println(" not equal");
//         }
    
// }




public static String substring(String str,int si,int ei){
    String subst="";
    for(int i=si;i<ei;i++){
        subst+=str.charAt(i);
        si++;
    }
    return subst;
}

//COMPARE TO FUNCTION
// public static void main(String args[]){
//     String s1="ritika";
//     String s2="RITIKA";
//     System.out.print(s1.compareToIgnoreCase(s2));//give 0 or equal as 
// }




 
//STRING BUILDER 
// public static void main(String args[]){
//     StringBuilder sb= new StringBuilder("");
//     for(char ch='a';ch<='z';ch++){
//         sb.append(ch);//string builder ka ek func h append aisi bohot sare funcs h
//     }//eski tc is o(26) yahi par if i had made a string then a loop tc(26*26)
// System.out.print(sb); 
// }






//TO UPPERCASE
public static String toUpperCase(String str){
    StringBuilder sb= new StringBuilder("");

    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()-1){//last condition for end
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
    } return sb.toString();
}





//STRING COMPRESSOR 
public static String compress(String str){
    String newstr = " ";

        for(int i=0;i<str.length();i++){
            Integer count=1;//int nhi likha kyuki badh me string me add hoga toh integer nhi ho payega we made a class to get object
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                  count++;
                  i++;
            }
            newstr+= str.charAt(i);
            if(count>1){
                newstr+= count.toString();
            }

       
       
        }

return newstr;
}//tc is o(n)
//also solve using string builder 


public static void main(String args[]){
    String str="abbcaaade";
    System.out.print(compress(str));
}





