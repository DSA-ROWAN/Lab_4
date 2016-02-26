
public class InFixEvaluator extends PostFixEvaluator {

	public InFixEvaluator(){
		super();
	}
	
	public InFixEvaluator(String expression) throws Exception{
		super(expression);
	}
	
	@Override
	public void setExpression(String expression) throws Exception{//TODO: Look up exception class
		if(this.isInFix()){
			this._expression = expression;
		}else{
			throw new Exception();
		}
	}
	
	public boolean isInFix(){
		return true;
	}
	
	private String inFixToPostFix(String expression){
		
		return "";
	}
	
	@Override
	public double evaluate() throws Exception{
		this._expression = this.inFixToPostFix(this._expression);
		return super.evaluate();
	}	
}
