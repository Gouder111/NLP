class A {
	int a1;
	double a2;
	String str;

	A(int i, double d, String s) {
		a1= i;
		a2 = d;
		str = s;
	}
	int addA1() {
		a1+=1;
		return a1;
	}
	void printA2() {
		System.out.println("Значение переменной а2 внутри объекта: " + a2);
	}

	char firstChar() {
		return str.charAt(0);
	}
	int getA1() {
		return a1;
	}

	double getA2() {
		return a2;
	}
}
class ClassDemo {
	public static void main(String[] args) {
		A classA = new A(5, 5.5, "Строка для объекта класса A");
		System.out.println("Значение переменной а1 в объекте classA: " + classA.getA1());
		classA.addA1();
		System.out.println("Значение переменной а1 в объекте classA: " + classA.getA1());
		classA.printA2();
		System.out.println("Певый символ встроке str в объекте classA: " + classA.firstChar());
		A secondOb = new A(100, 35.25, "Второй объект класса А");
		secondOb.addA1();
		System.out.println("Значение переменной а1 в объекте secondOb: " + secondOb.getA1());
		System.out.println("Первый символ в строке str в объекте secondOb: " + secondOb.firstChar());

	}
}
