package com.huawei.streaming.cql.executor.expressioncreater;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.huawei.streaming.cql.exception.ExecutorException;
import com.huawei.streaming.cql.semanticanalyzer.analyzecontext.expressiondesc.ConstExpressionDesc;
import com.huawei.streaming.cql.semanticanalyzer.analyzecontext.expressiondesc.ConstListExpressionDesc;
import com.huawei.streaming.cql.semanticanalyzer.analyzecontext.expressiondesc.ExpressionDescribe;
import com.huawei.streaming.event.TupleEvent;
import com.huawei.streaming.exception.ErrorCode;
import com.huawei.streaming.expression.ConstListExpression;
import com.huawei.streaming.expression.IExpression;

public class ConstListExpressionCreator implements ExpressionCreator{

	@Override
	public IExpression createInstance(ExpressionDescribe expressionDescribe,
			Map<String, String> systemconfig) throws ExecutorException {
		// TODO Auto-generated method stub
		ConstListExpressionDesc desc = (ConstListExpressionDesc)expressionDescribe;
		List<Object> objList = new ArrayList<Object>();
		for(ExpressionDescribe item : desc.getConstDescList()){
			if(! (item instanceof ConstExpressionDesc)){
				new ExecutorException(ErrorCode.SEMANTICANALYZE_INVALID_CONSTLIST);
			}
			IExpression expression = ExpressionCreatorFactory.createExpression(item, systemconfig);
			objList.add(expression.evaluate(new TupleEvent()));
		}
		return new ConstListExpression(objList);
	}

}
