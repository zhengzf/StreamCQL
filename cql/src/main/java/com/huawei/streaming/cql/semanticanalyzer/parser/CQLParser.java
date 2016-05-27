// Generated from CQLParser.g4 by ANTLR 4.1
package com.huawei.streaming.cql.semanticanalyzer.parser;
import com.huawei.streaming.cql.semanticanalyzer.parser.CQLParserListener;
import com.huawei.streaming.cql.semanticanalyzer.parser.CQLParserVisitor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CQLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_STRING=114, KW_LIKE=28, STAR=141, KW_JOIN=56, LSQUARE=126, KW_CROSS=60, 
		FloatLiteral=151, KW_SOURCE=16, MOD=142, KW_BATCH=86, KW_LONG=111, KW_INSERT=67, 
		BITWISEXOR=147, KW_INNER=63, KW_FLOAT=112, KW_ROWS=88, KW_DROP=8, KW_WHERE=53, 
		KW_INPUT=17, Identifier=158, KW_EXPLAIN=3, KW_EXISTS=37, KW_ASC=46, NOTEQUAL=132, 
		EQUAL_NS=131, RPAREN=125, KW_HOUR=105, KW_WORKER=99, KW_PARALLEL=82, KW_APPLICATIONS=71, 
		KW_RLIKE=29, KW_RANGE=87, KW_THEN=33, COMMENT=161, KW_OVERWRITE=68, KW_DISTINCT=23, 
		DIVIDE=137, GREATERTHAN=136, KW_SCHEMA=95, KW_PRESERVE=58, KW_FUNCTION=79, 
		LINE_COMMENT=162, KW_INT=110, KW_SINK=20, KW_DECIMAL=118, KW_DEACTIVE=97, 
		KW_COMBINE=80, KW_ADD=9, KW_OPERATOR=101, KW_QUERY=96, LCURLY=128, SEMICOLON=123, 
		KW_LEFT=62, KW_DOUBLE=113, WS=160, KW_SELECT=10, KW_LOAD=6, KW_GROUP=50, 
		KW_END=35, KW_BY=51, KW_FULL=57, KW_NATURAL=64, KW_TODAY=89, KW_DAY=104, 
		KW_PREVIOUS=93, LESSTHANOREQUALTO=133, KW_ACTIVE=98, KW_GET=5, KW_SEMI=61, 
		KW_SLIDE=85, DoubleLiteral=152, KW_DISTRIBUTE=103, KW_SUBMIT=21, KW_NOT=45, 
		KW_NOW=92, KW_MINUTES=106, KW_ELSE=34, DOLLAR=149, KW_FILE=75, KW_TIMESTAMP=115, 
		KW_INPATH=76, IntegerNumber=156, KW_JAR=78, KW_AND=24, KW_UNIDIRECTION=81, 
		CharSetName=159, KW_BOOLEAN=109, KW_DESC=47, KW_CREATE=1, KW_REGEXP=30, 
		KW_TRUE=43, KW_OUTPUT=19, KW_LIMIT=69, KW_WITH=14, KW_MILLISECONDS=108, 
		LPAREN=124, KW_PARTITION=84, KW_SORT=48, KW_FROM=54, GREATERTHANOREQUALTO=135, 
		KW_RIGHT=65, KW_TIME=117, Number=157, COMMA=122, EQUAL=130, KW_SET=4, 
		TILDE=144, KW_IN=27, KW_EXCLUDE=91, PLUS=138, KW_REBALANCE=100, KW_IS=42, 
		KW_OUTER=59, DOT=120, KW_EXTENDED=73, KW_IF=38, KW_DATASOURCE=94, LongLiteral=150, 
		KW_ORDER=49, KW_UNBOUNDED=90, LESSTHAN=134, KW_ALL=44, KW_HAVING=52, KW_FORCE=12, 
		KW_UNION=70, KW_CAST=36, KW_FALSE=39, KW_WHEN=32, KW_FUNCTIONS=74, KW_TRIGGER=83, 
		AMPERSAND=146, CONCATENATION=140, KW_EXPORT=7, MINUS=139, RSQUARE=127, 
		DecimalLiteral=153, KW_CASE=31, BITWISEOR=145, StringLiteral=154, COLON=121, 
		KW_SHOW=2, KW_DATE=116, CharSetLiteral=155, KW_INTO=66, QUESTION=148, 
		KW_OR=25, KW_STREAM=18, KW_ON=55, RCURLY=129, KW_AS=40, KW_COMMENT=11, 
		KW_USING=102, KW_NULL=41, KW_BETWEEN=26, KW_SECONDS=107, DIV=143, KW_WINDOW=77, 
		KW_OBJECT=119, KW_SERDE=13, KW_PROPERTIES=15, KW_APPLICATION=22, KW_WINDOWS=72;
	public static final String[] tokenNames = {
		"<INVALID>", "'CREATE'", "'SHOW'", "'EXPLAIN'", "'SET'", "'GET'", "'LOAD'", 
		"'EXPORT'", "'DROP'", "'ADD'", "'SELECT'", "'COMMENT'", "'FORCE'", "'SERDE'", 
		"'WITH'", "'PROPERTIES'", "'SOURCE'", "'INPUT'", "'STREAM'", "'OUTPUT'", 
		"'SINK'", "'SUBMIT'", "'APPLICATION'", "'DISTINCT'", "'AND'", "'OR'", 
		"'BETWEEN'", "'IN'", "'LIKE'", "'RLIKE'", "'REGEXP'", "'CASE'", "'WHEN'", 
		"'THEN'", "'ELSE'", "'END'", "'CAST'", "'EXISTS'", "'IF'", "'FALSE'", 
		"'AS'", "'NULL'", "'IS'", "'TRUE'", "'ALL'", "KW_NOT", "'ASC'", "'DESC'", 
		"'SORT'", "'ORDER'", "'GROUP'", "'BY'", "'HAVING'", "'WHERE'", "'FROM'", 
		"'ON'", "'JOIN'", "'FULL'", "'PRESERVE'", "'OUTER'", "'CROSS'", "'SEMI'", 
		"'LEFT'", "'INNER'", "'NATURAL'", "'RIGHT'", "'INTO'", "'INSERT'", "'OVERWRITE'", 
		"'LIMIT'", "'UNION'", "'APPLICATIONS'", "'WINDOWS'", "'EXTENDED'", "'FUNCTIONS'", 
		"'FILE'", "'INPATH'", "'WINDOW'", "'JAR'", "'FUNCTION'", "'COMBINE'", 
		"'UNIDIRECTION'", "'PARALLEL'", "'TRIGGER'", "'PARTITION'", "'SLIDE'", 
		"'BATCH'", "'RANGE'", "'ROWS'", "'TODAY'", "'UNBOUNDED'", "'EXCLUDE'", 
		"'NOW'", "'PREVIOUS'", "'DATASOURCE'", "'SCHEMA'", "'QUERY'", "'DEACTIVE'", 
		"'ACTIVE'", "'WORKER'", "'REBALANCE'", "'OPERATOR'", "'USING'", "'DISTRIBUTE'", 
		"KW_DAY", "KW_HOUR", "KW_MINUTES", "KW_SECONDS", "KW_MILLISECONDS", "'BOOLEAN'", 
		"'INT'", "'LONG'", "'FLOAT'", "'DOUBLE'", "'STRING'", "'TIMESTAMP'", "'DATE'", 
		"'TIME'", "'DECIMAL'", "'OBJECT'", "'.'", "':'", "','", "';'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "EQUAL", "'<=>'", "NOTEQUAL", "'<='", 
		"'<'", "'>='", "'>'", "'/'", "'+'", "'-'", "'||'", "'*'", "'%'", "'DIV'", 
		"'~'", "'|'", "'&'", "'^'", "'?'", "'$'", "LongLiteral", "FloatLiteral", 
		"DoubleLiteral", "DecimalLiteral", "StringLiteral", "CharSetLiteral", 
		"IntegerNumber", "Number", "Identifier", "CharSetName", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_statement = 0, RULE_execStatement = 1, RULE_ddlStatement = 2, RULE_createInputStreamStatement = 3, 
		RULE_createOutputStreamStatement = 4, RULE_createPipeStreamStatement = 5, 
		RULE_createDataSourceStatement = 6, RULE_createOperatorStatement = 7, 
		RULE_inputSchemaStatement = 8, RULE_outputSchemaStatement = 9, RULE_serdeDefine = 10, 
		RULE_sourceDefine = 11, RULE_sinkDefine = 12, RULE_primitiveType = 13, 
		RULE_colType = 14, RULE_columnNameType = 15, RULE_comment = 16, RULE_commentString = 17, 
		RULE_columnNameTypeList = 18, RULE_streamPropertiesList = 19, RULE_keyValueProperty = 20, 
		RULE_serdeClass = 21, RULE_serdeProperties = 22, RULE_datasourceProperties = 23, 
		RULE_sinkClause = 24, RULE_sinkProperties = 25, RULE_sourceClause = 26, 
		RULE_sourceProperties = 27, RULE_addFileStatement = 28, RULE_addJARStatement = 29, 
		RULE_createFunctionStatement = 30, RULE_dropFunctionStatement = 31, RULE_getStatement = 32, 
		RULE_setStatement = 33, RULE_loadStatement = 34, RULE_explainStatement = 35, 
		RULE_showFunctions = 36, RULE_showApplications = 37, RULE_dropApplication = 38, 
		RULE_submitApplication = 39, RULE_expression = 40, RULE_logicExpressionOr = 41, 
		RULE_logicExpressionAnd = 42, RULE_logicExpressionNot = 43, RULE_equalRelationExpression = 44, 
		RULE_isNullLikeInExpressions = 45, RULE_subQueryExpression = 46, RULE_binaryExpression = 47, 
		RULE_constList = 48, RULE_relationExpression = 49, RULE_relationOperator = 50, 
		RULE_precedenceEqualNegatableOperator = 51, RULE_bitExpression = 52, RULE_bitOperator = 53, 
		RULE_arithmeticPlusMinusExpression = 54, RULE_arithmeticPlusOperator = 55, 
		RULE_arithmeticStarExpression = 56, RULE_fieldExpression = 57, RULE_arithmeticStarOperator = 58, 
		RULE_atomExpression = 59, RULE_expressionWithLaparen = 60, RULE_constant = 61, 
		RULE_constStingValue = 62, RULE_constIntegerValue = 63, RULE_constLongValue = 64, 
		RULE_constFloatValue = 65, RULE_constDoubleValue = 66, RULE_constBigDecimalValue = 67, 
		RULE_function = 68, RULE_castExpression = 69, RULE_booleanValue = 70, 
		RULE_expressions = 71, RULE_insertStatement = 72, RULE_insertUserOperatorStatement = 73, 
		RULE_usingStatement = 74, RULE_distributeClause = 75, RULE_multiInsertStatement = 76, 
		RULE_selectStatement = 77, RULE_multiInsert = 78, RULE_multiSelect = 79, 
		RULE_parallelClause = 80, RULE_insertClause = 81, RULE_fromClause = 82, 
		RULE_joinSource = 83, RULE_joinRigthBody = 84, RULE_onCondition = 85, 
		RULE_joinToken = 86, RULE_innerJoin = 87, RULE_leftJoin = 88, RULE_rightJoin = 89, 
		RULE_fullJoin = 90, RULE_crossJoin = 91, RULE_naturalJoin = 92, RULE_fromSource = 93, 
		RULE_streamBody = 94, RULE_datasourceBody = 95, RULE_datasourceArguments = 96, 
		RULE_datasourceSchema = 97, RULE_datasourceQuery = 98, RULE_datasourceQueryArguments = 99, 
		RULE_streamSource = 100, RULE_unidirection = 101, RULE_filterBeforeWindow = 102, 
		RULE_windowSource = 103, RULE_windowBody = 104, RULE_rowsWindow = 105, 
		RULE_rangeWindow = 106, RULE_rangeBound = 107, RULE_rangeUnBound = 108, 
		RULE_rangeTime = 109, RULE_rangeDay = 110, RULE_rangeHour = 111, RULE_rangeMinutes = 112, 
		RULE_rangeSeconds = 113, RULE_rangeMilliSeconds = 114, RULE_windowProperties = 115, 
		RULE_windowDeterminer = 116, RULE_partitionbyDeterminer = 117, RULE_subQuerySource = 118, 
		RULE_sourceAlias = 119, RULE_groupByClause = 120, RULE_groupByList = 121, 
		RULE_groupByExpression = 122, RULE_havingClause = 123, RULE_havingCondition = 124, 
		RULE_orderByClause = 125, RULE_limitClause = 126, RULE_limitAll = 127, 
		RULE_limitRow = 128, RULE_distinct = 129, RULE_selectClause = 130, RULE_subSelectClause = 131, 
		RULE_selectList = 132, RULE_selectItem = 133, RULE_selectAlias = 134, 
		RULE_multialias = 135, RULE_singleAlias = 136, RULE_selectExpression = 137, 
		RULE_columnNameOrderList = 138, RULE_columnNameOrder = 139, RULE_columnOrder = 140, 
		RULE_whereClause = 141, RULE_searchCondition = 142, RULE_streamAllColumns = 143, 
		RULE_cqlIdentifier = 144, RULE_packageNameIdentifier = 145, RULE_streamProperties = 146, 
		RULE_confName = 147, RULE_confValue = 148, RULE_strValue = 149, RULE_unaryOperator = 150, 
		RULE_functionName = 151, RULE_windowName = 152, RULE_className = 153, 
		RULE_innerClassName = 154, RULE_userDefinedClassName = 155, RULE_path = 156, 
		RULE_applicationName = 157, RULE_columnName = 158, RULE_isForce = 159, 
		RULE_ifExists = 160, RULE_ifNotExists = 161, RULE_streamName = 162, RULE_dataSourceName = 163, 
		RULE_streamAlias = 164, RULE_streamNameOrAlias = 165, RULE_columnALias = 166, 
		RULE_constNull = 167, RULE_extended = 168, RULE_identifierNot = 169, RULE_nullCondition = 170, 
		RULE_operatorName = 171;
	public static final String[] ruleNames = {
		"statement", "execStatement", "ddlStatement", "createInputStreamStatement", 
		"createOutputStreamStatement", "createPipeStreamStatement", "createDataSourceStatement", 
		"createOperatorStatement", "inputSchemaStatement", "outputSchemaStatement", 
		"serdeDefine", "sourceDefine", "sinkDefine", "primitiveType", "colType", 
		"columnNameType", "comment", "commentString", "columnNameTypeList", "streamPropertiesList", 
		"keyValueProperty", "serdeClass", "serdeProperties", "datasourceProperties", 
		"sinkClause", "sinkProperties", "sourceClause", "sourceProperties", "addFileStatement", 
		"addJARStatement", "createFunctionStatement", "dropFunctionStatement", 
		"getStatement", "setStatement", "loadStatement", "explainStatement", "showFunctions", 
		"showApplications", "dropApplication", "submitApplication", "expression", 
		"logicExpressionOr", "logicExpressionAnd", "logicExpressionNot", "equalRelationExpression", 
		"isNullLikeInExpressions", "subQueryExpression", "binaryExpression", "constList", 
		"relationExpression", "relationOperator", "precedenceEqualNegatableOperator", 
		"bitExpression", "bitOperator", "arithmeticPlusMinusExpression", "arithmeticPlusOperator", 
		"arithmeticStarExpression", "fieldExpression", "arithmeticStarOperator", 
		"atomExpression", "expressionWithLaparen", "constant", "constStingValue", 
		"constIntegerValue", "constLongValue", "constFloatValue", "constDoubleValue", 
		"constBigDecimalValue", "function", "castExpression", "booleanValue", 
		"expressions", "insertStatement", "insertUserOperatorStatement", "usingStatement", 
		"distributeClause", "multiInsertStatement", "selectStatement", "multiInsert", 
		"multiSelect", "parallelClause", "insertClause", "fromClause", "joinSource", 
		"joinRigthBody", "onCondition", "joinToken", "innerJoin", "leftJoin", 
		"rightJoin", "fullJoin", "crossJoin", "naturalJoin", "fromSource", "streamBody", 
		"datasourceBody", "datasourceArguments", "datasourceSchema", "datasourceQuery", 
		"datasourceQueryArguments", "streamSource", "unidirection", "filterBeforeWindow", 
		"windowSource", "windowBody", "rowsWindow", "rangeWindow", "rangeBound", 
		"rangeUnBound", "rangeTime", "rangeDay", "rangeHour", "rangeMinutes", 
		"rangeSeconds", "rangeMilliSeconds", "windowProperties", "windowDeterminer", 
		"partitionbyDeterminer", "subQuerySource", "sourceAlias", "groupByClause", 
		"groupByList", "groupByExpression", "havingClause", "havingCondition", 
		"orderByClause", "limitClause", "limitAll", "limitRow", "distinct", "selectClause", 
		"subSelectClause", "selectList", "selectItem", "selectAlias", "multialias", 
		"singleAlias", "selectExpression", "columnNameOrderList", "columnNameOrder", 
		"columnOrder", "whereClause", "searchCondition", "streamAllColumns", "cqlIdentifier", 
		"packageNameIdentifier", "streamProperties", "confName", "confValue", 
		"strValue", "unaryOperator", "functionName", "windowName", "className", 
		"innerClassName", "userDefinedClassName", "path", "applicationName", "columnName", 
		"isForce", "ifExists", "ifNotExists", "streamName", "dataSourceName", 
		"streamAlias", "streamNameOrAlias", "columnALias", "constNull", "extended", 
		"identifierNot", "nullCondition", "operatorName"
	};

	@Override
	public String getGrammarFileName() { return "CQLParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CQLParser.EOF, 0); }
		public DdlStatementContext ddlStatement() {
			return getRuleContext(DdlStatementContext.class,0);
		}
		public ExecStatementContext execStatement() {
			return getRuleContext(ExecStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(353);
			switch (_input.LA(1)) {
			case KW_CREATE:
			case KW_SHOW:
			case KW_EXPLAIN:
			case KW_SET:
			case KW_GET:
			case KW_LOAD:
			case KW_DROP:
			case KW_ADD:
			case KW_SUBMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(344); ddlStatement();
				setState(345); match(EOF);
				}
				break;
			case KW_SELECT:
			case KW_FROM:
			case KW_INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); execStatement();
				setState(348); match(EOF);
				}
				break;
			case KW_CAST:
			case KW_FALSE:
			case KW_NULL:
			case KW_TRUE:
			case KW_NOT:
			case KW_OPERATOR:
			case KW_DAY:
			case KW_HOUR:
			case KW_MINUTES:
			case KW_SECONDS:
			case KW_MILLISECONDS:
			case KW_BOOLEAN:
			case KW_INT:
			case KW_LONG:
			case KW_FLOAT:
			case KW_DOUBLE:
			case KW_STRING:
			case KW_TIMESTAMP:
			case KW_DATE:
			case KW_TIME:
			case KW_DECIMAL:
			case LPAREN:
			case PLUS:
			case MINUS:
			case TILDE:
			case LongLiteral:
			case FloatLiteral:
			case DoubleLiteral:
			case DecimalLiteral:
			case StringLiteral:
			case IntegerNumber:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(350); expression();
				setState(351); match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecStatementContext extends ParserRuleContext {
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public MultiInsertStatementContext multiInsertStatement() {
			return getRuleContext(MultiInsertStatementContext.class,0);
		}
		public InsertUserOperatorStatementContext insertUserOperatorStatement() {
			return getRuleContext(InsertUserOperatorStatementContext.class,0);
		}
		public ExecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterExecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitExecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitExecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecStatementContext execStatement() throws RecognitionException {
		ExecStatementContext _localctx = new ExecStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_execStatement);
		try {
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); insertStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); insertUserOperatorStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357); multiInsertStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358); selectStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DdlStatementContext extends ParserRuleContext {
		public CreateFunctionStatementContext createFunctionStatement() {
			return getRuleContext(CreateFunctionStatementContext.class,0);
		}
		public ShowFunctionsContext showFunctions() {
			return getRuleContext(ShowFunctionsContext.class,0);
		}
		public DropFunctionStatementContext dropFunctionStatement() {
			return getRuleContext(DropFunctionStatementContext.class,0);
		}
		public DropApplicationContext dropApplication() {
			return getRuleContext(DropApplicationContext.class,0);
		}
		public GetStatementContext getStatement() {
			return getRuleContext(GetStatementContext.class,0);
		}
		public ExplainStatementContext explainStatement() {
			return getRuleContext(ExplainStatementContext.class,0);
		}
		public CreateDataSourceStatementContext createDataSourceStatement() {
			return getRuleContext(CreateDataSourceStatementContext.class,0);
		}
		public LoadStatementContext loadStatement() {
			return getRuleContext(LoadStatementContext.class,0);
		}
		public ShowApplicationsContext showApplications() {
			return getRuleContext(ShowApplicationsContext.class,0);
		}
		public AddFileStatementContext addFileStatement() {
			return getRuleContext(AddFileStatementContext.class,0);
		}
		public CreatePipeStreamStatementContext createPipeStreamStatement() {
			return getRuleContext(CreatePipeStreamStatementContext.class,0);
		}
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public SubmitApplicationContext submitApplication() {
			return getRuleContext(SubmitApplicationContext.class,0);
		}
		public CreateOutputStreamStatementContext createOutputStreamStatement() {
			return getRuleContext(CreateOutputStreamStatementContext.class,0);
		}
		public AddJARStatementContext addJARStatement() {
			return getRuleContext(AddJARStatementContext.class,0);
		}
		public CreateOperatorStatementContext createOperatorStatement() {
			return getRuleContext(CreateOperatorStatementContext.class,0);
		}
		public CreateInputStreamStatementContext createInputStreamStatement() {
			return getRuleContext(CreateInputStreamStatementContext.class,0);
		}
		public DdlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDdlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDdlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDdlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ddlStatement);
		try {
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361); createInputStreamStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362); createOutputStreamStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363); createPipeStreamStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364); createDataSourceStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(365); createOperatorStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(366); dropApplication();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(367); submitApplication();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(368); showFunctions();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(369); showApplications();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(370); loadStatement();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(371); explainStatement();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(372); getStatement();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(373); setStatement();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(374); createFunctionStatement();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(375); dropFunctionStatement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(376); addFileStatement();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(377); addJARStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateInputStreamStatementContext extends ParserRuleContext {
		public StreamNameContext streamName() {
			return getRuleContext(StreamNameContext.class,0);
		}
		public SerdeDefineContext serdeDefine() {
			return getRuleContext(SerdeDefineContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public TerminalNode KW_CREATE() { return getToken(CQLParser.KW_CREATE, 0); }
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public TerminalNode KW_INPUT() { return getToken(CQLParser.KW_INPUT, 0); }
		public ParallelClauseContext parallelClause() {
			return getRuleContext(ParallelClauseContext.class,0);
		}
		public SourceDefineContext sourceDefine() {
			return getRuleContext(SourceDefineContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public TerminalNode KW_STREAM() { return getToken(CQLParser.KW_STREAM, 0); }
		public CreateInputStreamStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createInputStreamStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCreateInputStreamStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCreateInputStreamStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCreateInputStreamStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateInputStreamStatementContext createInputStreamStatement() throws RecognitionException {
		CreateInputStreamStatementContext _localctx = new CreateInputStreamStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createInputStreamStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(KW_CREATE);
			setState(381); match(KW_INPUT);
			setState(382); match(KW_STREAM);
			setState(383); streamName();
			setState(388);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(384); match(LPAREN);
				setState(385); columnNameTypeList();
				setState(386); match(RPAREN);
				}
			}

			setState(391);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(390); comment();
				}
			}

			setState(394);
			_la = _input.LA(1);
			if (_la==KW_SERDE) {
				{
				setState(393); serdeDefine();
				}
			}

			setState(396); sourceDefine();
			setState(398);
			_la = _input.LA(1);
			if (_la==KW_PARALLEL) {
				{
				setState(397); parallelClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateOutputStreamStatementContext extends ParserRuleContext {
		public StreamNameContext streamName() {
			return getRuleContext(StreamNameContext.class,0);
		}
		public SerdeDefineContext serdeDefine() {
			return getRuleContext(SerdeDefineContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public TerminalNode KW_CREATE() { return getToken(CQLParser.KW_CREATE, 0); }
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public ParallelClauseContext parallelClause() {
			return getRuleContext(ParallelClauseContext.class,0);
		}
		public TerminalNode KW_OUTPUT() { return getToken(CQLParser.KW_OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public SinkDefineContext sinkDefine() {
			return getRuleContext(SinkDefineContext.class,0);
		}
		public TerminalNode KW_STREAM() { return getToken(CQLParser.KW_STREAM, 0); }
		public CreateOutputStreamStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOutputStreamStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCreateOutputStreamStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCreateOutputStreamStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCreateOutputStreamStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateOutputStreamStatementContext createOutputStreamStatement() throws RecognitionException {
		CreateOutputStreamStatementContext _localctx = new CreateOutputStreamStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createOutputStreamStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); match(KW_CREATE);
			setState(401); match(KW_OUTPUT);
			setState(402); match(KW_STREAM);
			setState(403); streamName();
			setState(408);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(404); match(LPAREN);
				setState(405); columnNameTypeList();
				setState(406); match(RPAREN);
				}
			}

			setState(411);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(410); comment();
				}
			}

			setState(414);
			_la = _input.LA(1);
			if (_la==KW_SERDE) {
				{
				setState(413); serdeDefine();
				}
			}

			setState(416); sinkDefine();
			setState(418);
			_la = _input.LA(1);
			if (_la==KW_PARALLEL) {
				{
				setState(417); parallelClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatePipeStreamStatementContext extends ParserRuleContext {
		public StreamNameContext streamName() {
			return getRuleContext(StreamNameContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public TerminalNode KW_CREATE() { return getToken(CQLParser.KW_CREATE, 0); }
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public TerminalNode KW_STREAM() { return getToken(CQLParser.KW_STREAM, 0); }
		public CreatePipeStreamStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createPipeStreamStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCreatePipeStreamStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCreatePipeStreamStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCreatePipeStreamStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatePipeStreamStatementContext createPipeStreamStatement() throws RecognitionException {
		CreatePipeStreamStatementContext _localctx = new CreatePipeStreamStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createPipeStreamStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); match(KW_CREATE);
			setState(421); match(KW_STREAM);
			setState(422); streamName();
			setState(427);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(423); match(LPAREN);
				setState(424); columnNameTypeList();
				setState(425); match(RPAREN);
				}
			}

			setState(430);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(429); comment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDataSourceStatementContext extends ParserRuleContext {
		public DatasourcePropertiesContext datasourceProperties() {
			return getRuleContext(DatasourcePropertiesContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public DataSourceNameContext dataSourceName() {
			return getRuleContext(DataSourceNameContext.class,0);
		}
		public TerminalNode KW_SOURCE() { return getToken(CQLParser.KW_SOURCE, 0); }
		public TerminalNode KW_CREATE() { return getToken(CQLParser.KW_CREATE, 0); }
		public TerminalNode KW_DATASOURCE() { return getToken(CQLParser.KW_DATASOURCE, 0); }
		public CreateDataSourceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDataSourceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCreateDataSourceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCreateDataSourceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCreateDataSourceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDataSourceStatementContext createDataSourceStatement() throws RecognitionException {
		CreateDataSourceStatementContext _localctx = new CreateDataSourceStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createDataSourceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); match(KW_CREATE);
			setState(433); match(KW_DATASOURCE);
			setState(434); dataSourceName();
			setState(435); match(KW_SOURCE);
			setState(436); className();
			setState(438);
			_la = _input.LA(1);
			if (_la==KW_PROPERTIES) {
				{
				setState(437); datasourceProperties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateOperatorStatementContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(CQLParser.KW_AS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public OutputSchemaStatementContext outputSchemaStatement() {
			return getRuleContext(OutputSchemaStatementContext.class,0);
		}
		public StreamPropertiesContext streamProperties() {
			return getRuleContext(StreamPropertiesContext.class,0);
		}
		public InputSchemaStatementContext inputSchemaStatement() {
			return getRuleContext(InputSchemaStatementContext.class,0);
		}
		public OperatorNameContext operatorName() {
			return getRuleContext(OperatorNameContext.class,0);
		}
		public TerminalNode KW_CREATE() { return getToken(CQLParser.KW_CREATE, 0); }
		public TerminalNode KW_OPERATOR() { return getToken(CQLParser.KW_OPERATOR, 0); }
		public CreateOperatorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOperatorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCreateOperatorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCreateOperatorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCreateOperatorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateOperatorStatementContext createOperatorStatement() throws RecognitionException {
		CreateOperatorStatementContext _localctx = new CreateOperatorStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createOperatorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440); match(KW_CREATE);
			setState(441); match(KW_OPERATOR);
			setState(442); operatorName();
			setState(443); match(KW_AS);
			setState(444); className();
			setState(445); inputSchemaStatement();
			setState(446); outputSchemaStatement();
			setState(448);
			_la = _input.LA(1);
			if (_la==KW_PROPERTIES) {
				{
				setState(447); streamProperties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputSchemaStatementContext extends ParserRuleContext {
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public TerminalNode KW_INPUT() { return getToken(CQLParser.KW_INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public InputSchemaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputSchemaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterInputSchemaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitInputSchemaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitInputSchemaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputSchemaStatementContext inputSchemaStatement() throws RecognitionException {
		InputSchemaStatementContext _localctx = new InputSchemaStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inputSchemaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); match(KW_INPUT);
			setState(451); match(LPAREN);
			setState(452); columnNameTypeList();
			setState(453); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputSchemaStatementContext extends ParserRuleContext {
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public TerminalNode KW_OUTPUT() { return getToken(CQLParser.KW_OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public OutputSchemaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputSchemaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterOutputSchemaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitOutputSchemaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitOutputSchemaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputSchemaStatementContext outputSchemaStatement() throws RecognitionException {
		OutputSchemaStatementContext _localctx = new OutputSchemaStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_outputSchemaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); match(KW_OUTPUT);
			setState(456); match(LPAREN);
			setState(457); columnNameTypeList();
			setState(458); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerdeDefineContext extends ParserRuleContext {
		public SerdePropertiesContext serdeProperties() {
			return getRuleContext(SerdePropertiesContext.class,0);
		}
		public SerdeClassContext serdeClass() {
			return getRuleContext(SerdeClassContext.class,0);
		}
		public SerdeDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serdeDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSerdeDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSerdeDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSerdeDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerdeDefineContext serdeDefine() throws RecognitionException {
		SerdeDefineContext _localctx = new SerdeDefineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_serdeDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); serdeClass();
			setState(462);
			_la = _input.LA(1);
			if (_la==KW_PROPERTIES) {
				{
				setState(461); serdeProperties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceDefineContext extends ParserRuleContext {
		public SourceClauseContext sourceClause() {
			return getRuleContext(SourceClauseContext.class,0);
		}
		public SourcePropertiesContext sourceProperties() {
			return getRuleContext(SourcePropertiesContext.class,0);
		}
		public SourceDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSourceDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSourceDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSourceDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceDefineContext sourceDefine() throws RecognitionException {
		SourceDefineContext _localctx = new SourceDefineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sourceDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); sourceClause();
			setState(466);
			_la = _input.LA(1);
			if (_la==KW_PROPERTIES) {
				{
				setState(465); sourceProperties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinkDefineContext extends ParserRuleContext {
		public SinkClauseContext sinkClause() {
			return getRuleContext(SinkClauseContext.class,0);
		}
		public SinkPropertiesContext sinkProperties() {
			return getRuleContext(SinkPropertiesContext.class,0);
		}
		public SinkDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSinkDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSinkDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSinkDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkDefineContext sinkDefine() throws RecognitionException {
		SinkDefineContext _localctx = new SinkDefineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sinkDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); sinkClause();
			setState(470);
			_la = _input.LA(1);
			if (_la==KW_PROPERTIES) {
				{
				setState(469); sinkProperties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode KW_INT() { return getToken(CQLParser.KW_INT, 0); }
		public TerminalNode KW_DECIMAL() { return getToken(CQLParser.KW_DECIMAL, 0); }
		public TerminalNode KW_BOOLEAN() { return getToken(CQLParser.KW_BOOLEAN, 0); }
		public TerminalNode KW_TIMESTAMP() { return getToken(CQLParser.KW_TIMESTAMP, 0); }
		public TerminalNode KW_TIME() { return getToken(CQLParser.KW_TIME, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(CQLParser.KW_DOUBLE, 0); }
		public TerminalNode KW_FLOAT() { return getToken(CQLParser.KW_FLOAT, 0); }
		public TerminalNode KW_LONG() { return getToken(CQLParser.KW_LONG, 0); }
		public TerminalNode KW_STRING() { return getToken(CQLParser.KW_STRING, 0); }
		public TerminalNode KW_DATE() { return getToken(CQLParser.KW_DATE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (KW_BOOLEAN - 109)) | (1L << (KW_INT - 109)) | (1L << (KW_LONG - 109)) | (1L << (KW_FLOAT - 109)) | (1L << (KW_DOUBLE - 109)) | (1L << (KW_STRING - 109)) | (1L << (KW_TIMESTAMP - 109)) | (1L << (KW_DATE - 109)) | (1L << (KW_TIME - 109)) | (1L << (KW_DECIMAL - 109)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public TerminalNode KW_OBJECT() { return getToken(CQLParser.KW_OBJECT, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_colType);
		try {
			setState(476);
			switch (_input.LA(1)) {
			case KW_BOOLEAN:
			case KW_INT:
			case KW_LONG:
			case KW_FLOAT:
			case KW_DOUBLE:
			case KW_STRING:
			case KW_TIMESTAMP:
			case KW_DATE:
			case KW_TIME:
			case KW_DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(474); primitiveType();
				}
				break;
			case KW_OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(475); match(KW_OBJECT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameTypeContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public ColumnNameTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterColumnNameType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitColumnNameType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor) return ((CQLParserVisitor<? extends T>)visitor).visitColumnNameType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameTypeContext columnNameType() throws RecognitionException {
		ColumnNameTypeContext _localctx = new ColumnNameTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_columnNameType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); columnName();
			setState(479); colType();
			setState(481);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(480); comment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode KW_COMMENT() { return getToken(CQLParser.KW_COMMENT, 0); }
		public CommentStringContext commentString() {
			return getRuleContext(CommentStringContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483); match(KW_COMMENT);
			setState(484); commentString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentStringContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CQLParser.StringLiteral, 0); }
		public CommentStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCommentString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCommentString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCommentString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentStringContext commentString() throws RecognitionException {
		CommentStringContext _localctx = new CommentStringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_commentString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameTypeListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public ColumnNameTypeContext columnNameType(int i) {
			return getRuleContext(ColumnNameTypeContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public List<ColumnNameTypeContext> columnNameType() {
			return getRuleContexts(ColumnNameTypeContext.class);
		}
		public ColumnNameTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterColumnNameTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitColumnNameTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitColumnNameTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameTypeListContext columnNameTypeList() throws RecognitionException {
		ColumnNameTypeListContext _localctx = new ColumnNameTypeListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_columnNameTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); columnNameType();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(489); match(COMMA);
				setState(490); columnNameType();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StreamPropertiesListContext extends ParserRuleContext {
		public KeyValuePropertyContext keyValueProperty(int i) {
			return getRuleContext(KeyValuePropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public List<KeyValuePropertyContext> keyValueProperty() {
			return getRuleContexts(KeyValuePropertyContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public StreamPropertiesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamPropertiesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStreamPropertiesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStreamPropertiesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStreamPropertiesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamPropertiesListContext streamPropertiesList() throws RecognitionException {
		StreamPropertiesListContext _localctx = new StreamPropertiesListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_streamPropertiesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); keyValueProperty();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(497); match(COMMA);
				setState(498); keyValueProperty();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyValuePropertyContext extends ParserRuleContext {
		public ConfValueContext confValue() {
			return getRuleContext(ConfValueContext.class,0);
		}
		public ConfNameContext confName() {
			return getRuleContext(ConfNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CQLParser.EQUAL, 0); }
		public KeyValuePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValueProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterKeyValueProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitKeyValueProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitKeyValueProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuePropertyContext keyValueProperty() throws RecognitionException {
		KeyValuePropertyContext _localctx = new KeyValuePropertyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_keyValueProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504); confName();
			setState(505); match(EQUAL);
			setState(506); confValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerdeClassContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode KW_SERDE() { return getToken(CQLParser.KW_SERDE, 0); }
		public SerdeClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serdeClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSerdeClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSerdeClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSerdeClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerdeClassContext serdeClass() throws RecognitionException {
		SerdeClassContext _localctx = new SerdeClassContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_serdeClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508); match(KW_SERDE);
			setState(509); className();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerdePropertiesContext extends ParserRuleContext {
		public StreamPropertiesContext streamProperties() {
			return getRuleContext(StreamPropertiesContext.class,0);
		}
		public SerdePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serdeProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSerdeProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSerdeProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSerdeProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerdePropertiesContext serdeProperties() throws RecognitionException {
		SerdePropertiesContext _localctx = new SerdePropertiesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_serdeProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); streamProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasourcePropertiesContext extends ParserRuleContext {
		public StreamPropertiesContext streamProperties() {
			return getRuleContext(StreamPropertiesContext.class,0);
		}
		public DatasourcePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasourceProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDatasourceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDatasourceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDatasourceProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasourcePropertiesContext datasourceProperties() throws RecognitionException {
		DatasourcePropertiesContext _localctx = new DatasourcePropertiesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_datasourceProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); streamProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinkClauseContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode KW_SINK() { return getToken(CQLParser.KW_SINK, 0); }
		public SinkClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSinkClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSinkClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSinkClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkClauseContext sinkClause() throws RecognitionException {
		SinkClauseContext _localctx = new SinkClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sinkClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); match(KW_SINK);
			setState(516); className();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinkPropertiesContext extends ParserRuleContext {
		public StreamPropertiesContext streamProperties() {
			return getRuleContext(StreamPropertiesContext.class,0);
		}
		public SinkPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSinkProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSinkProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSinkProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkPropertiesContext sinkProperties() throws RecognitionException {
		SinkPropertiesContext _localctx = new SinkPropertiesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sinkProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518); streamProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceClauseContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode KW_SOURCE() { return getToken(CQLParser.KW_SOURCE, 0); }
		public SourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSourceClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSourceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceClauseContext sourceClause() throws RecognitionException {
		SourceClauseContext _localctx = new SourceClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sourceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); match(KW_SOURCE);
			setState(521); className();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourcePropertiesContext extends ParserRuleContext {
		public StreamPropertiesContext streamProperties() {
			return getRuleContext(StreamPropertiesContext.class,0);
		}
		public SourcePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSourceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSourceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSourceProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourcePropertiesContext sourceProperties() throws RecognitionException {
		SourcePropertiesContext _localctx = new SourcePropertiesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sourceProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); streamProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddFileStatementContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode KW_ADD() { return getToken(CQLParser.KW_ADD, 0); }
		public TerminalNode KW_FILE() { return getToken(CQLParser.KW_FILE, 0); }
		public AddFileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addFileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterAddFileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitAddFileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitAddFileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddFileStatementContext addFileStatement() throws RecognitionException {
		AddFileStatementContext _localctx = new AddFileStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addFileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525); match(KW_ADD);
			setState(526); match(KW_FILE);
			setState(527); path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddJARStatementContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode KW_JAR() { return getToken(CQLParser.KW_JAR, 0); }
		public TerminalNode KW_ADD() { return getToken(CQLParser.KW_ADD, 0); }
		public AddJARStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addJARStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterAddJARStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitAddJARStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitAddJARStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddJARStatementContext addJARStatement() throws RecognitionException {
		AddJARStatementContext _localctx = new AddJARStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_addJARStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); match(KW_ADD);
			setState(530); match(KW_JAR);
			setState(531); path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFunctionStatementContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(CQLParser.KW_AS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public StreamPropertiesContext streamProperties() {
			return getRuleContext(StreamPropertiesContext.class,0);
		}
		public TerminalNode KW_CREATE() { return getToken(CQLParser.KW_CREATE, 0); }
		public TerminalNode KW_FUNCTION() { return getToken(CQLParser.KW_FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public CreateFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCreateFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCreateFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCreateFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunctionStatementContext createFunctionStatement() throws RecognitionException {
		CreateFunctionStatementContext _localctx = new CreateFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_createFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(KW_CREATE);
			setState(534); match(KW_FUNCTION);
			setState(535); functionName();
			setState(536); match(KW_AS);
			setState(537); className();
			setState(539);
			_la = _input.LA(1);
			if (_la==KW_PROPERTIES) {
				{
				setState(538); streamProperties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropFunctionStatementContext extends ParserRuleContext {
		public TerminalNode KW_FUNCTION() { return getToken(CQLParser.KW_FUNCTION, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode KW_DROP() { return getToken(CQLParser.KW_DROP, 0); }
		public DropFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDropFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDropFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDropFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropFunctionStatementContext dropFunctionStatement() throws RecognitionException {
		DropFunctionStatementContext _localctx = new DropFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dropFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); match(KW_DROP);
			setState(542); match(KW_FUNCTION);
			setState(544);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(543); ifExists();
				}
			}

			setState(546); functionName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetStatementContext extends ParserRuleContext {
		public TerminalNode KW_GET() { return getToken(CQLParser.KW_GET, 0); }
		public ConfNameContext confName() {
			return getRuleContext(ConfNameContext.class,0);
		}
		public GetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterGetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitGetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitGetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetStatementContext getStatement() throws RecognitionException {
		GetStatementContext _localctx = new GetStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_getStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548); match(KW_GET);
			setState(549); confName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStatementContext extends ParserRuleContext {
		public ConfValueContext confValue() {
			return getRuleContext(ConfValueContext.class,0);
		}
		public ConfNameContext confName() {
			return getRuleContext(ConfNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CQLParser.EQUAL, 0); }
		public TerminalNode KW_SET() { return getToken(CQLParser.KW_SET, 0); }
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_setStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); match(KW_SET);
			setState(552); confName();
			setState(553); match(EQUAL);
			setState(554); confValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadStatementContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode KW_APPLICATION() { return getToken(CQLParser.KW_APPLICATION, 0); }
		public TerminalNode KW_LOAD() { return getToken(CQLParser.KW_LOAD, 0); }
		public LoadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterLoadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitLoadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitLoadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadStatementContext loadStatement() throws RecognitionException {
		LoadStatementContext _localctx = new LoadStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_loadStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); match(KW_LOAD);
			setState(557); match(KW_APPLICATION);
			setState(558); path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainStatementContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ApplicationNameContext applicationName() {
			return getRuleContext(ApplicationNameContext.class,0);
		}
		public TerminalNode KW_EXPLAIN() { return getToken(CQLParser.KW_EXPLAIN, 0); }
		public TerminalNode KW_APPLICATION() { return getToken(CQLParser.KW_APPLICATION, 0); }
		public ExplainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterExplainStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitExplainStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitExplainStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainStatementContext explainStatement() throws RecognitionException {
		ExplainStatementContext _localctx = new ExplainStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_explainStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); match(KW_EXPLAIN);
			setState(561); match(KW_APPLICATION);
			setState(562); applicationName();
			setState(564);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(563); path();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowFunctionsContext extends ParserRuleContext {
		public TerminalNode KW_FUNCTIONS() { return getToken(CQLParser.KW_FUNCTIONS, 0); }
		public ExtendedContext extended() {
			return getRuleContext(ExtendedContext.class,0);
		}
		public TerminalNode KW_SHOW() { return getToken(CQLParser.KW_SHOW, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ShowFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowFunctionsContext showFunctions() throws RecognitionException {
		ShowFunctionsContext _localctx = new ShowFunctionsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_showFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566); match(KW_SHOW);
			setState(567); match(KW_FUNCTIONS);
			setState(569);
			_la = _input.LA(1);
			if (_la==KW_EXTENDED) {
				{
				setState(568); extended();
				}
			}

			setState(571); functionName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowApplicationsContext extends ParserRuleContext {
		public ApplicationNameContext applicationName() {
			return getRuleContext(ApplicationNameContext.class,0);
		}
		public TerminalNode KW_APPLICATIONS() { return getToken(CQLParser.KW_APPLICATIONS, 0); }
		public TerminalNode KW_SHOW() { return getToken(CQLParser.KW_SHOW, 0); }
		public StrValueContext strValue() {
			return getRuleContext(StrValueContext.class,0);
		}
		public ShowApplicationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showApplications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterShowApplications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitShowApplications(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitShowApplications(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowApplicationsContext showApplications() throws RecognitionException {
		ShowApplicationsContext _localctx = new ShowApplicationsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_showApplications);
		int _la;
		try {
			setState(583);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573); match(KW_SHOW);
				setState(574); match(KW_APPLICATIONS);
				setState(576);
				_la = _input.LA(1);
				if (((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (KW_OPERATOR - 101)) | (1L << (KW_DAY - 101)) | (1L << (KW_HOUR - 101)) | (1L << (KW_MINUTES - 101)) | (1L << (KW_SECONDS - 101)) | (1L << (KW_MILLISECONDS - 101)) | (1L << (KW_BOOLEAN - 101)) | (1L << (KW_INT - 101)) | (1L << (KW_LONG - 101)) | (1L << (KW_FLOAT - 101)) | (1L << (KW_DOUBLE - 101)) | (1L << (KW_STRING - 101)) | (1L << (KW_TIMESTAMP - 101)) | (1L << (KW_DATE - 101)) | (1L << (KW_TIME - 101)) | (1L << (KW_DECIMAL - 101)) | (1L << (IntegerNumber - 101)) | (1L << (Identifier - 101)))) != 0)) {
					{
					setState(575); applicationName();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578); match(KW_SHOW);
				setState(579); match(KW_APPLICATIONS);
				setState(581);
				_la = _input.LA(1);
				if (_la==StringLiteral) {
					{
					setState(580); strValue();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropApplicationContext extends ParserRuleContext {
		public ApplicationNameContext applicationName() {
			return getRuleContext(ApplicationNameContext.class,0);
		}
		public TerminalNode KW_APPLICATION() { return getToken(CQLParser.KW_APPLICATION, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public TerminalNode KW_DROP() { return getToken(CQLParser.KW_DROP, 0); }
		public DropApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDropApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDropApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDropApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropApplicationContext dropApplication() throws RecognitionException {
		DropApplicationContext _localctx = new DropApplicationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dropApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); match(KW_DROP);
			setState(586); match(KW_APPLICATION);
			setState(588);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(587); ifExists();
				}
			}

			setState(590); applicationName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubmitApplicationContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ApplicationNameContext applicationName() {
			return getRuleContext(ApplicationNameContext.class,0);
		}
		public TerminalNode KW_SUBMIT() { return getToken(CQLParser.KW_SUBMIT, 0); }
		public TerminalNode KW_APPLICATION() { return getToken(CQLParser.KW_APPLICATION, 0); }
		public IsForceContext isForce() {
			return getRuleContext(IsForceContext.class,0);
		}
		public SubmitApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submitApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSubmitApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSubmitApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSubmitApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubmitApplicationContext submitApplication() throws RecognitionException {
		SubmitApplicationContext _localctx = new SubmitApplicationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_submitApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); match(KW_SUBMIT);
			setState(593); match(KW_APPLICATION);
			setState(595);
			_la = _input.LA(1);
			if (_la==KW_FORCE) {
				{
				setState(594); isForce();
				}
			}

			setState(598);
			_la = _input.LA(1);
			if (((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (KW_OPERATOR - 101)) | (1L << (KW_DAY - 101)) | (1L << (KW_HOUR - 101)) | (1L << (KW_MINUTES - 101)) | (1L << (KW_SECONDS - 101)) | (1L << (KW_MILLISECONDS - 101)) | (1L << (KW_BOOLEAN - 101)) | (1L << (KW_INT - 101)) | (1L << (KW_LONG - 101)) | (1L << (KW_FLOAT - 101)) | (1L << (KW_DOUBLE - 101)) | (1L << (KW_STRING - 101)) | (1L << (KW_TIMESTAMP - 101)) | (1L << (KW_DATE - 101)) | (1L << (KW_TIME - 101)) | (1L << (KW_DECIMAL - 101)) | (1L << (IntegerNumber - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(597); applicationName();
				}
			}

			setState(601);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(600); path();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LogicExpressionOrContext logicExpressionOr() {
			return getRuleContext(LogicExpressionOrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603); logicExpressionOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExpressionOrContext extends ParserRuleContext {
		public LogicExpressionAndContext logicExpressionAnd(int i) {
			return getRuleContext(LogicExpressionAndContext.class,i);
		}
		public TerminalNode KW_OR(int i) {
			return getToken(CQLParser.KW_OR, i);
		}
		public List<TerminalNode> KW_OR() { return getTokens(CQLParser.KW_OR); }
		public List<LogicExpressionAndContext> logicExpressionAnd() {
			return getRuleContexts(LogicExpressionAndContext.class);
		}
		public LogicExpressionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpressionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterLogicExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitLogicExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitLogicExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionOrContext logicExpressionOr() throws RecognitionException {
		LogicExpressionOrContext _localctx = new LogicExpressionOrContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_logicExpressionOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); logicExpressionAnd();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_OR) {
				{
				{
				setState(606); match(KW_OR);
				setState(607); logicExpressionAnd();
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExpressionAndContext extends ParserRuleContext {
		public LogicExpressionNotContext logicExpressionNot(int i) {
			return getRuleContext(LogicExpressionNotContext.class,i);
		}
		public List<LogicExpressionNotContext> logicExpressionNot() {
			return getRuleContexts(LogicExpressionNotContext.class);
		}
		public List<TerminalNode> KW_AND() { return getTokens(CQLParser.KW_AND); }
		public TerminalNode KW_AND(int i) {
			return getToken(CQLParser.KW_AND, i);
		}
		public LogicExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterLogicExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitLogicExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitLogicExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionAndContext logicExpressionAnd() throws RecognitionException {
		LogicExpressionAndContext _localctx = new LogicExpressionAndContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_logicExpressionAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613); logicExpressionNot();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_AND) {
				{
				{
				setState(614); match(KW_AND);
				setState(615); logicExpressionNot();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExpressionNotContext extends ParserRuleContext {
		public EqualRelationExpressionContext equalRelationExpression() {
			return getRuleContext(EqualRelationExpressionContext.class,0);
		}
		public IdentifierNotContext identifierNot() {
			return getRuleContext(IdentifierNotContext.class,0);
		}
		public LogicExpressionNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpressionNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterLogicExpressionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitLogicExpressionNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitLogicExpressionNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionNotContext logicExpressionNot() throws RecognitionException {
		LogicExpressionNotContext _localctx = new LogicExpressionNotContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_logicExpressionNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if (_la==KW_NOT) {
				{
				setState(621); identifierNot();
				}
			}

			setState(624); equalRelationExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualRelationExpressionContext extends ParserRuleContext {
		public IsNullLikeInExpressionsContext isNullLikeInExpressions() {
			return getRuleContext(IsNullLikeInExpressionsContext.class,0);
		}
		public EqualRelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalRelationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterEqualRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitEqualRelationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitEqualRelationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualRelationExpressionContext equalRelationExpression() throws RecognitionException {
		EqualRelationExpressionContext _localctx = new EqualRelationExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_equalRelationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); isNullLikeInExpressions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsNullLikeInExpressionsContext extends ParserRuleContext {
		public NullConditionContext nullCondition() {
			return getRuleContext(NullConditionContext.class,0);
		}
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public TerminalNode KW_IS() { return getToken(CQLParser.KW_IS, 0); }
		public IsNullLikeInExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isNullLikeInExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterIsNullLikeInExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitIsNullLikeInExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitIsNullLikeInExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsNullLikeInExpressionsContext isNullLikeInExpressions() throws RecognitionException {
		IsNullLikeInExpressionsContext _localctx = new IsNullLikeInExpressionsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_isNullLikeInExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628); binaryExpression();
			setState(631);
			_la = _input.LA(1);
			if (_la==KW_IS) {
				{
				setState(629); match(KW_IS);
				setState(630); nullCondition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubQueryExpressionContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public SubQueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQueryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSubQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSubQueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSubQueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubQueryExpressionContext subQueryExpression() throws RecognitionException {
		SubQueryExpressionContext _localctx = new SubQueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_subQueryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); match(LPAREN);
			setState(634); selectStatement();
			setState(635); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionContext extends ParserRuleContext {
		public RelationExpressionContext relationExpression(int i) {
			return getRuleContext(RelationExpressionContext.class,i);
		}
		public BitExpressionContext bitExpression() {
			return getRuleContext(BitExpressionContext.class,0);
		}
		public List<RelationExpressionContext> relationExpression() {
			return getRuleContexts(RelationExpressionContext.class);
		}
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_binaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); bitExpression();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_IN || _la==KW_LIKE || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (EQUAL - 130)) | (1L << (EQUAL_NS - 130)) | (1L << (NOTEQUAL - 130)) | (1L << (LESSTHANOREQUALTO - 130)) | (1L << (LESSTHAN - 130)) | (1L << (GREATERTHANOREQUALTO - 130)) | (1L << (GREATERTHAN - 130)))) != 0)) {
				{
				{
				setState(638); relationExpression();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstListContext extends ParserRuleContext {
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConstList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConstList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644); match(LPAREN);
			setState(645); constant();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(646); match(COMMA);
				setState(647); constant();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationExpressionContext extends ParserRuleContext {
		public RelationOperatorContext relationOperator() {
			return getRuleContext(RelationOperatorContext.class,0);
		}
		public BitExpressionContext bitExpression() {
			return getRuleContext(BitExpressionContext.class,0);
		}
		public RelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRelationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRelationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExpressionContext relationExpression() throws RecognitionException {
		RelationExpressionContext _localctx = new RelationExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_relationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655); relationOperator();
			setState(656); bitExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationOperatorContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(CQLParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHANOREQUALTO() { return getToken(CQLParser.GREATERTHANOREQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(CQLParser.GREATERTHAN, 0); }
		public TerminalNode KW_IN() { return getToken(CQLParser.KW_IN, 0); }
		public TerminalNode KW_LIKE() { return getToken(CQLParser.KW_LIKE, 0); }
		public TerminalNode LESSTHANOREQUALTO() { return getToken(CQLParser.LESSTHANOREQUALTO, 0); }
		public TerminalNode EQUAL() { return getToken(CQLParser.EQUAL, 0); }
		public TerminalNode EQUAL_NS() { return getToken(CQLParser.EQUAL_NS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CQLParser.NOTEQUAL, 0); }
		public RelationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRelationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRelationOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRelationOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationOperatorContext relationOperator() throws RecognitionException {
		RelationOperatorContext _localctx = new RelationOperatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_relationOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( !(_la==KW_IN || _la==KW_LIKE || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (EQUAL - 130)) | (1L << (EQUAL_NS - 130)) | (1L << (NOTEQUAL - 130)) | (1L << (LESSTHANOREQUALTO - 130)) | (1L << (LESSTHAN - 130)) | (1L << (GREATERTHANOREQUALTO - 130)) | (1L << (GREATERTHAN - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceEqualNegatableOperatorContext extends ParserRuleContext {
		public TerminalNode KW_LIKE() { return getToken(CQLParser.KW_LIKE, 0); }
		public TerminalNode KW_REGEXP() { return getToken(CQLParser.KW_REGEXP, 0); }
		public TerminalNode KW_RLIKE() { return getToken(CQLParser.KW_RLIKE, 0); }
		public PrecedenceEqualNegatableOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceEqualNegatableOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterPrecedenceEqualNegatableOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitPrecedenceEqualNegatableOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitPrecedenceEqualNegatableOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecedenceEqualNegatableOperatorContext precedenceEqualNegatableOperator() throws RecognitionException {
		PrecedenceEqualNegatableOperatorContext _localctx = new PrecedenceEqualNegatableOperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_precedenceEqualNegatableOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_LIKE) | (1L << KW_RLIKE) | (1L << KW_REGEXP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExpressionContext extends ParserRuleContext {
		public List<BitOperatorContext> bitOperator() {
			return getRuleContexts(BitOperatorContext.class);
		}
		public BitOperatorContext bitOperator(int i) {
			return getRuleContext(BitOperatorContext.class,i);
		}
		public List<ArithmeticPlusMinusExpressionContext> arithmeticPlusMinusExpression() {
			return getRuleContexts(ArithmeticPlusMinusExpressionContext.class);
		}
		public ArithmeticPlusMinusExpressionContext arithmeticPlusMinusExpression(int i) {
			return getRuleContext(ArithmeticPlusMinusExpressionContext.class,i);
		}
		public BitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterBitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitBitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitBitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExpressionContext bitExpression() throws RecognitionException {
		BitExpressionContext _localctx = new BitExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_bitExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662); arithmeticPlusMinusExpression();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (BITWISEOR - 145)) | (1L << (AMPERSAND - 145)) | (1L << (BITWISEXOR - 145)))) != 0)) {
				{
				{
				setState(663); bitOperator();
				setState(664); arithmeticPlusMinusExpression();
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitOperatorContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(CQLParser.AMPERSAND, 0); }
		public TerminalNode BITWISEXOR() { return getToken(CQLParser.BITWISEXOR, 0); }
		public TerminalNode BITWISEOR() { return getToken(CQLParser.BITWISEOR, 0); }
		public BitOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterBitOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitBitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitBitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitOperatorContext bitOperator() throws RecognitionException {
		BitOperatorContext _localctx = new BitOperatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_bitOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_la = _input.LA(1);
			if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (BITWISEOR - 145)) | (1L << (AMPERSAND - 145)) | (1L << (BITWISEXOR - 145)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticPlusMinusExpressionContext extends ParserRuleContext {
		public List<ArithmeticPlusOperatorContext> arithmeticPlusOperator() {
			return getRuleContexts(ArithmeticPlusOperatorContext.class);
		}
		public List<ArithmeticStarExpressionContext> arithmeticStarExpression() {
			return getRuleContexts(ArithmeticStarExpressionContext.class);
		}
		public ArithmeticPlusOperatorContext arithmeticPlusOperator(int i) {
			return getRuleContext(ArithmeticPlusOperatorContext.class,i);
		}
		public ArithmeticStarExpressionContext arithmeticStarExpression(int i) {
			return getRuleContext(ArithmeticStarExpressionContext.class,i);
		}
		public ArithmeticPlusMinusExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticPlusMinusExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterArithmeticPlusMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitArithmeticPlusMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitArithmeticPlusMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticPlusMinusExpressionContext arithmeticPlusMinusExpression() throws RecognitionException {
		ArithmeticPlusMinusExpressionContext _localctx = new ArithmeticPlusMinusExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_arithmeticPlusMinusExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673); arithmeticStarExpression();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (CONCATENATION - 138)))) != 0)) {
				{
				{
				setState(674); arithmeticPlusOperator();
				setState(675); arithmeticStarExpression();
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticPlusOperatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(CQLParser.MINUS, 0); }
		public TerminalNode CONCATENATION() { return getToken(CQLParser.CONCATENATION, 0); }
		public TerminalNode PLUS() { return getToken(CQLParser.PLUS, 0); }
		public ArithmeticPlusOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticPlusOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterArithmeticPlusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitArithmeticPlusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitArithmeticPlusOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticPlusOperatorContext arithmeticPlusOperator() throws RecognitionException {
		ArithmeticPlusOperatorContext _localctx = new ArithmeticPlusOperatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_arithmeticPlusOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (CONCATENATION - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticStarExpressionContext extends ParserRuleContext {
		public FieldExpressionContext fieldExpression(int i) {
			return getRuleContext(FieldExpressionContext.class,i);
		}
		public List<ArithmeticStarOperatorContext> arithmeticStarOperator() {
			return getRuleContexts(ArithmeticStarOperatorContext.class);
		}
		public ArithmeticStarOperatorContext arithmeticStarOperator(int i) {
			return getRuleContext(ArithmeticStarOperatorContext.class,i);
		}
		public List<FieldExpressionContext> fieldExpression() {
			return getRuleContexts(FieldExpressionContext.class);
		}
		public ArithmeticStarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticStarExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterArithmeticStarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitArithmeticStarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitArithmeticStarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticStarExpressionContext arithmeticStarExpression() throws RecognitionException {
		ArithmeticStarExpressionContext _localctx = new ArithmeticStarExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arithmeticStarExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); fieldExpression();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DIVIDE - 137)) | (1L << (STAR - 137)) | (1L << (MOD - 137)) | (1L << (DIV - 137)))) != 0)) {
				{
				{
				setState(685); arithmeticStarOperator();
				setState(686); fieldExpression();
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldExpressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CQLParser.DOT, 0); }
		public AtomExpressionContext atomExpression() {
			return getRuleContext(AtomExpressionContext.class,0);
		}
		public StreamNameOrAliasContext streamNameOrAlias() {
			return getRuleContext(StreamNameOrAliasContext.class,0);
		}
		public FieldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterFieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitFieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitFieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldExpressionContext fieldExpression() throws RecognitionException {
		FieldExpressionContext _localctx = new FieldExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fieldExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(693); streamNameOrAlias();
				setState(694); match(DOT);
				}
				break;
			}
			setState(698); atomExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticStarOperatorContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(CQLParser.DIV, 0); }
		public TerminalNode STAR() { return getToken(CQLParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(CQLParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(CQLParser.MOD, 0); }
		public ArithmeticStarOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticStarOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterArithmeticStarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitArithmeticStarOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitArithmeticStarOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticStarOperatorContext arithmeticStarOperator() throws RecognitionException {
		ArithmeticStarOperatorContext _localctx = new ArithmeticStarOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arithmeticStarOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DIVIDE - 137)) | (1L << (STAR - 137)) | (1L << (MOD - 137)) | (1L << (DIV - 137)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ConstNullContext constNull() {
			return getRuleContext(ConstNullContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionWithLaparenContext expressionWithLaparen() {
			return getRuleContext(ExpressionWithLaparenContext.class,0);
		}
		public AtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterAtomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitAtomExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpressionContext atomExpression() throws RecognitionException {
		AtomExpressionContext _localctx = new AtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_atomExpression);
		try {
			setState(709);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702); constNull();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703); constList();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(704); constant();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(705); function();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(706); castExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(707); columnName();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(708); expressionWithLaparen();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionWithLaparenContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public ExpressionWithLaparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithLaparen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterExpressionWithLaparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitExpressionWithLaparen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitExpressionWithLaparen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithLaparenContext expressionWithLaparen() throws RecognitionException {
		ExpressionWithLaparenContext _localctx = new ExpressionWithLaparenContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expressionWithLaparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711); match(LPAREN);
			setState(712); expression();
			setState(713); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public ConstDoubleValueContext constDoubleValue() {
			return getRuleContext(ConstDoubleValueContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public ConstBigDecimalValueContext constBigDecimalValue() {
			return getRuleContext(ConstBigDecimalValueContext.class,0);
		}
		public ConstStingValueContext constStingValue() {
			return getRuleContext(ConstStingValueContext.class,0);
		}
		public ConstLongValueContext constLongValue() {
			return getRuleContext(ConstLongValueContext.class,0);
		}
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public ConstFloatValueContext constFloatValue() {
			return getRuleContext(ConstFloatValueContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_constant);
		int _la;
		try {
			setState(727);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case TILDE:
			case LongLiteral:
			case FloatLiteral:
			case DoubleLiteral:
			case DecimalLiteral:
			case IntegerNumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				_la = _input.LA(1);
				if (((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (TILDE - 138)))) != 0)) {
					{
					setState(715); unaryOperator();
					}
				}

				setState(723);
				switch (_input.LA(1)) {
				case IntegerNumber:
					{
					setState(718); constIntegerValue();
					}
					break;
				case LongLiteral:
					{
					setState(719); constLongValue();
					}
					break;
				case FloatLiteral:
					{
					setState(720); constFloatValue();
					}
					break;
				case DoubleLiteral:
					{
					setState(721); constDoubleValue();
					}
					break;
				case DecimalLiteral:
					{
					setState(722); constBigDecimalValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(725); constStingValue();
				}
				break;
			case KW_FALSE:
			case KW_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(726); booleanValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstStingValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CQLParser.StringLiteral, 0); }
		public ConstStingValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constStingValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConstStingValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConstStingValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConstStingValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstStingValueContext constStingValue() throws RecognitionException {
		ConstStingValueContext _localctx = new ConstStingValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constStingValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstIntegerValueContext extends ParserRuleContext {
		public TerminalNode IntegerNumber() { return getToken(CQLParser.IntegerNumber, 0); }
		public ConstIntegerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constIntegerValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConstIntegerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConstIntegerValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConstIntegerValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstIntegerValueContext constIntegerValue() throws RecognitionException {
		ConstIntegerValueContext _localctx = new ConstIntegerValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_constIntegerValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); match(IntegerNumber);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstLongValueContext extends ParserRuleContext {
		public TerminalNode LongLiteral() { return getToken(CQLParser.LongLiteral, 0); }
		public ConstLongValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constLongValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConstLongValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConstLongValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConstLongValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstLongValueContext constLongValue() throws RecognitionException {
		ConstLongValueContext _localctx = new ConstLongValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constLongValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); match(LongLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstFloatValueContext extends ParserRuleContext {
		public TerminalNode FloatLiteral() { return getToken(CQLParser.FloatLiteral, 0); }
		public ConstFloatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constFloatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConstFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConstFloatValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConstFloatValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstFloatValueContext constFloatValue() throws RecognitionException {
		ConstFloatValueContext _localctx = new ConstFloatValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constFloatValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735); match(FloatLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDoubleValueContext extends ParserRuleContext {
		public TerminalNode DoubleLiteral() { return getToken(CQLParser.DoubleLiteral, 0); }
		public ConstDoubleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDoubleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConstDoubleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConstDoubleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConstDoubleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDoubleValueContext constDoubleValue() throws RecognitionException {
		ConstDoubleValueContext _localctx = new ConstDoubleValueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_constDoubleValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737); match(DoubleLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstBigDecimalValueContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(CQLParser.DecimalLiteral, 0); }
		public ConstBigDecimalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constBigDecimalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConstBigDecimalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConstBigDecimalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConstBigDecimalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstBigDecimalValueContext constBigDecimalValue() throws RecognitionException {
		ConstBigDecimalValueContext _localctx = new ConstBigDecimalValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_constBigDecimalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741); functionName();
			setState(742); match(LPAREN);
			setState(744);
			_la = _input.LA(1);
			if (_la==KW_DISTINCT) {
				{
				setState(743); distinct();
				}
			}

			setState(754);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CAST) | (1L << KW_FALSE) | (1L << KW_NULL) | (1L << KW_TRUE) | (1L << KW_NOT))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (KW_OPERATOR - 101)) | (1L << (KW_DAY - 101)) | (1L << (KW_HOUR - 101)) | (1L << (KW_MINUTES - 101)) | (1L << (KW_SECONDS - 101)) | (1L << (KW_MILLISECONDS - 101)) | (1L << (KW_BOOLEAN - 101)) | (1L << (KW_INT - 101)) | (1L << (KW_LONG - 101)) | (1L << (KW_FLOAT - 101)) | (1L << (KW_DOUBLE - 101)) | (1L << (KW_STRING - 101)) | (1L << (KW_TIMESTAMP - 101)) | (1L << (KW_DATE - 101)) | (1L << (KW_TIME - 101)) | (1L << (KW_DECIMAL - 101)) | (1L << (LPAREN - 101)) | (1L << (PLUS - 101)) | (1L << (MINUS - 101)) | (1L << (STAR - 101)) | (1L << (TILDE - 101)) | (1L << (LongLiteral - 101)) | (1L << (FloatLiteral - 101)) | (1L << (DoubleLiteral - 101)) | (1L << (DecimalLiteral - 101)) | (1L << (StringLiteral - 101)) | (1L << (IntegerNumber - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(746); selectExpression();
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(747); match(COMMA);
					setState(748); selectExpression();
					}
					}
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(756); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(CQLParser.KW_AS, 0); }
		public TerminalNode KW_CAST() { return getToken(CQLParser.KW_CAST, 0); }
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758); match(KW_CAST);
			setState(759); match(LPAREN);
			setState(760); expression();
			setState(761); match(KW_AS);
			setState(762); primitiveType();
			setState(763); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode KW_FALSE() { return getToken(CQLParser.KW_FALSE, 0); }
		public TerminalNode KW_TRUE() { return getToken(CQLParser.KW_TRUE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_la = _input.LA(1);
			if ( !(_la==KW_FALSE || _la==KW_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767); match(LPAREN);
			setState(768); expression();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(769); match(COMMA);
				setState(770); expression();
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_insertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778); insertClause();
			setState(779); selectStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertUserOperatorStatementContext extends ParserRuleContext {
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public UsingStatementContext usingStatement() {
			return getRuleContext(UsingStatementContext.class,0);
		}
		public InsertUserOperatorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertUserOperatorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterInsertUserOperatorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitInsertUserOperatorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitInsertUserOperatorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertUserOperatorStatementContext insertUserOperatorStatement() throws RecognitionException {
		InsertUserOperatorStatementContext _localctx = new InsertUserOperatorStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_insertUserOperatorStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781); insertClause();
			setState(782); usingStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingStatementContext extends ParserRuleContext {
		public StreamNameContext streamName() {
			return getRuleContext(StreamNameContext.class,0);
		}
		public DistributeClauseContext distributeClause() {
			return getRuleContext(DistributeClauseContext.class,0);
		}
		public TerminalNode KW_FROM() { return getToken(CQLParser.KW_FROM, 0); }
		public OperatorNameContext operatorName() {
			return getRuleContext(OperatorNameContext.class,0);
		}
		public ParallelClauseContext parallelClause() {
			return getRuleContext(ParallelClauseContext.class,0);
		}
		public TerminalNode KW_OPERATOR() { return getToken(CQLParser.KW_OPERATOR, 0); }
		public TerminalNode KW_USING() { return getToken(CQLParser.KW_USING, 0); }
		public UsingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterUsingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitUsingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitUsingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingStatementContext usingStatement() throws RecognitionException {
		UsingStatementContext _localctx = new UsingStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_usingStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784); match(KW_USING);
			setState(785); match(KW_OPERATOR);
			setState(786); operatorName();
			setState(787); match(KW_FROM);
			setState(788); streamName();
			setState(790);
			_la = _input.LA(1);
			if (_la==KW_DISTRIBUTE) {
				{
				setState(789); distributeClause();
				}
			}

			setState(793);
			_la = _input.LA(1);
			if (_la==KW_PARALLEL) {
				{
				setState(792); parallelClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistributeClauseContext extends ParserRuleContext {
		public TerminalNode KW_DISTRIBUTE() { return getToken(CQLParser.KW_DISTRIBUTE, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode KW_BY() { return getToken(CQLParser.KW_BY, 0); }
		public DistributeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDistributeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDistributeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDistributeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistributeClauseContext distributeClause() throws RecognitionException {
		DistributeClauseContext _localctx = new DistributeClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_distributeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); match(KW_DISTRIBUTE);
			setState(796); match(KW_BY);
			setState(797); columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertStatementContext extends ParserRuleContext {
		public List<MultiInsertContext> multiInsert() {
			return getRuleContexts(MultiInsertContext.class);
		}
		public MultiInsertContext multiInsert(int i) {
			return getRuleContext(MultiInsertContext.class,i);
		}
		public ParallelClauseContext parallelClause() {
			return getRuleContext(ParallelClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public MultiInsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterMultiInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitMultiInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitMultiInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertStatementContext multiInsertStatement() throws RecognitionException {
		MultiInsertStatementContext _localctx = new MultiInsertStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_multiInsertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799); fromClause();
			setState(801); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(800); multiInsert();
				}
				}
				setState(803); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_INSERT );
			setState(806);
			_la = _input.LA(1);
			if (_la==KW_PARALLEL) {
				{
				setState(805); parallelClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public ParallelClauseContext parallelClause() {
			return getRuleContext(ParallelClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); selectClause();
			setState(809); fromClause();
			setState(811);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(810); whereClause();
				}
			}

			setState(814);
			_la = _input.LA(1);
			if (_la==KW_GROUP) {
				{
				setState(813); groupByClause();
				}
			}

			setState(817);
			_la = _input.LA(1);
			if (_la==KW_HAVING) {
				{
				setState(816); havingClause();
				}
			}

			setState(820);
			_la = _input.LA(1);
			if (_la==KW_ORDER) {
				{
				setState(819); orderByClause();
				}
			}

			setState(823);
			_la = _input.LA(1);
			if (_la==KW_LIMIT) {
				{
				setState(822); limitClause();
				}
			}

			setState(826);
			_la = _input.LA(1);
			if (_la==KW_PARALLEL) {
				{
				setState(825); parallelClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertContext extends ParserRuleContext {
		public MultiSelectContext multiSelect() {
			return getRuleContext(MultiSelectContext.class,0);
		}
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public MultiInsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterMultiInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitMultiInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitMultiInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertContext multiInsert() throws RecognitionException {
		MultiInsertContext _localctx = new MultiInsertContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_multiInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828); insertClause();
			setState(829); multiSelect();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiSelectContext extends ParserRuleContext {
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public MultiSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterMultiSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitMultiSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitMultiSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiSelectContext multiSelect() throws RecognitionException {
		MultiSelectContext _localctx = new MultiSelectContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_multiSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831); selectClause();
			setState(833);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(832); whereClause();
				}
			}

			setState(836);
			_la = _input.LA(1);
			if (_la==KW_GROUP) {
				{
				setState(835); groupByClause();
				}
			}

			setState(839);
			_la = _input.LA(1);
			if (_la==KW_HAVING) {
				{
				setState(838); havingClause();
				}
			}

			setState(842);
			_la = _input.LA(1);
			if (_la==KW_ORDER) {
				{
				setState(841); orderByClause();
				}
			}

			setState(845);
			_la = _input.LA(1);
			if (_la==KW_LIMIT) {
				{
				setState(844); limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParallelClauseContext extends ParserRuleContext {
		public TerminalNode KW_PARALLEL() { return getToken(CQLParser.KW_PARALLEL, 0); }
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public ParallelClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterParallelClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitParallelClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitParallelClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelClauseContext parallelClause() throws RecognitionException {
		ParallelClauseContext _localctx = new ParallelClauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_parallelClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847); match(KW_PARALLEL);
			setState(848); constIntegerValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertClauseContext extends ParserRuleContext {
		public StreamNameContext streamName() {
			return getRuleContext(StreamNameContext.class,0);
		}
		public TerminalNode KW_INSERT() { return getToken(CQLParser.KW_INSERT, 0); }
		public TerminalNode KW_INTO() { return getToken(CQLParser.KW_INTO, 0); }
		public TerminalNode KW_STREAM() { return getToken(CQLParser.KW_STREAM, 0); }
		public InsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterInsertClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitInsertClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitInsertClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertClauseContext insertClause() throws RecognitionException {
		InsertClauseContext _localctx = new InsertClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_insertClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850); match(KW_INSERT);
			setState(851); match(KW_INTO);
			setState(853);
			_la = _input.LA(1);
			if (_la==KW_STREAM) {
				{
				setState(852); match(KW_STREAM);
				}
			}

			setState(855); streamName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(CQLParser.KW_FROM, 0); }
		public JoinSourceContext joinSource() {
			return getRuleContext(JoinSourceContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857); match(KW_FROM);
			setState(858); joinSource();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinSourceContext extends ParserRuleContext {
		public JoinRigthBodyContext joinRigthBody(int i) {
			return getRuleContext(JoinRigthBodyContext.class,i);
		}
		public List<JoinRigthBodyContext> joinRigthBody() {
			return getRuleContexts(JoinRigthBodyContext.class);
		}
		public FromSourceContext fromSource() {
			return getRuleContext(FromSourceContext.class,0);
		}
		public JoinSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterJoinSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitJoinSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitJoinSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSourceContext joinSource() throws RecognitionException {
		JoinSourceContext _localctx = new JoinSourceContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_joinSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860); fromSource();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_JOIN) | (1L << KW_FULL) | (1L << KW_CROSS) | (1L << KW_LEFT) | (1L << KW_INNER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_NATURAL - 64)) | (1L << (KW_RIGHT - 64)) | (1L << (COMMA - 64)))) != 0)) {
				{
				{
				setState(861); joinRigthBody();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRigthBodyContext extends ParserRuleContext {
		public JoinTokenContext joinToken() {
			return getRuleContext(JoinTokenContext.class,0);
		}
		public OnConditionContext onCondition() {
			return getRuleContext(OnConditionContext.class,0);
		}
		public FromSourceContext fromSource() {
			return getRuleContext(FromSourceContext.class,0);
		}
		public JoinRigthBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRigthBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterJoinRigthBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitJoinRigthBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitJoinRigthBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRigthBodyContext joinRigthBody() throws RecognitionException {
		JoinRigthBodyContext _localctx = new JoinRigthBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_joinRigthBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867); joinToken();
			setState(868); fromSource();
			setState(870);
			_la = _input.LA(1);
			if (_la==KW_ON) {
				{
				setState(869); onCondition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_ON() { return getToken(CQLParser.KW_ON, 0); }
		public OnConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterOnCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitOnCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitOnCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnConditionContext onCondition() throws RecognitionException {
		OnConditionContext _localctx = new OnConditionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_onCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872); match(KW_ON);
			setState(873); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTokenContext extends ParserRuleContext {
		public FullJoinContext fullJoin() {
			return getRuleContext(FullJoinContext.class,0);
		}
		public InnerJoinContext innerJoin() {
			return getRuleContext(InnerJoinContext.class,0);
		}
		public RightJoinContext rightJoin() {
			return getRuleContext(RightJoinContext.class,0);
		}
		public LeftJoinContext leftJoin() {
			return getRuleContext(LeftJoinContext.class,0);
		}
		public CrossJoinContext crossJoin() {
			return getRuleContext(CrossJoinContext.class,0);
		}
		public NaturalJoinContext naturalJoin() {
			return getRuleContext(NaturalJoinContext.class,0);
		}
		public JoinTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterJoinToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitJoinToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitJoinToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTokenContext joinToken() throws RecognitionException {
		JoinTokenContext _localctx = new JoinTokenContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_joinToken);
		try {
			setState(881);
			switch (_input.LA(1)) {
			case KW_JOIN:
			case KW_INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(875); innerJoin();
				}
				break;
			case KW_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(876); leftJoin();
				}
				break;
			case KW_RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(877); rightJoin();
				}
				break;
			case KW_FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(878); fullJoin();
				}
				break;
			case KW_CROSS:
			case COMMA:
				enterOuterAlt(_localctx, 5);
				{
				setState(879); crossJoin();
				}
				break;
			case KW_NATURAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(880); naturalJoin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerJoinContext extends ParserRuleContext {
		public TerminalNode KW_INNER() { return getToken(CQLParser.KW_INNER, 0); }
		public TerminalNode KW_JOIN() { return getToken(CQLParser.KW_JOIN, 0); }
		public InnerJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterInnerJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitInnerJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitInnerJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerJoinContext innerJoin() throws RecognitionException {
		InnerJoinContext _localctx = new InnerJoinContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_innerJoin);
		try {
			setState(886);
			switch (_input.LA(1)) {
			case KW_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(883); match(KW_JOIN);
				}
				break;
			case KW_INNER:
				enterOuterAlt(_localctx, 2);
				{
				setState(884); match(KW_INNER);
				setState(885); match(KW_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftJoinContext extends ParserRuleContext {
		public TerminalNode KW_OUTER() { return getToken(CQLParser.KW_OUTER, 0); }
		public TerminalNode KW_LEFT() { return getToken(CQLParser.KW_LEFT, 0); }
		public TerminalNode KW_JOIN() { return getToken(CQLParser.KW_JOIN, 0); }
		public LeftJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterLeftJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitLeftJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitLeftJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftJoinContext leftJoin() throws RecognitionException {
		LeftJoinContext _localctx = new LeftJoinContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_leftJoin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888); match(KW_LEFT);
			setState(890);
			_la = _input.LA(1);
			if (_la==KW_OUTER) {
				{
				setState(889); match(KW_OUTER);
				}
			}

			setState(892); match(KW_JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightJoinContext extends ParserRuleContext {
		public TerminalNode KW_RIGHT() { return getToken(CQLParser.KW_RIGHT, 0); }
		public TerminalNode KW_OUTER() { return getToken(CQLParser.KW_OUTER, 0); }
		public TerminalNode KW_JOIN() { return getToken(CQLParser.KW_JOIN, 0); }
		public RightJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRightJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRightJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRightJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightJoinContext rightJoin() throws RecognitionException {
		RightJoinContext _localctx = new RightJoinContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_rightJoin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894); match(KW_RIGHT);
			setState(896);
			_la = _input.LA(1);
			if (_la==KW_OUTER) {
				{
				setState(895); match(KW_OUTER);
				}
			}

			setState(898); match(KW_JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullJoinContext extends ParserRuleContext {
		public TerminalNode KW_OUTER() { return getToken(CQLParser.KW_OUTER, 0); }
		public TerminalNode KW_JOIN() { return getToken(CQLParser.KW_JOIN, 0); }
		public TerminalNode KW_FULL() { return getToken(CQLParser.KW_FULL, 0); }
		public FullJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterFullJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitFullJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitFullJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullJoinContext fullJoin() throws RecognitionException {
		FullJoinContext _localctx = new FullJoinContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_fullJoin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900); match(KW_FULL);
			setState(902);
			_la = _input.LA(1);
			if (_la==KW_OUTER) {
				{
				setState(901); match(KW_OUTER);
				}
			}

			setState(904); match(KW_JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrossJoinContext extends ParserRuleContext {
		public TerminalNode KW_CROSS() { return getToken(CQLParser.KW_CROSS, 0); }
		public TerminalNode COMMA() { return getToken(CQLParser.COMMA, 0); }
		public TerminalNode KW_JOIN() { return getToken(CQLParser.KW_JOIN, 0); }
		public CrossJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCrossJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCrossJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCrossJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossJoinContext crossJoin() throws RecognitionException {
		CrossJoinContext _localctx = new CrossJoinContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_crossJoin);
		try {
			setState(909);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(906); match(COMMA);
				}
				break;
			case KW_CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(907); match(KW_CROSS);
				setState(908); match(KW_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NaturalJoinContext extends ParserRuleContext {
		public TerminalNode KW_NATURAL() { return getToken(CQLParser.KW_NATURAL, 0); }
		public TerminalNode KW_JOIN() { return getToken(CQLParser.KW_JOIN, 0); }
		public NaturalJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturalJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterNaturalJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitNaturalJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitNaturalJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturalJoinContext naturalJoin() throws RecognitionException {
		NaturalJoinContext _localctx = new NaturalJoinContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_naturalJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911); match(KW_NATURAL);
			setState(912); match(KW_JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromSourceContext extends ParserRuleContext {
		public StreamBodyContext streamBody() {
			return getRuleContext(StreamBodyContext.class,0);
		}
		public DatasourceBodyContext datasourceBody() {
			return getRuleContext(DatasourceBodyContext.class,0);
		}
		public FromSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterFromSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitFromSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitFromSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromSourceContext fromSource() throws RecognitionException {
		FromSourceContext _localctx = new FromSourceContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_fromSource);
		try {
			setState(916);
			switch (_input.LA(1)) {
			case KW_OPERATOR:
			case KW_DAY:
			case KW_HOUR:
			case KW_MINUTES:
			case KW_SECONDS:
			case KW_MILLISECONDS:
			case KW_BOOLEAN:
			case KW_INT:
			case KW_LONG:
			case KW_FLOAT:
			case KW_DOUBLE:
			case KW_STRING:
			case KW_TIMESTAMP:
			case KW_DATE:
			case KW_TIME:
			case KW_DECIMAL:
			case LPAREN:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(914); streamBody();
				}
				break;
			case KW_DATASOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(915); datasourceBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StreamBodyContext extends ParserRuleContext {
		public FilterBeforeWindowContext filterBeforeWindow() {
			return getRuleContext(FilterBeforeWindowContext.class,0);
		}
		public SourceAliasContext sourceAlias() {
			return getRuleContext(SourceAliasContext.class,0);
		}
		public WindowSourceContext windowSource() {
			return getRuleContext(WindowSourceContext.class,0);
		}
		public StreamSourceContext streamSource() {
			return getRuleContext(StreamSourceContext.class,0);
		}
		public UnidirectionContext unidirection() {
			return getRuleContext(UnidirectionContext.class,0);
		}
		public StreamBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStreamBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStreamBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStreamBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamBodyContext streamBody() throws RecognitionException {
		StreamBodyContext _localctx = new StreamBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_streamBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918); streamSource();
			setState(920);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(919); filterBeforeWindow();
				}
			}

			setState(923);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(922); windowSource();
				}
			}

			setState(926);
			_la = _input.LA(1);
			if (_la==KW_AS || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (KW_OPERATOR - 101)) | (1L << (KW_DAY - 101)) | (1L << (KW_HOUR - 101)) | (1L << (KW_MINUTES - 101)) | (1L << (KW_SECONDS - 101)) | (1L << (KW_MILLISECONDS - 101)) | (1L << (KW_BOOLEAN - 101)) | (1L << (KW_INT - 101)) | (1L << (KW_LONG - 101)) | (1L << (KW_FLOAT - 101)) | (1L << (KW_DOUBLE - 101)) | (1L << (KW_STRING - 101)) | (1L << (KW_TIMESTAMP - 101)) | (1L << (KW_DATE - 101)) | (1L << (KW_TIME - 101)) | (1L << (KW_DECIMAL - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(925); sourceAlias();
				}
			}

			setState(929);
			_la = _input.LA(1);
			if (_la==KW_UNIDIRECTION) {
				{
				setState(928); unidirection();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasourceBodyContext extends ParserRuleContext {
		public DataSourceNameContext dataSourceName() {
			return getRuleContext(DataSourceNameContext.class,0);
		}
		public SourceAliasContext sourceAlias() {
			return getRuleContext(SourceAliasContext.class,0);
		}
		public TerminalNode KW_DATASOURCE() { return getToken(CQLParser.KW_DATASOURCE, 0); }
		public DatasourceArgumentsContext datasourceArguments() {
			return getRuleContext(DatasourceArgumentsContext.class,0);
		}
		public DatasourceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasourceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDatasourceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDatasourceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDatasourceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasourceBodyContext datasourceBody() throws RecognitionException {
		DatasourceBodyContext _localctx = new DatasourceBodyContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_datasourceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931); match(KW_DATASOURCE);
			setState(932); dataSourceName();
			setState(933); datasourceArguments();
			setState(935);
			_la = _input.LA(1);
			if (_la==KW_AS || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (KW_OPERATOR - 101)) | (1L << (KW_DAY - 101)) | (1L << (KW_HOUR - 101)) | (1L << (KW_MINUTES - 101)) | (1L << (KW_SECONDS - 101)) | (1L << (KW_MILLISECONDS - 101)) | (1L << (KW_BOOLEAN - 101)) | (1L << (KW_INT - 101)) | (1L << (KW_LONG - 101)) | (1L << (KW_FLOAT - 101)) | (1L << (KW_DOUBLE - 101)) | (1L << (KW_STRING - 101)) | (1L << (KW_TIMESTAMP - 101)) | (1L << (KW_DATE - 101)) | (1L << (KW_TIME - 101)) | (1L << (KW_DECIMAL - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(934); sourceAlias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasourceArgumentsContext extends ParserRuleContext {
		public DatasourceSchemaContext datasourceSchema() {
			return getRuleContext(DatasourceSchemaContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CQLParser.RSQUARE, 0); }
		public DatasourceQueryContext datasourceQuery() {
			return getRuleContext(DatasourceQueryContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CQLParser.COMMA, 0); }
		public TerminalNode LSQUARE() { return getToken(CQLParser.LSQUARE, 0); }
		public DatasourceArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasourceArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDatasourceArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDatasourceArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDatasourceArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasourceArgumentsContext datasourceArguments() throws RecognitionException {
		DatasourceArgumentsContext _localctx = new DatasourceArgumentsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_datasourceArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937); match(LSQUARE);
			setState(938); datasourceSchema();
			setState(939); match(COMMA);
			setState(940); datasourceQuery();
			setState(941); match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasourceSchemaContext extends ParserRuleContext {
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(CQLParser.KW_SCHEMA, 0); }
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public DatasourceSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasourceSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDatasourceSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDatasourceSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDatasourceSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasourceSchemaContext datasourceSchema() throws RecognitionException {
		DatasourceSchemaContext _localctx = new DatasourceSchemaContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_datasourceSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943); match(KW_SCHEMA);
			setState(944); match(LPAREN);
			setState(945); columnNameTypeList();
			setState(946); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasourceQueryContext extends ParserRuleContext {
		public DatasourceQueryArgumentsContext datasourceQueryArguments() {
			return getRuleContext(DatasourceQueryArgumentsContext.class,0);
		}
		public TerminalNode KW_QUERY() { return getToken(CQLParser.KW_QUERY, 0); }
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public DatasourceQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasourceQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDatasourceQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDatasourceQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDatasourceQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasourceQueryContext datasourceQuery() throws RecognitionException {
		DatasourceQueryContext _localctx = new DatasourceQueryContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_datasourceQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948); match(KW_QUERY);
			setState(949); match(LPAREN);
			setState(951);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CAST) | (1L << KW_FALSE) | (1L << KW_NULL) | (1L << KW_TRUE) | (1L << KW_NOT))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (KW_OPERATOR - 101)) | (1L << (KW_DAY - 101)) | (1L << (KW_HOUR - 101)) | (1L << (KW_MINUTES - 101)) | (1L << (KW_SECONDS - 101)) | (1L << (KW_MILLISECONDS - 101)) | (1L << (KW_BOOLEAN - 101)) | (1L << (KW_INT - 101)) | (1L << (KW_LONG - 101)) | (1L << (KW_FLOAT - 101)) | (1L << (KW_DOUBLE - 101)) | (1L << (KW_STRING - 101)) | (1L << (KW_TIMESTAMP - 101)) | (1L << (KW_DATE - 101)) | (1L << (KW_TIME - 101)) | (1L << (KW_DECIMAL - 101)) | (1L << (LPAREN - 101)) | (1L << (PLUS - 101)) | (1L << (MINUS - 101)) | (1L << (TILDE - 101)) | (1L << (LongLiteral - 101)) | (1L << (FloatLiteral - 101)) | (1L << (DoubleLiteral - 101)) | (1L << (DecimalLiteral - 101)) | (1L << (StringLiteral - 101)) | (1L << (IntegerNumber - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(950); datasourceQueryArguments();
				}
			}

			setState(953); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasourceQueryArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public DatasourceQueryArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasourceQueryArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDatasourceQueryArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDatasourceQueryArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDatasourceQueryArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasourceQueryArgumentsContext datasourceQueryArguments() throws RecognitionException {
		DatasourceQueryArgumentsContext _localctx = new DatasourceQueryArgumentsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_datasourceQueryArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955); expression();
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(956); match(COMMA);
				setState(957); expression();
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StreamSourceContext extends ParserRuleContext {
		public SubQuerySourceContext subQuerySource() {
			return getRuleContext(SubQuerySourceContext.class,0);
		}
		public StreamNameContext streamName() {
			return getRuleContext(StreamNameContext.class,0);
		}
		public StreamSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStreamSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStreamSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStreamSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamSourceContext streamSource() throws RecognitionException {
		StreamSourceContext _localctx = new StreamSourceContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_streamSource);
		try {
			setState(965);
			switch (_input.LA(1)) {
			case KW_OPERATOR:
			case KW_DAY:
			case KW_HOUR:
			case KW_MINUTES:
			case KW_SECONDS:
			case KW_MILLISECONDS:
			case KW_BOOLEAN:
			case KW_INT:
			case KW_LONG:
			case KW_FLOAT:
			case KW_DOUBLE:
			case KW_STRING:
			case KW_TIMESTAMP:
			case KW_DATE:
			case KW_TIME:
			case KW_DECIMAL:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(963); streamName();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(964); subQuerySource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnidirectionContext extends ParserRuleContext {
		public TerminalNode KW_UNIDIRECTION() { return getToken(CQLParser.KW_UNIDIRECTION, 0); }
		public UnidirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterUnidirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitUnidirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitUnidirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnidirectionContext unidirection() throws RecognitionException {
		UnidirectionContext _localctx = new UnidirectionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_unidirection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967); match(KW_UNIDIRECTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterBeforeWindowContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public FilterBeforeWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterBeforeWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterFilterBeforeWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitFilterBeforeWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitFilterBeforeWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterBeforeWindowContext filterBeforeWindow() throws RecognitionException {
		FilterBeforeWindowContext _localctx = new FilterBeforeWindowContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_filterBeforeWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969); match(LPAREN);
			setState(970); searchCondition();
			setState(971); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSourceContext extends ParserRuleContext {
		public WindowBodyContext windowBody() {
			return getRuleContext(WindowBodyContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CQLParser.RSQUARE, 0); }
		public TerminalNode LSQUARE() { return getToken(CQLParser.LSQUARE, 0); }
		public WindowSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterWindowSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitWindowSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitWindowSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSourceContext windowSource() throws RecognitionException {
		WindowSourceContext _localctx = new WindowSourceContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_windowSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973); match(LSQUARE);
			setState(974); windowBody();
			setState(975); match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowBodyContext extends ParserRuleContext {
		public RowsWindowContext rowsWindow() {
			return getRuleContext(RowsWindowContext.class,0);
		}
		public RangeWindowContext rangeWindow() {
			return getRuleContext(RangeWindowContext.class,0);
		}
		public WindowBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterWindowBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitWindowBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitWindowBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowBodyContext windowBody() throws RecognitionException {
		WindowBodyContext _localctx = new WindowBodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_windowBody);
		try {
			setState(979);
			switch (_input.LA(1)) {
			case KW_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(977); rangeWindow();
				}
				break;
			case KW_ROWS:
				enterOuterAlt(_localctx, 2);
				{
				setState(978); rowsWindow();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowsWindowContext extends ParserRuleContext {
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public WindowDeterminerContext windowDeterminer() {
			return getRuleContext(WindowDeterminerContext.class,0);
		}
		public TerminalNode KW_ROWS() { return getToken(CQLParser.KW_ROWS, 0); }
		public WindowPropertiesContext windowProperties() {
			return getRuleContext(WindowPropertiesContext.class,0);
		}
		public RowsWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowsWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRowsWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRowsWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRowsWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowsWindowContext rowsWindow() throws RecognitionException {
		RowsWindowContext _localctx = new RowsWindowContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_rowsWindow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981); match(KW_ROWS);
			setState(982); constIntegerValue();
			setState(983); windowProperties();
			setState(985);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(984); windowDeterminer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeWindowContext extends ParserRuleContext {
		public TerminalNode KW_RANGE() { return getToken(CQLParser.KW_RANGE, 0); }
		public RangeBoundContext rangeBound() {
			return getRuleContext(RangeBoundContext.class,0);
		}
		public WindowDeterminerContext windowDeterminer() {
			return getRuleContext(WindowDeterminerContext.class,0);
		}
		public WindowPropertiesContext windowProperties() {
			return getRuleContext(WindowPropertiesContext.class,0);
		}
		public RangeWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRangeWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRangeWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRangeWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeWindowContext rangeWindow() throws RecognitionException {
		RangeWindowContext _localctx = new RangeWindowContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_rangeWindow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987); match(KW_RANGE);
			setState(988); rangeBound();
			setState(990);
			_la = _input.LA(1);
			if (_la==KW_SLIDE || _la==KW_BATCH) {
				{
				setState(989); windowProperties();
				}
			}

			setState(993);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(992); windowDeterminer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeBoundContext extends ParserRuleContext {
		public RangeTimeContext rangeTime() {
			return getRuleContext(RangeTimeContext.class,0);
		}
		public RangeUnBoundContext rangeUnBound() {
			return getRuleContext(RangeUnBoundContext.class,0);
		}
		public RangeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRangeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRangeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRangeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeBoundContext rangeBound() throws RecognitionException {
		RangeBoundContext _localctx = new RangeBoundContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_rangeBound);
		try {
			setState(997);
			switch (_input.LA(1)) {
			case KW_PARTITION:
			case KW_SLIDE:
			case KW_BATCH:
			case RSQUARE:
			case IntegerNumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(995); rangeTime();
				}
				break;
			case KW_UNBOUNDED:
				enterOuterAlt(_localctx, 2);
				{
				setState(996); rangeUnBound();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeUnBoundContext extends ParserRuleContext {
		public TerminalNode KW_UNBOUNDED() { return getToken(CQLParser.KW_UNBOUNDED, 0); }
		public RangeUnBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeUnBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRangeUnBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRangeUnBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRangeUnBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeUnBoundContext rangeUnBound() throws RecognitionException {
		RangeUnBoundContext _localctx = new RangeUnBoundContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_rangeUnBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999); match(KW_UNBOUNDED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeTimeContext extends ParserRuleContext {
		public RangeHourContext rangeHour() {
			return getRuleContext(RangeHourContext.class,0);
		}
		public RangeDayContext rangeDay() {
			return getRuleContext(RangeDayContext.class,0);
		}
		public RangeSecondsContext rangeSeconds() {
			return getRuleContext(RangeSecondsContext.class,0);
		}
		public RangeMinutesContext rangeMinutes() {
			return getRuleContext(RangeMinutesContext.class,0);
		}
		public RangeMilliSecondsContext rangeMilliSeconds() {
			return getRuleContext(RangeMilliSecondsContext.class,0);
		}
		public RangeTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRangeTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRangeTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRangeTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeTimeContext rangeTime() throws RecognitionException {
		RangeTimeContext _localctx = new RangeTimeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_rangeTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1001); rangeDay();
				}
				break;
			}
			setState(1005);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(1004); rangeHour();
				}
				break;
			}
			setState(1008);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(1007); rangeMinutes();
				}
				break;
			}
			setState(1011);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(1010); rangeSeconds();
				}
				break;
			}
			setState(1014);
			_la = _input.LA(1);
			if (_la==IntegerNumber) {
				{
				setState(1013); rangeMilliSeconds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeDayContext extends ParserRuleContext {
		public TerminalNode KW_DAY() { return getToken(CQLParser.KW_DAY, 0); }
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public RangeDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRangeDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRangeDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRangeDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeDayContext rangeDay() throws RecognitionException {
		RangeDayContext _localctx = new RangeDayContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_rangeDay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016); constIntegerValue();
			setState(1017); match(KW_DAY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeHourContext extends ParserRuleContext {
		public TerminalNode KW_HOUR() { return getToken(CQLParser.KW_HOUR, 0); }
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public RangeHourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeHour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRangeHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRangeHour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRangeHour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeHourContext rangeHour() throws RecognitionException {
		RangeHourContext _localctx = new RangeHourContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_rangeHour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019); constIntegerValue();
			setState(1020); match(KW_HOUR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeMinutesContext extends ParserRuleContext {
		public TerminalNode KW_MINUTES() { return getToken(CQLParser.KW_MINUTES, 0); }
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public RangeMinutesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeMinutes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRangeMinutes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRangeMinutes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRangeMinutes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeMinutesContext rangeMinutes() throws RecognitionException {
		RangeMinutesContext _localctx = new RangeMinutesContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_rangeMinutes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022); constIntegerValue();
			setState(1023); match(KW_MINUTES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeSecondsContext extends ParserRuleContext {
		public TerminalNode KW_SECONDS() { return getToken(CQLParser.KW_SECONDS, 0); }
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public RangeSecondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeSeconds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRangeSeconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRangeSeconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRangeSeconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeSecondsContext rangeSeconds() throws RecognitionException {
		RangeSecondsContext _localctx = new RangeSecondsContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_rangeSeconds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025); constIntegerValue();
			setState(1026); match(KW_SECONDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeMilliSecondsContext extends ParserRuleContext {
		public TerminalNode KW_MILLISECONDS() { return getToken(CQLParser.KW_MILLISECONDS, 0); }
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public RangeMilliSecondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeMilliSeconds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterRangeMilliSeconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitRangeMilliSeconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitRangeMilliSeconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeMilliSecondsContext rangeMilliSeconds() throws RecognitionException {
		RangeMilliSecondsContext _localctx = new RangeMilliSecondsContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_rangeMilliSeconds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028); constIntegerValue();
			setState(1029); match(KW_MILLISECONDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowPropertiesContext extends ParserRuleContext {
		public TerminalNode KW_BATCH() { return getToken(CQLParser.KW_BATCH, 0); }
		public TerminalNode KW_SLIDE() { return getToken(CQLParser.KW_SLIDE, 0); }
		public WindowPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterWindowProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitWindowProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitWindowProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowPropertiesContext windowProperties() throws RecognitionException {
		WindowPropertiesContext _localctx = new WindowPropertiesContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_windowProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			_la = _input.LA(1);
			if ( !(_la==KW_SLIDE || _la==KW_BATCH) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowDeterminerContext extends ParserRuleContext {
		public PartitionbyDeterminerContext partitionbyDeterminer() {
			return getRuleContext(PartitionbyDeterminerContext.class,0);
		}
		public WindowDeterminerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDeterminer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterWindowDeterminer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitWindowDeterminer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitWindowDeterminer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowDeterminerContext windowDeterminer() throws RecognitionException {
		WindowDeterminerContext _localctx = new WindowDeterminerContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_windowDeterminer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033); partitionbyDeterminer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionbyDeterminerContext extends ParserRuleContext {
		public TerminalNode KW_PARTITION() { return getToken(CQLParser.KW_PARTITION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_BY() { return getToken(CQLParser.KW_BY, 0); }
		public PartitionbyDeterminerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionbyDeterminer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterPartitionbyDeterminer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitPartitionbyDeterminer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitPartitionbyDeterminer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionbyDeterminerContext partitionbyDeterminer() throws RecognitionException {
		PartitionbyDeterminerContext _localctx = new PartitionbyDeterminerContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_partitionbyDeterminer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035); match(KW_PARTITION);
			setState(1036); match(KW_BY);
			setState(1037); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubQuerySourceContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public SubQuerySourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQuerySource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSubQuerySource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSubQuerySource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSubQuerySource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubQuerySourceContext subQuerySource() throws RecognitionException {
		SubQuerySourceContext _localctx = new SubQuerySourceContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_subQuerySource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039); match(LPAREN);
			setState(1040); selectStatement();
			setState(1041); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceAliasContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(CQLParser.KW_AS, 0); }
		public StreamAliasContext streamAlias() {
			return getRuleContext(StreamAliasContext.class,0);
		}
		public SourceAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSourceAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSourceAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSourceAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceAliasContext sourceAlias() throws RecognitionException {
		SourceAliasContext _localctx = new SourceAliasContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_sourceAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(1043); match(KW_AS);
				}
			}

			setState(1046); streamAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupByListContext groupByList() {
			return getRuleContext(GroupByListContext.class,0);
		}
		public TerminalNode KW_GROUP() { return getToken(CQLParser.KW_GROUP, 0); }
		public TerminalNode KW_BY() { return getToken(CQLParser.KW_BY, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048); match(KW_GROUP);
			setState(1049); match(KW_BY);
			setState(1050); groupByList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByListContext extends ParserRuleContext {
		public GroupByExpressionContext groupByExpression(int i) {
			return getRuleContext(GroupByExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public List<GroupByExpressionContext> groupByExpression() {
			return getRuleContexts(GroupByExpressionContext.class);
		}
		public GroupByListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterGroupByList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitGroupByList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitGroupByList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByListContext groupByList() throws RecognitionException {
		GroupByListContext _localctx = new GroupByListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_groupByList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052); groupByExpression();
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1053); match(COMMA);
				setState(1054); groupByExpression();
				}
				}
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterGroupByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitGroupByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitGroupByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByExpressionContext groupByExpression() throws RecognitionException {
		GroupByExpressionContext _localctx = new GroupByExpressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_groupByExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public HavingConditionContext havingCondition() {
			return getRuleContext(HavingConditionContext.class,0);
		}
		public TerminalNode KW_HAVING() { return getToken(CQLParser.KW_HAVING, 0); }
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062); match(KW_HAVING);
			setState(1063); havingCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterHavingCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitHavingCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitHavingCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingConditionContext havingCondition() throws RecognitionException {
		HavingConditionContext _localctx = new HavingConditionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_havingCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode KW_ORDER() { return getToken(CQLParser.KW_ORDER, 0); }
		public ColumnNameOrderListContext columnNameOrderList() {
			return getRuleContext(ColumnNameOrderListContext.class,0);
		}
		public TerminalNode KW_BY() { return getToken(CQLParser.KW_BY, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); match(KW_ORDER);
			setState(1068); match(KW_BY);
			setState(1069); columnNameOrderList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public LimitRowContext limitRow() {
			return getRuleContext(LimitRowContext.class,0);
		}
		public TerminalNode KW_LIMIT() { return getToken(CQLParser.KW_LIMIT, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071); match(KW_LIMIT);
			setState(1072); limitRow();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitAllContext extends ParserRuleContext {
		public TerminalNode KW_ALL() { return getToken(CQLParser.KW_ALL, 0); }
		public LimitAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterLimitAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitLimitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitLimitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitAllContext limitAll() throws RecognitionException {
		LimitAllContext _localctx = new LimitAllContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_limitAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074); match(KW_ALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitRowContext extends ParserRuleContext {
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public LimitRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterLimitRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitLimitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitLimitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitRowContext limitRow() throws RecognitionException {
		LimitRowContext _localctx = new LimitRowContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_limitRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076); constIntegerValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode KW_DISTINCT() { return getToken(CQLParser.KW_DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDistinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078); match(KW_DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public SubSelectClauseContext subSelectClause() {
			return getRuleContext(SubSelectClauseContext.class,0);
		}
		public TerminalNode KW_SELECT() { return getToken(CQLParser.KW_SELECT, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080); match(KW_SELECT);
			setState(1081); subSelectClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubSelectClauseContext extends ParserRuleContext {
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public SubSelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subSelectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSubSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSubSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSubSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubSelectClauseContext subSelectClause() throws RecognitionException {
		SubSelectClauseContext _localctx = new SubSelectClauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_subSelectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			_la = _input.LA(1);
			if (_la==KW_DISTINCT) {
				{
				setState(1083); distinct();
				}
			}

			setState(1086); selectList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088); selectItem();
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1089); match(COMMA);
				setState(1090); selectItem();
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectExpressionContext selectExpression() {
			return getRuleContext(SelectExpressionContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSelectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_selectItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096); selectExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectAliasContext extends ParserRuleContext {
		public SingleAliasContext singleAlias() {
			return getRuleContext(SingleAliasContext.class,0);
		}
		public MultialiasContext multialias() {
			return getRuleContext(MultialiasContext.class,0);
		}
		public SelectAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSelectAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSelectAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSelectAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectAliasContext selectAlias() throws RecognitionException {
		SelectAliasContext _localctx = new SelectAliasContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_selectAlias);
		try {
			setState(1100);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098); multialias();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099); singleAlias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultialiasContext extends ParserRuleContext {
		public List<ColumnALiasContext> columnALias() {
			return getRuleContexts(ColumnALiasContext.class);
		}
		public TerminalNode KW_AS() { return getToken(CQLParser.KW_AS, 0); }
		public ColumnALiasContext columnALias(int i) {
			return getRuleContext(ColumnALiasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public MultialiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multialias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterMultialias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitMultialias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitMultialias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultialiasContext multialias() throws RecognitionException {
		MultialiasContext _localctx = new MultialiasContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_multialias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102); match(KW_AS);
			setState(1103); match(LPAREN);
			setState(1104); columnALias();
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1105); match(COMMA);
				setState(1106); columnALias();
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1112); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleAliasContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(CQLParser.KW_AS, 0); }
		public ColumnALiasContext columnALias() {
			return getRuleContext(ColumnALiasContext.class,0);
		}
		public SingleAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSingleAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSingleAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSingleAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleAliasContext singleAlias() throws RecognitionException {
		SingleAliasContext _localctx = new SingleAliasContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_singleAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(1114); match(KW_AS);
				}
			}

			setState(1117); columnALias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectAliasContext selectAlias() {
			return getRuleContext(SelectAliasContext.class,0);
		}
		public StreamAllColumnsContext streamAllColumns() {
			return getRuleContext(StreamAllColumnsContext.class,0);
		}
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSelectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSelectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSelectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_selectExpression);
		int _la;
		try {
			setState(1124);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119); expression();
				setState(1121);
				_la = _input.LA(1);
				if (_la==KW_AS || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (KW_OPERATOR - 101)) | (1L << (KW_DAY - 101)) | (1L << (KW_HOUR - 101)) | (1L << (KW_MINUTES - 101)) | (1L << (KW_SECONDS - 101)) | (1L << (KW_MILLISECONDS - 101)) | (1L << (KW_BOOLEAN - 101)) | (1L << (KW_INT - 101)) | (1L << (KW_LONG - 101)) | (1L << (KW_FLOAT - 101)) | (1L << (KW_DOUBLE - 101)) | (1L << (KW_STRING - 101)) | (1L << (KW_TIMESTAMP - 101)) | (1L << (KW_DATE - 101)) | (1L << (KW_TIME - 101)) | (1L << (KW_DECIMAL - 101)) | (1L << (Identifier - 101)))) != 0)) {
					{
					setState(1120); selectAlias();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123); streamAllColumns();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameOrderListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public ColumnNameOrderContext columnNameOrder(int i) {
			return getRuleContext(ColumnNameOrderContext.class,i);
		}
		public List<ColumnNameOrderContext> columnNameOrder() {
			return getRuleContexts(ColumnNameOrderContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public ColumnNameOrderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameOrderList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterColumnNameOrderList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitColumnNameOrderList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitColumnNameOrderList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameOrderListContext columnNameOrderList() throws RecognitionException {
		ColumnNameOrderListContext _localctx = new ColumnNameOrderListContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_columnNameOrderList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126); columnNameOrder();
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1127); match(COMMA);
				setState(1128); columnNameOrder();
				}
				}
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameOrderContext extends ParserRuleContext {
		public ColumnOrderContext columnOrder() {
			return getRuleContext(ColumnOrderContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColumnNameOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterColumnNameOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitColumnNameOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitColumnNameOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameOrderContext columnNameOrder() throws RecognitionException {
		ColumnNameOrderContext _localctx = new ColumnNameOrderContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_columnNameOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134); expression();
			setState(1136);
			_la = _input.LA(1);
			if (_la==KW_ASC || _la==KW_DESC) {
				{
				setState(1135); columnOrder();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnOrderContext extends ParserRuleContext {
		public TerminalNode KW_ASC() { return getToken(CQLParser.KW_ASC, 0); }
		public TerminalNode KW_DESC() { return getToken(CQLParser.KW_DESC, 0); }
		public ColumnOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterColumnOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitColumnOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitColumnOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnOrderContext columnOrder() throws RecognitionException {
		ColumnOrderContext _localctx = new ColumnOrderContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_columnOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			_la = _input.LA(1);
			if ( !(_la==KW_ASC || _la==KW_DESC) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public TerminalNode KW_WHERE() { return getToken(CQLParser.KW_WHERE, 0); }
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140); match(KW_WHERE);
			setState(1141); searchCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterSearchCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitSearchCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitSearchCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchConditionContext searchCondition() throws RecognitionException {
		SearchConditionContext _localctx = new SearchConditionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_searchCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StreamAllColumnsContext extends ParserRuleContext {
		public StreamNameContext streamName() {
			return getRuleContext(StreamNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CQLParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(CQLParser.STAR, 0); }
		public StreamAllColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamAllColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStreamAllColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStreamAllColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStreamAllColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamAllColumnsContext streamAllColumns() throws RecognitionException {
		StreamAllColumnsContext _localctx = new StreamAllColumnsContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_streamAllColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			_la = _input.LA(1);
			if (((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (KW_OPERATOR - 101)) | (1L << (KW_DAY - 101)) | (1L << (KW_HOUR - 101)) | (1L << (KW_MINUTES - 101)) | (1L << (KW_SECONDS - 101)) | (1L << (KW_MILLISECONDS - 101)) | (1L << (KW_BOOLEAN - 101)) | (1L << (KW_INT - 101)) | (1L << (KW_LONG - 101)) | (1L << (KW_FLOAT - 101)) | (1L << (KW_DOUBLE - 101)) | (1L << (KW_STRING - 101)) | (1L << (KW_TIMESTAMP - 101)) | (1L << (KW_DATE - 101)) | (1L << (KW_TIME - 101)) | (1L << (KW_DECIMAL - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(1145); streamName();
				setState(1146); match(DOT);
				}
			}

			setState(1150); match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CqlIdentifierContext extends ParserRuleContext {
		public TerminalNode KW_MINUTES() { return getToken(CQLParser.KW_MINUTES, 0); }
		public TerminalNode KW_SECONDS() { return getToken(CQLParser.KW_SECONDS, 0); }
		public TerminalNode KW_TIMESTAMP() { return getToken(CQLParser.KW_TIMESTAMP, 0); }
		public TerminalNode Identifier() { return getToken(CQLParser.Identifier, 0); }
		public TerminalNode KW_TIME() { return getToken(CQLParser.KW_TIME, 0); }
		public TerminalNode KW_INT() { return getToken(CQLParser.KW_INT, 0); }
		public TerminalNode KW_HOUR() { return getToken(CQLParser.KW_HOUR, 0); }
		public TerminalNode KW_DECIMAL() { return getToken(CQLParser.KW_DECIMAL, 0); }
		public TerminalNode KW_DAY() { return getToken(CQLParser.KW_DAY, 0); }
		public TerminalNode KW_MILLISECONDS() { return getToken(CQLParser.KW_MILLISECONDS, 0); }
		public TerminalNode KW_BOOLEAN() { return getToken(CQLParser.KW_BOOLEAN, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(CQLParser.KW_DOUBLE, 0); }
		public TerminalNode KW_OPERATOR() { return getToken(CQLParser.KW_OPERATOR, 0); }
		public TerminalNode KW_FLOAT() { return getToken(CQLParser.KW_FLOAT, 0); }
		public TerminalNode KW_LONG() { return getToken(CQLParser.KW_LONG, 0); }
		public TerminalNode KW_STRING() { return getToken(CQLParser.KW_STRING, 0); }
		public TerminalNode KW_DATE() { return getToken(CQLParser.KW_DATE, 0); }
		public CqlIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cqlIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterCqlIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitCqlIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitCqlIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CqlIdentifierContext cqlIdentifier() throws RecognitionException {
		CqlIdentifierContext _localctx = new CqlIdentifierContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_cqlIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (KW_OPERATOR - 101)) | (1L << (KW_DAY - 101)) | (1L << (KW_HOUR - 101)) | (1L << (KW_MINUTES - 101)) | (1L << (KW_SECONDS - 101)) | (1L << (KW_MILLISECONDS - 101)) | (1L << (KW_BOOLEAN - 101)) | (1L << (KW_INT - 101)) | (1L << (KW_LONG - 101)) | (1L << (KW_FLOAT - 101)) | (1L << (KW_DOUBLE - 101)) | (1L << (KW_STRING - 101)) | (1L << (KW_TIMESTAMP - 101)) | (1L << (KW_DATE - 101)) | (1L << (KW_TIME - 101)) | (1L << (KW_DECIMAL - 101)) | (1L << (Identifier - 101)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameIdentifierContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier(int i) {
			return getRuleContext(CqlIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CQLParser.DOT); }
		public List<CqlIdentifierContext> cqlIdentifier() {
			return getRuleContexts(CqlIdentifierContext.class);
		}
		public TerminalNode DOT(int i) {
			return getToken(CQLParser.DOT, i);
		}
		public PackageNameIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageNameIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterPackageNameIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitPackageNameIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitPackageNameIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameIdentifierContext packageNameIdentifier() throws RecognitionException {
		PackageNameIdentifierContext _localctx = new PackageNameIdentifierContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_packageNameIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154); cqlIdentifier();
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1155); match(DOT);
				setState(1156); cqlIdentifier();
				}
				}
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StreamPropertiesContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(CQLParser.RPAREN, 0); }
		public TerminalNode KW_PROPERTIES() { return getToken(CQLParser.KW_PROPERTIES, 0); }
		public StreamPropertiesListContext streamPropertiesList() {
			return getRuleContext(StreamPropertiesListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CQLParser.LPAREN, 0); }
		public StreamPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStreamProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStreamProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStreamProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamPropertiesContext streamProperties() throws RecognitionException {
		StreamPropertiesContext _localctx = new StreamPropertiesContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_streamProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162); match(KW_PROPERTIES);
			setState(1163); match(LPAREN);
			setState(1164); streamPropertiesList();
			setState(1165); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfNameContext extends ParserRuleContext {
		public PackageNameIdentifierContext packageNameIdentifier() {
			return getRuleContext(PackageNameIdentifierContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(CQLParser.StringLiteral, 0); }
		public ConfNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConfName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConfName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConfName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfNameContext confName() throws RecognitionException {
		ConfNameContext _localctx = new ConfNameContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_confName);
		try {
			setState(1169);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167); match(StringLiteral);
				}
				break;
			case KW_OPERATOR:
			case KW_DAY:
			case KW_HOUR:
			case KW_MINUTES:
			case KW_SECONDS:
			case KW_MILLISECONDS:
			case KW_BOOLEAN:
			case KW_INT:
			case KW_LONG:
			case KW_FLOAT:
			case KW_DOUBLE:
			case KW_STRING:
			case KW_TIMESTAMP:
			case KW_DATE:
			case KW_TIME:
			case KW_DECIMAL:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168); packageNameIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CQLParser.StringLiteral, 0); }
		public ConfValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConfValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConfValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConfValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfValueContext confValue() throws RecognitionException {
		ConfValueContext _localctx = new ConfValueContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_confValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CQLParser.StringLiteral, 0); }
		public StrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrValueContext strValue() throws RecognitionException {
		StrValueContext _localctx = new StrValueContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_strValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(CQLParser.TILDE, 0); }
		public TerminalNode MINUS() { return getToken(CQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CQLParser.PLUS, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (PLUS - 138)) | (1L << (MINUS - 138)) | (1L << (TILDE - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177); cqlIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowNameContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public WindowNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterWindowName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitWindowName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitWindowName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowNameContext windowName() throws RecognitionException {
		WindowNameContext _localctx = new WindowNameContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_windowName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179); cqlIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public InnerClassNameContext innerClassName() {
			return getRuleContext(InnerClassNameContext.class,0);
		}
		public UserDefinedClassNameContext userDefinedClassName() {
			return getRuleContext(UserDefinedClassNameContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_className);
		try {
			setState(1183);
			switch (_input.LA(1)) {
			case KW_OPERATOR:
			case KW_DAY:
			case KW_HOUR:
			case KW_MINUTES:
			case KW_SECONDS:
			case KW_MILLISECONDS:
			case KW_BOOLEAN:
			case KW_INT:
			case KW_LONG:
			case KW_FLOAT:
			case KW_DOUBLE:
			case KW_STRING:
			case KW_TIMESTAMP:
			case KW_DATE:
			case KW_TIME:
			case KW_DECIMAL:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181); innerClassName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182); userDefinedClassName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerClassNameContext extends ParserRuleContext {
		public PackageNameIdentifierContext packageNameIdentifier() {
			return getRuleContext(PackageNameIdentifierContext.class,0);
		}
		public InnerClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterInnerClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitInnerClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitInnerClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerClassNameContext innerClassName() throws RecognitionException {
		InnerClassNameContext _localctx = new InnerClassNameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_innerClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185); packageNameIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserDefinedClassNameContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CQLParser.StringLiteral, 0); }
		public UserDefinedClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterUserDefinedClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitUserDefinedClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitUserDefinedClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedClassNameContext userDefinedClassName() throws RecognitionException {
		UserDefinedClassNameContext _localctx = new UserDefinedClassNameContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_userDefinedClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CQLParser.StringLiteral, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApplicationNameContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public ConstIntegerValueContext constIntegerValue() {
			return getRuleContext(ConstIntegerValueContext.class,0);
		}
		public ApplicationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applicationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterApplicationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitApplicationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitApplicationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplicationNameContext applicationName() throws RecognitionException {
		ApplicationNameContext _localctx = new ApplicationNameContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_applicationName);
		try {
			setState(1193);
			switch (_input.LA(1)) {
			case KW_OPERATOR:
			case KW_DAY:
			case KW_HOUR:
			case KW_MINUTES:
			case KW_SECONDS:
			case KW_MILLISECONDS:
			case KW_BOOLEAN:
			case KW_INT:
			case KW_LONG:
			case KW_FLOAT:
			case KW_DOUBLE:
			case KW_STRING:
			case KW_TIMESTAMP:
			case KW_DATE:
			case KW_TIME:
			case KW_DECIMAL:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191); cqlIdentifier();
				}
				break;
			case IntegerNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192); constIntegerValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195); cqlIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsForceContext extends ParserRuleContext {
		public TerminalNode KW_FORCE() { return getToken(CQLParser.KW_FORCE, 0); }
		public IsForceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isForce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterIsForce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitIsForce(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitIsForce(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsForceContext isForce() throws RecognitionException {
		IsForceContext _localctx = new IsForceContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_isForce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197); match(KW_FORCE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode KW_EXISTS() { return getToken(CQLParser.KW_EXISTS, 0); }
		public TerminalNode KW_IF() { return getToken(CQLParser.KW_IF, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199); match(KW_IF);
			setState(1200); match(KW_EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfNotExistsContext extends ParserRuleContext {
		public TerminalNode KW_NOT() { return getToken(CQLParser.KW_NOT, 0); }
		public TerminalNode KW_EXISTS() { return getToken(CQLParser.KW_EXISTS, 0); }
		public TerminalNode KW_IF() { return getToken(CQLParser.KW_IF, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); match(KW_IF);
			setState(1203); match(KW_NOT);
			setState(1204); match(KW_EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StreamNameContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public StreamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStreamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStreamName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStreamName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamNameContext streamName() throws RecognitionException {
		StreamNameContext _localctx = new StreamNameContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_streamName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206); cqlIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataSourceNameContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public DataSourceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSourceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterDataSourceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitDataSourceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitDataSourceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSourceNameContext dataSourceName() throws RecognitionException {
		DataSourceNameContext _localctx = new DataSourceNameContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_dataSourceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208); cqlIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StreamAliasContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public StreamAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStreamAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStreamAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStreamAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamAliasContext streamAlias() throws RecognitionException {
		StreamAliasContext _localctx = new StreamAliasContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_streamAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210); cqlIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StreamNameOrAliasContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public StreamNameOrAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamNameOrAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterStreamNameOrAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitStreamNameOrAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitStreamNameOrAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamNameOrAliasContext streamNameOrAlias() throws RecognitionException {
		StreamNameOrAliasContext _localctx = new StreamNameOrAliasContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_streamNameOrAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212); cqlIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnALiasContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public ColumnALiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnALias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterColumnALias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitColumnALias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitColumnALias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnALiasContext columnALias() throws RecognitionException {
		ColumnALiasContext _localctx = new ColumnALiasContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_columnALias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214); cqlIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstNullContext extends ParserRuleContext {
		public TerminalNode KW_NULL() { return getToken(CQLParser.KW_NULL, 0); }
		public ConstNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterConstNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitConstNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitConstNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstNullContext constNull() throws RecognitionException {
		ConstNullContext _localctx = new ConstNullContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_constNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216); match(KW_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedContext extends ParserRuleContext {
		public TerminalNode KW_EXTENDED() { return getToken(CQLParser.KW_EXTENDED, 0); }
		public ExtendedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitExtended(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitExtended(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedContext extended() throws RecognitionException {
		ExtendedContext _localctx = new ExtendedContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_extended);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218); match(KW_EXTENDED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierNotContext extends ParserRuleContext {
		public TerminalNode KW_NOT() { return getToken(CQLParser.KW_NOT, 0); }
		public IdentifierNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterIdentifierNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitIdentifierNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitIdentifierNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierNotContext identifierNot() throws RecognitionException {
		IdentifierNotContext _localctx = new IdentifierNotContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_identifierNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220); match(KW_NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullConditionContext extends ParserRuleContext {
		public TerminalNode KW_NULL() { return getToken(CQLParser.KW_NULL, 0); }
		public IdentifierNotContext identifierNot() {
			return getRuleContext(IdentifierNotContext.class,0);
		}
		public NullConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterNullCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitNullCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitNullCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullConditionContext nullCondition() throws RecognitionException {
		NullConditionContext _localctx = new NullConditionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_nullCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_la = _input.LA(1);
			if (_la==KW_NOT) {
				{
				setState(1222); identifierNot();
				}
			}

			setState(1225); match(KW_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorNameContext extends ParserRuleContext {
		public CqlIdentifierContext cqlIdentifier() {
			return getRuleContext(CqlIdentifierContext.class,0);
		}
		public OperatorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).enterOperatorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLParserListener ) ((CQLParserListener)listener).exitOperatorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLParserVisitor ) return ((CQLParserVisitor<? extends T>)visitor).visitOperatorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorNameContext operatorName() throws RecognitionException {
		OperatorNameContext _localctx = new OperatorNameContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_operatorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227); cqlIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u00a4\u04d0\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0164\n\2\3\3\3\3\3\3\3\3\5\3"+
		"\u016a\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u017d\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0187\n\5\3"+
		"\5\5\5\u018a\n\5\3\5\5\5\u018d\n\5\3\5\3\5\5\5\u0191\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u019b\n\6\3\6\5\6\u019e\n\6\3\6\5\6\u01a1\n\6\3"+
		"\6\3\6\5\6\u01a5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01ae\n\7\3\7\5\7"+
		"\u01b1\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01b9\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u01c3\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\5\f\u01d1\n\f\3\r\3\r\5\r\u01d5\n\r\3\16\3\16\5\16\u01d9\n\16"+
		"\3\17\3\17\3\20\3\20\5\20\u01df\n\20\3\21\3\21\3\21\5\21\u01e4\n\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u01ee\n\24\f\24\16\24\u01f1"+
		"\13\24\3\25\3\25\3\25\7\25\u01f6\n\25\f\25\16\25\u01f9\13\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \5 \u021e\n \3!\3!\3!\5!\u0223\n!\3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\5%\u0237\n%\3&\3&\3&\5&\u023c\n&\3"+
		"&\3&\3\'\3\'\3\'\5\'\u0243\n\'\3\'\3\'\3\'\5\'\u0248\n\'\5\'\u024a\n\'"+
		"\3(\3(\3(\5(\u024f\n(\3(\3(\3)\3)\3)\5)\u0256\n)\3)\5)\u0259\n)\3)\5)"+
		"\u025c\n)\3*\3*\3+\3+\3+\7+\u0263\n+\f+\16+\u0266\13+\3,\3,\3,\7,\u026b"+
		"\n,\f,\16,\u026e\13,\3-\5-\u0271\n-\3-\3-\3.\3.\3/\3/\3/\5/\u027a\n/\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\7\61\u0282\n\61\f\61\16\61\u0285\13\61\3"+
		"\62\3\62\3\62\3\62\7\62\u028b\n\62\f\62\16\62\u028e\13\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u029d\n\66"+
		"\f\66\16\66\u02a0\13\66\3\67\3\67\38\38\38\38\78\u02a8\n8\f8\168\u02ab"+
		"\138\39\39\3:\3:\3:\3:\7:\u02b3\n:\f:\16:\u02b6\13:\3;\3;\3;\5;\u02bb"+
		"\n;\3;\3;\3<\3<\3=\3=\3=\3=\3=\3=\3=\5=\u02c8\n=\3>\3>\3>\3>\3?\5?\u02cf"+
		"\n?\3?\3?\3?\3?\3?\5?\u02d6\n?\3?\3?\5?\u02da\n?\3@\3@\3A\3A\3B\3B\3C"+
		"\3C\3D\3D\3E\3E\3F\3F\3F\5F\u02eb\nF\3F\3F\3F\7F\u02f0\nF\fF\16F\u02f3"+
		"\13F\5F\u02f5\nF\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3I\3I\3I\3I\7I\u0306"+
		"\nI\fI\16I\u0309\13I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3L\3L\5L\u0319"+
		"\nL\3L\5L\u031c\nL\3M\3M\3M\3M\3N\3N\6N\u0324\nN\rN\16N\u0325\3N\5N\u0329"+
		"\nN\3O\3O\3O\5O\u032e\nO\3O\5O\u0331\nO\3O\5O\u0334\nO\3O\5O\u0337\nO"+
		"\3O\5O\u033a\nO\3O\5O\u033d\nO\3P\3P\3P\3Q\3Q\5Q\u0344\nQ\3Q\5Q\u0347"+
		"\nQ\3Q\5Q\u034a\nQ\3Q\5Q\u034d\nQ\3Q\5Q\u0350\nQ\3R\3R\3R\3S\3S\3S\5S"+
		"\u0358\nS\3S\3S\3T\3T\3T\3U\3U\7U\u0361\nU\fU\16U\u0364\13U\3V\3V\3V\5"+
		"V\u0369\nV\3W\3W\3W\3X\3X\3X\3X\3X\3X\5X\u0374\nX\3Y\3Y\3Y\5Y\u0379\n"+
		"Y\3Z\3Z\5Z\u037d\nZ\3Z\3Z\3[\3[\5[\u0383\n[\3[\3[\3\\\3\\\5\\\u0389\n"+
		"\\\3\\\3\\\3]\3]\3]\5]\u0390\n]\3^\3^\3^\3_\3_\5_\u0397\n_\3`\3`\5`\u039b"+
		"\n`\3`\5`\u039e\n`\3`\5`\u03a1\n`\3`\5`\u03a4\n`\3a\3a\3a\3a\5a\u03aa"+
		"\na\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3d\3d\3d\5d\u03ba\nd\3d\3d\3e\3e"+
		"\3e\7e\u03c1\ne\fe\16e\u03c4\13e\3f\3f\5f\u03c8\nf\3g\3g\3h\3h\3h\3h\3"+
		"i\3i\3i\3i\3j\3j\5j\u03d6\nj\3k\3k\3k\3k\5k\u03dc\nk\3l\3l\3l\5l\u03e1"+
		"\nl\3l\5l\u03e4\nl\3m\3m\5m\u03e8\nm\3n\3n\3o\5o\u03ed\no\3o\5o\u03f0"+
		"\no\3o\5o\u03f3\no\3o\5o\u03f6\no\3o\5o\u03f9\no\3p\3p\3p\3q\3q\3q\3r"+
		"\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u\3v\3v\3w\3w\3w\3w\3x\3x\3x\3x\3y\5y\u0417"+
		"\ny\3y\3y\3z\3z\3z\3z\3{\3{\3{\7{\u0422\n{\f{\16{\u0425\13{\3|\3|\3}\3"+
		"}\3}\3~\3~\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085\5\u0085"+
		"\u043f\n\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u0446\n"+
		"\u0086\f\u0086\16\u0086\u0449\13\u0086\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\5\u0088\u044f\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089"+
		"\u0456\n\u0089\f\u0089\16\u0089\u0459\13\u0089\3\u0089\3\u0089\3\u008a"+
		"\5\u008a\u045e\n\u008a\3\u008a\3\u008a\3\u008b\3\u008b\5\u008b\u0464\n"+
		"\u008b\3\u008b\5\u008b\u0467\n\u008b\3\u008c\3\u008c\3\u008c\7\u008c\u046c"+
		"\n\u008c\f\u008c\16\u008c\u046f\13\u008c\3\u008d\3\u008d\5\u008d\u0473"+
		"\n\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0091\5\u0091\u047f\n\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\3\u0093\7\u0093\u0488\n\u0093\f\u0093\16\u0093\u048b"+
		"\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\5\u0095"+
		"\u0494\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\5\u009b\u04a2\n\u009b\3\u009c"+
		"\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\5\u009f\u04ac"+
		"\n\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ac\5\u00ac\u04ca\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\2\u00ae\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\2\r\3\2ox\4\2\35\36\u0084"+
		"\u008a\3\2\36 \3\2\u0093\u0095\3\2\u008c\u008e\4\2\u008b\u008b\u008f\u0091"+
		"\4\2))--\3\2WX\3\2\60\61\5\2ggjx\u00a0\u00a0\4\2\u008c\u008d\u0092\u0092"+
		"\u04b1\2\u0163\3\2\2\2\4\u0169\3\2\2\2\6\u017c\3\2\2\2\b\u017e\3\2\2\2"+
		"\n\u0192\3\2\2\2\f\u01a6\3\2\2\2\16\u01b2\3\2\2\2\20\u01ba\3\2\2\2\22"+
		"\u01c4\3\2\2\2\24\u01c9\3\2\2\2\26\u01ce\3\2\2\2\30\u01d2\3\2\2\2\32\u01d6"+
		"\3\2\2\2\34\u01da\3\2\2\2\36\u01de\3\2\2\2 \u01e0\3\2\2\2\"\u01e5\3\2"+
		"\2\2$\u01e8\3\2\2\2&\u01ea\3\2\2\2(\u01f2\3\2\2\2*\u01fa\3\2\2\2,\u01fe"+
		"\3\2\2\2.\u0201\3\2\2\2\60\u0203\3\2\2\2\62\u0205\3\2\2\2\64\u0208\3\2"+
		"\2\2\66\u020a\3\2\2\28\u020d\3\2\2\2:\u020f\3\2\2\2<\u0213\3\2\2\2>\u0217"+
		"\3\2\2\2@\u021f\3\2\2\2B\u0226\3\2\2\2D\u0229\3\2\2\2F\u022e\3\2\2\2H"+
		"\u0232\3\2\2\2J\u0238\3\2\2\2L\u0249\3\2\2\2N\u024b\3\2\2\2P\u0252\3\2"+
		"\2\2R\u025d\3\2\2\2T\u025f\3\2\2\2V\u0267\3\2\2\2X\u0270\3\2\2\2Z\u0274"+
		"\3\2\2\2\\\u0276\3\2\2\2^\u027b\3\2\2\2`\u027f\3\2\2\2b\u0286\3\2\2\2"+
		"d\u0291\3\2\2\2f\u0294\3\2\2\2h\u0296\3\2\2\2j\u0298\3\2\2\2l\u02a1\3"+
		"\2\2\2n\u02a3\3\2\2\2p\u02ac\3\2\2\2r\u02ae\3\2\2\2t\u02ba\3\2\2\2v\u02be"+
		"\3\2\2\2x\u02c7\3\2\2\2z\u02c9\3\2\2\2|\u02d9\3\2\2\2~\u02db\3\2\2\2\u0080"+
		"\u02dd\3\2\2\2\u0082\u02df\3\2\2\2\u0084\u02e1\3\2\2\2\u0086\u02e3\3\2"+
		"\2\2\u0088\u02e5\3\2\2\2\u008a\u02e7\3\2\2\2\u008c\u02f8\3\2\2\2\u008e"+
		"\u02ff\3\2\2\2\u0090\u0301\3\2\2\2\u0092\u030c\3\2\2\2\u0094\u030f\3\2"+
		"\2\2\u0096\u0312\3\2\2\2\u0098\u031d\3\2\2\2\u009a\u0321\3\2\2\2\u009c"+
		"\u032a\3\2\2\2\u009e\u033e\3\2\2\2\u00a0\u0341\3\2\2\2\u00a2\u0351\3\2"+
		"\2\2\u00a4\u0354\3\2\2\2\u00a6\u035b\3\2\2\2\u00a8\u035e\3\2\2\2\u00aa"+
		"\u0365\3\2\2\2\u00ac\u036a\3\2\2\2\u00ae\u0373\3\2\2\2\u00b0\u0378\3\2"+
		"\2\2\u00b2\u037a\3\2\2\2\u00b4\u0380\3\2\2\2\u00b6\u0386\3\2\2\2\u00b8"+
		"\u038f\3\2\2\2\u00ba\u0391\3\2\2\2\u00bc\u0396\3\2\2\2\u00be\u0398\3\2"+
		"\2\2\u00c0\u03a5\3\2\2\2\u00c2\u03ab\3\2\2\2\u00c4\u03b1\3\2\2\2\u00c6"+
		"\u03b6\3\2\2\2\u00c8\u03bd\3\2\2\2\u00ca\u03c7\3\2\2\2\u00cc\u03c9\3\2"+
		"\2\2\u00ce\u03cb\3\2\2\2\u00d0\u03cf\3\2\2\2\u00d2\u03d5\3\2\2\2\u00d4"+
		"\u03d7\3\2\2\2\u00d6\u03dd\3\2\2\2\u00d8\u03e7\3\2\2\2\u00da\u03e9\3\2"+
		"\2\2\u00dc\u03ec\3\2\2\2\u00de\u03fa\3\2\2\2\u00e0\u03fd\3\2\2\2\u00e2"+
		"\u0400\3\2\2\2\u00e4\u0403\3\2\2\2\u00e6\u0406\3\2\2\2\u00e8\u0409\3\2"+
		"\2\2\u00ea\u040b\3\2\2\2\u00ec\u040d\3\2\2\2\u00ee\u0411\3\2\2\2\u00f0"+
		"\u0416\3\2\2\2\u00f2\u041a\3\2\2\2\u00f4\u041e\3\2\2\2\u00f6\u0426\3\2"+
		"\2\2\u00f8\u0428\3\2\2\2\u00fa\u042b\3\2\2\2\u00fc\u042d\3\2\2\2\u00fe"+
		"\u0431\3\2\2\2\u0100\u0434\3\2\2\2\u0102\u0436\3\2\2\2\u0104\u0438\3\2"+
		"\2\2\u0106\u043a\3\2\2\2\u0108\u043e\3\2\2\2\u010a\u0442\3\2\2\2\u010c"+
		"\u044a\3\2\2\2\u010e\u044e\3\2\2\2\u0110\u0450\3\2\2\2\u0112\u045d\3\2"+
		"\2\2\u0114\u0466\3\2\2\2\u0116\u0468\3\2\2\2\u0118\u0470\3\2\2\2\u011a"+
		"\u0474\3\2\2\2\u011c\u0476\3\2\2\2\u011e\u0479\3\2\2\2\u0120\u047e\3\2"+
		"\2\2\u0122\u0482\3\2\2\2\u0124\u0484\3\2\2\2\u0126\u048c\3\2\2\2\u0128"+
		"\u0493\3\2\2\2\u012a\u0495\3\2\2\2\u012c\u0497\3\2\2\2\u012e\u0499\3\2"+
		"\2\2\u0130\u049b\3\2\2\2\u0132\u049d\3\2\2\2\u0134\u04a1\3\2\2\2\u0136"+
		"\u04a3\3\2\2\2\u0138\u04a5\3\2\2\2\u013a\u04a7\3\2\2\2\u013c\u04ab\3\2"+
		"\2\2\u013e\u04ad\3\2\2\2\u0140\u04af\3\2\2\2\u0142\u04b1\3\2\2\2\u0144"+
		"\u04b4\3\2\2\2\u0146\u04b8\3\2\2\2\u0148\u04ba\3\2\2\2\u014a\u04bc\3\2"+
		"\2\2\u014c\u04be\3\2\2\2\u014e\u04c0\3\2\2\2\u0150\u04c2\3\2\2\2\u0152"+
		"\u04c4\3\2\2\2\u0154\u04c6\3\2\2\2\u0156\u04c9\3\2\2\2\u0158\u04cd\3\2"+
		"\2\2\u015a\u015b\5\6\4\2\u015b\u015c\7\2\2\3\u015c\u0164\3\2\2\2\u015d"+
		"\u015e\5\4\3\2\u015e\u015f\7\2\2\3\u015f\u0164\3\2\2\2\u0160\u0161\5R"+
		"*\2\u0161\u0162\7\2\2\3\u0162\u0164\3\2\2\2\u0163\u015a\3\2\2\2\u0163"+
		"\u015d\3\2\2\2\u0163\u0160\3\2\2\2\u0164\3\3\2\2\2\u0165\u016a\5\u0092"+
		"J\2\u0166\u016a\5\u0094K\2\u0167\u016a\5\u009aN\2\u0168\u016a\5\u009c"+
		"O\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u0168\3\2\2\2\u016a\5\3\2\2\2\u016b\u017d\5\b\5\2\u016c\u017d\5\n\6\2"+
		"\u016d\u017d\5\f\7\2\u016e\u017d\5\16\b\2\u016f\u017d\5\20\t\2\u0170\u017d"+
		"\5N(\2\u0171\u017d\5P)\2\u0172\u017d\5J&\2\u0173\u017d\5L\'\2\u0174\u017d"+
		"\5F$\2\u0175\u017d\5H%\2\u0176\u017d\5B\"\2\u0177\u017d\5D#\2\u0178\u017d"+
		"\5> \2\u0179\u017d\5@!\2\u017a\u017d\5:\36\2\u017b\u017d\5<\37\2\u017c"+
		"\u016b\3\2\2\2\u017c\u016c\3\2\2\2\u017c\u016d\3\2\2\2\u017c\u016e\3\2"+
		"\2\2\u017c\u016f\3\2\2\2\u017c\u0170\3\2\2\2\u017c\u0171\3\2\2\2\u017c"+
		"\u0172\3\2\2\2\u017c\u0173\3\2\2\2\u017c\u0174\3\2\2\2\u017c\u0175\3\2"+
		"\2\2\u017c\u0176\3\2\2\2\u017c\u0177\3\2\2\2\u017c\u0178\3\2\2\2\u017c"+
		"\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\7\3\2\2\2"+
		"\u017e\u017f\7\3\2\2\u017f\u0180\7\23\2\2\u0180\u0181\7\24\2\2\u0181\u0186"+
		"\5\u0146\u00a4\2\u0182\u0183\7~\2\2\u0183\u0184\5&\24\2\u0184\u0185\7"+
		"\177\2\2\u0185\u0187\3\2\2\2\u0186\u0182\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\3\2\2\2\u0188\u018a\5\"\22\2\u0189\u0188\3\2\2\2\u0189\u018a\3"+
		"\2\2\2\u018a\u018c\3\2\2\2\u018b\u018d\5\26\f\2\u018c\u018b\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\5\30\r\2\u018f\u0191\5"+
		"\u00a2R\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\t\3\2\2\2\u0192"+
		"\u0193\7\3\2\2\u0193\u0194\7\25\2\2\u0194\u0195\7\24\2\2\u0195\u019a\5"+
		"\u0146\u00a4\2\u0196\u0197\7~\2\2\u0197\u0198\5&\24\2\u0198\u0199\7\177"+
		"\2\2\u0199\u019b\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019e\5\"\22\2\u019d\u019c\3\2\2\2\u019d\u019e\3"+
		"\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\5\26\f\2\u01a0\u019f\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\5\32\16\2\u01a3\u01a5\5"+
		"\u00a2R\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\13\3\2\2\2\u01a6"+
		"\u01a7\7\3\2\2\u01a7\u01a8\7\24\2\2\u01a8\u01ad\5\u0146\u00a4\2\u01a9"+
		"\u01aa\7~\2\2\u01aa\u01ab\5&\24\2\u01ab\u01ac\7\177\2\2\u01ac\u01ae\3"+
		"\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u01b1\5\"\22\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\r\3\2\2"+
		"\2\u01b2\u01b3\7\3\2\2\u01b3\u01b4\7`\2\2\u01b4\u01b5\5\u0148\u00a5\2"+
		"\u01b5\u01b6\7\22\2\2\u01b6\u01b8\5\u0134\u009b\2\u01b7\u01b9\5\60\31"+
		"\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\17\3\2\2\2\u01ba\u01bb"+
		"\7\3\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\5\u0158\u00ad\2\u01bd\u01be\7"+
		"*\2\2\u01be\u01bf\5\u0134\u009b\2\u01bf\u01c0\5\22\n\2\u01c0\u01c2\5\24"+
		"\13\2\u01c1\u01c3\5\u0126\u0094\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\21\3\2\2\2\u01c4\u01c5\7\23\2\2\u01c5\u01c6\7~\2\2\u01c6\u01c7"+
		"\5&\24\2\u01c7\u01c8\7\177\2\2\u01c8\23\3\2\2\2\u01c9\u01ca\7\25\2\2\u01ca"+
		"\u01cb\7~\2\2\u01cb\u01cc\5&\24\2\u01cc\u01cd\7\177\2\2\u01cd\25\3\2\2"+
		"\2\u01ce\u01d0\5,\27\2\u01cf\u01d1\5.\30\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\27\3\2\2\2\u01d2\u01d4\5\66\34\2\u01d3\u01d5\58\35\2\u01d4"+
		"\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\31\3\2\2\2\u01d6\u01d8\5\62\32"+
		"\2\u01d7\u01d9\5\64\33\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\33\3\2\2\2\u01da\u01db\t\2\2\2\u01db\35\3\2\2\2\u01dc\u01df\5\34\17\2"+
		"\u01dd\u01df\7y\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\37\3"+
		"\2\2\2\u01e0\u01e1\5\u013e\u00a0\2\u01e1\u01e3\5\36\20\2\u01e2\u01e4\5"+
		"\"\22\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4!\3\2\2\2\u01e5\u01e6"+
		"\7\r\2\2\u01e6\u01e7\5$\23\2\u01e7#\3\2\2\2\u01e8\u01e9\7\u009c\2\2\u01e9"+
		"%\3\2\2\2\u01ea\u01ef\5 \21\2\u01eb\u01ec\7|\2\2\u01ec\u01ee\5 \21\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\'\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f7\5*\26\2\u01f3\u01f4"+
		"\7|\2\2\u01f4\u01f6\5*\26\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8)\3\2\2\2\u01f9\u01f7\3\2\2\2"+
		"\u01fa\u01fb\5\u0128\u0095\2\u01fb\u01fc\7\u0084\2\2\u01fc\u01fd\5\u012a"+
		"\u0096\2\u01fd+\3\2\2\2\u01fe\u01ff\7\17\2\2\u01ff\u0200\5\u0134\u009b"+
		"\2\u0200-\3\2\2\2\u0201\u0202\5\u0126\u0094\2\u0202/\3\2\2\2\u0203\u0204"+
		"\5\u0126\u0094\2\u0204\61\3\2\2\2\u0205\u0206\7\26\2\2\u0206\u0207\5\u0134"+
		"\u009b\2\u0207\63\3\2\2\2\u0208\u0209\5\u0126\u0094\2\u0209\65\3\2\2\2"+
		"\u020a\u020b\7\22\2\2\u020b\u020c\5\u0134\u009b\2\u020c\67\3\2\2\2\u020d"+
		"\u020e\5\u0126\u0094\2\u020e9\3\2\2\2\u020f\u0210\7\13\2\2\u0210\u0211"+
		"\7M\2\2\u0211\u0212\5\u013a\u009e\2\u0212;\3\2\2\2\u0213\u0214\7\13\2"+
		"\2\u0214\u0215\7P\2\2\u0215\u0216\5\u013a\u009e\2\u0216=\3\2\2\2\u0217"+
		"\u0218\7\3\2\2\u0218\u0219\7Q\2\2\u0219\u021a\5\u0130\u0099\2\u021a\u021b"+
		"\7*\2\2\u021b\u021d\5\u0134\u009b\2\u021c\u021e\5\u0126\u0094\2\u021d"+
		"\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e?\3\2\2\2\u021f\u0220\7\n\2\2"+
		"\u0220\u0222\7Q\2\2\u0221\u0223\5\u0142\u00a2\2\u0222\u0221\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\5\u0130\u0099\2\u0225A"+
		"\3\2\2\2\u0226\u0227\7\7\2\2\u0227\u0228\5\u0128\u0095\2\u0228C\3\2\2"+
		"\2\u0229\u022a\7\6\2\2\u022a\u022b\5\u0128\u0095\2\u022b\u022c\7\u0084"+
		"\2\2\u022c\u022d\5\u012a\u0096\2\u022dE\3\2\2\2\u022e\u022f\7\b\2\2\u022f"+
		"\u0230\7\30\2\2\u0230\u0231\5\u013a\u009e\2\u0231G\3\2\2\2\u0232\u0233"+
		"\7\5\2\2\u0233\u0234\7\30\2\2\u0234\u0236\5\u013c\u009f\2\u0235\u0237"+
		"\5\u013a\u009e\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237I\3\2\2"+
		"\2\u0238\u0239\7\4\2\2\u0239\u023b\7L\2\2\u023a\u023c\5\u0152\u00aa\2"+
		"\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e"+
		"\5\u0130\u0099\2\u023eK\3\2\2\2\u023f\u0240\7\4\2\2\u0240\u0242\7I\2\2"+
		"\u0241\u0243\5\u013c\u009f\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u024a\3\2\2\2\u0244\u0245\7\4\2\2\u0245\u0247\7I\2\2\u0246\u0248\5\u012c"+
		"\u0097\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249"+
		"\u023f\3\2\2\2\u0249\u0244\3\2\2\2\u024aM\3\2\2\2\u024b\u024c\7\n\2\2"+
		"\u024c\u024e\7\30\2\2\u024d\u024f\5\u0142\u00a2\2\u024e\u024d\3\2\2\2"+
		"\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\5\u013c\u009f\2\u0251"+
		"O\3\2\2\2\u0252\u0253\7\27\2\2\u0253\u0255\7\30\2\2\u0254\u0256\5\u0140"+
		"\u00a1\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257"+
		"\u0259\5\u013c\u009f\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b"+
		"\3\2\2\2\u025a\u025c\5\u013a\u009e\2\u025b\u025a\3\2\2\2\u025b\u025c\3"+
		"\2\2\2\u025cQ\3\2\2\2\u025d\u025e\5T+\2\u025eS\3\2\2\2\u025f\u0264\5V"+
		",\2\u0260\u0261\7\33\2\2\u0261\u0263\5V,\2\u0262\u0260\3\2\2\2\u0263\u0266"+
		"\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265U\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0267\u026c\5X-\2\u0268\u0269\7\32\2\2\u0269\u026b\5X-"+
		"\2\u026a\u0268\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d"+
		"\3\2\2\2\u026dW\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0271\5\u0154\u00ab"+
		"\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273"+
		"\5Z.\2\u0273Y\3\2\2\2\u0274\u0275\5\\/\2\u0275[\3\2\2\2\u0276\u0279\5"+
		"`\61\2\u0277\u0278\7,\2\2\u0278\u027a\5\u0156\u00ac\2\u0279\u0277\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027a]\3\2\2\2\u027b\u027c\7~\2\2\u027c\u027d"+
		"\5\u009cO\2\u027d\u027e\7\177\2\2\u027e_\3\2\2\2\u027f\u0283\5j\66\2\u0280"+
		"\u0282\5d\63\2\u0281\u0280\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2"+
		"\2\2\u0283\u0284\3\2\2\2\u0284a\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287"+
		"\7~\2\2\u0287\u028c\5|?\2\u0288\u0289\7|\2\2\u0289\u028b\5|?\2\u028a\u0288"+
		"\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0290\7\177\2\2\u0290c\3\2\2"+
		"\2\u0291\u0292\5f\64\2\u0292\u0293\5j\66\2\u0293e\3\2\2\2\u0294\u0295"+
		"\t\3\2\2\u0295g\3\2\2\2\u0296\u0297\t\4\2\2\u0297i\3\2\2\2\u0298\u029e"+
		"\5n8\2\u0299\u029a\5l\67\2\u029a\u029b\5n8\2\u029b\u029d\3\2\2\2\u029c"+
		"\u0299\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029fk\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\t\5\2\2\u02a2m\3\2"+
		"\2\2\u02a3\u02a9\5r:\2\u02a4\u02a5\5p9\2\u02a5\u02a6\5r:\2\u02a6\u02a8"+
		"\3\2\2\2\u02a7\u02a4\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aao\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\t\6\2\2"+
		"\u02adq\3\2\2\2\u02ae\u02b4\5t;\2\u02af\u02b0\5v<\2\u02b0\u02b1\5t;\2"+
		"\u02b1\u02b3\3\2\2\2\u02b2\u02af\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5s\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02b8\5\u014c\u00a7\2\u02b8\u02b9\7z\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b7"+
		"\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\5x=\2\u02bd"+
		"u\3\2\2\2\u02be\u02bf\t\7\2\2\u02bfw\3\2\2\2\u02c0\u02c8\5\u0150\u00a9"+
		"\2\u02c1\u02c8\5b\62\2\u02c2\u02c8\5|?\2\u02c3\u02c8\5\u008aF\2\u02c4"+
		"\u02c8\5\u008cG\2\u02c5\u02c8\5\u013e\u00a0\2\u02c6\u02c8\5z>\2\u02c7"+
		"\u02c0\3\2\2\2\u02c7\u02c1\3\2\2\2\u02c7\u02c2\3\2\2\2\u02c7\u02c3\3\2"+
		"\2\2\u02c7\u02c4\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8"+
		"y\3\2\2\2\u02c9\u02ca\7~\2\2\u02ca\u02cb\5R*\2\u02cb\u02cc\7\177\2\2\u02cc"+
		"{\3\2\2\2\u02cd\u02cf\5\u012e\u0098\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d5\3\2\2\2\u02d0\u02d6\5\u0080A\2\u02d1\u02d6\5\u0082"+
		"B\2\u02d2\u02d6\5\u0084C\2\u02d3\u02d6\5\u0086D\2\u02d4\u02d6\5\u0088"+
		"E\2\u02d5\u02d0\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d5\u02d2\3\2\2\2\u02d5"+
		"\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\u02da\3\2\2\2\u02d7\u02da\5~"+
		"@\2\u02d8\u02da\5\u008eH\2\u02d9\u02ce\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9"+
		"\u02d8\3\2\2\2\u02da}\3\2\2\2\u02db\u02dc\7\u009c\2\2\u02dc\177\3\2\2"+
		"\2\u02dd\u02de\7\u009e\2\2\u02de\u0081\3\2\2\2\u02df\u02e0\7\u0098\2\2"+
		"\u02e0\u0083\3\2\2\2\u02e1\u02e2\7\u0099\2\2\u02e2\u0085\3\2\2\2\u02e3"+
		"\u02e4\7\u009a\2\2\u02e4\u0087\3\2\2\2\u02e5\u02e6\7\u009b\2\2\u02e6\u0089"+
		"\3\2\2\2\u02e7\u02e8\5\u0130\u0099\2\u02e8\u02ea\7~\2\2\u02e9\u02eb\5"+
		"\u0104\u0083\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02f4\3\2"+
		"\2\2\u02ec\u02f1\5\u0114\u008b\2\u02ed\u02ee\7|\2\2\u02ee\u02f0\5\u0114"+
		"\u008b\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02ec\3\2"+
		"\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\7\177\2\2\u02f7"+
		"\u008b\3\2\2\2\u02f8\u02f9\7&\2\2\u02f9\u02fa\7~\2\2\u02fa\u02fb\5R*\2"+
		"\u02fb\u02fc\7*\2\2\u02fc\u02fd\5\34\17\2\u02fd\u02fe\7\177\2\2\u02fe"+
		"\u008d\3\2\2\2\u02ff\u0300\t\b\2\2\u0300\u008f\3\2\2\2\u0301\u0302\7~"+
		"\2\2\u0302\u0307\5R*\2\u0303\u0304\7|\2\2\u0304\u0306\5R*\2\u0305\u0303"+
		"\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u030a\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030b\7\177\2\2\u030b\u0091\3"+
		"\2\2\2\u030c\u030d\5\u00a4S\2\u030d\u030e\5\u009cO\2\u030e\u0093\3\2\2"+
		"\2\u030f\u0310\5\u00a4S\2\u0310\u0311\5\u0096L\2\u0311\u0095\3\2\2\2\u0312"+
		"\u0313\7h\2\2\u0313\u0314\7g\2\2\u0314\u0315\5\u0158\u00ad\2\u0315\u0316"+
		"\78\2\2\u0316\u0318\5\u0146\u00a4\2\u0317\u0319\5\u0098M\2\u0318\u0317"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u031c\5\u00a2R"+
		"\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u0097\3\2\2\2\u031d\u031e"+
		"\7i\2\2\u031e\u031f\7\65\2\2\u031f\u0320\5\u013e\u00a0\2\u0320\u0099\3"+
		"\2\2\2\u0321\u0323\5\u00a6T\2\u0322\u0324\5\u009eP\2\u0323\u0322\3\2\2"+
		"\2\u0324\u0325\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328"+
		"\3\2\2\2\u0327\u0329\5\u00a2R\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2"+
		"\2\u0329\u009b\3\2\2\2\u032a\u032b\5\u0106\u0084\2\u032b\u032d\5\u00a6"+
		"T\2\u032c\u032e\5\u011c\u008f\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2"+
		"\2\u032e\u0330\3\2\2\2\u032f\u0331\5\u00f2z\2\u0330\u032f\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0334\5\u00f8}\2\u0333\u0332"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0337\5\u00fc\177"+
		"\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u033a"+
		"\5\u00fe\u0080\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3"+
		"\2\2\2\u033b\u033d\5\u00a2R\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2"+
		"\u033d\u009d\3\2\2\2\u033e\u033f\5\u00a4S\2\u033f\u0340\5\u00a0Q\2\u0340"+
		"\u009f\3\2\2\2\u0341\u0343\5\u0106\u0084\2\u0342\u0344\5\u011c\u008f\2"+
		"\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u0347"+
		"\5\u00f2z\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349\3\2\2"+
		"\2\u0348\u034a\5\u00f8}\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034c\3\2\2\2\u034b\u034d\5\u00fc\177\2\u034c\u034b\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u0350\5\u00fe\u0080\2\u034f\u034e\3"+
		"\2\2\2\u034f\u0350\3\2\2\2\u0350\u00a1\3\2\2\2\u0351\u0352\7T\2\2\u0352"+
		"\u0353\5\u0080A\2\u0353\u00a3\3\2\2\2\u0354\u0355\7E\2\2\u0355\u0357\7"+
		"D\2\2\u0356\u0358\7\24\2\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u035a\5\u0146\u00a4\2\u035a\u00a5\3\2\2\2\u035b\u035c"+
		"\78\2\2\u035c\u035d\5\u00a8U\2\u035d\u00a7\3\2\2\2\u035e\u0362\5\u00bc"+
		"_\2\u035f\u0361\5\u00aaV\2\u0360\u035f\3\2\2\2\u0361\u0364\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u00a9\3\2\2\2\u0364\u0362\3\2"+
		"\2\2\u0365\u0366\5\u00aeX\2\u0366\u0368\5\u00bc_\2\u0367\u0369\5\u00ac"+
		"W\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u00ab\3\2\2\2\u036a"+
		"\u036b\79\2\2\u036b\u036c\5R*\2\u036c\u00ad\3\2\2\2\u036d\u0374\5\u00b0"+
		"Y\2\u036e\u0374\5\u00b2Z\2\u036f\u0374\5\u00b4[\2\u0370\u0374\5\u00b6"+
		"\\\2\u0371\u0374\5\u00b8]\2\u0372\u0374\5\u00ba^\2\u0373\u036d\3\2\2\2"+
		"\u0373\u036e\3\2\2\2\u0373\u036f\3\2\2\2\u0373\u0370\3\2\2\2\u0373\u0371"+
		"\3\2\2\2\u0373\u0372\3\2\2\2\u0374\u00af\3\2\2\2\u0375\u0379\7:\2\2\u0376"+
		"\u0377\7A\2\2\u0377\u0379\7:\2\2\u0378\u0375\3\2\2\2\u0378\u0376\3\2\2"+
		"\2\u0379\u00b1\3\2\2\2\u037a\u037c\7@\2\2\u037b\u037d\7=\2\2\u037c\u037b"+
		"\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\7:\2\2\u037f"+
		"\u00b3\3\2\2\2\u0380\u0382\7C\2\2\u0381\u0383\7=\2\2\u0382\u0381\3\2\2"+
		"\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\7:\2\2\u0385\u00b5"+
		"\3\2\2\2\u0386\u0388\7;\2\2\u0387\u0389\7=\2\2\u0388\u0387\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\7:\2\2\u038b\u00b7\3\2"+
		"\2\2\u038c\u0390\7|\2\2\u038d\u038e\7>\2\2\u038e\u0390\7:\2\2\u038f\u038c"+
		"\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u00b9\3\2\2\2\u0391\u0392\7B\2\2\u0392"+
		"\u0393\7:\2\2\u0393\u00bb\3\2\2\2\u0394\u0397\5\u00be`\2\u0395\u0397\5"+
		"\u00c0a\2\u0396\u0394\3\2\2\2\u0396\u0395\3\2\2\2\u0397\u00bd\3\2\2\2"+
		"\u0398\u039a\5\u00caf\2\u0399\u039b\5\u00ceh\2\u039a\u0399\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039d\3\2\2\2\u039c\u039e\5\u00d0i\2\u039d\u039c"+
		"\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u03a1\5\u00f0y"+
		"\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2\u03a4"+
		"\5\u00ccg\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u00bf\3\2\2"+
		"\2\u03a5\u03a6\7`\2\2\u03a6\u03a7\5\u0148\u00a5\2\u03a7\u03a9\5\u00c2"+
		"b\2\u03a8\u03aa\5\u00f0y\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u00c1\3\2\2\2\u03ab\u03ac\7\u0080\2\2\u03ac\u03ad\5\u00c4c\2\u03ad\u03ae"+
		"\7|\2\2\u03ae\u03af\5\u00c6d\2\u03af\u03b0\7\u0081\2\2\u03b0\u00c3\3\2"+
		"\2\2\u03b1\u03b2\7a\2\2\u03b2\u03b3\7~\2\2\u03b3\u03b4\5&\24\2\u03b4\u03b5"+
		"\7\177\2\2\u03b5\u00c5\3\2\2\2\u03b6\u03b7\7b\2\2\u03b7\u03b9\7~\2\2\u03b8"+
		"\u03ba\5\u00c8e\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb"+
		"\3\2\2\2\u03bb\u03bc\7\177\2\2\u03bc\u00c7\3\2\2\2\u03bd\u03c2\5R*\2\u03be"+
		"\u03bf\7|\2\2\u03bf\u03c1\5R*\2\u03c0\u03be\3\2\2\2\u03c1\u03c4\3\2\2"+
		"\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u00c9\3\2\2\2\u03c4\u03c2"+
		"\3\2\2\2\u03c5\u03c8\5\u0146\u00a4\2\u03c6\u03c8\5\u00eex\2\u03c7\u03c5"+
		"\3\2\2\2\u03c7\u03c6\3\2\2\2\u03c8\u00cb\3\2\2\2\u03c9\u03ca\7S\2\2\u03ca"+
		"\u00cd\3\2\2\2\u03cb\u03cc\7~\2\2\u03cc\u03cd\5\u011e\u0090\2\u03cd\u03ce"+
		"\7\177\2\2\u03ce\u00cf\3\2\2\2\u03cf\u03d0\7\u0080\2\2\u03d0\u03d1\5\u00d2"+
		"j\2\u03d1\u03d2\7\u0081\2\2\u03d2\u00d1\3\2\2\2\u03d3\u03d6\5\u00d6l\2"+
		"\u03d4\u03d6\5\u00d4k\2\u03d5\u03d3\3\2\2\2\u03d5\u03d4\3\2\2\2\u03d6"+
		"\u00d3\3\2\2\2\u03d7\u03d8\7Z\2\2\u03d8\u03d9\5\u0080A\2\u03d9\u03db\5"+
		"\u00e8u\2\u03da\u03dc\5\u00eav\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2"+
		"\2\u03dc\u00d5\3\2\2\2\u03dd\u03de\7Y\2\2\u03de\u03e0\5\u00d8m\2\u03df"+
		"\u03e1\5\u00e8u\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e3"+
		"\3\2\2\2\u03e2\u03e4\5\u00eav\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2"+
		"\2\u03e4\u00d7\3\2\2\2\u03e5\u03e8\5\u00dco\2\u03e6\u03e8\5\u00dan\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e6\3\2\2\2\u03e8\u00d9\3\2\2\2\u03e9\u03ea\7\\"+
		"\2\2\u03ea\u00db\3\2\2\2\u03eb\u03ed\5\u00dep\2\u03ec\u03eb\3\2\2\2\u03ec"+
		"\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03f0\5\u00e0q\2\u03ef\u03ee"+
		"\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03f3\5\u00e2r"+
		"\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f5\3\2\2\2\u03f4\u03f6"+
		"\5\u00e4s\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f8\3\2\2"+
		"\2\u03f7\u03f9\5\u00e6t\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u00dd\3\2\2\2\u03fa\u03fb\5\u0080A\2\u03fb\u03fc\7j\2\2\u03fc\u00df\3"+
		"\2\2\2\u03fd\u03fe\5\u0080A\2\u03fe\u03ff\7k\2\2\u03ff\u00e1\3\2\2\2\u0400"+
		"\u0401\5\u0080A\2\u0401\u0402\7l\2\2\u0402\u00e3\3\2\2\2\u0403\u0404\5"+
		"\u0080A\2\u0404\u0405\7m\2\2\u0405\u00e5\3\2\2\2\u0406\u0407\5\u0080A"+
		"\2\u0407\u0408\7n\2\2\u0408\u00e7\3\2\2\2\u0409\u040a\t\t\2\2\u040a\u00e9"+
		"\3\2\2\2\u040b\u040c\5\u00ecw\2\u040c\u00eb\3\2\2\2\u040d\u040e\7V\2\2"+
		"\u040e\u040f\7\65\2\2\u040f\u0410\5R*\2\u0410\u00ed\3\2\2\2\u0411\u0412"+
		"\7~\2\2\u0412\u0413\5\u009cO\2\u0413\u0414\7\177\2\2\u0414\u00ef\3\2\2"+
		"\2\u0415\u0417\7*\2\2\u0416\u0415\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0418"+
		"\3\2\2\2\u0418\u0419\5\u014a\u00a6\2\u0419\u00f1\3\2\2\2\u041a\u041b\7"+
		"\64\2\2\u041b\u041c\7\65\2\2\u041c\u041d\5\u00f4{\2\u041d\u00f3\3\2\2"+
		"\2\u041e\u0423\5\u00f6|\2\u041f\u0420\7|\2\2\u0420\u0422\5\u00f6|\2\u0421"+
		"\u041f\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2"+
		"\2\2\u0424\u00f5\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427\5R*\2\u0427\u00f7"+
		"\3\2\2\2\u0428\u0429\7\66\2\2\u0429\u042a\5\u00fa~\2\u042a\u00f9\3\2\2"+
		"\2\u042b\u042c\5R*\2\u042c\u00fb\3\2\2\2\u042d\u042e\7\63\2\2\u042e\u042f"+
		"\7\65\2\2\u042f\u0430\5\u0116\u008c\2\u0430\u00fd\3\2\2\2\u0431\u0432"+
		"\7G\2\2\u0432\u0433\5\u0102\u0082\2\u0433\u00ff\3\2\2\2\u0434\u0435\7"+
		".\2\2\u0435\u0101\3\2\2\2\u0436\u0437\5\u0080A\2\u0437\u0103\3\2\2\2\u0438"+
		"\u0439\7\31\2\2\u0439\u0105\3\2\2\2\u043a\u043b\7\f\2\2\u043b\u043c\5"+
		"\u0108\u0085\2\u043c\u0107\3\2\2\2\u043d\u043f\5\u0104\u0083\2\u043e\u043d"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\5\u010a\u0086"+
		"\2\u0441\u0109\3\2\2\2\u0442\u0447\5\u010c\u0087\2\u0443\u0444\7|\2\2"+
		"\u0444\u0446\5\u010c\u0087\2\u0445\u0443\3\2\2\2\u0446\u0449\3\2\2\2\u0447"+
		"\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u010b\3\2\2\2\u0449\u0447\3\2"+
		"\2\2\u044a\u044b\5\u0114\u008b\2\u044b\u010d\3\2\2\2\u044c\u044f\5\u0110"+
		"\u0089\2\u044d\u044f\5\u0112\u008a\2\u044e\u044c\3\2\2\2\u044e\u044d\3"+
		"\2\2\2\u044f\u010f\3\2\2\2\u0450\u0451\7*\2\2\u0451\u0452\7~\2\2\u0452"+
		"\u0457\5\u014e\u00a8\2\u0453\u0454\7|\2\2\u0454\u0456\5\u014e\u00a8\2"+
		"\u0455\u0453\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458"+
		"\3\2\2\2\u0458\u045a\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b\7\177\2\2"+
		"\u045b\u0111\3\2\2\2\u045c\u045e\7*\2\2\u045d\u045c\3\2\2\2\u045d\u045e"+
		"\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\5\u014e\u00a8\2\u0460\u0113\3"+
		"\2\2\2\u0461\u0463\5R*\2\u0462\u0464\5\u010e\u0088\2\u0463\u0462\3\2\2"+
		"\2\u0463\u0464\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0467\5\u0120\u0091\2"+
		"\u0466\u0461\3\2\2\2\u0466\u0465\3\2\2\2\u0467\u0115\3\2\2\2\u0468\u046d"+
		"\5\u0118\u008d\2\u0469\u046a\7|\2\2\u046a\u046c\5\u0118\u008d\2\u046b"+
		"\u0469\3\2\2\2\u046c\u046f\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2"+
		"\2\2\u046e\u0117\3\2\2\2\u046f\u046d\3\2\2\2\u0470\u0472\5R*\2\u0471\u0473"+
		"\5\u011a\u008e\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0119\3"+
		"\2\2\2\u0474\u0475\t\n\2\2\u0475\u011b\3\2\2\2\u0476\u0477\7\67\2\2\u0477"+
		"\u0478\5\u011e\u0090\2\u0478\u011d\3\2\2\2\u0479\u047a\5R*\2\u047a\u011f"+
		"\3\2\2\2\u047b\u047c\5\u0146\u00a4\2\u047c\u047d\7z\2\2\u047d\u047f\3"+
		"\2\2\2\u047e\u047b\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0481\7\u008f\2\2\u0481\u0121\3\2\2\2\u0482\u0483\t\13\2\2\u0483\u0123"+
		"\3\2\2\2\u0484\u0489\5\u0122\u0092\2\u0485\u0486\7z\2\2\u0486\u0488\5"+
		"\u0122\u0092\2\u0487\u0485\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u0487\3\2"+
		"\2\2\u0489\u048a\3\2\2\2\u048a\u0125\3\2\2\2\u048b\u0489\3\2\2\2\u048c"+
		"\u048d\7\21\2\2\u048d\u048e\7~\2\2\u048e\u048f\5(\25\2\u048f\u0490\7\177"+
		"\2\2\u0490\u0127\3\2\2\2\u0491\u0494\7\u009c\2\2\u0492\u0494\5\u0124\u0093"+
		"\2\u0493\u0491\3\2\2\2\u0493\u0492\3\2\2\2\u0494\u0129\3\2\2\2\u0495\u0496"+
		"\7\u009c\2\2\u0496\u012b\3\2\2\2\u0497\u0498\7\u009c\2\2\u0498\u012d\3"+
		"\2\2\2\u0499\u049a\t\f\2\2\u049a\u012f\3\2\2\2\u049b\u049c\5\u0122\u0092"+
		"\2\u049c\u0131\3\2\2\2\u049d\u049e\5\u0122\u0092\2\u049e\u0133\3\2\2\2"+
		"\u049f\u04a2\5\u0136\u009c\2\u04a0\u04a2\5\u0138\u009d\2\u04a1\u049f\3"+
		"\2\2\2\u04a1\u04a0\3\2\2\2\u04a2\u0135\3\2\2\2\u04a3\u04a4\5\u0124\u0093"+
		"\2\u04a4\u0137\3\2\2\2\u04a5\u04a6\7\u009c\2\2\u04a6\u0139\3\2\2\2\u04a7"+
		"\u04a8\7\u009c\2\2\u04a8\u013b\3\2\2\2\u04a9\u04ac\5\u0122\u0092\2\u04aa"+
		"\u04ac\5\u0080A\2\u04ab\u04a9\3\2\2\2\u04ab\u04aa\3\2\2\2\u04ac\u013d"+
		"\3\2\2\2\u04ad\u04ae\5\u0122\u0092\2\u04ae\u013f\3\2\2\2\u04af\u04b0\7"+
		"\16\2\2\u04b0\u0141\3\2\2\2\u04b1\u04b2\7(\2\2\u04b2\u04b3\7\'\2\2\u04b3"+
		"\u0143\3\2\2\2\u04b4\u04b5\7(\2\2\u04b5\u04b6\7/\2\2\u04b6\u04b7\7\'\2"+
		"\2\u04b7\u0145\3\2\2\2\u04b8\u04b9\5\u0122\u0092\2\u04b9\u0147\3\2\2\2"+
		"\u04ba\u04bb\5\u0122\u0092\2\u04bb\u0149\3\2\2\2\u04bc\u04bd\5\u0122\u0092"+
		"\2\u04bd\u014b\3\2\2\2\u04be\u04bf\5\u0122\u0092\2\u04bf\u014d\3\2\2\2"+
		"\u04c0\u04c1\5\u0122\u0092\2\u04c1\u014f\3\2\2\2\u04c2\u04c3\7+\2\2\u04c3"+
		"\u0151\3\2\2\2\u04c4\u04c5\7K\2\2\u04c5\u0153\3\2\2\2\u04c6\u04c7\7/\2"+
		"\2\u04c7\u0155\3\2\2\2\u04c8\u04ca\5\u0154\u00ab\2\u04c9\u04c8\3\2\2\2"+
		"\u04c9\u04ca\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\7+\2\2\u04cc\u0157"+
		"\3\2\2\2\u04cd\u04ce\5\u0122\u0092\2\u04ce\u0159\3\2\2\2q\u0163\u0169"+
		"\u017c\u0186\u0189\u018c\u0190\u019a\u019d\u01a0\u01a4\u01ad\u01b0\u01b8"+
		"\u01c2\u01d0\u01d4\u01d8\u01de\u01e3\u01ef\u01f7\u021d\u0222\u0236\u023b"+
		"\u0242\u0247\u0249\u024e\u0255\u0258\u025b\u0264\u026c\u0270\u0279\u0283"+
		"\u028c\u029e\u02a9\u02b4\u02ba\u02c7\u02ce\u02d5\u02d9\u02ea\u02f1\u02f4"+
		"\u0307\u0318\u031b\u0325\u0328\u032d\u0330\u0333\u0336\u0339\u033c\u0343"+
		"\u0346\u0349\u034c\u034f\u0357\u0362\u0368\u0373\u0378\u037c\u0382\u0388"+
		"\u038f\u0396\u039a\u039d\u03a0\u03a3\u03a9\u03b9\u03c2\u03c7\u03d5\u03db"+
		"\u03e0\u03e3\u03e7\u03ec\u03ef\u03f2\u03f5\u03f8\u0416\u0423\u043e\u0447"+
		"\u044e\u0457\u045d\u0463\u0466\u046d\u0472\u047e\u0489\u0493\u04a1\u04ab"+
		"\u04c9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}