package org.behavioral.visitor;

public class UpVisitor implements Visitor{

	@Override
	public void visit(This thiss) {
		System.out.println("UP on " + thiss.thiss());;
		
	}

	@Override
	public void visit(That that) {
		System.out.println("UP on " + that.that());
	}

}
