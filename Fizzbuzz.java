import java.util.*;

class Fizzbuzz
{
    public static void main(String[] args)
    {
        System.out.println("Write what number you want to count up to.");
        List<String> output = Collections.unmodifiableList(FizzBuzz(new Scanner(System.in).nextInt()));
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= output.size() - 1; i++)
            s.append(output.get(i)).append("\n");
        System.out.println(s);
    }

    private static List<String> FizzBuzz(int n)
    {
        ArrayList<String> fb = new ArrayList<>();
        HashMap<Integer, String> hm = new HashMap<Integer, String>()
        {
            {
                put(3, "Fizz");
                put(5, "Buzz");
            }
        };
        for (int i = 1; i <= n; i++)
        {
            StringBuilder output = new StringBuilder();
            for (Integer key : hm.keySet()) output.append((i % key == 0) ? hm.get(key) : "");
            output = new StringBuilder((output.toString().equals("")) ? String.valueOf(i) : output.toString());
            fb.add(output.toString());
        }
        return fb;
    }
}