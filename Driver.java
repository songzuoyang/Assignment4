public class Driver {
	public static void main(String[] args) {
		String name1 = "Michael";
		String name2 = "Tesla";
		Car car1 = new Car(name1,name2);
		Car car2 = new Car(60,700);
		GasTank gas = new GasTank();
		gas.addGas(108);
		gas.useGas(99);
		System.out.println(gas.getGasLevel());
	}
}
	
	class GasTank {
		double amount = 0;

		void addGas(double a) {
			amount = a;
			System.out.println("add gas " + amount);
		}

		void useGas(double b) {
			amount = 1000 - b;
			System.out.println("use gas " + amount);
		}

		double getGasLevel() {
			return amount;
		}
	}
	
	class Car {
		int sweptvolume ;
		int distance;
		
		public Car(String drivername, String carname) {
			System.out.println(drivername +" is driving " + carname);
		}
		
		public Car(int sweptvolume, int distance) {
			System.out.println("the sweptvolume is " + sweptvolume + " and it has been driven for " + distance + "miles.");
		}
		public int getSweptvolume() {
			return sweptvolume;
		}
		public void setSweptvolume(int sweptvolume) {
			this.sweptvolume = sweptvolume;
		}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
	}
	
	class MusicAlbum {
		String albumTitle;
		String singer;
		double price;
		public String getAlbumTitle() {
			return albumTitle;
		}
		public void setAlbumTitle(String albumTitle) {
			this.albumTitle = albumTitle;
		}
		public String getSinger() {
			return singer;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
	}
	
	class Stack {
		Object [] stack = new Object[10];
		void push(int number) {
			boolean overflow = true;
			for (int i=0;i<stack.length;i++) {
				if (stack[i]!=null) {
					stack[i]=number;
					overflow = false;
					break;
				} 
			}
			if (overflow==true) {
				System.out.println("overflow");
			}
		}
		int pop() {
			for (int i=stack.length-1;i>=0;i--) {
				if (stack[i]!=null) {
					return (int) stack[i];
				}
			}
			System.out.println("underflow");
			return 0;
		}
	}


