package project123;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class abcd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> wordlist = new ArrayList<String>();
		ArrayList<Integer> index = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("ted.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;
            String[] word = line.split("[\\s\\!\\.\\,\\?\\']+");
            for(int i = 0; i < word.length; i++)
            {
            	if(!word[i].equals("")&& word[i] != null)
            	{
            		if(wordlist.contains(word[i]))
            		{
            			index.set(wordlist.indexOf(word[i]), index.get(wordlist.indexOf(word[i]))+1);
            		}
            		else
            		{
            			index.add(1);
            			wordlist.add(word[i]);
            		}
            	}
            }
        }
        br.close();
        
        for(int i = 0; i < wordlist.size(); i++)
        {
        	System.out.println(wordlist.get(i)+":"+index.get(i));
        }
        
        Scanner sn = new Scanner(System.in);
        System.out.print("찾으려는 단어를 입력하세요 : ");
        
        while(true)
        {
        	String st = sn.nextLine();
        	
        	if(st.contains("exit"))
        	{
        		break;
        	}
        	
        	if(wordlist.contains(st))
        	{
        		System.out.println("----found----");
        	}
        	else
        	{
        		System.out.println("----not found----");
        	}
        }
        sn.close();
	}
}

