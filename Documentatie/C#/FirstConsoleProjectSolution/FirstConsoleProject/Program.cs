using System;


namespace FirstConsoleProject
{
    class MainClass
    {
        static void Main(string[] args)     // this is a method called "Main". It is called when the program starts.
        {
            int numero1;
            int numero2;

            Console.Write ("Type a dividend: ");
            numero1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Type a divisor: ");
            numero2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("The divison between " + numero1 + " and " + numero2 + " is " + numero1 / numero2 );
            Console.ReadKey();
        }
    }
}
