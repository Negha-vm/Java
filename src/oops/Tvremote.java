package oops;
interface Tvremotes
{
	public void Tvremote();
}
interface Smarttvremote extends Tvremotes
{
	public void Smarttvremotes();
	public void channel();
}
class TV implements Smarttvremote
{

	@Override
	public void Smarttvremotes() {
		System.out.println("Smarttvremotedetails");
		
	}

	@Override
	public void channel() {
		
		System.out.println("channeldetails");
	}

	@Override
	public void Tvremote() {
		
		System.out.println("Tvremotedetails");
	}
	
	
}
public class Tvremote {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.Smarttvremotes();
		ob.channel();
		ob.Tvremote();
	

	}

}
