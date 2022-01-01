import java.util.*;
class ClassicHangman
{
    static String wordarray[]={"university","simplest","statement","discussion","essential",
        "exchange","fireplace","explanation","mandatory","independent","manufacture",
        "memorial","official","neighbourhood","occurrence","positive","possible","practical",
        "remarkable","requirement","rhyming","satellite","satisfaction","selection","shallow",
        "spectacle","benevolent","basement", "convention","iconoclast","examination","saviour",
        "treatment","programme","differentiate","garrulous","mercurial","emphatic","conviction",
        "aesthetic"};
    static String hintarray[]={"related to education","easy to understand","single sentence",
        "conversation","necessary","give and take","area for fuel burning in the house",
        "interpretation","compulsory","freedom","production","commemorative object","authority holder",
        "vicinity","happening of an event","confident in opinion","credible","resulting from action",
        "notable,extraordinary","need","simlar sound","object in space","contentment","to choose",
        "superficial","optics","kind","lowermost portion","custom","against established beliefs",
        "test","protect","way of handling","plan","distinct","talkative","fickle",
        "strongly expressive","firm belief","beautiful"};
    static int rndom=(int)((Math.random()*40));
    static String gword=wordarray[rndom];
    static char ch[]=new char[gword.length()];
    static int chance=0;
    static String s;
    static char usedwords[]=new char[26];
    static void displayset()
    {
        System.out.println("LETS PLAY HANGMAN!!");
        System.out.println("The rules of the game are as follows:");
        System.out.println("1.The player needs to guess a word, letter by letter, to win.");
        System.out.println("2.The number of letters of the word to be guessed will be displayed and the word will be covered in '*' at first. ");
        System.out.println("3.The player has to enter a letter of the english alphabet only.");
        System.out.println("4.A particular letter has to be entered only once.");
        System.out.println("5.If the letter is present in the word, the letter position will be revealed.");
        System.out.println("6.If the letter is not present in the word, it will be counted as one incorrect chance");
        System.out.println("7.The player will get 7 incorrect chances.");
        System.out.println("8.The player will be allowed an incorrect guess 6 times and will be hanged on the 7th time.");
        System.out.println("9.Every time a player guesses incorrectly, the picture of the hangman will start to appear.");
        System.out.println("10.A hint will be displayed, which has some relation to the word, after 4 incorrect chances.");
        System.out.println("11.If the player makes 7 incorrect chances, he or she fails to guess the word and loses.");
        System.out.println("12.If the player guesses the word before making 7 incorrect chances, he or she wins.");
        System.out.println("LETS BEGIN!!");
        int l=gword.length();
        int q;
        for(q=0;q<26;q++)
        {
            usedwords[q]='*';
        } 
        for(q=0;q<l;q++)
        {
            ch[q]='*';
        }
        System.out.println("The word you need to guess is a "+l+" letter word.");
        System.out.println("The word is");
        for(q=0;q<l;q++)
        {
            System.out.print(ch[q]);
        }
        System.out.println();
        s="";
        for(q=0;q<l;q++)
        {
            s=s+ch[q];
        }
    }
    static void wordcreate(String choice)
    {
        int i;s="";String x="";char xyz='\u0000'; 
        for(i=0;i<gword.length();i++)
        {
            x=x+ch[i];
        }
        for(i=0;i<gword.length();i++)
        {
            xyz=choice.charAt(0);
            if((gword.charAt(i))==(Character.toLowerCase(xyz)))
            ch[i]=gword.charAt(i);
        }
        for(i=0;i<gword.length();i++)
        {
            s=s+ch[i];
        }
        if(x.equals(s))
        {
            chance=chance+1;
            hangmanpic();
        }
        else
        {
            System.out.println("Your letter was present in the word.");
            System.out.println(s);
            System.out.println("———————————————————————————————————————————————————————————————");
            if(s.equals(gword)==false)
            {
                System.out.print("Used letters are: ");
	        print();
                System.out.println();
            }
        }
        if(s.equals(gword))
        {
            System.out.println("YOU WIN!!");
            System.out.println("WELL DONE!YOU GUESSED THE WORD CORRECTLY.");
            System.out.println("The word was "+gword+".");
            System.out.println("———————————————————————————————————————————————————————————————");
        }
    }
    static void hangmanpic() 
    {
        if(chance==1) 
        {
          System.out.println("INCORRECT GUESS!PLEASE TRY AGAIN.");
	  System.out.println();
	  System.out.println();
	  System.out.println("                                                  You will be hanged in 6 incorrect chances.");
	  System.out.println();
	  System.out.println("___|___");
	  System.out.println("———————————————————————————————————————————————————————————————");
	  System.out.println(s);
	  System.out.print("Used letters are: ");
	  print();
          System.out.println();
        }
	if(chance==2) 
        {
	  System.out.println("INCORRECT GUESS!PLEASE TRY AGAIN.");
	  System.out.println("   |");
	  System.out.println("   |");
	  System.out.println("   |");
	  System.out.println("   |                                              You will be hanged in 5 incorrect chances.");
	  System.out.println("   |");
	  System.out.println("   |");
	  System.out.println("   |");
	  System.out.println("___|___");
	  System.out.println("———————————————————————————————————————————————————————————————");
	  System.out.println(s);
	  System.out.print("Used letters are: ");
	  print();
          System.out.println();
	}
	if(chance==3) 
	{
	  System.out.println("INCORRECT GUESS!PLEASE TRY AGAIN.");
	  System.out.println("   ____________");
	  System.out.println("   |");
	  System.out.println("   |");
	  System.out.println("   |                                              You will be hanged in 4 incorrect chances.");
	  System.out.println("   |");
	  System.out.println("   |");
	  System.out.println("   |");
	  System.out.println("   | ");
	  System.out.println("___|___");
	  System.out.println("———————————————————————————————————————————————————————————————");
	  System.out.println(s);
	  System.out.print("Used letters are: ");
	  print();
          System.out.println();
	}
	if(chance==4) 
	{
	  System.out.println("INCORRECT GUESS!PLEASE TRY AGAIN.");
	  System.out.println("   ____________");
	  System.out.println("   |          _|_");
	  System.out.println("   |         /   \\");
	  System.out.println("   |        |     |                               You will be hanged in 3 incorrect chances.");
	  System.out.println("   |         \\_ _/                                WORD HINT:"+hintarray[rndom]);
	  System.out.println("   |");
	  System.out.println("   |");
	  System.out.println("   |");
	  System.out.println("___|___");
	  System.out.println("———————————————————————————————————————————————————————————————");
	  System.out.println(s);
	  System.out.print("Used letters are: ");
	  print();
          System.out.println();
	}
	if(chance==5) 
	{
	  System.out.println("INCORRECT GUESS!PLEASE TRY AGAIN.");
          System.out.println("   ____________");
	  System.out.println("   |          _|_");
	  System.out.println("   |         /   \\");
	  System.out.println("   |        |     |                               You will be hanged in 2 incorrect chances.");
	  System.out.println("   |         \\_ _/");
	  System.out.println("   |           |");
	  System.out.println("   |           |");
	  System.out.println("   |");
	  System.out.println("___|___");
	  System.out.println("———————————————————————————————————————————————————————————————");
	  System.out.println(s);
	  System.out.print("Used letters are: ");
	  print();
          System.out.println();
        }
	if(chance==6) 
	{
	  System.out.println("INCORRECT GUESS!PLEASE TRY AGAIN.");
	  System.out.println("   ____________");
	  System.out.println("   |          _|_");
	  System.out.println("   |         /   \\");
	  System.out.println("   |        |     |                               You will be hanged in the next incorrect chance.");
	  System.out.println("   |         \\_ _/");
	  System.out.println("   |           |");
	  System.out.println("   |           |");
	  System.out.println("   |          / \\ ");
	  System.out.println("___|___      /   \\");
	  System.out.println("———————————————————————————————————————————————————————————————");
	  System.out.println(s);
	  System.out.print("Used letters are: ");
	  print();
          System.out.println();
	}
	if(chance==7) 
	{
          System.out.println("   ____________");
	  System.out.println("   |          _|_");
	  System.out.println("   |         /   \\");
	  System.out.println("   |        |     |");
	  System.out.println("   |         \\_ _/");
	  System.out.println("   |          _|_");
	  System.out.println("   |         / | \\");
	  System.out.println("   |          / \\ ");
	  System.out.println("___|___      /   \\");
	  System.out.println("YOU LOSE!!");
	  System.out.println("GAME OVER! The word was " + gword+".");
	  System.out.println("———————————————————————————————————————————————————————————————");
	}	
    }
    public static void main()
    {
        int w=0;
        displayset();
        Scanner sc=new Scanner(System.in);
        while(chance<7 && (hasasterisk(s)==true))
        {
           int p=0;int k=0;
           System.out.println("Enter the guess letter");
           String cx=sc.next();
           char abc=cx.charAt(0);
           if((cx.length()==1) && (Character.isLetter(abc)==true))
           {
               for(p=0;p<26;p++)
            {
               if((Character.toLowerCase(abc))==usedwords[p])
               {
                   k=1;
                   break;
               }
            }
            if(k==1)
            {
               System.out.println("ERROR!! LETTER ALREADY USED. PLEASE TRY AGAIN.");
               System.out.println("———————————————————————————————————————————————————————————————"); 
               System.out.print("Used letters are:");
	       print();
               System.out.println();
            }
            else
            {
               usedwords[w]=Character.toLowerCase(abc);
               w=w+1;
               wordcreate(cx);
            }
           }
           else
           {
               System.out.println("ERROR!! INVALID INPUT. PLEASE TRY AGAIN.");
               System.out.println("———————————————————————————————————————————————————————————————");
               print();
               System.out.println();
           }
        }
    }
    static boolean hasasterisk(String acheck)
    {
        int a,f=0;
        for(a=0;a<acheck.length();a++)
        {
            if(acheck.charAt(a)=='*')
            {
                f=1;
                break;
            }  
        }
        if(f==1)
        return true;
        else 
        return false;
    }
    static void print()
    {
        int op;
        for(op=0;op<26;op++)
                {
                   if(Character.isLetter(usedwords[op])==true)
                   System.out.print(usedwords[op]+" ");
                }
    }
  }