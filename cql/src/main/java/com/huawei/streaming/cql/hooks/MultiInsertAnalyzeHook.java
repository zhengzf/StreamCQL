package com.huawei.streaming.cql.hooks;

import com.huawei.streaming.cql.DriverContext;
import com.huawei.streaming.cql.exception.SemanticAnalyzerException;
import com.huawei.streaming.cql.semanticanalyzer.analyzecontext.AnalyzeContext;
import com.huawei.streaming.cql.semanticanalyzer.analyzecontext.InsertAnalyzeContext;
import com.huawei.streaming.cql.semanticanalyzer.analyzecontext.MultiInsertAnalyzeContext;
import com.huawei.streaming.cql.semanticanalyzer.analyzecontext.MultiInsertStatementAnalyzeContext;
import com.huawei.streaming.cql.semanticanalyzer.parser.context.InsertStatementContext;
import com.huawei.streaming.cql.semanticanalyzer.parser.context.MultiInsertStatementContext;
import com.huawei.streaming.cql.semanticanalyzer.parser.context.ParseContext;

public class MultiInsertAnalyzeHook implements SemanticAnalyzeHook {

	@Override
	public boolean validate(ParseContext parseContext)
			throws SemanticAnalyzerException {
		 return parseContext instanceof MultiInsertStatementContext;
	}

	@Override
	public void preAnalyze(DriverContext context, ParseContext parseContext)
			throws SemanticAnalyzerException {
		// TODO Auto-generated method stub

	}

	@Override
	public void postAnalyze(DriverContext context, AnalyzeContext analyzeConext)
			throws SemanticAnalyzerException {
		// TODO Auto-generated method stub
		MultiInsertStatementAnalyzeContext multiInsertContext = (MultiInsertStatementAnalyzeContext)analyzeConext;
        for (MultiInsertAnalyzeContext insert : multiInsertContext.getMultiSelectBodyAnalyzeContexts())
        {
        	context.addSchema(insert.getOutputSchema());
		}
	}

}
