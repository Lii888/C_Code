#include <iostream>
using namespace std;

#define MAXSIZE 10

typedef struct
{
    int data[MAXSIZE];
    int top;
    int stacksize;
}Sqstack;

int InitStack(Sqstack &s)
{
    s.top = -1 ;
    s.stacksize = MAXSIZE;
    return 0;
}

int Push(Sqstack &s,int e)
{
    if(s.top == s.stacksize)
        return -1;
    s.top++;
    s.data[s.top] = e;
    return 0;
}

int Pop(Sqstack &s,int *e)
{
    if(s.top == -1)
        return -1;
    else
        {
        *e = s.data[s.top];
        s.top--;
    }
    return 0;
}


int main()
{
    Sqstack s;
    int *e = new int;
    InitStack(s);
    for(int i=0; i<5; i++)
    {
        Push(s,i);
    }
    for(int i=0; i<5; i++)
    {
        Pop(s,e);
        cout<< *e <<endl;
    }

}