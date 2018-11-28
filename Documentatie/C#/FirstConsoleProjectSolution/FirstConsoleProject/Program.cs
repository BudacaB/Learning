using System;
using System.Collections.Generic;

namespace FirstConsoleProject
{

    class Animal
    {
        // CLASS VARIABLES

        public static int Count = 0;

        public string name;
        public int age;
        public float happiness;

        // CLASS CONSTRUCTORS

        public Animal ()
        {
            name = "Bruno";
            age = 6;
            happiness = 0.5f;

            Count++;
        }

        public Animal (string _name, int _age, float _happiness)
        {
            name = _name;
            age = _age;
            happiness = _happiness;

            Count++;
        }

        // CLASS METHODS

        public void Print ()
        {
            Console.WriteLine("Name: " + name);
            Console.WriteLine("Age: " + age);
            Console.WriteLine("Happiness: " + happiness);
        }
    }

    class MainClass
    {
        static void Main(string[] args)     // this is a method called "Main". It is called when the program starts
        {

            Animal dog = new Animal();
            dog.Print();

            Console.WriteLine();

            Animal cat = new Animal("Tom", 10, 0.8f);
            cat.Print();

            Console.WriteLine();
            Console.WriteLine("Num of animals: " + Animal.Count);


            Console.ReadKey();
        }

    }
}
