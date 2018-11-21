package class7;
class Animal{
	protected String name;
	protected int age;
	protected String sex;
	protected int legNum;
	protected int weight;
	public Animal(){
		
	}
	public Animal(String aname,int aage,String asex,int alegNum,int aweight){
		name=aname;
		age=aage;
		sex=asex;
		legNum=alegNum;
		weight=aweight;
	}
	protected void eating(String food){
		System.out.println("eating " + food);	
	}
	public String toString(){
		return "name="+name+","+"age="+age+","+"sex="+sex+","+"legNum="+legNum+","+"weight="+weight;
	}
}
class Pig extends Animal{
	protected int length;
	protected int height;
	protected String color;
	public Pig(String aname,int aage,String asex,int alegNum,int aweight,int alength,int aheight,String acolor) {
		super( aname, aage, asex, alegNum, aweight);
		length=alength;
		height=aheight;
		color=acolor;
	}
	public String toString() {
		return "length="+length+","+"height="+","+height+"color="+color;
	}
	protected void eating(String food) {
		System.out.println("eating " + food);
	}
	public void walking() {
	    System.out.println("walking");
	}
	public void printPig() {
		System.out.println("name="+name+","+"age="+age+","+"sex="+sex+","+"legNum="+legNum+","+"weight="+weight+","+"length:"+length+","+"height:"+height+","+"color:"+color);
	}
}
class Chicken extends Animal{
	protected String combColor;
	public Chicken(String aname,int aage,String asex,int alegNum,int aweight,String acombColor) {
		super( aname, aage, asex, alegNum, aweight);
		combColor=acombColor;
	}
	public String toString() {
		return "combColor="+combColor;
	}
	protected void eating(String food) {
		System.out.println("eating " + food);
	}
	public void flying() {
	    System.out.println("flying");
	}
	public void printChicken() {
		System.out.println("name="+name+","+"age="+age+","+"sex="+sex+","+"legNum="+legNum+","+"weight="+weight+","+"combColor:"+combColor);
	}
}



public class class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Pig peiqi = new Pig("peiqi",18,"man",4,120,2, 3, "red");
		peiqi.printPig();
		peiqi.eating("catton");
		peiqi.walking();
		Chicken xhj = new Chicken("xhj",3,"woman",2,12,"blue");
		xhj.printChicken();
		xhj.eating("worm");
		xhj.flying();
	}

}
