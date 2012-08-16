package org.behavioral.visitor;

public class DownVisitor implements Visitor{

	@Override
	public void visit(This thiss) {
		System.out.println("DOWN on " + thiss.thiss());
		
	}

	@Override
	public void visit(That that) {
		System.out.println("DOWN on " + that.that());
	}

}
