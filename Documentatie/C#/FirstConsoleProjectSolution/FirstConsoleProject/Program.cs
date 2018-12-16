using System;
using System.Collections.Generic;

namespace FirstConsoleProject
{
    class MainClass
    {
        public static char[] StringToArrayOfCharacters(string name)
        {
            return name.ToCharArray();
        }

        public static List<LetterIndicator> ArrayOfObjects(char[] charArray)
        {
            var result = new List<LetterIndicator>();
            for (int i = 0; i < charArray.Length; i++)
            {
                LetterIndicator personNameBreakdown = new LetterIndicator(charArray[i].ToString(), i);
                result.Add(personNameBreakdown);
            }
            return result;
        }

        public static void Main(string[] args)
        {
            foreach (Object obj in args)
            {
                var firstResult = StringToArrayOfCharacters(obj.ToString());
                var secondResult = ArrayOfObjects(firstResult);
                foreach (var personNameLetterAndPosition in secondResult)
                {
                    Console.WriteLine("Letter is {0} and position is {1}", personNameLetterAndPosition.Letter, personNameLetterAndPosition.Position);
                }
            }
        }
    }

    class LetterIndicator
    {
        public LetterIndicator(string letter, int position)
        {
            this._letter = letter;
            this._position = position;
        }

        private string _letter;
        public string Letter
        {
            get { return _letter; }
        }

        private int _position;
        public int Position
        {
            get { return _position; }  
        }


    }
}
