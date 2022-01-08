class PatternDecorator implements Shape
{
	Shape shape;
	
	 public PatternDecorator(Shape shape) {
		
		this.shape = shape;
	}

	@Override
	public void draw()
	{
		
		 this.shape.draw();
		 addPattern();
	}
	
	private void addPattern() {
		System.out.println("Pattern is added to the shape");
	}
}

class ColorDecorator implements Shape
{
	Shape shape;
	
	 public ColorDecorator(Shape shape) {
		
		this.shape = shape;
	}

	@Override
	public void draw()
	{
		
		 this.shape.draw();
		 fillColor();
	}
	
	private void fillColor() {
		System.out.println("Color is filled to the shape");
	}
}

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
