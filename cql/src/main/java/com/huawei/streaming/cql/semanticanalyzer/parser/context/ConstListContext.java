package com.huawei.streaming.cql.semanticanalyzer.parser.context;

import java.util.ArrayList;
import java.util.List;

import com.huawei.streaming.cql.exception.SemanticAnalyzerException;
import com.huawei.streaming.cql.semanticanalyzer.analyzecontext.expressiondesc.ConstListExpressionDesc;
import com.huawei.streaming.cql.semanticanalyzer.analyzecontext.expressiondesc.ExpressionDescribe;
import com.huawei.streaming.cql.semanticanalyzer.parsecontextreplacer.ParseContextReplacer;
import com.huawei.streaming.cql.semanticanalyzer.parsecontextwalker.ParseContextWalker;

public class ConstListContext extends BaseExpressionParseContext{

	private List<BaseExpressionParseContext> contextList;
	
	public ConstListContext(){
		contextList =new ArrayList<BaseExpressionParseContext>();
	}
	
	public List<BaseExpressionParseContext> getContextList() {
		return contextList;
	}

	public void setContextList(List<BaseExpressionParseContext> contextList) {
		this.contextList = contextList;
	}

	@Override
	public void walkChildAndReplace(ParseContextReplacer replacer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected ExpressionDescribe createExpressionDesc()
			throws SemanticAnalyzerException {
		// TODO Auto-generated method stub
		List<ExpressionDescribe> list  = new ArrayList<ExpressionDescribe>();
		for(BaseExpressionParseContext item: contextList){
			list.add(item.createExpressionDesc());
		}
		return new ConstListExpressionDesc(list);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void walkChild(ParseContextWalker walker) {
		// TODO Auto-generated method stub
		walkExpressions(walker, contextList);
	}

}
