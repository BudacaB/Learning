using System;

namespace FirstConsoleProject
{
    class MainClass
    {
        static void Main(string[] args)     // this is method called "Main". It is called when the program starts
        {
            Random numberGenerator = new Random();

            int num1 = numberGenerator.Next(1, 11);
            int num2 = numberGenerator.Next(1, 11);
            int responseIndex = numberGenerator.Next(1, 4);

            Console.WriteLine("What is the result of " + num1 + " times " + num2 + "?");
            int answer = Convert.ToInt32(Console.ReadLine());
            if (answer == num1 * num2)
            {
                switch (responseIndex)
                {
                    case 1:
                        Console.WriteLine("Congrats, you've got it!");
                        break;
                    case 2:
                        Console.WriteLine("Correct!");
                        break;
                    default:
                        Console.WriteLine("Well done!");
                        break;
                }
            } else
            {
                switch (responseIndex)
                {
                    case 1:
                        Console.WriteLine("Are you even trying?");
                        break;
                    case 2:
                        Console.WriteLine("The answer was incorrect.");
                        break;
                    default:
                        Console.WriteLine("You can do better than that.");
                        break;
                }
            }
        }
    }
}
