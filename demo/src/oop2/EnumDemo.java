package oop2;

enum Transport {
	TRAIN, ROAD, SEA, AIR
}

enum Branch {
	CS, EC, ME
}


public class EnumDemo {
	public static void main(String[] args) {
       Transport t;
       
        t = Transport.AIR; 
        
        System.out.println(t);

	}

}
