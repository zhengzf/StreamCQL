package com.huawei.streaming.cql.semanticanalyzer.parser.visitor;

import org.antlr.v4.runtime.misc.NotNull;

import com.huawei.streaming.cql.semanticanalyzer.parser.CQLParser;
import com.huawei.streaming.cql.semanticanalyzer.parser.context.ConstListContext;


public class ConstListVisitor extends
		AbsCQLParserBaseVisitor<ConstListContext> {

	private ConstListContext context  = null;
	
	public ConstListVisitor() {
		// TODO Auto-generated constructor stub
		context = new ConstListContext();
	}
	
	@Override
	protected ConstListContext defaultResult() {
		// TODO Auto-generated method stub
		return context;
	}
	
	@Override
	public ConstListContext visitConstant(@NotNull CQLParser.ConstantContext ctx){
		ConstantVisitor visitor = new ConstantVisitor();
		context.getContextList().add(visitor.visit(ctx));
		return context;
	}

}
