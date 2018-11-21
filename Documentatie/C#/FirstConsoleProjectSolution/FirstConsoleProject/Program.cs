using System;
using System.Collections.Generic;

namespace FirstConsoleProject
{
    class MainClass
    {
        static void Main(string[] args)     // this is method called "Main". It is called when the program starts
        {

            // Multidimensional arrays
            CreateGrid();

            Console.ReadKey();
        }

        public static void CreateGrid()
        {
            int width = 5;
            int height = 5;

            int[,] grid = new int[width,height];
            grid[2, 3] = 3;
            grid[1, 2] = 4;

            for (int x = 0; x < width; x++)
            {
                for (int y = 0; y < height; y++)
                {
                    Console.Write(grid[x,y] + " ");
                }
                Console.WriteLine();
            }
        }

    }
}
