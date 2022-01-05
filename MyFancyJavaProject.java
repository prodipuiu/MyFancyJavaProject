
class Client
{
	 public static void main(String[] args) throws Exception
	 {

		 Shape circle=new Circle();

		 circle.draw();

		 PatternDecorator patternDec=new PatternDecorator(circle);
		 patternDec.draw();


		 ColorDecorator colorDec=new ColorDecorator(circle);
		 colorDec.draw();


		 ColorDecorator colorPatternDec=new ColorDecorator(patternDec);
		 colorPatternDec.draw();


	 }
}
