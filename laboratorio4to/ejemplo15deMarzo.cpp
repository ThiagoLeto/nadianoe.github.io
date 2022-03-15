
#include <iostream>

using namespace std;

int main(){
    
    /* Sea A un conjunto tal que 
       
       A = (-∞,2) U [4,10]
      
    */
    
    int a = 5;
    
    
    if(a < 2){
        cout << "Es menor a 2. Pertenece a A."  << endl;
    } else if (a >= 4 && a <= 10){
        cout << "Está entre 4 y 10. Pertenece a A" << endl;
    } else {
        cout << "No pertenece a A."<< endl;
    }
    
    a = a + 1;
    a = a - 1;
    a = 2 * a;
    a = a + 2;
    a = a + 1;
    a++;
    a = a - 1;
    a--;
    
    int b,c,d;
    
    b = 1;
    b++;
    c = b;
    cout << c << endl;
    
    
    

    return 0;
}

    
