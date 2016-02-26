
public class MathEvalUnitTests {

	static PostFixEvaluator pFix = new PostFixEvaluator();
	static InFixEvaluator iFix = new InFixEvaluator();
	
	public static void main(String[] args) throws Exception {
		String expression = "";
		
		System.out.println("Testing PostFix Calculator");
		
		try{
			System.out.print("Testing " + expression + ": " );
			pFix.setExpression(expression);
			
			if(pFix.evaluate() == 0){
				System.out.println("PASS");
			}else{
				System.out.println("FAIL");
			}
			
		}catch(Exception excpt){
			System.out.println("FAIL");
		}
		

	}

}
