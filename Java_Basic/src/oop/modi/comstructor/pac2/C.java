package oop.modi.comstructor.pac2;

import oop.modi.comstructor.pac1.A;

public class C {

	A a1 = new A(false); // public A(boolean b) {}
  //A a2 = new A(23); // (x) A(int i) {} : public 이 아니라 default 제한이기때문에 안됨
  //A a3 = new A(2.34); // (x) private A(double d) {} private이라 안됨
	
}
