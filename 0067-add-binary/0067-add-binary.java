class Solution {
    public String addBinary(String a, String b) {
        
         int x=a.length()-1;//1
         int y=b.length()-1;//0
         String ans="";
         int t=0; 

         while(x>=0 && y>=0){

            if(a.charAt(x)==b.charAt(y)){
                if(a.charAt(x)=='0'){
                    if(t==0)
                    ans="0"+ans;

                    else{
                    ans="1"+ans;
                    t=0;
                    }
                }
                else{
                     if(t==0)
                    ans="0"+ans;
                    
                    else
                    ans="1"+ans;
                    t=1;
                    
                }
            }  
            else{
                     if(t==0)
                    ans="1"+ans;

                    else{
                    ans="0"+ans;
                    t=1;
                    }
            }  
             x--;
             y--;       
            
         }
         
         
         if(x>=0){
               
               while(x>=0){
                if(t==0)
                return a.substring(0,x+1)+ans;

                else{
                    if(a.charAt(x)=='1')
                    ans ="0"+ans;

                    else{
                        ans="1"+ans;
                        t=0;
                    }
                }
                x--;
               }
            }
            else if(y>=0){
                while(y>=0){
                
                    if(t==0)
                    return b.substring(0,y+1)+ans;

                    else{
                        if(b.charAt(y)=='1')
                         ans ="0"+ans;

                        else{
                        ans="1"+ans;
                        t=0;
                        }
                    }
                     y--;
               }
            }
            
                if(t==0)
                return ans;
                else 
                return "1"+ans;
            
           
    }
}