package stack_machine;

import java.io.IOException;
import java.util.Stack;

/**
 *Lulu: recebe token, verifica se é operação, se for efetua a mesma, guarda
 * resultado.
 * 
 * @author Domarys Correa
 */
public class Lulu {
    
    Integer result;
     
    Stack stack = new Stack();
    Zed reader = new Zed();

    public Lulu() {
        // construtor
    }
    
    public Integer sum (int x, int y){
    
        this.result = x+y;
        return this.result;
    
    }
    
    public Integer subtract (int x, int y) {
        
        this.result = x-y;
        return this.result;
        
    }
    
    public Integer multiply (int x, int y) {
        
        this.result = x*y;
        return this.result;
    }
    
    public Integer diference (int x, int y) {
        
        if (y == 0) {
            
            System.out.println("Nao existe divisao por zero \n");
            return 0; // kill task?
            
        } else {
            
            this.result = x/y;
            return this.result;
            
        }
   
    }
    
    public void push () throws IOException {
   //     char c = reader.read();
        
     //   while (c != 'e') {
            
       //     stack.push(reader.read());
            
        //}
        
    }
    
    
}
