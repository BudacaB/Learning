using System;
using System.Collections.Generic;

namespace FirstConsoleProject
{
    enum Breed { Bulldog, Boxer, Chihuahua, Briard };

    // Base class
    class Animal
    {
        public string name;
        public int age;
        public float happiness;
    }

    // Derived class
    class Dog: Animal
    {
        public Breed breed;

        public Dog (string _name, int _age, float _happiness, Breed _breed)
        {
            name = _name;
            age = _age;
            happiness = _happiness;

            breed = _breed;
        }

        public void Print ()
        {
            Console.WriteLine("Name: " + name);
            Console.WriteLine("Age: " + age);
            Console.WriteLine("Happiness: " + happiness);

            Console.WriteLine("Breed: " + breed);
        }
    }

    class MainClass
    {
        static void Main(string[] args)     // this is a method called "Main". It is called when the program starts
        {
            Dog hulk = new Dog("Hulk", 6, 0.7f, Breed.Boxer);
            hulk.Print();

            Console.ReadKey();
        }

    }
}
