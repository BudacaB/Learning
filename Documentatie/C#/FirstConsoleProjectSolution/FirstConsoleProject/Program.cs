using System;

namespace FirstConsoleProject
{
    class MainClass
    {
     

        public static void Main(string[] args)
        {

            StringToArrayOfCharacters("Protopopitericescovici");

        }

        public static void StringToArrayOfCharacters(string name)
        {
            char[] characters = name.ToCharArray();
            for (int i = 0; i < characters.Length; i++)
            {
                Console.WriteLine(characters[i]);
            } 
        }
    }                                                               

    class StringToArrayWithPositionM
    {

        public string letter = "Bogdan";
        public int position = 0;

        public static void StringToArrayWithPositionMethod(string letter)
        {
            char[] charac = letter.ToCharArray();
            for (int position = 0; position < charac.Length; position++)
            {
                Console.WriteLine(position + ": " + charac[position]);
            }
        }

    }
    
}
