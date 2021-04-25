package codingInterview1_9;

import java.util.Scanner;

public class codingInterviewArray3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in).useDelimiter("\n");
        String inputString=scanner.next();
        Scanner scanner1=new Scanner(System.in);
       // scanner1.nextInt();
        int sizeOfInputString=scanner1.nextInt();
        char[] inputArray=inputString.toCharArray();
        methodForUlrify(inputArray,sizeOfInputString);
    }

    private static void methodForUlrify(char[] inputString, int sizeOfInputString) {
        int index,spaceCount=0;

        for (int i = 0; i <sizeOfInputString-1 ; i++) {
            if(inputString[i]==' '){
                spaceCount++;
            }
        }
        index=sizeOfInputString+spaceCount*2;
        if(inputString.length>sizeOfInputString) inputString[sizeOfInputString]='\0';
        char[] newArray=new char[index];
        for (int j = sizeOfInputString-1; j >=0 ; j--) {
            if(inputString[j]==' '){
                newArray[index-1]='0';
                newArray[index-2]='2';
                newArray[index-3]='%';
                index=index-3;
            }else{
                newArray[index-1]=inputString[j];
                index--;
            }

        }
         System.out.println(newArray);
    }

}
