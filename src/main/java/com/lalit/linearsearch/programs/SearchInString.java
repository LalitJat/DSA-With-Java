package com.lalit.linearsearch.programs;

public class SearchInString {

    public static void main(String[] args) {
        String name = "Lalit Jat";
        char target = 'l';

        boolean isPresentInString = searchInString2(name, target);
        System.out.println("Char is present in String : "+ isPresentInString);

        target = ' ';
        isPresentInString = searchInString2(name, target);
        System.out.println("Char is present in String : "+ isPresentInString);
    }

    static boolean searchInString1(String str, char target){
        for (char c : str.toCharArray()){
            if(c == target)
                return true;
        }
        return false;
    }

    // better approach then 1
    static boolean searchInString2(String str, char target){

        if(str.isEmpty()){
            return false;
        }

        for (char c : str.toCharArray()){
            if(c == target)
                return true;
        }
        return false;
    }

    // search by using predefined method
    static boolean searchInStringByIndexOf(String str, char target) {
        return str.indexOf(target) != -1;
    }
}
