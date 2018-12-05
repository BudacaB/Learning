using System;

namespace FirstConsoleProject
{
    class MainClass
    {
     

        static void Main(string[] args)     // this is a method called "Main". It is called when the program starts
        {
            Console.WriteLine(Utility.CompareValues("hello", "world"));
            Console.WriteLine(Utility.CompareTypes("hello", "world"));

            Console.ReadKey();
        }

    }

    class Utility
    {
        public static bool CompareValues<T01, T02> (T01 value01, T02 value02)
        {
            return value01.Equals(value02);
        }

        public static bool CompareTypes<T01, T02>(T01 type01, T02 type02)
        {
            return typeof(T01).Equals(typeof(T02));
        }
    }
}
