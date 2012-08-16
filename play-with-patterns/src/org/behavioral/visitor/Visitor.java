package org.behavioral.visitor;

public interface Visitor {
	void visit(This thiss);

	void visit(That that);
}
