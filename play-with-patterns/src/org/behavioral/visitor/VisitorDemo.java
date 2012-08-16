package org.behavioral.visitor;

public class VisitorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor downVisitor = new DownVisitor();
		Visitor upVisitor = new UpVisitor();
		This thiss = new This();
		That that = new That();
		thiss.accept(downVisitor);
		thiss.accept(upVisitor);
		that.accept(downVisitor);
		that.accept(upVisitor);
	}

}
