import java.util.EmptyStackException;

public class PostFixEvaluator {
	
	String _expression = "";
	
	public PostFixEvaluator(){
		
	}
	
	public PostFixEvaluator(String expression) throws Exception{//TODO: Look up exception class
		this.setExpression(expression);
	}
	
	public void setExpression(String expression) throws Exception{//TODO: Look up exception class
		if(this.isPostFix()){
			this._expression = expression;
		}else{
			throw new Exception();
		}
	}
	
	public String getExpression(){
		return this._expression;
	}
	
	public boolean isPostFix(){
		return true;
	}
	
	private double toNumber(String num){
		return 0;
	}
	
	private boolean isOperator(String op){
		return true;
	}
	
	private double doOperator(String op, double num1, double num2){
		return 0;
	}
	
	public double evaluate() throws Exception{
		Stack<String> expressionStk = new Stack<String>();
		Stack<String> resultStk = new Stack<String>();
		
		String[] splitExpression = this._expression.split("/[ ]+/");
		
		for(String part : splitExpression){
			expressionStk.push(part);
		}
		
		String tok = "";
		
		try{
			tok = expressionStk.pop();
		}catch(EmptyStackException excpt){
			tok = null;
		}
		
		while(tok != null){
			if(this.isOperator(tok)){
				double topVal = toNumber(resultStk.pop());
				double nextVal = toNumber(resultStk.pop());
				double result = doOperator(tok, topVal, nextVal);
				expressionStk.push(Double.toString(result));
			}else{
				resultStk.push(tok);
			}
			
			tok = expressionStk.pop();
		}
		return toNumber(expressionStk.pop());
	}
	
	
	
}
