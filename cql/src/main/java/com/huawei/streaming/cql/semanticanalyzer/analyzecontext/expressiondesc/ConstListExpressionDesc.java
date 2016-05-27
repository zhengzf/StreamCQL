package com.huawei.streaming.cql.semanticanalyzer.analyzecontext.expressiondesc;

import java.util.List;

import com.huawei.streaming.cql.executor.expressioncreater.ConstListExpressionCreator;
import com.huawei.streaming.cql.executor.operatorinfocreater.ExpressionCreatorAnnotation;

@ExpressionCreatorAnnotation(ConstListExpressionCreator.class)
public class ConstListExpressionDesc implements ExpressionDescribe {
	private List<ExpressionDescribe> constDescList;

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString()
    {
    	String retStr = "( " + constDescList.get(0).toString();
    	for(int i = 1; i < constDescList.size() ; i++){
    		retStr += " ," + constDescList.get(i).toString(); 
    	}
    	retStr+=" )";
    	return retStr;
    }
	
	public ConstListExpressionDesc(List<ExpressionDescribe> list){
		this.constDescList = list;
	}
	
	public List<ExpressionDescribe> getConstDescList() {
		return constDescList;
	}

	public void setConstDescList(List<ExpressionDescribe> constDescList) {
		this.constDescList = constDescList;
	}
}
