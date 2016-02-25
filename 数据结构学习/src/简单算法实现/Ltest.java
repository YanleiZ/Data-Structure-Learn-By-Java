package 简单算法实现;
//全排列算法，复制自网络
//http://blog.csdn.net/randyjiawenjie/article/details/6313729
//需要时间看看
public class Ltest {  
    public static int total = 0;  
    public static void swap(int[] str, int i, int j)  
    {  
        int temp ;  
        temp = str[i];  
        str[i] = str[j];  
        str[j] = temp;  
    }  
    public static void arrange (int[] str, int st, int len)  
    {  
        if (st == len - 1)  
        {  
            for (int i = 0; i < len; i ++)  
            {  
                System.out.print(str[i]+ "  ");  
            }  
            System.out.println();  
            total++;  
        }  
        else  
        {  
            for (int i = st; i < len; i ++)  
            {  
                swap(str, st, i);  
                arrange(str, st + 1, len);  
                swap(str, st, i);  
            }  
        }  
          
    }  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
         int str[] = {1,2,3,4,5,6,7,8,9,0};  
         arrange(str, 0, str.length);  
         System.out.println(total+"种情况！");  
    }  
}  