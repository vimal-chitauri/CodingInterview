//package loveBabberSheet.String;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
//public class printAnagram {
//
//    // A Java program to print all anagrams together
//    // class for each word of duplicate array
//    static class Word {
//        String str; // to store word itself
//        int index; // index of the word in the
//        // original array
//
//        // constructor
//        Word(String str, int index) {
//            this.str = str;
//            this.index = index;
//        }
//    }
//
//    // class to represent duplicate array.
//    static class DupArray {
//        Word[] array; // Array of words
//        int size; // Size of array
//        public DupArray(String str[], int size) {
//            this.size = size;
//            array = new Word[size];
//            int i;
//            for (i = 0; i < size; ++i) {
//                array[i] = new Word(str[i], i);
//            }
//        }
//    }
//    static class compStr implements Comparator<Word> {
//        public int compare(Word a, Word b) {
//            return a.str.compareTo(b.str);
//        }
//    }
//    static List<List<String>> printAnagramsTogether(String wordArr[],
//                                                    int size) {
//        List<List<String>> list = new ArrayList<>();
//        List<String> subList = new ArrayList<>();
//        DupArray dupArray = new DupArray(wordArr, size);
//        int i;
//        for (i = 0; i < size; ++i) {
//            char[] char_arr = dupArray.array[i].str.toCharArray();
//            Arrays.sort(char_arr);
//            dupArray.array[i].str = new String(char_arr);
//        }
//        Arrays.sort(dupArray.array, new compStr());
//        for (i = 0; i < size; i++) {
//            if (size > i + 1 && dupArray.array[i].str.equals(dupArray.array[i + 1].str) ) {
//                subList.add(wordArr[dupArray.array[i].index]);
//            }else{
//                subList.add(wordArr[dupArray.array[i].index]);
//                list.add(subList);
//                subList = new ArrayList<>();
//            }
//
//        }
//       ;
//        //System.out.print(wordArr[dupArray.array[i].index] + " ");
//        return list;
//    }
//
//
//
//
//
//
//
//    static class Word{
//        String str;
//        int index;
//        Word(String str, int index){
//            this.str=str;
//            this.index=index;
//        }
//    }
//
//    static class Duplicate{
//        Word[] array;
//        int size;
//
//        Duplicate(String[] str, int size){
//            this.size=size;
//            array=new Word[size];
//
//            for(int i=0;i<size;i++){
//                array[i]=new Word(str[i],i);
//            }
//        }
//
//
//    }
//
//    static class Comp implements Comparator<Word> {
//        public int compare(Word a,Word b){
//            return a.str.compareTo(b.str);
//        }
//    }
//
//    public List<List<String>> Anagrams(String[] string_list) {
//        List<List<String>> list = new ArrayList<>();
//        List<String> sublist = new ArrayList<>();
//
//        Duplicate duplicate = new Duplicate(string_list, string_list.length);
//
//        for(int i=0;i<string_list.size();i++){
//            char[] array= duplicate.array[i].str.toCharArray();
//            Arrays.sort(array);
//            duplicate.array[i].str=new String(array);
//        }
//Arrays
//        Arrays.sort(duplicate.array,new Comp());
//
//        for(int i=0; i< string_list.size();i++){
//            if(string_list.size()>i+1 && uplicate.array[i].str.equals(duplicate.array[i+1].str)){
//                sublist.add(string_list[uplicate.array[i].index]);
//            }else{
//                sublist.add(string_list[uplicate.array[i].index]);
//                list.add(sublist);
//                sublist=new ArrayList<>();
//            }
//        }
//        return list;
//    }
//    // Driver program to test above functions
//    public static void main(String args[]) {
//        String wordArr[] = {"cat", "dog", "tac", "god", "act"};
//        int size = wordArr.length;
//        printAnagramsTogether(wordArr, size);
//    }
//}
