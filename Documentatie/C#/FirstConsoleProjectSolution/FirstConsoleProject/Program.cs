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
                LetterIndicator personNameBreakdown = new LetterIndicator();
                personNameBreakdown.Letter = charArray[i].ToString();
                personNameBreakdown.Position = i;
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
        private string _letter;
        public string Letter
        {
            get { return _letter; }
            set { _letter = value; }
        }

        private int _position;
        public int Position
        {
            get { return _position; }
            set { _position = value; }
        }
    }
}
