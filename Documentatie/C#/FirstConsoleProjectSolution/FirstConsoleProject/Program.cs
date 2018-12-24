using System;
using System.Collections.Generic;
using System.Text;

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
            foreach (Object input in args)
            {
                var firstResult = StringToArrayOfCharacters(input.ToString());
                var secondResult = ArrayOfObjects(firstResult);
                StringBuilder builder = new StringBuilder();
                foreach (var personNameLetterAndPosition in secondResult)
                {
                    var fileName = $"{input}_on_{Environment.UserName}";
                    var path = $"{Environment.CurrentDirectory}/{ fileName }.txt";
                    //StringBuilder path = new StringBuilder();
                    //path.Append(Environment.CurrentDirectory).Append("/").Append(input).Append(".txt");
                    builder
                        .Append("Letter is: ")
                        .Append(personNameLetterAndPosition.Letter)
                        .Append(" and position is: ")
                        .Append(personNameLetterAndPosition.Position)
                        .Append(Environment.NewLine);
                    System.IO.File.WriteAllText(path, builder.ToString());
                    //System.IO.File.WriteAllText(path.ToString(), builder.ToString());
                };
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
