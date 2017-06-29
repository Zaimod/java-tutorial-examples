package org.o7planning.spring.lang.impl;
 
import org.o7planning.spring.lang.Language;
 
// Romanian
public class Romanian implements Language {
 
   @Override
   public String getGreeting() {
       return "Salut";
   }
 
   @Override
   public String getBye() {
       return "La revedere";
   }
 
}