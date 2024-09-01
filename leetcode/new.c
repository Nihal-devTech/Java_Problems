using System;

public class MonicaFoodItems
{
    public static int DivideFoodItems(int[] V, int N, int K, int M)
    {
        Array.Sort(V); // Sort the array in non-decreasing order
        int meals = 0; // Number of meals formed
        int start = 0; // Start pointer
        int end = 0; // End pointer

        while (end < N)
        {
            if (V[end] - V[start] <= M)
            {
                end++;
            }
            else if (end - start >= K)
            {
                meals++;
                start++;
            }
            else
            {
                return -1;
            }
        }

        if (end - start >= K)
        {
            meals++;
        }
        else
        {
            return -1;
        }

        return meals;
    }

    public static void Main(string[] args)
    {
        int[] V = { 5, 8, 12, 15, 20 }; // Example input array
        int N = V.Length; // Number of food items
        int K = 3; // Minimum number of items per meal
        int M = 7; // Maximum nutritional difference

        int minMeals = DivideFoodItems(V, N, K, M);
        Console.WriteLine("Minimum number of meals: " + minMeals);
    }
}