package Abstractclass;

abstract class bank {
    
    abstract int Interest();    
}    

class SBI extends bank{    
    int Interest(){return 7;}    
    }    
    
class ICICI extends bank{    
    int Interest(){return 8;}    
    }    

    class TestBank{    
        public static void main(String args[]){    
        bank b;  
        b=new SBI();  
        System.out.println("Rate of Interest is: "+b.Interest()+" %");    
        b=new ICICI();  
        System.out.println("Rate of Interest is: "+b.Interest()+" %");    
        }
    }       