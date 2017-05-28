package stack_machine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

public class Zed {
    
    Stack teste  = new Stack();

    public Zed() {
        
    }
    
    public void read () throws FileNotFoundException, IOException {
      char c;
      int x = 0;
        
      FileInputStream entrada = new FileInputStream ("teste.txt");
      InputStreamReader entradaCaracter = new InputStreamReader(entrada);
      
      //while ((c = (char) entradaCaracter.read())!= -1) {  
      while(x<10) {
        System.out.println("Ateh aki2");
        x = x+1;
        c = (char) entradaCaracter.read();
        System.out.println(x);
        System.out.printf("%c\n",c);
       // return c;
       // this.teste.push(c);
      }
     
      //return 'e';
    }
    
    public void write () throws IOException {
        char c;
        
        FileWriter arq = new FileWriter("teste.txt");
        PrintWriter gravaArq = new PrintWriter(arq);
        c = (char) this.teste.pop();
        gravaArq.printf("%c \n",c);
                arq.close();
        
        
    }
    
}