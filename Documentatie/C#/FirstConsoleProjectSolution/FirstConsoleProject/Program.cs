using System;
using System.Collections.Generic;

namespace FirstConsoleProject
{
    class MainClass
    {
        static void Main(string[] args)     // this is method called "Main". It is called when the program starts
        {

            Random numberGen = new Random();

            int numberOfAttempts = 0;
            int attempt = 0;

            while (attempt != 6)
            {
                attempt = numberGen.Next(1, 7);
                Console.WriteLine("Tom rolled: " + attempt + ".");
                numberOfAttempts++;
            }

            Console.WriteLine("It took Tom " + numberOfAttempts + " attempts to roll a six");

            Console.ReadKey();
        }

    }
}
