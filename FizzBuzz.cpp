#include <iostream>
#include <vector>
#include <map>
using namespace std;
using std::vector;

class Solution 
{
    public:
        vector<string> fizzBuzz(int n) 
        {
            vector<string> output;
            map<int, string> hm = { {3, "Fizz"}, 
                                    {5, "Buzz"} };
            for (int i = 1; i <= n; i++)
            {
                string s = "";
                for (auto& x : hm) s += (i%x.first == 0) ? x.second : "";
                s = (s == "") ? to_string(i) : s;
                output.push_back(s);
            }
            return output;
        }
};

int main()
{
    Solution s;
    vector<string> output = s.fizzBuzz(15);
    for (auto i = output.begin(); i != output.end(); i++)
        cout << *i << endl; 
    return 0;
}