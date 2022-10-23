using System;

class Program
{
    public string fizzBuzz(int nmbr)
    {
        string output = "";

        if (nmbr % 3 == 0) { output += "Fizz"; }
        if (nmbr % 5 == 0) { output += "Buzz"; }

        if (output == "") { output = nmbr.ToString(); }
        return output;
    }

    public static void Main(string[] args)
    {
        Program p = new Program();

        for (int i = 1; i <= 100; i++)
        {
            Console.WriteLine(p.fizzBuzz(i));
        }
    }
}
