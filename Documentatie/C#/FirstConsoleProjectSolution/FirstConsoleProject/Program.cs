using System;
using System.Collections.Generic;

namespace FirstConsoleProject
{
    class MainClass
    {
        class Player
        {
            private int _health = 100;
            public int health
            {
                get
                {
                    return _health;
                }

                set
                {
                    if (value <= 0)
                    {
                        _health = 0;
                    } else if (value >= 100)
                    {
                        _health = 100;
                    } else
                    {
                        _health = value;
                    }
                }
            }
            
        }

        static void Main(string[] args)     // this is a method called "Main". It is called when the program starts
        {
            Player tom = new Player();
            Console.WriteLine(tom.health);
            tom.health -= 200;
            Console.WriteLine(tom.health);
            tom.health += 400;
            Console.WriteLine(tom.health);
            tom.health = 50;
            Console.WriteLine(tom.health);

            Console.ReadKey();
        }

    }
}
