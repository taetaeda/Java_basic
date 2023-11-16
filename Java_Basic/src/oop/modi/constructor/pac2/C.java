package oop.modi.constructor.pac2;

import oop.modi.constructor.pac1.A;

public class C {
	A a1 = new A(false); //public 이니까 패키지 달라져도 import로 괜찮아졌다
	// A a2 = new A(23); default (x)
	// A a3 = new A(2.34); private (x)
}
