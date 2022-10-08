import java.util.Scanner;
public class stack2WM
{//Begin Program
Scanner keyboard = new Scanner (System.in);
int size = 20;
int top = 0, x;
int tempTop = 0;
int myStack[] = new int[size];
int tempStack[] = new int [size];

public void store()
{//Start Method

System.out.println("Store 10 Elements");
for(int i = 0; top <10; i++)
   {  
      x = keyboard.nextInt();
      myStack[i] = x;
      top ++;   
   }  
   
}// End Method  


public boolean addToStack(int x)
{//Begin Method
   if(top >= size)
   {
      System.out.println("Passed the Stack Limit");
      return false;
   }
   else
   {
      myStack[++top] = x;
      System.out.println(x + " was added into the Stack");
      return true; 
   }

}//End method



public void removeFromTopStack()
{//Begin Method
   top--;
   System.out.println("This elemment was taken down from the top of the Stack");
}//End Method



public void removeFromAnyWhereStack(int x)
{//Begin method
   
   boolean flag = false;
   int i = top-1;
   while(i>0)
   {
      
      i--;
      
      if(myStack[i] != x)
      {
      tempStack[tempTop] = myStack[i];
      tempTop ++;
      top--;
      }
      else
      {
       flag = true;
       System.out.println("The Element "+x + " was removed.");
       
      }

   }
   
   for (i = tempTop-1; i>=0; i--)
      {
      myStack[top] = tempStack[i];
      top ++;
      tempTop--;
      }

   
   

}//End Method

   

public void printStack()//In Order They Were Put In
{//Begin Method
 for(int i = top - 1; i>=0; i--)
 {
      tempStack[tempTop] = myStack[i];
      tempTop ++;
      top--;   
 }  
 
 for (int i = tempTop-1; i>=0; i--)
 {
      myStack[top] = tempStack[i];
      System.out.println(myStack[top]);
      top ++;
      tempTop--;
 }

}//End Method


public void printFromTopStack()//In Order They Were Put In
{//Begin Method
 for(int i = top - 1; i>=0; i--)
 {
      tempStack[tempTop] = myStack[i];
      System.out.println(tempStack[tempTop]);
      tempTop ++;
      top--;   
 }  
 
 for (int i = tempTop-1; i>=0; i--)
 {
      myStack[top] = tempStack[i];
      top ++;
      tempTop--;
 }

}//End Method


public void calculateAverageStack()
{//Begin Method
   int average, sum = 0;
   for(int i = top - 1; i>=0; i--)
 {
      tempStack[tempTop] = myStack[i];
      tempTop ++;
      top--;   
 }  
 
 for (int i = tempTop-1; i>=0; i--)
 {
      myStack[top] = tempStack[i];
      sum += myStack[top];
      top ++;
      tempTop--;
 }
 
 average = sum/20;
 System.out.println("The average = " + average);

}//End Method

public void findMultiplesSixStack()
{//Begin Method

for(int i = top - 1; i>=0; i--)
 {
      tempStack[tempTop] = myStack[i];
      tempTop ++;
      top--;   
 }  
 
 for (int i = tempTop-1; i>=0; i--)
 {
      myStack[top] = tempStack[i];
      if(myStack[top] % 6 == 0)
      System.out.println(myStack[top]);
      top ++;
      tempTop--;
 }

}//End Method



public void increment12()
{//Begin Method

for(int i = top - 1; i>=0; i--)
 {
      tempStack[tempTop] = myStack[i];
      tempTop ++;
      top--;   
 }  
 
 for (int i = tempTop-1; i>=0; i--)
 {
      myStack[top] = tempStack[i] + 12;
      System.out.println(myStack[top]);
      top ++;
      tempTop--;
 }

}//End Method


public void isStackFull()
{//Begin Method

for(int i = top - 1; i>=0; i--)
 {
      tempStack[tempTop] = myStack[i];
      tempTop ++;
      top--;   
 }  
 
 for (int i = tempTop-1; i>=0; i--)
 {
      myStack[top] = tempStack[i];
      top ++;
      tempTop--;
 }
 
 if(top == myStack.length -1)
   System.out.println("Stack is full");
 else
   System.out.println("Stack is not full");
     

}//End Method


public void isStackEmpty()
{//Begin Method

for(int i = top - 1; i>=0; i--)
 {
      tempStack[tempTop] = myStack[i];
      tempTop ++;
      top--;   
 }  
 
 for (int i = tempTop-1; i>=0; i--)
 {
      myStack[top] = tempStack[i];
      top ++;
      tempTop--;
 }
 
 if(top > 0)
   System.out.println("Stack is Not Empty");
 else
   System.out.println("Stack is Empty");
     

}//End Method

public void fillStack()

{//Start Method

for(int i = 10; top < 20; i++)
   {  
      x = keyboard.nextInt();
      myStack[i] = x;
      top ++;   
   }  
   
}// End Method 




public void modulusStack()
{//Begin Method
 for(int i = top - 1; i>=0; i--)
 {
      tempStack[tempTop] = myStack[i];
      tempTop ++;
      top--;   
 }  
 
 for (int i = tempTop-1; i>=0; i--)
 {
      myStack[top] = tempStack[i]%12;
      top ++;
      tempTop--;
 }

}//End Method


  
   
}//End Class Method   
   
