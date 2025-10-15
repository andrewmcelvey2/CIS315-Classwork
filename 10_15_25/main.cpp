// C++ illustration of the deadly diamond of death
#include <iostream>
using namespace std;

class Animal {
public:
    double weight;
    void eat() { cout << "yum" << endl; }
};

class Mammal : public Animal {
public:
};

class WingedAnimal : public Animal {
public:
};

class Bat : public Mammal, public WingedAnimal {
};

int main()
{
    Bat* obj = new Bat();
    obj->weight = 7.2; // Bat::weight is ambiguous
    obj->eat(); // Bat::eat is ambiguous

    return 0;
}