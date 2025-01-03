package com.practice.java_practice.practiceQuestions_short;
//find consecutive vowel in a word
public class ConsecutiveVowel {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the word");
//        String sentence=sc.nextLine().toLowerCase();
        String sentence="abcd aabc aede iogg gfht";
        String[] word=sentence.split(" ");
       ConsecutiveVowel ob=new ConsecutiveVowel();
        int count=0;
        for(int i=0;i< word.length;i++){
           for(int j=0;j<word[i].length();j++){
               if(ob.isVowel(word[i].charAt(j)) && ob.isVowel(word[i].charAt(j + 1))){
                   count++;
                   break;
               }
           }
        }
        System.out.println(count);

    }
    public  boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;
        }
        return false;
    }
}
